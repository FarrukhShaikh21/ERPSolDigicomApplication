//
function registerKeyBoardHandler(event) {
    for (var i = keyRegistry.length - 1; i >= 0; i--)
    {
      var keyStroke = AdfKeyStroke.getKeyStrokeFromMarshalledString(keyRegistry[i]);
      AdfRichUIPeer.registerKeyStroke(event.getSource(), keyStroke, callBack);
    }
}

// The array below defines the keys that are registered to be handled by the callback function in this script
var keyRegistry = new Array();
keyRegistry.push("UP");
keyRegistry.push("DOWN");



function callBack(keyCode)
{
    var ac = AdfPage.PAGE.getActiveComponent();
    var marshalledKeyCode = keyCode.toMarshalledString(keyCode);
    var componentType = ac.getComponentType();
    if(marshalledKeyCode == "UP" || marshalledKeyCode == "DOWN")
    {
      // Ignore arrow actions in drop down list and mult-line text fields
      // NOTE: for getRows to return correct value, clientComponent must be set to true on inputText!
      if(componentType=='oracle.adf.RichSelectOneChoice'||componentType=='oracle.adf.RichInputComboboxListOfValues' || ac.getProperty("rows")>1)
      {
        // don't handle as function key up/down
        return false;
      } else if (marshalledKeyCode == "UP" || marshalledKeyCode == "DOWN") {
        // Let's try and find a table
        var parent = ac.getParent();
        while (parent)  {
          if (parent instanceof AdfRichTable) {
              break;
          }
          parent = parent.getParent();
        }
        // Did we find a table?
        if (parent instanceof AdfRichTable) {
          //using a matcher to split up the clientId so we can calculate the new clientId we want to navigate to
          var clientId = ac.getClientId().match("(.*):([0-9]+)(:[^:]+)");
          var newRowKey
          var tablePeer  = parent.getPeer();
          tablePeer.bind(parent);
          // ask for the previous/next rowkey
          switch (marshalledKeyCode) {
            case "UP":
                newRowKey = tablePeer._getPreviousRowKeyAndRow(clientId[2]).rowKey;
                break;
            case "DOWN":
                newRowKey = tablePeer._getNextRowKeyAndRow(clientId[2]).rowKey;            
                break;
          }
          // Check if page is ready (cancel navigation if not)
          // Otherwise when holding down the arrow keys the navigation gets out of sync
          if (!AdfPage.PAGE.isSynchronizedWithServer()) {
              return true;
          }
            var event = document.createEvent('Event'); 
            event.initEvent('keydown', true, true); 
            event.keyCode = 113

          // Handle the table row selection (but not the focus to the input field)
          tablePeer._handleTableBodyArrowUpDown(marshalledKeyCode == "UP", false, false);
          // For a click to edit table we need a more extensive approach
          if(!tablePeer._isClickToEdit()) {
            // Edit all mode
            // We use the beginning and and of our old clientId and just replace the rowKey part
            var newComp = AdfPage.PAGE.findComponent(clientId[1] + ":" +newRowKey + clientId[3]);
            // If we can find the component, set focus
            if (newComp!=null) {
              newCompPeer = newComp.getPeer();
              newCompPeer.bind(newComp);
              // find the html input element, set focus and select the value (so you can edit it immediately
              var inputElem = newCompPeer.getDomContentElement().firstElementChild;
              inputElem.focus();
              inputElem.select();
              var counter = 0;
              // Check every 10ms if the page is ready (in case of PPR focus gets lost
              var interval = setInterval(function () {
                if (++counter === 200 || AdfPage.PAGE.isSynchronizedWithServer()) {
                  inputElem.focus();
                  inputElem.select();
                  clearInterval(interval);
                }
              },10);
            }
          } else {
            // Click to Edit mode
            // This is not tested very well but seems to work

            tablePeer._editableTableReadOnlyMode = true;

            var cellIndex = -1;
            var node = ac.getPeer().getDomElement();
            while(null != node && cellIndex==-1) {
              if(AdfAgent.AGENT.getNodeName(node) == "TD") {
                break;
              }
              node = node.parentNode;
            }
            cellIndex = tablePeer._indexOfDomElement(tablePeer.FindRowByKey(clientId[2]).tr.cells, node);
            tablePeer._lastCTEIndex = cellIndex;
            
            var compEvent = new AdfDomUIInputEvent(parent, AdfUIInputEvent.KEY_DOWN_EVENT_TYPE, event );
            tablePeer.HandleComponentKeyDown(compEvent);
          }
          return true;
        }
        // We are not in a table, handle as usual.
        return false;
    }
  } 
}
package dgcom.view.backing;

import dgcom.model.stand.DigicomClass;

import dgcom.view.appbean.OracleReport;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectManyShuttle;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.binding.BindingContainer;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUCtrlListBinding;

public class CIC_0056 {
    private RichPanelFormLayout pfl2;
    private RichPanelStretchLayout psl1;
    private RichButton b1;
    private RichInputDate id2;
    private RichInputDate id1;
    private UISelectItems si4;
    private RichSelectOneChoice soc2;
    private UISelectItems si3;
    private RichSelectOneChoice soc1;
    private UISelectItems si8;
    private RichSelectOneChoice soc3;
    private RichPanelFormLayout pfl1;
    private RichPanelGroupLayout pgl2;
    private RichPanelSplitter ps1;
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichInputText it1;
    private RichPanelGroupLayout pgl1;
    private RichButton b2;
    private RichSelectManyShuttle sms1;
    private UISelectItems si14;
    private RichSelectManyShuttle sms2;
    private UISelectItems si1;
    private RichSelectManyShuttle sms3;
    private RichSelectManyShuttle sms4;
    private UISelectItems si2;
    private RichSelectManyShuttle sms5;
    private UISelectItems si5;
    private RichSelectManyShuttle sms6;
    private UISelectItems si6;
    private RichSelectManyShuttle sms7;
    private UISelectItems si7;
    private RichSelectManyShuttle sms8;
    private UISelectItems si9;
    private RichSelectManyShuttle sms9;
    private UISelectItems si10;
    private RichSelectManyShuttle sms10;
    private UISelectItems si11;
    private RichPanelAccordion pa1;
    private RichShowDetailItem sdi1;
    private RichShowDetailItem sdi2;
    private RichShowDetailItem sdi3;
    private RichShowDetailItem sdi4;
    private RichShowDetailItem sdi5;
    private RichShowDetailItem sdi6;
    private RichShowDetailItem sdi7;
    private RichShowDetailItem sdi8;
    private RichShowDetailItem sdi9;
    private RichShowDetailItem sdi10;
    private UISelectItems si12;
    private RichShowDetailItem sdi11;
    private RichInputText it2;
    private RichPanelGroupLayout pgl3;
    private RichInputComboboxListOfValues iclov1;
    private RichSelectManyShuttle sms11;
    private UISelectItems si13;
    private RichButton b3;
    private RichShowDetailItem sdi12;
    private RichSelectManyShuttle sms12;
    private UISelectItems si15;
    private RichPanelGroupLayout pgl4;
    private RichButton b4;
    private RichInputComboboxListOfValues txtPartNameId;
    private RichInputText it3;
    private RichShowDetailItem sdi13;
    private RichSelectManyShuttle sms13;
    private UISelectItems si16;
    private RichShowDetailItem sdi14;
    private RichSelectManyShuttle sms14;
    private UISelectItems si17;
    private RichSelectOneChoice soc4;
    private RichSelectItem si19;
    private RichSelectItem si18;
    private RichSelectItem si20;
    private RichSelectOneChoice soc5;
    private RichSelectItem si21;
    private RichSelectItem si22;
    private RichSelectItem si23;
    private RichSelectItem si24;
    private RichShowDetailItem sdi15;
    private RichSelectManyShuttle sms15;
    private UISelectItems si25;
    private RichShowDetailItem sdi16;
    private RichSelectManyShuttle sms16;
    private UISelectItems si26;
    private RichShowDetailItem sdi17;
    private RichSelectManyShuttle sms17;
    private UISelectItems si27;
    private RichShowDetailItem sdi18;
    private RichSelectManyShuttle sms18;
    private UISelectItems si28;
    private RichShowDetailItem sdi19;
    private RichSelectManyShuttle sms19;
    private UISelectItems si29;
    private RichShowDetailItem sdi20;
    private RichSelectManyShuttle sms20;
    private UISelectItems si30;
    private RichSelectOneChoice soc6;
    private RichSelectItem si32;
    private RichSelectItem si31;
    private RichSelectItem si33;
    private RichSelectOneChoice soc7;
    private UISelectItems si34;
    private RichSelectOneChoice soc8;
    private RichSelectItem si35;
    private RichSelectItem si36;
    private RichSelectItem si37;
    private RichSelectOneChoice soc9;
    private RichSelectItem si38;
    private RichSelectItem si39;
    private RichSelectItem si40;
    private RichSelectOneChoice soc10;
    private RichSelectItem si41;
    private RichSelectItem si42;
    private RichSelectItem si43;
    private RichSelectItem si44;
    private RichSelectItem si45;
    private RichSelectItem si46;
    private RichSelectItem si47;
    private RichSelectOneChoice soc11;
    private RichSelectItem si48;
    private RichSelectItem si49;
    private RichSelectItem si50;
    private RichSelectItem si51;
    private RichSelectItem si52;
    private RichShowDetailItem sdi21;
    private RichSelectManyShuttle sms21;
    private UISelectItems si53;

    private RichSelectOneChoice soc13;
    private UISelectItems si55;
    private RichSelectOneChoice soc12;
    private UISelectItems si54;
    private RichInputText it4;
    private RichSelectOneChoice soc14;
    private RichSelectItem si56;
    private RichSelectItem si57;
    private RichSelectItem si58;
    private RichShowDetailItem sdi22;
    private RichSelectManyShuttle sms22;
    private UISelectItems si59;
    private RichButton b5;
    private RichButton b6;
    private RichSelectOneChoice soc15;
    private UISelectItems si60;
    private RichSelectOneChoice soc16;
    private UISelectItems si61;
    private RichSelectOneChoice soc17;
    private RichSelectItem si62;
    private RichSelectItem si63;
    private RichSelectItem si64;
    private RichSelectItem si65;
    private RichSelectItem si66;
    private RichSelectItem si67;
    private RichShowDetailItem sdi23;
    private RichSelectManyShuttle sms23;
    private UISelectItems si68;

    public CIC_0056() {
    }


    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }
    public void doLocationChangeEvent(ValueChangeEvent vce) {
        //System.out.println((vce.getNewValue().==0?"":vce.getNewValue().toString()));
                                              
        DCBindingContainer bc= (DCBindingContainer) getBindings();
        DCIteratorBinding  ib= bc.findIteratorBinding("SrvDealersROIterator");
        ib.getViewObject().setNamedWhereClauseParam("P_ADF_LOCATIONID", (vce.getNewValue()==null?"":vce.getNewValue().toString()));
        ib.executeQuery();
        ib= bc.findIteratorBinding("SrvTechnicianROIterator");
        ib.getViewObject().setNamedWhereClauseParam("P_ADF_LOCATIONID", (vce.getNewValue()==null?"":vce.getNewValue().toString()));
        ib.executeQuery();
        ib= bc.findIteratorBinding("SysUserStoreROIterator");
        ib.getViewObject().setNamedWhereClauseParam("P_ADF_LOCATIONID", (vce.getNewValue()==null?"":vce.getNewValue().toString()));
        ib.executeQuery();
        ib= bc.findIteratorBinding("PuSuppliersROIterator");
        ib.getViewObject().setNamedWhereClauseParam("P_ADF_LOCATIONID", (vce.getNewValue()==null?"":vce.getNewValue().toString()));
        ib.executeQuery();
        ib= bc.findIteratorBinding("SrvTechnicianJobSolutionROIterator");
        ib.getViewObject().setNamedWhereClauseParam("P_ADF_LOCATIONID", (vce.getNewValue()==null?"":vce.getNewValue().toString()));
        ib.executeQuery();
    }
    public String doRunReport() {
        // Add event code here...
        DCBindingContainer bc= (DCBindingContainer) getBindings();
        DCIteratorBinding  ib= bc.findIteratorBinding("SysReportConditionDetailROIterator");
        ViewObject         vo= ib.getViewObject();
        vo.setWhereClause("MODULE_ID='"+getSoc3().getValue()+"'");
        String columnName="";
        String allias=getIt4().getValue().toString();
        vo.executeQuery();
        vo.setRangeSize(-1);
        String whereClause="";
        for (int j = 0; j < vo.getRowCount(); j++) {
        //System.out.println(vo.getRowAtRangeIndex(j).getAttribute("txtAdfComponentId"));      
                     
        JUCtrlListBinding listBindings = (JUCtrlListBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get(vo.getRowAtRangeIndex(j).getAttribute("txtAdfBindingName"));
            columnName=allias+vo.getRowAtRangeIndex(j).getAttribute("txtColumnName").toString();
            
            System.out.println("columnName::> " +columnName);
            System.out.println(vo.getRowAtRangeIndex(j).getAttribute("txtColumnName").toString());
            
        Object str[] = listBindings.getSelectedValues();
        //System.out.println(listBindings.getSelectedValues()+"colunname:>"+columnName);    
        String condition="";
        
        StringBuilder saveMsg =
                    new StringBuilder("");
        
                for (int i = 0; i < str.length; i++) {
                  //System.out.println(i +" "+str.length );  
                    if (i==str.length-1) {
                    condition = condition + "''" + str[i].toString() + "''";
                }
                    else
                        condition = condition + "''" + str[i].toString() + "'',";    
                    //System.out.println(str[i]);
                }


            if (condition.length()>0) {
                if (whereClause.length() == 0) {
                    whereClause = " and " + columnName + " IN(" + condition + ")";
                } else {
                    whereClause = whereClause + " and " + columnName + " IN(" + condition + ")";
                }
            }
        }
        FacesMessage msg = new FacesMessage(whereClause.toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);       
/////////////
        ApplicationModule  am=vo.getApplicationModule();
        ViewObject         qvo =am.findViewObject("rptRunSrvReport");
        if (qvo!=null) {
            qvo.remove();
        }
        qvo=am.createViewObjectFromQueryStmt("rptRunSrvReport", "SELECT parameter_value from SYS_PARAMETERS where parameter_id='HOST'");
        qvo.executeQuery();
        String host=qvo.first().getAttribute(0).toString();
        qvo.remove();
        qvo=am.createViewObjectFromQueryStmt("rptRunSrvReport", "SELECT parameter_value from SYS_PARAMETERS where parameter_id='PORT'");
        qvo.executeQuery();
        String port=qvo.first().getAttribute(0).toString();
        qvo.remove();
        qvo=am.createViewObjectFromQueryStmt("rptRunSrvReport", "select parameter_value from SYS_PARAMETERS where parameter_id='USERID'");
        qvo.executeQuery();
        String userid=qvo.first().getAttribute(0).toString();
        qvo.remove();
        qvo=am.createViewObjectFromQueryStmt("rptRunSrvReport", "select parameter_value from SYS_PARAMETERS where parameter_id='REPORT_PATH'");
        qvo.executeQuery();
        String reportpath=qvo.first().getAttribute(0).toString();
        qvo.remove();
        String vparaId="";
                 
                         OracleReport reportBean =
                new OracleReport(host, port, null);
                reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,"cache");// which will be one of the [cashe - file - mail - printer]
                reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,"PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
                reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT,reportpath+getIt1().getValue()+".rep");
                //reportBean.setReportServerParam(OracleReport.RS_PARAM_USERID,userid);
                
        
        ib= bc.findIteratorBinding("SysReportParameterROIterator");
        vo= ib.getViewObject();
        vo.setWhereClause("REPORT_ID='"+getSoc3().getValue()+"' AND REP_PARAM!='-'");
        vo.executeQuery();
        vo.setRangeSize(-1);
        String paravalue;
        String VParaId=DigicomClass.getConnectedUser()+new java.util.Date().toString().replace(" ", "-");
        
        String plsql="";
        
        plsql="begin insert into REP_PARA (userid,company, location, str, paraid, date1, date2, regionid) values"+"\n"+
              "('"+DigicomClass.getConnectedUser()+"',2,'"+getSoc2().getValue()+"','"+whereClause+"','"+VParaId+"','"+(this.getId1().getValue()==null?"":this.getId1().getValue())+"','"+(this.getId1().getValue()==null?"":this.getId2().getValue())+"','"+(getSoc1().getValue()==null?"":getSoc1().getValue())+"'); commit; end;";
        
        System.out.println(plsql); 
          DigicomClass.doExecutePLSQL(plsql);
        reportBean.setReportParameter("vparaid",VParaId);  
        for (int i = 0; i < vo.getRowCount(); i++) {
            
         if (vo.getRowAtRangeIndex(i).getAttribute("ParamType").equals("D")) {
                try {
                    paravalue =
                        ((RichInputDate) getPfl1().findComponent(vo.getRowAtRangeIndex(i).getAttribute("ParamId").toString())).getValue().toString();
                } catch (NullPointerException e) {
                    // TODO: Add catch code
                    paravalue=null;
                }
            }
         else
         if(vo.getRowAtRangeIndex(i).getAttribute("ParamType").equals("F")) {
                   paravalue=vo.getRowAtRangeIndex(i).getAttribute("ParamId").toString();
               }
          else
         {                try {
                    paravalue =
                        ((RichSelectOneChoice) getPfl1().findComponent(vo.getRowAtRangeIndex(i).getAttribute("ParamId").toString())).getValue().toString();
                              paravalue=(paravalue.equals("-")?"":paravalue);
                } catch (NullPointerException e) {
                    // TODO: Add catch code
                              paravalue="";
                }
  
             }
            
             //if (!vo.getRowAtRangeIndex(i).getAttribute("RepParam").toString().equals("-")) 
             {
                reportBean.setReportParameter(vo.getRowAtRangeIndex(i).getAttribute("RepParam").toString(), paravalue);
            }
        }                
                String url = reportBean.getReportServerURL();
               
                reportBean.openUrlInNewWindow(url);
/////////////// 
                
        return null;
    }
    public void reportIdVCE(ValueChangeEvent vce) {

        JUCtrlListBinding listBindings = (JUCtrlListBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("SrvJobtypesRO");
        listBindings.clearSelectedIndices();
        listBindings = (JUCtrlListBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("SrvSymptomsRO");
        listBindings.clearSelectedIndices();
        listBindings = (JUCtrlListBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("SoProductBrandsRO");
        listBindings.clearSelectedIndices();
        listBindings = (JUCtrlListBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("SrvFaultsRO");
        listBindings.clearSelectedIndices();
        listBindings = (JUCtrlListBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("SrvReasonsRO");
        listBindings.clearSelectedIndices();
        listBindings = (JUCtrlListBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("PuSuppliersRO");
        listBindings.clearSelectedIndices();        
        this.getSms1().resetValue();
        this.getSms2().resetValue();
        this.getSms3().resetValue();
        this.getSms4().resetValue();
        this.getSms5().resetValue();
        this.getSms6().resetValue();
        this.getSms7().resetValue();
        this.getSms8().resetValue();
        this.getSms9().resetValue();
        this.getSms10().resetValue();
        this.getSms11().resetValue();
        this.getSms12().resetValue();
        this.getSms13().resetValue();
        this.getSms14().resetValue();
        this.getSms15().resetValue();
        this.getSms16().resetValue();
        this.getSms17().resetValue();
        this.getSms18().resetValue();
        this.getSms19().resetValue();
        this.getSms20().resetValue();
        this.getSms21().resetValue();
        this.getSms22().resetValue();
        this.getSms23().resetValue();
        this.getSoc1().resetValue();
        this.getSoc2().resetValue();
        this.getSoc4().resetValue();
        this.getSoc5().resetValue();
        this.getSoc6().resetValue();
        this.getSoc7().resetValue();
        this.getSoc8().resetValue();
        this.getSoc9().resetValue();
        this.getSoc10().resetValue();
        this.getSoc11().resetValue();
        this.getSoc12().resetValue();       
        this.getSoc13().resetValue();
        this.getSoc14().resetValue();
        this.getSoc15().resetValue();
        this.getSoc16().resetValue();
        this.getSoc17().resetValue();
        this.getId1().resetValue();
        this.getId2().resetValue();        
        this.getSms1().setVisible(false);
        this.getSms2().setVisible(false);
        this.getSms3().setVisible(false);
        this.getSms4().setVisible(false);
        this.getSms5().setVisible(false);
        this.getSms6().setVisible(false);
        this.getSms7().setVisible(false);
        this.getSms8().setVisible(false);
        this.getSms9().setVisible(false);
        this.getSms10().setVisible(false);
        this.getSms11().setVisible(false);
        this.getSms12().setVisible(false);
        this.getSms13().setVisible(false);
        this.getSms14().setVisible(false);
        this.getSms15().setVisible(false);
        this.getSms16().setVisible(false);
        this.getSms17().setVisible(false);
        this.getSms18().setVisible(false);
        this.getSms19().setVisible(false);
        this.getSms20().setVisible(false);
        this.getSms21().setVisible(false);
        this.getSms22().setVisible(false);
        this.getSms23().setVisible(false);
        this.getSoc1().setVisible(false);
        this.getSoc2().setVisible(false);
        this.getSoc4().setVisible(false);
        this.getSoc5().setVisible(false);
        this.getSoc6().setVisible(false);
        this.getSoc7().setVisible(false);
        this.getSoc8().setVisible(false);
        this.getSoc9().setVisible(false);
        this.getSoc10().setVisible(false);
        this.getSoc11().setVisible(false);
        this.getSoc12().setVisible(false);
        this.getSoc13().setVisible(false);
        this.getSoc14().setVisible(false);
        this.getSoc15().setVisible(false);
        this.getSoc16().setVisible(false);
        this.getSoc17().setVisible(false);
        this.getB5().setVisible(false);
        this.getId1().setVisible(false);
        this.getId2().setVisible(false);
            
      DCBindingContainer bc= (DCBindingContainer) getBindings();
      DCIteratorBinding  ib= bc.findIteratorBinding("SysReportConditionDetailROIterator");
      ViewObject         vo= ib.getViewObject();
      vo.setWhereClause("MODULE_ID='"+vce.getNewValue()+"'");
      vo.executeQuery();
      vo.setRangeSize(-1);
    
      for (int i = 0; i < vo.getRowCount(); i++) {
          RichSelectManyShuttle uc=(RichSelectManyShuttle)getPfl2().findComponent(vo.getRowAtRangeIndex(i).getAttribute("txtAdfComponentId").toString());
          uc.setVisible(true);
        System.out.println(vo.getRowAtRangeIndex(i).getAttribute("txtAdfComponentId"));      
       }
        ib= bc.findIteratorBinding("SysReportParameterROIterator");
        vo= ib.getViewObject();
        vo.setWhereClause("");
        vo.setWhereClause("REPORT_ID='"+getSoc3().getValue()+"' AND PARAM_TYPE!='F'");
        vo.executeQuery();
        vo.setRangeSize(-1);      
        for (int i = 0; i < vo.getRowCount(); i++) {
            
         if (vo.getRowAtRangeIndex(i).getAttribute("ParamType").equals("D")) {
                
         ((RichInputDate) getPfl1().findComponent(vo.getRowAtRangeIndex(i).getAttribute("ParamId").toString())).setVisible(true);
            }
        else if (vo.getRowAtRangeIndex(i).getAttribute("ParamType").equals("B")) {
                       
                ((RichButton) getPfl1().findComponent(vo.getRowAtRangeIndex(i).getAttribute("ParamId").toString())).setVisible(true);
                   }        
          else
         {
             ((RichSelectOneChoice) getPfl1().findComponent(vo.getRowAtRangeIndex(i).getAttribute("ParamId").toString())).setVisible(true);
         }
            }
        vo.setWhereClause("");
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }


    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public String b2_action() {
        // Add event code here...
        //System.out.println(getSml10().getValue());
        return null;
    }


    public void setSms1(RichSelectManyShuttle sms1) {
        this.sms1 = sms1;
    }

    public RichSelectManyShuttle getSms1() {
        return sms1;
    }

    public void setSi14(UISelectItems si14) {
        this.si14 = si14;
    }

    public UISelectItems getSi14() {
        return si14;
    }

    public void setSms2(RichSelectManyShuttle sms2) {
        this.sms2 = sms2;
    }

    public RichSelectManyShuttle getSms2() {
        return sms2;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSms3(RichSelectManyShuttle sms3) {
        this.sms3 = sms3;
    }

    public RichSelectManyShuttle getSms3() {
        return sms3;
    }


    public void setSms4(RichSelectManyShuttle sms4) {
        this.sms4 = sms4;
    }

    public RichSelectManyShuttle getSms4() {
        return sms4;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSms5(RichSelectManyShuttle sms5) {
        this.sms5 = sms5;
    }

    public RichSelectManyShuttle getSms5() {
        return sms5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSms6(RichSelectManyShuttle sms6) {
        this.sms6 = sms6;
    }

    public RichSelectManyShuttle getSms6() {
        return sms6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setSms7(RichSelectManyShuttle sms7) {
        this.sms7 = sms7;
    }

    public RichSelectManyShuttle getSms7() {
        return sms7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setSms8(RichSelectManyShuttle sms8) {
        this.sms8 = sms8;
    }

    public RichSelectManyShuttle getSms8() {
        return sms8;
    }

    public void setSi9(UISelectItems si9) {
        this.si9 = si9;
    }

    public UISelectItems getSi9() {
        return si9;
    }

    public void setSms9(RichSelectManyShuttle sms9) {
        this.sms9 = sms9;
    }

    public RichSelectManyShuttle getSms9() {
        return sms9;
    }

    public void setSi10(UISelectItems si10) {
        this.si10 = si10;
    }

    public UISelectItems getSi10() {
        return si10;
    }

    public void setSms10(RichSelectManyShuttle sms10) {
        this.sms10 = sms10;
    }

    public RichSelectManyShuttle getSms10() {
        return sms10;
    }

    public void setSi11(UISelectItems si11) {
        this.si11 = si11;
    }

    public UISelectItems getSi11() {
        return si11;
    }


    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setSdi3(RichShowDetailItem sdi3) {
        this.sdi3 = sdi3;
    }

    public RichShowDetailItem getSdi3() {
        return sdi3;
    }

    public void setSdi4(RichShowDetailItem sdi4) {
        this.sdi4 = sdi4;
    }

    public RichShowDetailItem getSdi4() {
        return sdi4;
    }

    public void setSdi5(RichShowDetailItem sdi5) {
        this.sdi5 = sdi5;
    }

    public RichShowDetailItem getSdi5() {
        return sdi5;
    }

    public void setSdi6(RichShowDetailItem sdi6) {
        this.sdi6 = sdi6;
    }

    public RichShowDetailItem getSdi6() {
        return sdi6;
    }

    public void setSdi7(RichShowDetailItem sdi7) {
        this.sdi7 = sdi7;
    }

    public RichShowDetailItem getSdi7() {
        return sdi7;
    }

    public void setSdi8(RichShowDetailItem sdi8) {
        this.sdi8 = sdi8;
    }

    public RichShowDetailItem getSdi8() {
        return sdi8;
    }

    public void setSdi9(RichShowDetailItem sdi9) {
        this.sdi9 = sdi9;
    }

    public RichShowDetailItem getSdi9() {
        return sdi9;
    }

    public void setSdi10(RichShowDetailItem sdi10) {
        this.sdi10 = sdi10;
    }

    public RichShowDetailItem getSdi10() {
        return sdi10;
    }

    public void setSi12(UISelectItems si12) {
        this.si12 = si12;
    }

    public UISelectItems getSi12() {
        return si12;
    }

    public void setSdi11(RichShowDetailItem sdi11) {
        this.sdi11 = sdi11;
    }

    public RichShowDetailItem getSdi11() {
        return sdi11;
    }


    public String doAddModelInList() {
        doAddValueInList("InItemsVORO",getIclov1().getValue(),"ModelNo");
            return null;
    }
    public String doAddPart() {
        // Add event code here...
        doAddValueInList("InPartsRO",getTxtPartNameId().getValue(),"Partno");
        return null;
    }
   public void doAddValueInList(String pListName,Object p_sourceList,String pColumnName) {
       BindingContext bctx = BindingContext.getCurrent();
       BindingContainer bindings = bctx.getCurrentBindingsEntry();        
       JUCtrlListBinding list=(JUCtrlListBinding) bindings.get(pListName);
       DCIteratorBinding iterList=list.getDCIteratorBinding();
        //System.out.println("list.getValueAt(0)"+list.getValueFromList(0));
        Row r=iterList.getViewObject().getFilteredRows(pColumnName, p_sourceList)[0];
       iterList.setCurrentRowWithKey(r.getKey().toStringFormat(true));
       int indx = iterList.getCurrentRowIndexInRange();
        /*         if (1==1) {
            return;
       } */
          System.out.println(list.getSelectedIndices().length);
          int[] selected =new int[list.getSelectedIndices().length+1];
          
          for (int i = 0; i < list.getSelectedIndices().length; i++) {
               selected[i]=list.getSelectedIndices()[i];
          }
          selected[list.getSelectedIndices().length]=indx;//list.findListIndex(p_sourceList);
           System.out.println(selected.length);

           list.setSelectedIndices(selected);
                  
   }
    public List<SelectItem> getSuggestedModel(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("InItemsVOROIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("ASBInItemsCIC_0056");
        vo.getViewObject().reset();
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(MODEL_NO) LIKE upper('%"+resourceName+"%') AND ROWNUM<=10");
        vo.executeQuery();
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("ModelNo")));
        }
      
        return resourceList;
        
    }
    public List<SelectItem> getSuggestedPart(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("InPartsROIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("ASBInParts_CIC_0056");
        vo.getViewObject().reset();
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(Partid||Partno||DESCRIPTION) LIKE upper('%"+resourceName+"%') AND ROWNUM<=20");
        vo.executeQuery();
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Partno"),resourceRow.getAttribute("Partno")+":"+resourceRow.getAttribute("Description").toString()));
        }
      
        return resourceList;
        
    }

    public List<SelectItem> getSuggestedReport(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvReportBlockQueryROIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("ASBSysProgram");
        vo.getViewObject().reset();
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(MODULE_NAME) LIKE upper('%"+resourceName+"%') AND ROWNUM<=10");
        vo.executeQuery();
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("ModuleName")));
        }
      
        return resourceList;
        
    }
    
    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setIclov1(RichInputComboboxListOfValues iclov1) {
        this.iclov1 = iclov1;
    }

    public RichInputComboboxListOfValues getIclov1() {
        return iclov1;
    }

    public void setSms11(RichSelectManyShuttle sms11) {
        this.sms11 = sms11;
    }

    public RichSelectManyShuttle getSms11() {
        return sms11;
    }

    public void setSi13(UISelectItems si13) {
        this.si13 = si13;
    }

    public UISelectItems getSi13() {
        return si13;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setSdi12(RichShowDetailItem sdi12) {
        this.sdi12 = sdi12;
    }

    public RichShowDetailItem getSdi12() {
        return sdi12;
    }

    public void setSms12(RichSelectManyShuttle sms12) {
        this.sms12 = sms12;
    }

    public RichSelectManyShuttle getSms12() {
        return sms12;
    }

    public void setSi15(UISelectItems si15) {
        this.si15 = si15;
    }

    public UISelectItems getSi15() {
        return si15;
    }


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }


    public void setTxtPartNameId(RichInputComboboxListOfValues txtPartNameId) {
        this.txtPartNameId = txtPartNameId;
    }

    public RichInputComboboxListOfValues getTxtPartNameId() {
        return txtPartNameId;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setSdi13(RichShowDetailItem sdi13) {
        this.sdi13 = sdi13;
    }

    public RichShowDetailItem getSdi13() {
        return sdi13;
    }

    public void setSms13(RichSelectManyShuttle sms13) {
        this.sms13 = sms13;
    }

    public RichSelectManyShuttle getSms13() {
        return sms13;
    }

    public void setSi16(UISelectItems si16) {
        this.si16 = si16;
    }

    public UISelectItems getSi16() {
        return si16;
    }


    public void setSdi14(RichShowDetailItem sdi14) {
        this.sdi14 = sdi14;
    }

    public RichShowDetailItem getSdi14() {
        return sdi14;
    }

    public void setSms14(RichSelectManyShuttle sms14) {
        this.sms14 = sms14;
    }

    public RichSelectManyShuttle getSms14() {
        return sms14;
    }

    public void setSi17(UISelectItems si17) {
        this.si17 = si17;
    }

    public UISelectItems getSi17() {
        return si17;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }


    public void setSi19(RichSelectItem si19) {
        this.si19 = si19;
    }

    public RichSelectItem getSi19() {
        return si19;
    }

    public void setSi18(RichSelectItem si18) {
        this.si18 = si18;
    }

    public RichSelectItem getSi18() {
        return si18;
    }

    public void setSi20(RichSelectItem si20) {
        this.si20 = si20;
    }

    public RichSelectItem getSi20() {
        return si20;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }


    public void setSi21(RichSelectItem si21) {
        this.si21 = si21;
    }

    public RichSelectItem getSi21() {
        return si21;
    }

    public void setSi22(RichSelectItem si22) {
        this.si22 = si22;
    }

    public RichSelectItem getSi22() {
        return si22;
    }

    public void setSi23(RichSelectItem si23) {
        this.si23 = si23;
    }

    public RichSelectItem getSi23() {
        return si23;
    }

    public void setSi24(RichSelectItem si24) {
        this.si24 = si24;
    }

    public RichSelectItem getSi24() {
        return si24;
    }

    public void setSdi15(RichShowDetailItem sdi15) {
        this.sdi15 = sdi15;
    }

    public RichShowDetailItem getSdi15() {
        return sdi15;
    }

    public void setSms15(RichSelectManyShuttle sms15) {
        this.sms15 = sms15;
    }

    public RichSelectManyShuttle getSms15() {
        return sms15;
    }

    public void setSi25(UISelectItems si25) {
        this.si25 = si25;
    }

    public UISelectItems getSi25() {
        return si25;
    }

    public void setSdi16(RichShowDetailItem sdi16) {
        this.sdi16 = sdi16;
    }

    public RichShowDetailItem getSdi16() {
        return sdi16;
    }


    public void setSms16(RichSelectManyShuttle sms16) {
        this.sms16 = sms16;
    }

    public RichSelectManyShuttle getSms16() {
        return sms16;
    }

    public void setSi26(UISelectItems si26) {
        this.si26 = si26;
    }

    public UISelectItems getSi26() {
        return si26;
    }


    public void setSdi17(RichShowDetailItem sdi17) {
        this.sdi17 = sdi17;
    }

    public RichShowDetailItem getSdi17() {
        return sdi17;
    }

    public void setSms17(RichSelectManyShuttle sms17) {
        this.sms17 = sms17;
    }

    public RichSelectManyShuttle getSms17() {
        return sms17;
    }

    public void setSi27(UISelectItems si27) {
        this.si27 = si27;
    }

    public UISelectItems getSi27() {
        return si27;
    }

    public void setSdi18(RichShowDetailItem sdi18) {
        this.sdi18 = sdi18;
    }

    public RichShowDetailItem getSdi18() {
        return sdi18;
    }

    public void setSms18(RichSelectManyShuttle sms18) {
        this.sms18 = sms18;
    }

    public RichSelectManyShuttle getSms18() {
        return sms18;
    }

    public void setSi28(UISelectItems si28) {
        this.si28 = si28;
    }

    public UISelectItems getSi28() {
        return si28;
    }

    public void setSdi19(RichShowDetailItem sdi19) {
        this.sdi19 = sdi19;
    }

    public RichShowDetailItem getSdi19() {
        return sdi19;
    }

    public void setSms19(RichSelectManyShuttle sms19) {
        this.sms19 = sms19;
    }

    public RichSelectManyShuttle getSms19() {
        return sms19;
    }

    public void setSi29(UISelectItems si29) {
        this.si29 = si29;
    }

    public UISelectItems getSi29() {
        return si29;
    }

    public void setSdi20(RichShowDetailItem sdi20) {
        this.sdi20 = sdi20;
    }

    public RichShowDetailItem getSdi20() {
        return sdi20;
    }

    public void setSms20(RichSelectManyShuttle sms20) {
        this.sms20 = sms20;
    }

    public RichSelectManyShuttle getSms20() {
        return sms20;
    }

    public void setSi30(UISelectItems si30) {
        this.si30 = si30;
    }

    public UISelectItems getSi30() {
        return si30;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }


    public void setSi32(RichSelectItem si32) {
        this.si32 = si32;
    }

    public RichSelectItem getSi32() {
        return si32;
    }

    public void setSi31(RichSelectItem si31) {
        this.si31 = si31;
    }

    public RichSelectItem getSi31() {
        return si31;
    }

    public void setSi33(RichSelectItem si33) {
        this.si33 = si33;
    }

    public RichSelectItem getSi33() {
        return si33;
    }


    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi34(UISelectItems si34) {
        this.si34 = si34;
    }

    public UISelectItems getSi34() {
        return si34;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
    }


    public void setSi35(RichSelectItem si35) {
        this.si35 = si35;
    }

    public RichSelectItem getSi35() {
        return si35;
    }

    public void setSi36(RichSelectItem si36) {
        this.si36 = si36;
    }

    public RichSelectItem getSi36() {
        return si36;
    }

    public void setSi37(RichSelectItem si37) {
        this.si37 = si37;
    }

    public RichSelectItem getSi37() {
        return si37;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }


    public void setSi38(RichSelectItem si38) {
        this.si38 = si38;
    }

    public RichSelectItem getSi38() {
        return si38;
    }

    public void setSi39(RichSelectItem si39) {
        this.si39 = si39;
    }

    public RichSelectItem getSi39() {
        return si39;
    }

    public void setSi40(RichSelectItem si40) {
        this.si40 = si40;
    }

    public RichSelectItem getSi40() {
        return si40;
    }

    public void setSoc10(RichSelectOneChoice soc10) {
        this.soc10 = soc10;
    }

    public RichSelectOneChoice getSoc10() {
        return soc10;
    }


    public void setSi41(RichSelectItem si41) {
        this.si41 = si41;
    }

    public RichSelectItem getSi41() {
        return si41;
    }

    public void setSi42(RichSelectItem si42) {
        this.si42 = si42;
    }

    public RichSelectItem getSi42() {
        return si42;
    }

    public void setSi43(RichSelectItem si43) {
        this.si43 = si43;
    }

    public RichSelectItem getSi43() {
        return si43;
    }

    public void setSi44(RichSelectItem si44) {
        this.si44 = si44;
    }

    public RichSelectItem getSi44() {
        return si44;
    }

    public void setSi45(RichSelectItem si45) {
        this.si45 = si45;
    }

    public RichSelectItem getSi45() {
        return si45;
    }

    public void setSi46(RichSelectItem si46) {
        this.si46 = si46;
    }

    public RichSelectItem getSi46() {
        return si46;
    }

    public void setSi47(RichSelectItem si47) {
        this.si47 = si47;
    }

    public RichSelectItem getSi47() {
        return si47;
    }

    public void setSoc11(RichSelectOneChoice soc11) {
        this.soc11 = soc11;
    }

    public RichSelectOneChoice getSoc11() {
        return soc11;
    }


    public void setSi48(RichSelectItem si48) {
        this.si48 = si48;
    }

    public RichSelectItem getSi48() {
        return si48;
    }

    public void setSi49(RichSelectItem si49) {
        this.si49 = si49;
    }

    public RichSelectItem getSi49() {
        return si49;
    }

    public void setSi50(RichSelectItem si50) {
        this.si50 = si50;
    }

    public RichSelectItem getSi50() {
        return si50;
    }

    public void setSi51(RichSelectItem si51) {
        this.si51 = si51;
    }

    public RichSelectItem getSi51() {
        return si51;
    }

    public void setSi52(RichSelectItem si52) {
        this.si52 = si52;
    }

    public RichSelectItem getSi52() {
        return si52;
    }

    public void setSdi21(RichShowDetailItem sdi21) {
        this.sdi21 = sdi21;
    }

    public RichShowDetailItem getSdi21() {
        return sdi21;
    }

    public void setSms21(RichSelectManyShuttle sms21) {
        this.sms21 = sms21;
    }

    public RichSelectManyShuttle getSms21() {
        return sms21;
    }

    public void setSi53(UISelectItems si53) {
        this.si53 = si53;
    }

    public UISelectItems getSi53() {
        return si53;
    }


    public void setSoc13(RichSelectOneChoice soc13) {
        this.soc13 = soc13;
    }

    public RichSelectOneChoice getSoc13() {
        return soc13;
    }

    public void setSi55(UISelectItems si55) {
        this.si55 = si55;
    }

    public UISelectItems getSi55() {
        return si55;
    }

    public void setSoc12(RichSelectOneChoice soc12) {
        this.soc12 = soc12;
    }

    public RichSelectOneChoice getSoc12() {
        return soc12;
    }

    public void setSi54(UISelectItems si54) {
        this.si54 = si54;
    }

    public UISelectItems getSi54() {
        return si54;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setSoc14(RichSelectOneChoice soc14) {
        this.soc14 = soc14;
    }

    public RichSelectOneChoice getSoc14() {
        return soc14;
    }


    public void setSi56(RichSelectItem si56) {
        this.si56 = si56;
    }

    public RichSelectItem getSi56() {
        return si56;
    }

    public void setSi57(RichSelectItem si57) {
        this.si57 = si57;
    }

    public RichSelectItem getSi57() {
        return si57;
    }

    public void setSi58(RichSelectItem si58) {
        this.si58 = si58;
    }

    public RichSelectItem getSi58() {
        return si58;
    }

    public void setSdi22(RichShowDetailItem sdi22) {
        this.sdi22 = sdi22;
    }

    public RichShowDetailItem getSdi22() {
        return sdi22;
    }

    public void setSms22(RichSelectManyShuttle sms22) {
        this.sms22 = sms22;
    }

    public RichSelectManyShuttle getSms22() {
        return sms22;
    }

    public void setSi59(UISelectItems si59) {
        this.si59 = si59;
    }

    public UISelectItems getSi59() {
        return si59;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public String doRunProcess() {
        // Add event code here...
         DigicomClass.doExecutePLSQL("begin STORE_SUMMARY_STOCK('"+id1.getValue()+"','"+id2.getValue()+"'); end;");
        return null;
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setSoc15(RichSelectOneChoice soc15) {
        this.soc15 = soc15;
    }

    public RichSelectOneChoice getSoc15() {
        return soc15;
    }

    public void setSi60(UISelectItems si60) {
        this.si60 = si60;
    }

    public UISelectItems getSi60() {
        return si60;
    }

    public void setSoc16(RichSelectOneChoice soc16) {
        this.soc16 = soc16;
    }

    public RichSelectOneChoice getSoc16() {
        return soc16;
    }

    public void setSi61(UISelectItems si61) {
        this.si61 = si61;
    }

    public UISelectItems getSi61() {
        return si61;
    }

    public void setSoc17(RichSelectOneChoice soc17) {
        this.soc17 = soc17;
    }

    public RichSelectOneChoice getSoc17() {
        return soc17;
    }


    public void setSi62(RichSelectItem si62) {
        this.si62 = si62;
    }

    public RichSelectItem getSi62() {
        return si62;
    }

    public void setSi63(RichSelectItem si63) {
        this.si63 = si63;
    }

    public RichSelectItem getSi63() {
        return si63;
    }

    public void setSi64(RichSelectItem si64) {
        this.si64 = si64;
    }

    public RichSelectItem getSi64() {
        return si64;
    }

    public void setSi65(RichSelectItem si65) {
        this.si65 = si65;
    }

    public RichSelectItem getSi65() {
        return si65;
    }

    public void setSi66(RichSelectItem si66) {
        this.si66 = si66;
    }

    public RichSelectItem getSi66() {
        return si66;
    }

    public void setSi67(RichSelectItem si67) {
        this.si67 = si67;
    }

    public RichSelectItem getSi67() {
        return si67;
    }


    public void setSdi23(RichShowDetailItem sdi23) {
        this.sdi23 = sdi23;
    }

    public RichShowDetailItem getSdi23() {
        return sdi23;
    }

    public void setSms23(RichSelectManyShuttle sms23) {
        this.sms23 = sms23;
    }

    public RichSelectManyShuttle getSms23() {
        return sms23;
    }

    public void setSi68(UISelectItems si68) {
        this.si68 = si68;
    }

    public UISelectItems getSi68() {
        return si68;
    }
}

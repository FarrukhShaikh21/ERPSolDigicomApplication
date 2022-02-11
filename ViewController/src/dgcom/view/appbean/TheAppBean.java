package dgcom.view.appbean;

import java.util.ArrayList;
import java.util.List;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTree;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.client.Configuration;

import org.apache.myfaces.trinidad.component.UIXTree;
import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;
import org.apache.myfaces.trinidad.model.RowKeySet;

public class TheAppBean {
        public TheAppBean() {
            super();
            
        }
        List<TreeElement> allEmployees = new ArrayList<TreeElement>();
        
        ChildPropertyTreeModel employeeTree;
        private RichTree rtree;
        private RichLink l1;
        private RichOutputText rot1;
        private String gotoActivity;
        private String activityName;
        private String activityDescription;
        //private RichButton l1;



    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        public String getActivityName() {
            return activityName;
        }

        public void setGotoActivity(String gotoActivity) {
            this.gotoActivity = gotoActivity;
        }

        public String getGotoActivity() {
            return gotoActivity;
        }

        public void setRot1(RichOutputText rot1) {
            this.rot1 = rot1;
        }

        public RichOutputText getRot1() {
            return rot1;
        }

        public synchronized void setL1(RichLink l1) {
            this.l1 = l1;
        }

        public synchronized RichLink getL1() {
            return l1;
        }

        public synchronized void setRtree(RichTree rtree) {
            this.rtree = rtree;
        }

        public synchronized RichTree getRtree() {
            return rtree;
        }




        public ChildPropertyTreeModel getEmployeeTree() {
            return employeeTree;
        }

        public String doRemoeTree() {
            /*THIS PROCEDURE IS OLD AND WILL NOT USE*/
            System.out.println("do remove tree call");
            // Add event code here...
            //System.out.println("b1 action........");
            allEmployees.clear();

            /* try {
                AdfFacesContext.getCurrentInstance().addPartialTarget(getRtree());
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            } */
            return null;
        }

        public String doCreateTree() {
/*THIS PROCEDURE IS OLD AND WILL NOT USE*/
            System.out.println("Hello.......");
            TreeElement te[];
            String amDef = "dgcom.model.ams.modLoginLocal";
            String config = "modLoginLocal";
            ApplicationModule am = Configuration.createRootApplicationModule(amDef, config);
            ViewObject vo = am.findViewObject("ApplicationActivityQVO1");
            vo.executeQuery();
            vo.setRangeSize(-1);
        //System.out.println(aa+ "total row count");
            te = new TreeElement[vo.getRowCount()];
            //System.out.println(vo.getRowCount()+ "");
            for (int i = 0; i < vo.getRowCount(); i++) {
                
                Row r = vo.getRowAtRangeIndex(i);
                te[i] =
                    new TreeElement(r.getAttribute("Moduleid").toString(), "London", "N",
                                    Integer.parseInt(r.getAttribute("TotChild").toString()),r.getAttribute("FileName").toString(),r.getAttribute("ModuleName").toString()); //adding tree
                if (r.getAttribute("ParentId") != null) {
                    
                    int ind = doGetIndex(r.getAttribute("ParentId").toString(), vo);
                    te[ind].addDirect(te[i]);
                    te[i].setIs_added("Y"); //adding tree
                }
            }
            for (int i = 0; i < te.length; i++) {
                if (te[i].getIs_added().equals("N")) {
                    allEmployees.add(te[i]);
                }
            }
            Configuration.releaseRootApplicationModule(am, true);
            employeeTree = new ChildPropertyTreeModel(allEmployees, "directs");
            
            return null;
        }

        /*public String b2_action() {
            // Add event code here...
            doCreateTree();
            return null;
        }*/
        public String doGetNodeValue() {
                DCBindingContainer bindings =
                    (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                DCIteratorBinding itorBinding =
                    bindings.findIteratorBinding("SysProgramROIterator");
              System.out.println(itorBinding.getCurrentRow().getAttribute("Moduleid"));  
                
                /*                 //return this.getRb1().getText();
            if (1==1) {
            return null;
       } */
            //System.out.println("ACT-"+this.getRot1().getValue().toString());
          //  System.out.println("-----------------H--------------"+"ACT-"+this.getRot1().getValue().toString());
            this.gotoActivity= "ACT-"+itorBinding.getCurrentRow().getAttribute("Moduleid");
            this.activityName=itorBinding.getCurrentRow().getAttribute("Moduleid").toString();
            this.activityDescription=itorBinding.getCurrentRow().getAttribute("ModuleName").toString();
            doSetModuleId(itorBinding.getCurrentRow().getAttribute("Moduleid").toString());
          //System.out.println("ACT-"+this.getRot1().getValue().toString() +" farrukh shaikh");
            return "StartTaskFlows";
            //return "/SO-0124.jsf";
            
        }
        
  /*this will delete*/
    private void doSetModuleId(String p_moduleid) {
        BindingContext      bindingContext = BindingContext.getCurrent();
        DCBindingContainer  dcbMod         = bindingContext.findBindingContainer("dgcom_view_tmpDigicomTemplatePageDef");
        DCIteratorBinding   ib             = dcbMod.findIteratorBinding("ApplicationActivityQVO1Iterator"); //can be used
        ViewObject          vo             = ib.getViewObject();
        vo.reset();
        vo.setWhereClause("moduleid='"+p_moduleid.toString()+"'");
        vo.executeQuery();
        

    }

        public int doGetIndex(String p_value, ViewObject vo) {
            Key k = new Key(new Object[] { p_value });
            Row[] byKey = vo.findByKey(k, 1);
            return Integer.parseInt(byKey[0].getAttribute("Rn").toString());
        }
        
     public void setACtivityNull() {
         
         this.gotoActivity=null;
     }
        public void collapseAllTreeNodes() {
            if (getRtree()!=null) {
                UIXTree tree = getRtree();
                RowKeySet _getSelectedRowKeys = tree.getSelectedRowKeys();
                if (_getSelectedRowKeys != null && _getSelectedRowKeys.size() > 0) {
                    _getSelectedRowKeys.clear();
                }
                RowKeySet _disclosedRowKeys = tree.getDisclosedRowKeys();
                if (_disclosedRowKeys != null && _disclosedRowKeys.size() > 0) {
                    _disclosedRowKeys.clear();
                }
                tree.setDisclosedRowKeys(_disclosedRowKeys);
            }
        }
        public String doGogoActivity() {
            System.out.println(this.getRot1().getValue());
            setActivityName(this.getRot1().getValue().toString());
            return this.getRot1().getValue().toString();
            //return "/"+this.getRot1().getValue()+".jsf";
        }
        public String doLogOut() {
           // return null;
            //return "/Login.jsf";
            return "ACT-Logout";
        }
    }


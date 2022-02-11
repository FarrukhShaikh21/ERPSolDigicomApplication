package dgcom.view.backing;


import dgcom.model.stand.DigicomClass;
import dgcom.model.vo.srv.SrvTechnicianVOImpl;

import dgcom.view.appbean.OracleReport;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;

public class CIC_0026 {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputDate id1;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichPanelGroupLayout pgl1;
    private RichButton b2;
    private RichButton b3;
    private RichToolbar t1;
    private RichButton b1;
    private RichButton b4;
    private RichButton b5;
    private RichButton b6;
    private RichTable t2;
    private RichPanelCollection pc1;
    private RichToolbar t3;
    private RichButton b7;
    private RichButton b8;
    private RichButton b9;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelLabelAndMessage plam1;
    private RichButton b10;
    private RichPopup p2;
    private RichDialog d3;
    private RichInputListOfValues locationidId;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichInputComboboxListOfValues txtTechnicianNameId;
    private RichPanelLabelAndMessage plam2;
    private RichInputText it2;
    private RichButton b11;

    public CIC_0026() {
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

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }


    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
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

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }


    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }


    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
    }

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void doSubmitJobAssign(DialogEvent de) {
        if (de.getOutcome()==DialogEvent.Outcome.yes) {
           BindingContainer bindings = getBindings();
           OperationBinding ob = bindings.getOperationBinding("Commit");
           ob.execute();
           OperationBinding operationBinding = bindings.getOperationBinding("doSubmitJobAssign");
           operationBinding.execute();
           AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPfl1());
           AdfFacesContext.getCurrentInstance().addPartialTarget(this.getT2());
           
       }
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String doDeleteDetail() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        this.getT2().resetStampState();
        return null;
    }

    public String doCreateNew() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        operationBinding = bindings.getOperationBinding("Commit");
        return null;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setD3(RichDialog d3) {
        this.d3 = d3;
    }

    public RichDialog getD3() {
        return d3;
    }

    public void setLocationidId(RichInputListOfValues locationidId) {
        this.locationidId = locationidId;
    }

    public RichInputListOfValues getLocationidId() {
        return locationidId;
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setTxtTechnicianNameId(RichInputComboboxListOfValues txtTechnicianNameId) {
        this.txtTechnicianNameId = txtTechnicianNameId;
    }

    public RichInputComboboxListOfValues getTxtTechnicianNameId() {
        return txtTechnicianNameId;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

public void remarksVCE(ValueChangeEvent vce) {
    /*     DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
    DCIteratorBinding ib=bc.findIteratorBinding("SrvJobassdetlDETCRUDIterator");
    
    if (ib.getViewObject().getRowCount()==0) {
            for (int i = 0; i < 10; i++) {
                Row r = ib.getViewObject().createRow();
                ib.getViewObject().insertRow(r);

            }
        } */


    }

    public List<SelectItem> getSuggestedDealer(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobassignCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        SrvTechnicianVOImpl  vo=(SrvTechnicianVOImpl)am.findViewObject("SrvTechnicianASB");
        vo.getViewObject().reset();
        vo.setNamedWhereClauseParam("P_ADF_LOCATIONID", (getLocationidId().getValue()==null?"-1":getLocationidId().getValue()));
        vo.isCustomWhereClause("Y");
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(Techician) LIKE upper('%"+resourceName+"%') and exist='Y'");
        vo.executeQuery();
        //vo.isCustomWhereClause("N");
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Techician")));
        }
        return resourceList;
        
    }
    
    public String doNew() {
        BindingContainer bindings = getBindings();
        DCIteratorBinding ib=(DCIteratorBinding)bindings.get("SrvJobassignCRUDIterator");
        OperationBinding operationBinding = bindings.getOperationBinding("doCreateNewJobAssignRow");
        Object result = operationBinding.execute();
        operationBinding = bindings.getOperationBinding("doCreateNewJobAssignDetRow");
        result = operationBinding.execute();
        /*         if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        ib.getCurrentRow().setAttribute("Assignid", getIt1().getValue());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getF1());
        
        for (int i = 0; i < 9; i++) {
           operationBinding = bindings.getOperationBinding("CreateInsert1");
           operationBinding.getParamsMap().put("Assignid", getIt1().getValue());
           operationBinding.execute(); 
       }    */

        return null;
    } 
    public String doPrint() {
        // Add event code here...
        OracleReport reportBean =
        new OracleReport("www01.qapp.com.pk", "10000", null);
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,"cache");// which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,"PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT,"Z:\\\\SERVICE\\\\reports\\\\JOb_Assigne.rep");
        reportBean.setReportParameter("USER",DigicomClass.getConnectedUser());
        reportBean.setReportParameter("FORM","Job_Assignment");
        reportBean.setReportParameter("COMP","2");
        reportBean.setReportParameter("Assign",getIt1().getValue().toString());
        String url = reportBean.getReportServerURL();
        
        reportBean.openUrlInNewWindow(url);
        return null;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }
    public void deptPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Rollback");
            ob.execute();
        }      
}

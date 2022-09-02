package dgcom.view.backing;

import dgcom.model.stand.DigicomClass;
import dgcom.model.vo.srv.SrvActionVOImpl;
import dgcom.model.vo.srv.SrvFaultsVOImpl;
import dgcom.model.vo.srv.SrvJobactionVOImpl;

import dgcom.view.appbean.OracleReport;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UISelectItems;
import javax.faces.event.ActionEvent;
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
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
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

public class CIC_0015 {
    private RichButton b6;
    private RichButton b5;
    private RichButton b3;
    private RichButton b2;
    private RichButton b1;
    private RichButton b4;
    private RichButton b15;
    private RichPanelGroupLayout pgl1;
    private RichToolbar t1;
    private RichButton b14;
    private RichButton b13;
    private RichToolbar t10;
    private RichPanelCollection pc4;
    private RichButton b11;
    private RichButton b12;
    private RichToolbar t8;
    private RichPanelCollection pc3;
    private RichPanelSplitter ps5;
    private RichTable t6;
    private RichPanelSplitter ps4;
    private RichTable t4;
    private RichButton b9;
    private RichButton b10;
    private RichToolbar t5;
    private RichPanelCollection pc2;
    private RichTable t2;
    private RichButton b7;
    private RichButton b8;
    private RichToolbar t3;
    private RichPanelCollection pc1;
    private RichPanelBox pb1;
    private RichPanelSplitter ps3;
    private RichInputText it5;
    private RichInputText it9;
    private UISelectItems si11;
    private RichSelectOneChoice soc3;
    private UISelectItems si10;
    private RichSelectOneChoice soc2;
    private RichInputText it3;
    private RichInputText it8;
    private RichSelectItem si9;
    private RichSelectItem si8;
    private RichSelectItem si7;
    private RichSelectItem si6;
    private RichSelectItem si5;
    private RichSelectItem si4;
    private RichSelectItem si3;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectOneChoice soc1;
    private RichPanelGroupLayout pgl2;
    private RichPanelLabelAndMessage plam2;
    private RichInputText it4;
    private RichInputListOfValues jobcardnoId;
    private RichInputDate id1;
    private RichInputText it1;
    private RichPanelLabelAndMessage plam1;
    private RichPanelFormLayout pfl1;
    private RichPanelSplitter ps2;
    private RichPanelSplitter ps1;
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichPanelBox pb4;
    private RichInputListOfValues locationidId;
    private RichButton b16;
    private RichPopup p2;
    private RichDialog d3;
    private RichPanelGroupLayout pgl3;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichInputText it10;
    private RichTable t7;
    private RichTable t9;
    private RichInputText it12;
    private RichButton b17;

    public CIC_0015() {
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
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

    public void setB15(RichButton b15) {
        this.b15 = b15;
    }

    public RichButton getB15() {
        return b15;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }


    public void setB14(RichButton b14) {
        this.b14 = b14;
    }

    public RichButton getB14() {
        return b14;
    }

    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }

    public void setT10(RichToolbar t10) {
        this.t10 = t10;
    }

    public RichToolbar getT10() {
        return t10;
    }

    public void setPc4(RichPanelCollection pc4) {
        this.pc4 = pc4;
    }

    public RichPanelCollection getPc4() {
        return pc4;
    }


    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }

    public void setPs5(RichPanelSplitter ps5) {
        this.ps5 = ps5;
    }

    public RichPanelSplitter getPs5() {
        return ps5;
    }

    public void setT6(RichTable t6) {
        this.t6 = t6;
    }

    public RichTable getT6() {
        return t6;
    }

    public void setPs4(RichPanelSplitter ps4) {
        this.ps4 = ps4;
    }

    public RichPanelSplitter getPs4() {
        return ps4;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
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

    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPs3(RichPanelSplitter ps3) {
        this.ps3 = ps3;
    }

    public RichPanelSplitter getPs3() {
        return ps3;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setSi11(UISelectItems si11) {
        this.si11 = si11;
    }

    public UISelectItems getSi11() {
        return si11;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi10(UISelectItems si10) {
        this.si10 = si10;
    }

    public UISelectItems getSi10() {
        return si10;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setSi9(RichSelectItem si9) {
        this.si9 = si9;
    }

    public RichSelectItem getSi9() {
        return si9;
    }

    public void setSi8(RichSelectItem si8) {
        this.si8 = si8;
    }

    public RichSelectItem getSi8() {
        return si8;
    }

    public void setSi7(RichSelectItem si7) {
        this.si7 = si7;
    }

    public RichSelectItem getSi7() {
        return si7;
    }

    public void setSi6(RichSelectItem si6) {
        this.si6 = si6;
    }

    public RichSelectItem getSi6() {
        return si6;
    }

    public void setSi5(RichSelectItem si5) {
        this.si5 = si5;
    }

    public RichSelectItem getSi5() {
        return si5;
    }

    public void setSi4(RichSelectItem si4) {
        this.si4 = si4;
    }

    public RichSelectItem getSi4() {
        return si4;
    }

    public void setSi3(RichSelectItem si3) {
        this.si3 = si3;
    }

    public RichSelectItem getSi3() {
        return si3;
    }

    public void setSi1(RichSelectItem si1) {
        this.si1 = si1;
    }

    public RichSelectItem getSi1() {
        return si1;
    }

    public void setSi2(RichSelectItem si2) {
        this.si2 = si2;
    }

    public RichSelectItem getSi2() {
        return si2;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setJobcardnoId(RichInputListOfValues jobcardnoId) {
        this.jobcardnoId = jobcardnoId;
    }

    public RichInputListOfValues getJobcardnoId() {
        return jobcardnoId;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
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

    public void doDialogEventSubmit(DialogEvent de) {
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            DCIteratorBinding ib = bc.findIteratorBinding("SrvJobsolutionCRUDIterator");
            OperationBinding ob = bc.getOperationBinding("Commit");
            ob.execute();
            ib.getViewObject().getCurrentRow().setAttribute("Posted", "Y");
            ob = bc.getOperationBinding("Commit");
            ob.execute();
            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }
            ob = bc.getOperationBinding("doSubmitJobSolutions");
            ob.execute();

            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }
            AdfFacesContext.getCurrentInstance().addPartialTarget(getF1());
        }
    } 
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
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

    public String doDeletePartConsumed() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        this.getT2().resetStampState();
        AdfFacesContext.getCurrentInstance().addPartialTarget(getT2());
        return null;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public String doDeletePartsRepair() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete2");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        this.getT4().resetStampState();
        AdfFacesContext.getCurrentInstance().addPartialTarget(getT4());
        return null;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }

    /*     public String doDeleteFaults() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete3");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        //this.getT7().resetStampState();
        //AdfFacesContext.getCurrentInstance().addPartialTarget(getT7());
        return null;
    } */

    public String doDeleteActions() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete4");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        //this.getT9().resetStampState();
        //AdfFacesContext.getCurrentInstance().addPartialTarget(getT9());
        return null;
    }

    public void setLocationidId(RichInputListOfValues locationidId) {
        this.locationidId = locationidId;
    }

    public RichInputListOfValues getLocationidId() {
        return locationidId;
    }

    public void setB16(RichButton b16) {
        this.b16 = b16;
    }

    public RichButton getB16() {
        return b16;
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


    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
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

    public List<SelectItem> getSuggestedDealer(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobsolutionCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        SrvJobactionVOImpl  vo=(SrvJobactionVOImpl)am.findViewObject("SrvActionASB");
        vo.getViewObject().reset();
        vo.setNamedWhereClauseParam("P_ADF_PROD_ID", (getLocationidId().getValue()==null?"-1":getLocationidId().getValue()));
        vo.isCustomWhereClause("Y");
        vo.executeQuery();
        System.out.println("resourceName");
        
        vo.getViewObject().setWhereClause("UPPER(NAME) LIKE upper('%"+resourceName+"%')");
        System.out.println(" this is where clause "+vo.getWhereClause());
        vo.executeQuery();
        //vo.isCustomWhereClause("N");
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Name")));
        }
        return resourceList;
        
    }

    public List<SelectItem> getSuggestedFault(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobsolutionCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        SrvFaultsVOImpl  vo=(SrvFaultsVOImpl)am.findViewObject("SrvFaultsASB");
        vo.getViewObject().reset();
        vo.setNamedWhereClauseParam("P_ADF_PROD_ID",(getIt10().getValue()==null?"-1":getIt10().getValue()));
        vo.isCustomWhereClause("Y");
        vo.executeQuery();
        System.out.println("resourceName");
        
        vo.getViewObject().setWhereClause("UPPER(DESCRIPTION) LIKE upper('%"+resourceName+"%')");
        System.out.println(" this is where clause "+vo.getWhereClause());
        vo.executeQuery();
        //vo.isCustomWhereClause("N");
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Description")));
        }
        return resourceList;
        
    }

    public List<SelectItem> getSuggestedAction(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobsolutionCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        SrvActionVOImpl  vo=(SrvActionVOImpl)am.findViewObject("SrvActionASB");
        vo.getViewObject().reset();
        vo.setNamedWhereClauseParam("P_ADF_PROD_ID",(getIt10().getValue()==null?"-1":getIt10().getValue()));
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(DESCRIPTION) LIKE upper('%"+resourceName+"%')");
        vo.executeQuery();
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Description")));
        }
        return resourceList;
        
    }
    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }


    public void setT7(RichTable t7) {
        this.t7 = t7;
    }

    public RichTable getT7() {
        return t7;
    }
    
    public String doNew() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("doCreateNewJobSolRow");
        Object result = operationBinding.execute();
        operationBinding = bindings.getOperationBinding("doCreateNewJobFaultRow");
         result = operationBinding.execute();
        operationBinding = bindings.getOperationBinding("doCreateNewJobActionRow");
        result = operationBinding.execute();
        
        return null;
    }

    public void setT9(RichTable t9) {
        this.t9 = t9;
    }

    public RichTable getT9() {
        return t9;
    }

    public void execute(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public String doPrint() {
        // Add event code here...
        OracleReport reportBean =
        new OracleReport("app.deploy.com.pk", "55000", null);
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,"cache");// which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,"PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT,"Z:\\\\SERVICE\\\\reports\\\\SRV_JobSolution.rep");
        reportBean.setReportParameter("USER",DigicomClass.getConnectedUser());
        reportBean.setReportParameter("FORM","SRV_JobSolution");
        reportBean.setReportParameter("COMP","2");
        reportBean.setReportParameter("JSID",getIt1().getValue().toString());
        String url = reportBean.getReportServerURL();
        
        reportBean.openUrlInNewWindow(url);
        return null;
    }

    public void setB17(RichButton b17) {
        this.b17 = b17;
    }

    public RichButton getB17() {
        return b17;
    }
    public void deptPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Rollback");
            ob.execute();
        }      
}

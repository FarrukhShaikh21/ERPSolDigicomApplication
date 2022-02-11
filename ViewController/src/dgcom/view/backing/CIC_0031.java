package dgcom.view.backing;

import dgcom.model.stand.DigicomClass;
import dgcom.model.vo.srv.SrvTechnicianVOImpl;

import dgcom.view.appbean.OracleReport;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UISelectItems;
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
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
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


public class CIC_0031 {
    private RichButton b4;
    private RichButton b3;
    private RichButton b2;
    private RichButton b1;
    private RichButton b5;
    private RichButton b6;
    private RichButton b7;
    private RichPanelGroupLayout pgl1;
    private RichToolbar t1;
    private RichPanelCollection pc5;
    private RichPanelCollection pc4;
    private RichPanelSplitter ps5;
    private RichTable t3;
    private RichPanelCollection pc2;
    private RichTable t2;
    private RichPanelCollection pc1;
    private RichPanelSplitter ps4;
    private RichPanelSplitter ps3;
    private RichTable t4;
    private RichPanelCollection pc3;
    private RichInputText it7;
    private UISelectItems si1;
    private RichSelectOneChoice soc1;
    private RichSelectItem si3;
    private RichSelectItem si2;
    private RichSelectOneChoice soc2;
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
    private RichInputListOfValues locationidId;
    private RichButton b8;
    private RichPopup p2;
    private RichDialog d3;
    private RichInputDate id2;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichPanelLabelAndMessage plam2;
    private RichInputComboboxListOfValues txtTechnicianNameId;
    private RichInputText it4;
    private RichTable t6;
    private RichTable t5;
    private RichInputText it5;
    private RichButton b9;

    public CIC_0031() {
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
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

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
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


    public void setPc5(RichPanelCollection pc5) {
        this.pc5 = pc5;
    }

    public RichPanelCollection getPc5() {
        return pc5;
    }


    public void setPc4(RichPanelCollection pc4) {
        this.pc4 = pc4;
    }

    public RichPanelCollection getPc4() {
        return pc4;
    }

    public void setPs5(RichPanelSplitter ps5) {
        this.ps5 = ps5;
    }

    public RichPanelSplitter getPs5() {
        return ps5;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
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

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setPs4(RichPanelSplitter ps4) {
        this.ps4 = ps4;
    }

    public RichPanelSplitter getPs4() {
        return ps4;
    }

    public void setPs3(RichPanelSplitter ps3) {
        this.ps3 = ps3;
    }

    public RichPanelSplitter getPs3() {
        return ps3;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi3(RichSelectItem si3) {
        this.si3 = si3;
    }

    public RichSelectItem getSi3() {
        return si3;
    }

    public void setSi2(RichSelectItem si2) {
        this.si2 = si2;
    }

    public RichSelectItem getSi2() {
        return si2;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
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
            DCIteratorBinding ib = bc.findIteratorBinding("SrvJobqcCRUDIterator");
            OperationBinding ob = bc.getOperationBinding("Commit");
            ob.execute();
            ib.getViewObject().getCurrentRow().setAttribute("Posted", "Y");
            ob = bc.getOperationBinding("Commit");
            ob.execute();
            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }
            ob = bc.getOperationBinding("doSubmitJobQC");
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


    public void setLocationidId(RichInputListOfValues locationidId) {
        this.locationidId = locationidId;
    }

    public RichInputListOfValues getLocationidId() {
        return locationidId;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
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


    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
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


    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }


    public void setTxtTechnicianNameId(RichInputComboboxListOfValues txtTechnicianNameId) {
        this.txtTechnicianNameId = txtTechnicianNameId;
    }

    public RichInputComboboxListOfValues getTxtTechnicianNameId() {
        return txtTechnicianNameId;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public List<SelectItem> getSuggestedTechnician(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobqcCRUDIterator");
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


    public void setT6(RichTable t6) {
        this.t6 = t6;
    }

    public RichTable getT6() {
        return t6;
    }

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public String doPrint() {
        // Add event code here...
        OracleReport reportBean =
        new OracleReport("www01.qapp.com.pk", "10000", null);
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,"cache");// which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,"PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT,"Z:\\\\SERVICE\\\\reports\\\\JobcardQC.rep");
        reportBean.setReportParameter("USER",DigicomClass.getConnectedUser());
        reportBean.setReportParameter("FORM","Service_JobQC");
        reportBean.setReportParameter("COMP","2");
        reportBean.setReportParameter("JOBQCID",getIt1().getValue().toString());
        String url = reportBean.getReportServerURL();
        
        reportBean.openUrlInNewWindow(url);
        return null;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }
    public void deptPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Rollback");
            ob.execute();
        }  

}

package dgcom.view.backing;

import dgcom.model.stand.DigicomClass;
import dgcom.model.vo.srv.SrvDealersVOImpl;

import dgcom.view.appbean.OracleReport;

import java.util.ArrayList;
import java.util.List;

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
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;

public class CIC_0016 {
    private RichButton b3;
    private RichButton b2;
    private RichButton b4;
    private RichButton b1;
    private RichButton b6;
    private RichButton b5;
    private RichButton b7;
    private RichButton b8;
    private RichPanelGroupLayout pgl1;
    private RichInputText it9;
    private RichInputText it8;
    private RichInputText it7;
    private RichInputDate id2;
    private RichInputText it6;
    private RichInputListOfValues branchidId;
    private RichSelectItem si6;
    private RichSelectItem si5;
    private RichSelectItem si4;
    private RichSelectItem si3;
    private RichSelectItem si2;
    private RichSelectItem si1;
    private RichSelectOneChoice soc1;
    private RichInputDate id1;
    private RichInputText it1;
    private RichPanelLabelAndMessage plam1;
    private RichPanelFormLayout pfl1;
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichPopup p1;
    private RichDialog d2;
    private RichPopup p2;
    private RichDialog d3;
    private RichTable t1;
    private RichButton b9;
    private RichPopup p3;
    private RichDialog d4;
    private RichInputListOfValues locationidId;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichButton b10;
    private RichInputComboboxListOfValues txtDealerNameId;
    private RichInputText it2;
    private RichPanelGroupLayout pgl3;
    private RichPanelLabelAndMessage plam2;

    public CIC_0016() {
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

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
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

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setBranchidId(RichInputListOfValues branchidId) {
        this.branchidId = branchidId;
    }

    public RichInputListOfValues getBranchidId() {
        return branchidId;
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

    public void setSi2(RichSelectItem si2) {
        this.si2 = si2;
    }

    public RichSelectItem getSi2() {
        return si2;
    }

    public void setSi1(RichSelectItem si1) {
        this.si1 = si1;
    }

    public RichSelectItem getSi1() {
        return si1;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
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
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    public void doDialogEventSubmit(DialogEvent de) {
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            DCIteratorBinding ib = bc.findIteratorBinding("SrvReceiptMasterCRUDIterator");
            OperationBinding ob = bc.getOperationBinding("Commit");
            ob.execute();
            ib.getViewObject().getCurrentRow().setAttribute("Posted", "Y");
            ob = bc.getOperationBinding("Commit");
            ob.execute();
            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }
            ob = bc.getOperationBinding("doSubmitSrvReceipt");
            ob.execute();

            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }
            AdfFacesContext.getCurrentInstance().addPartialTarget(getF1());
        }
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

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }

    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setD4(RichDialog d4) {
        this.d4 = d4;
    }

    public RichDialog getD4() {
        return d4;
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
    public String doPrint() {
        // Add event code here...
        OracleReport reportBean =
        new OracleReport("app.deploy.com.pk", "55000", null);
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,"cache");// which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,"PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT,"Z:\\\\SERVICE\\\\reports\\\\SRV_RECEIPT_MASTER.rep");
        reportBean.setReportParameter("USER",DigicomClass.getConnectedUser());
        reportBean.setReportParameter("FORM","SRV_RECEIPT_MASTER");
        reportBean.setReportParameter("COMP","2");
        reportBean.setReportParameter("RECEIPT_NO",getIt1().getValue().toString());
        String url = reportBean.getReportServerURL();
        
        reportBean.openUrlInNewWindow(url);
        return null;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setTxtDealerNameId(RichInputComboboxListOfValues txtDealerNameId) {
        this.txtDealerNameId = txtDealerNameId;
    }

    public RichInputComboboxListOfValues getTxtDealerNameId() {
        return txtDealerNameId;
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

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public List<SelectItem> getSuggestedDealer(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvReceiptMasterCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        SrvDealersVOImpl  vo=(SrvDealersVOImpl)am.findViewObject("SrvDealersASB");
        vo.getViewObject().reset();
        vo.setNamedWhereClauseParam("P_ADF_LOCATIONID", (getLocationidId().getValue()==null?"-1":getLocationidId().getValue()));
        vo.isCustomWhereClause("Y");
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(NAME) LIKE upper('%"+resourceName+"%')");
        vo.executeQuery();
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Name")));
        }
        return resourceList;
    }    
    public void deptPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Rollback");
            ob.execute();
        }      
}

package dgcom.view.backing;

import dgcom.model.stand.DigicomClass;

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
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class CIC_0027 {
    private RichButton b4;
    private RichButton b9;
    private RichButton b8;
    private RichButton b3;
    private RichButton b6;
    private RichButton b7;
    private RichButton b5;
    private RichPanelGroupLayout pgl1;
    private RichTable t1;
    private RichButton b2;
    private RichButton b1;
    private RichToolbar t2;
    private RichPanelCollection pc1;
    private RichInputText it2;
    private RichInputDate id1;
    private RichInputText it1;
    private RichPanelFormLayout pfl1;
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl2;
    private RichPanelLabelAndMessage plam1;
    private RichInputText it6;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelGroupLayout pgl3;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichInputComboboxListOfValues txtSupplierId;
    private RichInputText it9;
    private RichPanelGroupLayout pgl4;
    private RichPanelLabelAndMessage plam2;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichInputText it4;
    private RichSelectOneChoice soc2;
    private RichSelectItem si3;
    private RichSelectItem si4;
    private RichButton b10;
    private RichInputComboboxListOfValues txtModelNameId;

    public CIC_0027() {
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
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

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
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

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
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


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }


    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }
    
    public List<SelectItem> getSuggestedPart(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvBompartsDetCRUDIterator");
        //SrvBompartsDetCRUD
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject  vo=am.findViewObject("ASBInPartsCIC_0027");
        vo.getViewObject().reset();
        vo.getViewObject().setWhereClause("UPPER((DESCRIPTION)) LIKE upper('%"+resourceName+"%') and rownum<=10");
        vo.executeQuery();
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Description")));
        }
        return resourceList;
    }
        
    public List<SelectItem> getSuggestedModel(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvBomCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject  vo=am.findViewObject("ASBInItemsCIC_0027");
        vo.getViewObject().reset();
        vo.getViewObject().setWhereClause("UPPER((MODEL_NO)) LIKE upper('%"+resourceName+"%') and rownum<=10");
        vo.executeQuery();
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("ModelNo")));
        }
        return resourceList;
    }
    public List<SelectItem> getSuggestedSupp(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvBomCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject  vo=am.findViewObject("ASBSupplierCIC_0027");
        vo.getViewObject().reset();
        vo.getViewObject().setWhereClause("UPPER((SUPP_NAME)) LIKE upper('%"+resourceName+"%') and rownum<=10");
        vo.executeQuery();
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("SuppName")));
        }
        return resourceList;
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    public void deptPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Rollback");
            ob.execute();
        }
    public String doPrint() {
        // Add event code here...
        OracleReport reportBean =
        new OracleReport("app.deploy.com.pk", "55000", null);
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,"cache");// which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,"PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT,"Z:\\\\SERVICE\\\\reports\\\\SRV_BOM.rep");
        reportBean.setReportParameter("USER",DigicomClass.getConnectedUser());
        reportBean.setReportParameter("FORM","Job_Assignment");
        reportBean.setReportParameter("COMP","2");
        reportBean.setReportParameter("BOMID",getIt1().getValue().toString());
        String url = reportBean.getReportServerURL();
        
        reportBean.openUrlInNewWindow(url);
        return null;
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

    public void setTxtSupplierId(RichInputComboboxListOfValues txtSupplierId) {
        this.txtSupplierId = txtSupplierId;
    }

    public RichInputComboboxListOfValues getTxtSupplierId() {
        return txtSupplierId;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }


    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
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


    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }


    public void setSi3(RichSelectItem si3) {
        this.si3 = si3;
    }

    public RichSelectItem getSi3() {
        return si3;
    }

    public void setSi4(RichSelectItem si4) {
        this.si4 = si4;
    }

    public RichSelectItem getSi4() {
        return si4;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }


    public void setTxtModelNameId(RichInputComboboxListOfValues txtModelNameId) {
        this.txtModelNameId = txtModelNameId;
    }

    public RichInputComboboxListOfValues getTxtModelNameId() {
        return txtModelNameId;
    }
}

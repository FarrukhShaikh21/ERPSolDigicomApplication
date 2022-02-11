package dgcom.view.backing;

import dgcom.model.stand.DigicomClass;

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
import oracle.jbo.ViewObject;

public class CIC_0065 {
    private RichButton b3;
    private RichButton b2;
    private RichButton b4;
    private RichButton b1;
    private RichButton b6;
    private RichButton b5;
    private RichButton b7;
    private RichPanelGroupLayout pgl1;
    private RichInputText it5;
    private RichInputListOfValues tolocationidId;
    private RichInputText it2;
    private RichInputDate id1;
    private RichInputText it1;
    private RichPanelLabelAndMessage plam1;
    private RichPanelFormLayout pfl1;
    private RichPageTemplate pt1;
    private RichDialog d2;
    private RichPopup p1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichButton b10;
    private RichPopup p2;
    private RichDialog d3;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichPanelCollection pc1;
    private RichToolbar t2;
    private RichButton b8;
    private RichButton b9;
    private RichTable t1;
    private RichButton b11;
    private RichInputComboboxListOfValues iclov1;
    private RichPanelLabelAndMessage plam2;
    private RichPanelGroupLayout pgl3;
    private RichInputText it9;
    private RichInputComboboxListOfValues txtCatNameId;
    private RichInputText it10;
    private RichPanelGroupLayout pgl4;
    private RichPanelLabelAndMessage plam3;
    private RichInputComboboxListOfValues txtModelNameId;
    private RichInputText it11;
    private RichPanelGroupLayout pgl5;
    private RichPanelLabelAndMessage plam4;
    private RichPanelGroupLayout pgl6;

    public CIC_0065() {
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

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }


    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }


    public void setTolocationidId(RichInputListOfValues tolocationidId) {
        this.tolocationidId = tolocationidId;
    }

    public RichInputListOfValues getTolocationidId() {
        return tolocationidId;
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

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
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
            DCIteratorBinding ib = bc.findIteratorBinding("SrvStnStoreCRUDIterator");
            OperationBinding ob = bc.getOperationBinding("Commit");
            ob.execute();
            ib.getViewObject().getCurrentRow().setAttribute("Posted", "Y");
            ob.execute();
            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }
            ob = bc.getOperationBinding("doSubmitSrvStnStore");
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


    public String doNew() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("doCreateNewStnRow");
        Object result = operationBinding.execute();
        operationBinding = bindings.getOperationBinding("doCreateNewStnDetRow");
        result = operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(getF1());


        return null;
    }
    public void dopopulateDetail(ValueChangeEvent vce) {
        if (1==1) {
            return;
       }
        BindingContainer bindings = getBindings();
        DCIteratorBinding iter=(DCIteratorBinding)bindings.get("SrvStnpartsStoreDETCRUDIterator");
        
        iter.getViewObject().first();
        iter.getViewObject().setCurrentRow(iter.getViewObject().first());
        iter.getViewObject().first().setAttribute("Fromstoreid", vce.getNewValue());
        
        while(iter.getViewObject().hasNext()) {
           Row r =iter.getViewObject().next();
            iter.getViewObject().setCurrentRow(r);
            r.setAttribute("Fromstoreid", vce.getNewValue());
        }
        /* for (int i = 0; i < iter.getEstimatedRowCount(); i++) {
            iter.getViewObject().getRowAtRangeIndex(i).setAttribute("Fromstoreid", vce.getNewValue());
       } */
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(getT1());

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


    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
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

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }
    public String doPrint() {
        // Add event code here...
        OracleReport reportBean =
        new OracleReport("www01.qapp.com.pk", "10000", null);
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,"cache");// which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,"PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT,"Z:\\\\SERVICE\\\\reports\\\\STN_Print_Doc.rep");
        reportBean.setReportParameter("USER",DigicomClass.getConnectedUser());
        reportBean.setReportParameter("FORM","Service_STN");
        reportBean.setReportParameter("COMP","2");
        reportBean.setReportParameter("LOCID",getIt2().getValue().toString());
        
        reportBean.setReportParameter("STN_NO",getIt1().getValue().toString());
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
    public List<SelectItem> getSuggestedFromStore(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvStnStoreCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("AllStoresASB");
        vo.getViewObject().reset();
        
        vo.setNamedWhereClauseParam("P_ADF_LOCATIONID", (getIt2().getValue()==null?"-1":getIt2().getValue()));
        /*vo.setNamedWhereClauseParam("P_ADF_MODEL_NO", (getIt2().getValue()==null?"-1":getIt2().getValue()));
        vo.setNamedWhereClauseParam("P_ADF_PROD_ID", (getSoc1().getValue()==null?"-1":getSoc1().getValue()));
        */ //vo.executeQuery();
        
        System.out.println("rcnt+>"+ vo.getRowCount());
        vo.getViewObject().setWhereClause("UPPER(STORE_NAME) LIKE upper('%"+resourceName+"%')");
        vo.executeQuery();
        System.out.println("rcnt2+>"+ vo.getRowCount());
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("StoreName")));
        }
        return resourceList;
    } 
    
    public List<SelectItem> getSuggesteToStore(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvStnStoreCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("AllStoresASB");
        vo.getViewObject().reset();
        
        vo.setNamedWhereClauseParam("P_ADF_LOCATIONID", (getTolocationidId().getValue()==null?"-1":getTolocationidId().getValue()));
        /*vo.setNamedWhereClauseParam("P_ADF_MODEL_NO", (getIt2().getValue()==null?"-1":getIt2().getValue()));
        vo.setNamedWhereClauseParam("P_ADF_PROD_ID", (getSoc1().getValue()==null?"-1":getSoc1().getValue()));
        */ //vo.executeQuery();
        
       
        vo.getViewObject().setWhereClause("UPPER(STORE_NAME) LIKE upper('%"+resourceName+"%')");
        vo.executeQuery();
       
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("StoreName")));
        }
        return resourceList;
    }

    public void setIclov1(RichInputComboboxListOfValues iclov1) {
        this.iclov1 = iclov1;
    }

    public RichInputComboboxListOfValues getIclov1() {
        return iclov1;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setTxtCatNameId(RichInputComboboxListOfValues txtCatNameId) {
        this.txtCatNameId = txtCatNameId;
    }

    public RichInputComboboxListOfValues getTxtCatNameId() {
        return txtCatNameId;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }
    public List<SelectItem> getSuggestedPartCat(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvStnStoreCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("SrvPartcategoryASB");
        vo.getViewObject().reset();
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(Description) LIKE upper('%"+resourceName+"%')");
        vo.executeQuery();
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("Description")));
        }
        return resourceList;
        
    } 
    public List<SelectItem> getSuggestedModel(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvStnStoreCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("ASBInItemsCIC_0065");
        vo.getViewObject().reset();
        //vo.setNamedWhereClauseParam("P_ADF_BRAND_ID", (getSoc9().getValue()==null?"-1":getSoc9().getValue()));
        vo.executeQuery();
        vo.getViewObject().setWhereClause("UPPER(MODEL_NO) LIKE upper('%"+resourceName+"%')");
        vo.executeQuery();
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("ModelNo")));
        }
        return resourceList;
        
    }

    public void setTxtModelNameId(RichInputComboboxListOfValues txtModelNameId) {
        this.txtModelNameId = txtModelNameId;
    }

    public RichInputComboboxListOfValues getTxtModelNameId() {
        return txtModelNameId;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
    }
    public List<SelectItem> getSuggestedPart(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvStnStoreCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("ASBSrvStnSrvStnPartPartIdForStnStoreCIC_0065");
        vo.getViewObject().reset();
        
        //System.out.println("getTxtModelNameId"+getTxtModelNameId().getValue());
        //System.out.println("getSoc1"+getSoc1().getValue());
        System.out.println(getIt9().getValue()==null?"":getIt9().getValue());
        System.out.println(getIt10().getValue()==null?"":getIt10().getValue());
        System.out.println(getIt11().getValue()==null?"":getIt11().getValue());
        
        vo.setNamedWhereClauseParam("P_ADF_FROMSTOREID", (getIt9().getValue()==null?"":getIt9().getValue()));
       // vo.setNamedWhereClauseParam("P_ADF_DEMAND_ID", (getTxtDemandIdId().getValue()==null?"-1":getTxtDemandIdId().getValue()));
        //vo.setNamedWhereClauseParam("P_ADF_STNDETLID", (getIt12().getValue()==null?"-1":getIt12().getValue()));
        vo.setNamedWhereClauseParam("P_ADF_CATID", (getIt10().getValue()==null?"":getIt10().getValue()));
        vo.setNamedWhereClauseParam("P_ADF_MODELID", (getIt11().getValue()==null?"":getIt11().getValue()));
        //vo.setNamedWhereClauseParam("P_ADF_LOCATIONID", (getLocationidId().getValue()==null?"-1":getLocationidId().getValue()));
        
        
        
        //vo.executeQuery();
        
        
        vo.getViewObject().setWhereClause("UPPER(Part_Name) LIKE upper('%"+resourceName+"%')");
        System.out.println(vo.getWhereClause());
        vo.executeQuery();
        
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("PartName")));
        }
        return resourceList;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }
    public void deptPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Rollback");
            ob.execute();
        }      
}

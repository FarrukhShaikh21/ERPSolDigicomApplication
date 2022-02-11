package dgcom.view.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UISelectItems;
import javax.faces.model.SelectItem;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class CIC_0088 {
    private RichTable t1;
    private RichButton b1;
    private UISelectItems si2;
    private RichSelectOneChoice soc2;
    private RichPanelFormLayout pfl1;
    private RichPanelSplitter ps1;
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichInputComboboxListOfValues modelNameId;
    private RichInputText it9;
    private RichInputComboboxListOfValues partNameId;
    private RichInputText it11;

    public CIC_0088() {
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }


    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }


    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
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

    public void setModelNameId(RichInputComboboxListOfValues modelNameId) {
        this.modelNameId = modelNameId;
    }

    public RichInputComboboxListOfValues getModelNameId() {
        return modelNameId;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public List<SelectItem> getSuggestedModel(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("ControlBlockROIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("ASBInItemsCIC_0088");
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

    public List<SelectItem> getSuggestedPart(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("ControlBlockROIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("ASBSrvPartItemAndCategoryWiseCIC_0088");
        vo.getViewObject().reset();
        
        //System.out.println("getTxtModelNameId"+getTxtModelNameId().getValue());
        //System.out.println("getSoc1"+getSoc1().getValue());
        
        //vo.setNamedWhereClauseParam("P_ADF_STNDETLID", (getIt12().getValue()==null?"-1":getIt12().getValue()));
        vo.setNamedWhereClauseParam("P_CAT_ID", (getSoc2().getValue()==null?"":getSoc2().getValue()));
        vo.setNamedWhereClauseParam("P_ADF_ITEMID", (getIt9().getValue()==null?"":getIt9().getValue()));
        //vo.setNamedWhereClauseParam("P_ADF_LOCATIONID", (getLocationidId().getValue()==null?"-1":getLocationidId().getValue()));
        
        
        
        //vo.executeQuery();
        
        
        vo.getViewObject().setWhereClause("Partno||PartId||UPPER(Part_Desc) LIKE upper('%"+resourceName+"%') AND ROWNUM<=10");
        vo.executeQuery();
        
        //System.out.println(vo.getEstimatedRowCount()+ " ERC");
        while(vo.getViewObject().hasNext()) {
            Row resourceRow=vo.next();
            resourceList.add(new SelectItem(resourceRow.getAttribute("PartDesc"),resourceRow.getAttribute("PartDesc")+":"+resourceRow.getAttribute("Partno").toString()+":"+resourceRow.getAttribute("Partid")));
        }
        return resourceList;
    }


    public void setPartNameId(RichInputComboboxListOfValues partNameId) {
        this.partNameId = partNameId;
    }

    public RichInputComboboxListOfValues getPartNameId() {
        return partNameId;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }
}

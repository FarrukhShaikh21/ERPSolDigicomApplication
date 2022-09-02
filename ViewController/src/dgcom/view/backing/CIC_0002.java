package dgcom.view.backing;

import dgcom.model.stand.DigicomClass;
import dgcom.model.vo.srv.SrvDealersVOImpl;

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
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessage;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSpacer;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.SQLStmtException;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;

public class CIC_0002 {
    private RichButton b3;
    private RichButton b6;
    private RichButton b1;
    private RichButton b2;
    private RichButton b5;
    private RichButton b4;
    private RichToolbar t1;
    private RichInputText it25;
    private RichInputText it24;
    private RichInputText it23;
    private RichInputText it22;
    private RichInputDate id3;
    private RichSelectItem si11;
    private RichSelectItem si10;
    private RichSelectOneChoice soc8;
    private RichSelectItem si9;
    private RichSelectItem si8;
    private RichSelectItem si7;
    private RichSelectOneChoice soc7;
    private UISelectItems si6;
    private RichSelectOneChoice soc6;
    private UISelectItems si5;
    private RichSelectOneChoice soc5;
    private UISelectItems si4;
    private RichSelectOneChoice soc4;
    private RichPanelFormLayout pfl1;
    private RichInputText it14;
    private RichInputText it12;
    private RichInputListOfValues dealerIdId;
    private RichInputText it11;
    private RichInputText it10;
    private RichInputText it9;
    private UISelectItems si3;
    private RichSelectOneChoice soc3;
    private RichInputDate id2;
    private UISelectItems si2;
    private RichSelectOneChoice soc2;
    private RichInputText it4;
    private RichInputText it3;
    private RichInputDate id1;
    private RichInputText it1;
    private RichPanelFormLayout pfl2;
    private RichPanelSplitter ps1;
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichInputText it15;
    private RichTable t2;
    private RichPanelCollection pc1;
    private RichToolbar t3;
    private RichButton b7;
    private RichButton b8;
    private RichButton b9;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelLabelAndMessage plam1;
    private RichInputText it17;
    private RichInputText it18;
    private RichButton b10;
    private RichPopup p2;
    private RichDialog d3;
    private RichPanelFormLayout pfl3;
    private RichInputText it21;
    private RichInputText it27;
    private RichInputText it28;
    private RichInputListOfValues itemid1Id;
    private RichInputText it13;
    private RichSelectOneChoice soc10;
    private UISelectItems si13;
    private RichButton b11;
    private RichInputListOfValues locationidId;
    private RichPopup p3;
    private RichDialog d4;
    private RichPanelGroupLayout pgl2;
    private RichSpacer s1;
    private RichPanelBox pb1;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichPanelLabelAndMessage plam2;
    private RichPanelGroupLayout pgl3;
    private RichPanelLabelAndMessage plam3;
    private RichPanelGroupLayout pgl4;
    private RichPanelLabelAndMessage plam4;
    private RichPanelGroupLayout pgl5;
    private RichButton b12;
    private RichInputComboboxListOfValues nameId;
    private RichPanelLabelAndMessage plam5;
    private RichPanelGroupLayout pgl6;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichInputComboboxListOfValues txtModelNo1Id;
    private RichSelectOneChoice soc9;
    private UISelectItems si12;
    private RichInputText it2;
    private RichInputText it5;
    private RichMessages m2;
    private RichPanelGroupLayout pgl7;
    private RichMessage m3;
    private RichPanelGroupLayout pgl8;
    private RichInputText it6;

    public CIC_0002() {
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

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }


    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setIt23(RichInputText it23) {
        this.it23 = it23;
    }

    public RichInputText getIt23() {
        return it23;
    }

    public void setIt22(RichInputText it22) {
        this.it22 = it22;
    }

    public RichInputText getIt22() {
        return it22;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }


    public void setSi11(RichSelectItem si11) {
        this.si11 = si11;
    }

    public RichSelectItem getSi11() {
        return si11;
    }

    public void setSi10(RichSelectItem si10) {
        this.si10 = si10;
    }

    public RichSelectItem getSi10() {
        return si10;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
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

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }


    public void setDealerIdId(RichInputListOfValues dealerIdId) {
        this.dealerIdId = dealerIdId;
    }

    public RichInputListOfValues getDealerIdId() {
        return dealerIdId;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
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


    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
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

    public void imeiVCE(ValueChangeEvent vce) {
        if (1 == 1) {
            return;
        }
        ViewObject vojOBCARD = doGetBindingVO("SrvJobcardCRUDIterator");
        try {

            ApplicationModule am = vojOBCARD.getApplicationModule();
            ViewObject imeiVo = am.findViewObject("imeiVO");
            if (imeiVo != null) {
                imeiVo.remove();
            }

            imeiVo =
                am.createViewObjectFromQueryStmt("imeiVO",
                                                 "SELECT A.EXP_DATE FROM ITEM_IMEI_INFO A where a.imei=" +
                                                 vce.getNewValue());
            imeiVo.executeQuery();

            Date jbodate = (Date) vojOBCARD.getCurrentRow().getAttribute("Jobdate");

            Date expDate = DigicomClass.doConvertStringToJboDate(imeiVo.first().getAttribute(0).toString());

            System.out.println("expDating " + expDate);

            if ((jbodate.getValue().getTime() - expDate.getValue().getTime() >= 0)) {
                vojOBCARD.getCurrentRow().setAttribute("Warranty", "NW");
                FacesMessage fm = new FacesMessage("This IMEI Warranty is Expired");
                FacesContext.getCurrentInstance().addMessage(null, fm);
            }
        } catch (NullPointerException e) {
            // TODO: Add catch code
            e.printStackTrace();
        } catch (SQLStmtException e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        ApplicationModule am = doGetBindingVO("SrvJobcardCRUDIterator").getApplicationModule();
        ViewObject vo1 = am.findViewObject("blockImeiVO");
        if (vo1 != null) {
            vo1.remove();
        }
        try {
            System.out.println("one");
            vo1 =
                am.createViewObjectFromQueryStmt("blockImeiVO",
                                                 "select nvl(d.Fixed,'N') Fixed, d.BRANDID, d.ITEMID, d.SERIAL_NO, \n" +
                                                 "m.description||' date '||to_char(d.blk_date,'dd/mm/yyyy')||' By '||d.CreatedBy||' @ '||d.locationid||', '||d.Remarks Remark " +
                                                 " from SRV_BLOCKED_IMEI d, srv_imeiblockmaster m\n" +
                                                 " where m.blockid = d.blockid\n" + "and (('" +
                                                 DigicomClass.getUserLocation() +
                                                 "'= 'KHI' and BRANDID = '07') Or BRANDID <> '07')\n" +
                                                 "and IMEI_No = '" + vce.getNewValue() + "'");
            vo1.executeQuery();
            System.out.println("two");
            this.it15.setValue(vo1.first().getAttribute(4));
            System.out.println("three");
            if (vo1.first().getAttribute("FIXED").equals("Y")) {
                throw new JboException("This Imei Is Blocked.");
            }
            vojOBCARD.getCurrentRow().setAttribute("Warranty", "NW");
            vojOBCARD.getCurrentRow().setAttribute("Charges", "250");
            vojOBCARD.getCurrentRow().setAttribute("txtWarning", "");
            FacesMessage fm =
                new FacesMessage("This IMEI is already blocked, so you can not make its job in warranty.");
            FacesContext.getCurrentInstance().addMessage(null, fm);
        } catch (SQLStmtException e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        //oracle.jbo.domain.Date=
    }

    public ViewObject doGetBindingVO(String pIteratorName) {
        DCBindingContainer bc = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib = bc.findIteratorBinding(pIteratorName);

        return ib.getViewObject();

    }

    public String doShowBlockImeiDialog() {
        ViewObject vo = doGetBindingVO("SrvBlockedImeiCRUDIterator");


        Row r = vo.createRow();


        try {
            Row curRow = doGetBindingVO("SrvJobcardCRUDIterator").getCurrentRow();
            if (curRow.getAttribute("Itemid") != null && curRow.getAttribute("Brandid") != null &&
                curRow.getAttribute("ImeiNo") != null) {
                r.setAttribute("Brandid", curRow.getAttribute("Brandid"));
                r.setAttribute("Itemid", curRow.getAttribute("Itemid"));
                r.setAttribute("ImeiNo", curRow.getAttribute("ImeiNo"));
            }
        } catch (NullPointerException e) {
    
        }
        vo.insertRow(r);
        getP2().show(new RichPopup.PopupHints());

        return null;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
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

    public void doPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {
        DCBindingContainer bc = (DCBindingContainer) getBindings();
        OperationBinding ob = bc.getOperationBinding("Rollback1");
        ob.execute();
          
    }    

    public void doDialogEventSubmit(DialogEvent de) {
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            DCIteratorBinding ib = bc.findIteratorBinding("SrvJobcardCRUDIterator");
            OperationBinding ob;
            
            ob = bc.getOperationBinding("Commit");
            ob.execute();
            ib.getViewObject().getCurrentRow().setAttribute("Posted", "Y");
            ob.execute();
            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }
            ob = bc.getOperationBinding("doSubmitJobCard");
            ob.execute();

            if (!ob.getErrors().isEmpty()) {
                ib.getCurrentRow().refresh(ib.getViewObject().getCurrentRow().REFRESH_UNDO_CHANGES);
                return;
            }

        }
    }

    public void doDialogBlockImeiDialog(DialogEvent de) {
        if (de.getOutcome() == DialogEvent.Outcome.ok) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Commit1");
            ob.execute();
        }
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
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

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }


    public void setIt21(RichInputText it21) {
        this.it21 = it21;
    }

    public RichInputText getIt21() {
        return it21;
    }


    public void setIt27(RichInputText it27) {
        this.it27 = it27;
    }

    public RichInputText getIt27() {
        return it27;
    }

    public void setIt28(RichInputText it28) {
        this.it28 = it28;
    }

    public RichInputText getIt28() {
        return it28;
    }


    public void setItemid1Id(RichInputListOfValues itemid1Id) {
        this.itemid1Id = itemid1Id;
    }

    public RichInputListOfValues getItemid1Id() {
        return itemid1Id;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setSoc10(RichSelectOneChoice soc10) {
        this.soc10 = soc10;
    }

    public RichSelectOneChoice getSoc10() {
        return soc10;
    }

    public void setSi13(UISelectItems si13) {
        this.si13 = si13;
    }

    public UISelectItems getSi13() {
        return si13;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public String b11_action() {
        // Add event code here...
        DigicomClass.doGetTHeUser();
        return null;
    }

    public void setLocationidId(RichInputListOfValues locationidId) {
        this.locationidId = locationidId;
    }

    public RichInputListOfValues getLocationidId() {
        return locationidId;
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


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }


    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
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

    public List<SelectItem> getSuggestedSympton(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobcardCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("SrvSymptomsASB");
        vo.getViewObject().reset();
        vo.getViewObject().setWhereClause("UPPER(DESCRIPTION) LIKE upper('%"+resourceName+"%') AND ROWNUM<=10");
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
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobcardCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("InItemsItemASB");
        vo.getViewObject().reset();
        vo.setNamedWhereClauseParam("P_ADF_BRAND_ID", (getSoc9().getValue()==null?"-1":getSoc9().getValue()));
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

    public List<SelectItem> getSuggestedDealer(String resourceName) {
        List<SelectItem> resourceList=new ArrayList<SelectItem>();
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobcardCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        SrvDealersVOImpl  vo=(SrvDealersVOImpl)am.findViewObject("SrvDealersASB");
        vo.getViewObject().reset();
        vo.setNamedWhereClauseParam("P_ADF_LOCATIONID", (getLocationidId().getValue()==null?"-1":getLocationidId().getValue()));
        vo.isCustomWhereClause("Y");
        vo.executeQuery();
        System.out.println("resourceName");
        
        vo.getViewObject().setWhereClause("UPPER(NAME) LIKE upper('%"+resourceName+"%') AND ROWNUM<=10");
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
    
    public String doNewRecord() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        DCBindingContainer bc =(DCBindingContainer) getBindings();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobsymptomDETCRUDIterator");
        ViewObject vo=ib.getViewObject();
        Row r=vo.createRow();
        //vo.insertRow(r);
        return null;
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

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public String doPrintJC() {
        // Add event code here...
        DCBindingContainer bc =(DCBindingContainer) getBindings();
        DCIteratorBinding ib=bc.findIteratorBinding("SrvJobcardCRUDIterator");
        ApplicationModule am=ib.getViewObject().getApplicationModule();
        ViewObject vo=am.findViewObject("voCheckRight");
        
        if (vo!=null) {
            vo.remove();
       }
        System.out.println("select nvl(d.Reprint,'N') Reprint,nvl(d.h_level,'U') Hlevel from sys_users_detail d WHERE D.MODULEID='CIC-0002' AND D.USERID='"+DigicomClass.getConnectedUser()+"'");
        vo=am.createViewObjectFromQueryStmt("voCheckRight", "select nvl(d.Reprint,'N') Reprint,nvl(d.h_level,'U') Hlevel from sys_users_detail d WHERE D.MODULEID='CIC-0002' AND D.USERID='"+DigicomClass.getConnectedUser()+"'");
        vo.executeQuery();
        
        if (getIt6().getValue().toString().equals("0") || vo.first().getAttribute(0).toString().equals("Y")|| vo.first().getAttribute(1).toString().equals("A")) {
            OracleReport reportBean = new OracleReport("app.deploy.com.pk", "55000", null);
            reportBean.setReportServerParam(OracleReport.RS_PARAM_DESTYPE,
                                            "cache"); // which will be one of the [cashe - file - mail - printer]
            reportBean.setReportServerParam(OracleReport.RS_PARAM_DESFORMAT,
                                            "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
            reportBean.setReportServerParam(OracleReport.RS_PARAM_REPORT, "R:\\\\SERVICE\\\\reports\\\\01_JOBCARD.rep");
           /* reportBean.setReportParameter("JOB", getIt1().getValue().toString());
            reportBean.setReportParameter("USER", DigicomClass.getConnectedUser());
            reportBean.setReportParameter("Printno", getIt6().getValue().toString());*/
            String url = reportBean.getReportServerURL();

            reportBean.openUrlInNewWindow(url);
            /*DigicomClass.doExecutePLSQL("begin update SRV_JOBCARD set Print = Print+1  where JOBCARDNO ='" + getIt1().getValue() +
                                        "'; commit; END;");*/

        }
        else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Call your admin power user to reprint this jobcard."));
        }
            return null;
    }


    public String doNew() {
        BindingContainer bindings = getBindings();
        DCIteratorBinding ib=(DCIteratorBinding)bindings.get("SrvJobcardCRUDIterator");
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        ib.getCurrentRow().setAttribute("Jobcardno", getIt1().getValue());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getF1());
        
        for (int i = 0; i < 4; i++) {
           operationBinding = bindings.getOperationBinding("CreateInsert1");
           operationBinding.getParamsMap().put("Jobcardno", getIt1().getValue());
           operationBinding.execute(); 
       }   

        return null;
    }


    public void setNameId(RichInputComboboxListOfValues nameId) {
        this.nameId = nameId;
    }

    public RichInputComboboxListOfValues getNameId() {
        return nameId;
    }

    public void setPlam5(RichPanelLabelAndMessage plam5) {
        this.plam5 = plam5;
    }

    public RichPanelLabelAndMessage getPlam5() {
        return plam5;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }


    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }


    public void setTxtModelNo1Id(RichInputComboboxListOfValues txtModelNo1Id) {
        this.txtModelNo1Id = txtModelNo1Id;
    }

    public RichInputComboboxListOfValues getTxtModelNo1Id() {
        return txtModelNo1Id;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }

    public void setSi12(UISelectItems si12) {
        this.si12 = si12;
    }

    public UISelectItems getSi12() {
        return si12;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }


    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }


    public void setM2(RichMessages m2) {
        this.m2 = m2;
    }

    public RichMessages getM2() {
        return m2;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }


    public void setM3(RichMessage m3) {
        this.m3 = m3;
    }

    public RichMessage getM3() {
        return m3;
    }
    public void deptPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
            DCBindingContainer bc = (DCBindingContainer) getBindings();
            OperationBinding ob = bc.getOperationBinding("Rollback");
            ob.execute();
        }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }
}

package dgcom.model.vo.srv;

import dgcom.model.eo.srv.AllDemandLinesImpl;
import dgcom.model.stand.DigicomEntityImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 03 12:30:45 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AllDemandLinesVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_ALLDEMANDLINES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Dmditemid,
        DemandId,
        Itemid,
        OrderQty,
        GrinQty,
        IssuedQty,
        CancelQty,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Partid,
        DemandQty,
        UsedQty,
        txtPartName,
        txtPartNo,
        txtModelNo,
        AllDemandNoteVO,
        InPartsVO,
        InItemsVO,
        AccSrvAllDemantNoteLinInPart;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DMDITEMID = AttributesEnum.Dmditemid.index();
    public static final int DEMANDID = AttributesEnum.DemandId.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int ORDERQTY = AttributesEnum.OrderQty.index();
    public static final int GRINQTY = AttributesEnum.GrinQty.index();
    public static final int ISSUEDQTY = AttributesEnum.IssuedQty.index();
    public static final int CANCELQTY = AttributesEnum.CancelQty.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int PARTID = AttributesEnum.Partid.index();
    public static final int DEMANDQTY = AttributesEnum.DemandQty.index();
    public static final int USEDQTY = AttributesEnum.UsedQty.index();
    public static final int TXTPARTNAME = AttributesEnum.txtPartName.index();
    public static final int TXTPARTNO = AttributesEnum.txtPartNo.index();
    public static final int TXTMODELNO = AttributesEnum.txtModelNo.index();
    public static final int ALLDEMANDNOTEVO = AttributesEnum.AllDemandNoteVO.index();
    public static final int INPARTSVO = AttributesEnum.InPartsVO.index();
    public static final int INITEMSVO = AttributesEnum.InItemsVO.index();
    public static final int ACCSRVALLDEMANTNOTELININPART = AttributesEnum.AccSrvAllDemantNoteLinInPart.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AllDemandLinesVORowImpl() {
    }

    /**
     * Gets AllDemandLines entity object.
     * @return the AllDemandLines
     */
    public AllDemandLinesImpl getAllDemandLines() {
        return (AllDemandLinesImpl) getEntity(ENTITY_ALLDEMANDLINES);
    }

    /**
     * Gets the attribute value for DMDITEMID using the alias name Dmditemid.
     * @return the DMDITEMID
     */
    public String getDmditemid() {
        return (String) getAttributeInternal(DMDITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for DMDITEMID using the alias name Dmditemid.
     * @param value value to set the DMDITEMID
     */
    public void setDmditemid(String value) {
        setAttributeInternal(DMDITEMID, value);
    }

    /**
     * Gets the attribute value for DEMAND_ID using the alias name DemandId.
     * @return the DEMAND_ID
     */
    public String getDemandId() {
        return (String) getAttributeInternal(DEMANDID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_ID using the alias name DemandId.
     * @param value value to set the DEMAND_ID
     */
    public void setDemandId(String value) {
        setAttributeInternal(DEMANDID, value);
    }

    /**
     * Gets the attribute value for ITEMID using the alias name Itemid.
     * @return the ITEMID
     */
    public String getItemid() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEMID using the alias name Itemid.
     * @param value value to set the ITEMID
     */
    public void setItemid(String value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for ORDER_QTY using the alias name OrderQty.
     * @return the ORDER_QTY
     */
    public BigDecimal getOrderQty() {
        return (BigDecimal) getAttributeInternal(ORDERQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for ORDER_QTY using the alias name OrderQty.
     * @param value value to set the ORDER_QTY
     */
    public void setOrderQty(BigDecimal value) {
        setAttributeInternal(ORDERQTY, value);
    }

    /**
     * Gets the attribute value for GRIN_QTY using the alias name GrinQty.
     * @return the GRIN_QTY
     */
    public BigDecimal getGrinQty() {
        return (BigDecimal) getAttributeInternal(GRINQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for GRIN_QTY using the alias name GrinQty.
     * @param value value to set the GRIN_QTY
     */
    public void setGrinQty(BigDecimal value) {
        setAttributeInternal(GRINQTY, value);
    }

    /**
     * Gets the attribute value for ISSUED_QTY using the alias name IssuedQty.
     * @return the ISSUED_QTY
     */
    public BigDecimal getIssuedQty() {
        return (BigDecimal) getAttributeInternal(ISSUEDQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for ISSUED_QTY using the alias name IssuedQty.
     * @param value value to set the ISSUED_QTY
     */
    public void setIssuedQty(BigDecimal value) {
        setAttributeInternal(ISSUEDQTY, value);
    }

    /**
     * Gets the attribute value for CANCEL_QTY using the alias name CancelQty.
     * @return the CANCEL_QTY
     */
    public BigDecimal getCancelQty() {
        return (BigDecimal) getAttributeInternal(CANCELQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for CANCEL_QTY using the alias name CancelQty.
     * @param value value to set the CANCEL_QTY
     */
    public void setCancelQty(BigDecimal value) {
        setAttributeInternal(CANCELQTY, value);
    }

    /**
     * Gets the attribute value for CREATEDBY using the alias name Createdby.
     * @return the CREATEDBY
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATEDBY using the alias name Createdby.
     * @param value value to set the CREATEDBY
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @return the MODIFIEDBY
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @param value value to set the MODIFIEDBY
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @return the MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @param value value to set the MODIFIED_DATE
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for PARTID using the alias name Partid.
     * @return the PARTID
     */
    public String getPartid() {
        return (String) getAttributeInternal(PARTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARTID using the alias name Partid.
     * @param value value to set the PARTID
     */
    public void setPartid(String value) {
        setAttributeInternal(PARTID, value);
    }

    /**
     * Gets the attribute value for DEMAND_QTY using the alias name DemandQty.
     * @return the DEMAND_QTY
     */
    public BigDecimal getDemandQty() {
        return (BigDecimal) getAttributeInternal(DEMANDQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_QTY using the alias name DemandQty.
     * @param value value to set the DEMAND_QTY
     */
    public void setDemandQty(BigDecimal value) {
        setAttributeInternal(DEMANDQTY, value);
    }

    /**
     * Gets the attribute value for USED_QTY using the alias name UsedQty.
     * @return the USED_QTY
     */
    public BigDecimal getUsedQty() {
        return (BigDecimal) getAttributeInternal(USEDQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for USED_QTY using the alias name UsedQty.
     * @param value value to set the USED_QTY
     */
    public void setUsedQty(BigDecimal value) {
        setAttributeInternal(USEDQTY, value);
    }

    /**
     * Gets the attribute value for TXT_PART_NAME using the alias name txtPartName.
     * @return the TXT_PART_NAME
     */
    public String gettxtPartName() {
        return (String) getAttributeInternal(TXTPARTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_PART_NAME using the alias name txtPartName.
     * @param value value to set the TXT_PART_NAME
     */
    public void settxtPartName(String value) {
        setAttributeInternal(TXTPARTNAME, value);
    }

    /**
     * Gets the attribute value for TXT_PART_NO using the alias name txtPartNo.
     * @return the TXT_PART_NO
     */
    public String gettxtPartNo() {
        return (String) getAttributeInternal(TXTPARTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_PART_NO using the alias name txtPartNo.
     * @param value value to set the TXT_PART_NO
     */
    public void settxtPartNo(String value) {
        setAttributeInternal(TXTPARTNO, value);
    }

    /**
     * Gets the attribute value for TXT_MODEL_NO using the alias name txtModelNo.
     * @return the TXT_MODEL_NO
     */
    public String gettxtModelNo() {
        return (String) getAttributeInternal(TXTMODELNO);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_MODEL_NO using the alias name txtModelNo.
     * @param value value to set the TXT_MODEL_NO
     */
    public void settxtModelNo(String value) {
        setAttributeInternal(TXTMODELNO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link AllDemandNoteVO.
     */
    public Row getAllDemandNoteVO() {
        return (Row) getAttributeInternal(ALLDEMANDNOTEVO);
    }

    /**
     * Sets the master-detail link AllDemandNoteVO between this object and <code>value</code>.
     */
    public void setAllDemandNoteVO(Row value) {
        setAttributeInternal(ALLDEMANDNOTEVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InPartsVO.
     */
    public Row getInPartsVO() {
        return (Row) getAttributeInternal(INPARTSVO);
    }

    /**
     * Sets the master-detail link InPartsVO between this object and <code>value</code>.
     */
    public void setInPartsVO(Row value) {
        setAttributeInternal(INPARTSVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InItemsVO.
     */
    public Row getInItemsVO() {
        return (Row) getAttributeInternal(INITEMSVO);
    }

    /**
     * Sets the master-detail link InItemsVO between this object and <code>value</code>.
     */
    public void setInItemsVO(Row value) {
        setAttributeInternal(INITEMSVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvAllDemantNoteLinInPart.
     */
    public RowSet getAccSrvAllDemantNoteLinInPart() {
        return (RowSet) getAttributeInternal(ACCSRVALLDEMANTNOTELININPART);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if(getAllDemandNoteVO().getAttribute("Posted").equals("Y"))
        {return false;}
        return super.isAttributeUpdateable(i);
    }
}


package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvSadjustdetlImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 20 12:57:18 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvSadjustdetlVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVSADJUSTDETL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Said,
        Storeid,
        Itemid,
        Partid,
        Incqty,
        Decqty,
        Rate,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        PurchaseRate,
        Rowid,
        txtAmount,
        txtPartName,
        txtPartNo,
        txtStoreName,
        SrvStockadjustVO,
        InPartsVO,
        AllStoresVO,
        AccInParts,
        AccSysUserStore;
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


    public static final int SAID = AttributesEnum.Said.index();
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int PARTID = AttributesEnum.Partid.index();
    public static final int INCQTY = AttributesEnum.Incqty.index();
    public static final int DECQTY = AttributesEnum.Decqty.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int PURCHASERATE = AttributesEnum.PurchaseRate.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int TXTAMOUNT = AttributesEnum.txtAmount.index();
    public static final int TXTPARTNAME = AttributesEnum.txtPartName.index();
    public static final int TXTPARTNO = AttributesEnum.txtPartNo.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int SRVSTOCKADJUSTVO = AttributesEnum.SrvStockadjustVO.index();
    public static final int INPARTSVO = AttributesEnum.InPartsVO.index();
    public static final int ALLSTORESVO = AttributesEnum.AllStoresVO.index();
    public static final int ACCINPARTS = AttributesEnum.AccInParts.index();
    public static final int ACCSYSUSERSTORE = AttributesEnum.AccSysUserStore.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvSadjustdetlVORowImpl() {
    }

    /**
     * Gets SrvSadjustdetl entity object.
     * @return the SrvSadjustdetl
     */
    public SrvSadjustdetlImpl getSrvSadjustdetl() {
        return (SrvSadjustdetlImpl) getEntity(ENTITY_SRVSADJUSTDETL);
    }

    /**
     * Gets the attribute value for SAID using the alias name Said.
     * @return the SAID
     */
    public String getSaid() {
        return (String) getAttributeInternal(SAID);
    }

    /**
     * Sets <code>value</code> as attribute value for SAID using the alias name Said.
     * @param value value to set the SAID
     */
    public void setSaid(String value) {
        setAttributeInternal(SAID, value);
    }

    /**
     * Gets the attribute value for STOREID using the alias name Storeid.
     * @return the STOREID
     */
    public String getStoreid() {
        return (String) getAttributeInternal(STOREID);
    }

    /**
     * Sets <code>value</code> as attribute value for STOREID using the alias name Storeid.
     * @param value value to set the STOREID
     */
    public void setStoreid(String value) {
        setAttributeInternal(STOREID, value);
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
     * Gets the attribute value for INCQTY using the alias name Incqty.
     * @return the INCQTY
     */
    public BigDecimal getIncqty() {
        return (BigDecimal) getAttributeInternal(INCQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for INCQTY using the alias name Incqty.
     * @param value value to set the INCQTY
     */
    public void setIncqty(BigDecimal value) {
        setAttributeInternal(INCQTY, value);
    }

    /**
     * Gets the attribute value for DECQTY using the alias name Decqty.
     * @return the DECQTY
     */
    public BigDecimal getDecqty() {
        return (BigDecimal) getAttributeInternal(DECQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for DECQTY using the alias name Decqty.
     * @param value value to set the DECQTY
     */
    public void setDecqty(BigDecimal value) {
        setAttributeInternal(DECQTY, value);
    }

    /**
     * Gets the attribute value for RATE using the alias name Rate.
     * @return the RATE
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RATE using the alias name Rate.
     * @param value value to set the RATE
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
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
     * Gets the attribute value for PURCHASE_RATE using the alias name PurchaseRate.
     * @return the PURCHASE_RATE
     */
    public BigDecimal getPurchaseRate() {
        return (BigDecimal) getAttributeInternal(PURCHASERATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PURCHASE_RATE using the alias name PurchaseRate.
     * @param value value to set the PURCHASE_RATE
     */
    public void setPurchaseRate(BigDecimal value) {
        setAttributeInternal(PURCHASERATE, value);
    }

    /**
     * Gets the attribute value for ROWID using the alias name Rowid.
     * @return the ROWID
     */
    public RowID getRowid() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * Gets the attribute value for the calculated attribute txtAmount.
     * @return the txtAmount
     */
    public BigDecimal gettxtAmount() {
        return (BigDecimal) getAttributeInternal(TXTAMOUNT);
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
     * Gets the attribute value for TXT_STORE_NAME using the alias name txtStoreName.
     * @return the TXT_STORE_NAME
     */
    public String gettxtStoreName() {
        return (String) getAttributeInternal(TXTSTORENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_STORE_NAME using the alias name txtStoreName.
     * @param value value to set the TXT_STORE_NAME
     */
    public void settxtStoreName(String value) {
        setAttributeInternal(TXTSTORENAME, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrvStockadjustVO.
     */
    public Row getSrvStockadjustVO() {
        return (Row) getAttributeInternal(SRVSTOCKADJUSTVO);
    }

    /**
     * Sets the master-detail link SrvStockadjustVO between this object and <code>value</code>.
     */
    public void setSrvStockadjustVO(Row value) {
        setAttributeInternal(SRVSTOCKADJUSTVO, value);
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
     * Gets the associated <code>Row</code> using master-detail link AllStoresVO.
     */
    public Row getAllStoresVO() {
        return (Row) getAttributeInternal(ALLSTORESVO);
    }

    /**
     * Sets the master-detail link AllStoresVO between this object and <code>value</code>.
     */
    public void setAllStoresVO(Row value) {
        setAttributeInternal(ALLSTORESVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInParts.
     */
    public RowSet getAccInParts() {
        return (RowSet) getAttributeInternal(ACCINPARTS);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysUserStore.
     */
    public RowSet getAccSysUserStore() {
        return (RowSet) getAttributeInternal(ACCSYSUSERSTORE);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getSrvStockadjustVO().getAttribute("Posted").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}


package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomEntityImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 28 14:16:40 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvStransferdetlVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVSTRANSFERDETL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Stransid,
        Storeid,
        FromPartid,
        ToPartid,
        TransferQty,
        Rate,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Rowid,
        txtStoreName,
        txtToPartName,
        txtFromPartName,
        txtToPartNo,
        txtFromPartNo,
        SrvStocktransferVO,
        AllStoresVO,
        InPartsVO,
        InPartsVO1,
        AccSysUserStoreStoreId,
        AccSrvStockTransferDetailFromPartID,
        AccInPartsPartId;
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


    public static final int STRANSID = AttributesEnum.Stransid.index();
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int FROMPARTID = AttributesEnum.FromPartid.index();
    public static final int TOPARTID = AttributesEnum.ToPartid.index();
    public static final int TRANSFERQTY = AttributesEnum.TransferQty.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int TXTTOPARTNAME = AttributesEnum.txtToPartName.index();
    public static final int TXTFROMPARTNAME = AttributesEnum.txtFromPartName.index();
    public static final int TXTTOPARTNO = AttributesEnum.txtToPartNo.index();
    public static final int TXTFROMPARTNO = AttributesEnum.txtFromPartNo.index();
    public static final int SRVSTOCKTRANSFERVO = AttributesEnum.SrvStocktransferVO.index();
    public static final int ALLSTORESVO = AttributesEnum.AllStoresVO.index();
    public static final int INPARTSVO = AttributesEnum.InPartsVO.index();
    public static final int INPARTSVO1 = AttributesEnum.InPartsVO1.index();
    public static final int ACCSYSUSERSTORESTOREID = AttributesEnum.AccSysUserStoreStoreId.index();
    public static final int ACCSRVSTOCKTRANSFERDETAILFROMPARTID =
        AttributesEnum.AccSrvStockTransferDetailFromPartID.index();
    public static final int ACCINPARTSPARTID = AttributesEnum.AccInPartsPartId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvStransferdetlVORowImpl() {
    }

    /**
     * Gets SrvStransferdetl entity object.
     * @return the SrvStransferdetl
     */
    public DigicomEntityImpl getSrvStransferdetl() {
        return (DigicomEntityImpl) getEntity(ENTITY_SRVSTRANSFERDETL);
    }

    /**
     * Gets the attribute value for STRANSID using the alias name Stransid.
     * @return the STRANSID
     */
    public String getStransid() {
        return (String) getAttributeInternal(STRANSID);
    }

    /**
     * Sets <code>value</code> as attribute value for STRANSID using the alias name Stransid.
     * @param value value to set the STRANSID
     */
    public void setStransid(String value) {
        setAttributeInternal(STRANSID, value);
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
     * Gets the attribute value for FROM_PARTID using the alias name FromPartid.
     * @return the FROM_PARTID
     */
    public String getFromPartid() {
        return (String) getAttributeInternal(FROMPARTID);
    }

    /**
     * Sets <code>value</code> as attribute value for FROM_PARTID using the alias name FromPartid.
     * @param value value to set the FROM_PARTID
     */
    public void setFromPartid(String value) {
        setAttributeInternal(FROMPARTID, value);
    }

    /**
     * Gets the attribute value for TO_PARTID using the alias name ToPartid.
     * @return the TO_PARTID
     */
    public String getToPartid() {
        return (String) getAttributeInternal(TOPARTID);
    }

    /**
     * Sets <code>value</code> as attribute value for TO_PARTID using the alias name ToPartid.
     * @param value value to set the TO_PARTID
     */
    public void setToPartid(String value) {
        setAttributeInternal(TOPARTID, value);
    }

    /**
     * Gets the attribute value for TRANSFER_QTY using the alias name TransferQty.
     * @return the TRANSFER_QTY
     */
    public BigDecimal getTransferQty() {
        return (BigDecimal) getAttributeInternal(TRANSFERQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSFER_QTY using the alias name TransferQty.
     * @param value value to set the TRANSFER_QTY
     */
    public void setTransferQty(BigDecimal value) {
        setAttributeInternal(TRANSFERQTY, value);
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
     * Gets the attribute value for ROWID using the alias name Rowid.
     * @return the ROWID
     */
    public RowID getRowid() {
        return (RowID) getAttributeInternal(ROWID);
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
     * Gets the attribute value for TXT_TO_PART_NAME using the alias name txtToPartName.
     * @return the TXT_TO_PART_NAME
     */
    public String gettxtToPartName() {
        return (String) getAttributeInternal(TXTTOPARTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_TO_PART_NAME using the alias name txtToPartName.
     * @param value value to set the TXT_TO_PART_NAME
     */
    public void settxtToPartName(String value) {
        setAttributeInternal(TXTTOPARTNAME, value);
    }

    /**
     * Gets the attribute value for TXT_FROM_PART_NAME using the alias name txtFromPartName.
     * @return the TXT_FROM_PART_NAME
     */
    public String gettxtFromPartName() {
        return (String) getAttributeInternal(TXTFROMPARTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_FROM_PART_NAME using the alias name txtFromPartName.
     * @param value value to set the TXT_FROM_PART_NAME
     */
    public void settxtFromPartName(String value) {
        setAttributeInternal(TXTFROMPARTNAME, value);
    }

    /**
     * Gets the attribute value for TXT_TO_PART_NO using the alias name txtToPartNo.
     * @return the TXT_TO_PART_NO
     */
    public String gettxtToPartNo() {
        return (String) getAttributeInternal(TXTTOPARTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_TO_PART_NO using the alias name txtToPartNo.
     * @param value value to set the TXT_TO_PART_NO
     */
    public void settxtToPartNo(String value) {
        setAttributeInternal(TXTTOPARTNO, value);
    }

    /**
     * Gets the attribute value for TXT_FROM_PART_NO using the alias name txtFromPartNo.
     * @return the TXT_FROM_PART_NO
     */
    public String gettxtFromPartNo() {
        return (String) getAttributeInternal(TXTFROMPARTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_FROM_PART_NO using the alias name txtFromPartNo.
     * @param value value to set the TXT_FROM_PART_NO
     */
    public void settxtFromPartNo(String value) {
        setAttributeInternal(TXTFROMPARTNO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrvStocktransferVO.
     */
    public Row getSrvStocktransferVO() {
        return (Row) getAttributeInternal(SRVSTOCKTRANSFERVO);
    }

    /**
     * Sets the master-detail link SrvStocktransferVO between this object and <code>value</code>.
     */
    public void setSrvStocktransferVO(Row value) {
        setAttributeInternal(SRVSTOCKTRANSFERVO, value);
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
     * Gets the associated <code>Row</code> using master-detail link InPartsVO1.
     */
    public Row getInPartsVO1() {
        return (Row) getAttributeInternal(INPARTSVO1);
    }

    /**
     * Sets the master-detail link InPartsVO1 between this object and <code>value</code>.
     */
    public void setInPartsVO1(Row value) {
        setAttributeInternal(INPARTSVO1, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysUserStoreStoreId.
     */
    public RowSet getAccSysUserStoreStoreId() {
        return (RowSet) getAttributeInternal(ACCSYSUSERSTORESTOREID);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvStockTransferDetailFromPartID.
     */
    public RowSet getAccSrvStockTransferDetailFromPartID() {
        return (RowSet) getAttributeInternal(ACCSRVSTOCKTRANSFERDETAILFROMPARTID);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInPartsPartId.
     */
    public RowSet getAccInPartsPartId() {
        return (RowSet) getAttributeInternal(ACCINPARTSPARTID);
    }


    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getSrvStocktransferVO().getAttribute("Posted").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvBlockedImeiImpl;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 18 13:54:28 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvBlockedImeiVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SRVBLOCKEDIMEI = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Locationid,
        Brandid,
        Itemid,
        Blockid,
        BlkDate,
        ImeiNo,
        SerialNo,
        Remarks,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Fixed,
        Tmpfed,
        Rowid,
        txtModelNo,
        InItemsVO,
        AccBlockIMEIBrandId,
        AccInItemsItemIdWithBRandAcc,
        AccSrvImeiblockmasterSrvImeiBlock;
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


    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int BRANDID = AttributesEnum.Brandid.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int BLOCKID = AttributesEnum.Blockid.index();
    public static final int BLKDATE = AttributesEnum.BlkDate.index();
    public static final int IMEINO = AttributesEnum.ImeiNo.index();
    public static final int SERIALNO = AttributesEnum.SerialNo.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int FIXED = AttributesEnum.Fixed.index();
    public static final int TMPFED = AttributesEnum.Tmpfed.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int TXTMODELNO = AttributesEnum.txtModelNo.index();
    public static final int INITEMSVO = AttributesEnum.InItemsVO.index();
    public static final int ACCBLOCKIMEIBRANDID = AttributesEnum.AccBlockIMEIBrandId.index();
    public static final int ACCINITEMSITEMIDWITHBRANDACC = AttributesEnum.AccInItemsItemIdWithBRandAcc.index();
    public static final int ACCSRVIMEIBLOCKMASTERSRVIMEIBLOCK =
        AttributesEnum.AccSrvImeiblockmasterSrvImeiBlock.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvBlockedImeiVORowImpl() {
    }

    /**
     * Gets SrvBlockedImei entity object.
     * @return the SrvBlockedImei
     */
    public SrvBlockedImeiImpl getSrvBlockedImei() {
        return (SrvBlockedImeiImpl) getEntity(ENTITY_SRVBLOCKEDIMEI);
    }

    /**
     * Gets the attribute value for LOCATIONID using the alias name Locationid.
     * @return the LOCATIONID
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATIONID using the alias name Locationid.
     * @param value value to set the LOCATIONID
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for BRANDID using the alias name Brandid.
     * @return the BRANDID
     */
    public String getBrandid() {
        return (String) getAttributeInternal(BRANDID);
    }

    /**
     * Sets <code>value</code> as attribute value for BRANDID using the alias name Brandid.
     * @param value value to set the BRANDID
     */
    public void setBrandid(String value) {
        setAttributeInternal(BRANDID, value);
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
     * Gets the attribute value for BLOCKID using the alias name Blockid.
     * @return the BLOCKID
     */
    public String getBlockid() {
        return (String) getAttributeInternal(BLOCKID);
    }

    /**
     * Sets <code>value</code> as attribute value for BLOCKID using the alias name Blockid.
     * @param value value to set the BLOCKID
     */
    public void setBlockid(String value) {
        setAttributeInternal(BLOCKID, value);
    }

    /**
     * Gets the attribute value for BLK_DATE using the alias name BlkDate.
     * @return the BLK_DATE
     */
    public Date getBlkDate() {
        return (Date) getAttributeInternal(BLKDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for BLK_DATE using the alias name BlkDate.
     * @param value value to set the BLK_DATE
     */
    public void setBlkDate(Date value) {
        setAttributeInternal(BLKDATE, value);
    }

    /**
     * Gets the attribute value for IMEI_NO using the alias name ImeiNo.
     * @return the IMEI_NO
     */
    public String getImeiNo() {
        return (String) getAttributeInternal(IMEINO);
    }

    /**
     * Sets <code>value</code> as attribute value for IMEI_NO using the alias name ImeiNo.
     * @param value value to set the IMEI_NO
     */
    public void setImeiNo(String value) {
        setAttributeInternal(IMEINO, value);
    }

    /**
     * Gets the attribute value for SERIAL_NO using the alias name SerialNo.
     * @return the SERIAL_NO
     */
    public String getSerialNo() {
        return (String) getAttributeInternal(SERIALNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SERIAL_NO using the alias name SerialNo.
     * @param value value to set the SERIAL_NO
     */
    public void setSerialNo(String value) {
        setAttributeInternal(SERIALNO, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
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
     * Gets the attribute value for FIXED using the alias name Fixed.
     * @return the FIXED
     */
    public String getFixed() {
        return (String) getAttributeInternal(FIXED);
    }

    /**
     * Sets <code>value</code> as attribute value for FIXED using the alias name Fixed.
     * @param value value to set the FIXED
     */
    public void setFixed(String value) {
        setAttributeInternal(FIXED, value);
    }

    /**
     * Gets the attribute value for TMPFED using the alias name Tmpfed.
     * @return the TMPFED
     */
    public String getTmpfed() {
        return (String) getAttributeInternal(TMPFED);
    }

    /**
     * Sets <code>value</code> as attribute value for TMPFED using the alias name Tmpfed.
     * @param value value to set the TMPFED
     */
    public void setTmpfed(String value) {
        setAttributeInternal(TMPFED, value);
    }

    /**
     * Gets the attribute value for ROWID using the alias name Rowid.
     * @return the ROWID
     */
    public RowID getRowid() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * Gets the attribute value for the calculated attribute txtModelNo.
     * @return the txtModelNo
     */
    public String gettxtModelNo() {
        return (String) getAttributeInternal(TXTMODELNO);
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
     * Gets the view accessor <code>RowSet</code> AccBlockIMEIBrandId.
     */
    public RowSet getAccBlockIMEIBrandId() {
        return (RowSet) getAttributeInternal(ACCBLOCKIMEIBRANDID);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInItemsItemIdWithBRandAcc.
     */
    public RowSet getAccInItemsItemIdWithBRandAcc() {
        return (RowSet) getAttributeInternal(ACCINITEMSITEMIDWITHBRANDACC);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvImeiblockmasterSrvImeiBlock.
     */
    public RowSet getAccSrvImeiblockmasterSrvImeiBlock() {
        return (RowSet) getAttributeInternal(ACCSRVIMEIBLOCKMASTERSRVIMEIBLOCK);
    }
}

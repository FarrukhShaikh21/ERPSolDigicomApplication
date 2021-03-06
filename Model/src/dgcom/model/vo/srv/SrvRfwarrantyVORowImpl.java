package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvRfwarrantyImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 08 10:26:09 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvRfwarrantyVORowImpl extends DigicomViewRowImpl {
    public static final int ENTITY_SRVRFWARRANTY = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Rfwid,
        Locationid,
        Rdate,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Reason,
        Remarks,
        IsMigrated,
        MigratedDate,
        SrvRfwdetlVO,
        AccSysUserRightsWiseLocation,
        AccYesNo;
        private static AttributesEnum[] vals = null;
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
    public static final int RFWID = AttributesEnum.Rfwid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int RDATE = AttributesEnum.Rdate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int REASON = AttributesEnum.Reason.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int SRVRFWDETLVO = AttributesEnum.SrvRfwdetlVO.index();
    public static final int ACCSYSUSERRIGHTSWISELOCATION = AttributesEnum.AccSysUserRightsWiseLocation.index();
    public static final int ACCYESNO = AttributesEnum.AccYesNo.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvRfwarrantyVORowImpl() {
    }

    /**
     * Gets SrvRfwarranty entity object.
     * @return the SrvRfwarranty
     */
    public SrvRfwarrantyImpl getSrvRfwarranty() {
        return (SrvRfwarrantyImpl) getEntity(ENTITY_SRVRFWARRANTY);
    }

    /**
     * Gets the attribute value for RFWID using the alias name Rfwid.
     * @return the RFWID
     */
    public String getRfwid() {
        return (String) getAttributeInternal(RFWID);
    }

    /**
     * Sets <code>value</code> as attribute value for RFWID using the alias name Rfwid.
     * @param value value to set the RFWID
     */
    public void setRfwid(String value) {
        setAttributeInternal(RFWID, value);
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
     * Gets the attribute value for RDATE using the alias name Rdate.
     * @return the RDATE
     */
    public Date getRdate() {
        return (Date) getAttributeInternal(RDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RDATE using the alias name Rdate.
     * @param value value to set the RDATE
     */
    public void setRdate(Date value) {
        setAttributeInternal(RDATE, value);
    }

    /**
     * Gets the attribute value for POSTED using the alias name Posted.
     * @return the POSTED
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED using the alias name Posted.
     * @param value value to set the POSTED
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for POSTEDBY using the alias name Postedby.
     * @return the POSTEDBY
     */
    public String getPostedby() {
        return (String) getAttributeInternal(POSTEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTEDBY using the alias name Postedby.
     * @param value value to set the POSTEDBY
     */
    public void setPostedby(String value) {
        setAttributeInternal(POSTEDBY, value);
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
     * Gets the attribute value for REASON using the alias name Reason.
     * @return the REASON
     */
    public String getReason() {
        return (String) getAttributeInternal(REASON);
    }

    /**
     * Sets <code>value</code> as attribute value for REASON using the alias name Reason.
     * @param value value to set the REASON
     */
    public void setReason(String value) {
        setAttributeInternal(REASON, value);
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
     * Gets the attribute value for IS_MIGRATED using the alias name IsMigrated.
     * @return the IS_MIGRATED
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_MIGRATED using the alias name IsMigrated.
     * @param value value to set the IS_MIGRATED
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MIGRATED_DATE using the alias name MigratedDate.
     * @return the MIGRATED_DATE
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MIGRATED_DATE using the alias name MigratedDate.
     * @param value value to set the MIGRATED_DATE
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrvRfwdetlVO.
     */
    public RowIterator getSrvRfwdetlVO() {
        return (RowIterator) getAttributeInternal(SRVRFWDETLVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysUserRightsWiseLocation.
     */
    public RowSet getAccSysUserRightsWiseLocation() {
        return (RowSet) getAttributeInternal(ACCSYSUSERRIGHTSWISELOCATION);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccYesNo.
     */
    public RowSet getAccYesNo() {
        return (RowSet) getAttributeInternal(ACCYESNO);
    }
}


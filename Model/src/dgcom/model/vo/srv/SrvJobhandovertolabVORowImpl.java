package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvJobhandovertolabImpl;

import dgcom.model.stand.DigicomViewRowImpl;

import java.math.BigDecimal;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 23 09:55:31 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJobhandovertolabVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVJOBHANDOVERTOLAB = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Jhoid,
        Locationid,
        Hodate,
        Remarks,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        IsMigrated,
        MigratedDate,
        Jhoseq,
        SrvJhotldetlVO,
        AccSysUserRightsWiseLocation,
        AccSubmitYesNo;
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


    public static final int JHOID = AttributesEnum.Jhoid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int HODATE = AttributesEnum.Hodate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int JHOSEQ = AttributesEnum.Jhoseq.index();
    public static final int SRVJHOTLDETLVO = AttributesEnum.SrvJhotldetlVO.index();
    public static final int ACCSYSUSERRIGHTSWISELOCATION = AttributesEnum.AccSysUserRightsWiseLocation.index();
    public static final int ACCSUBMITYESNO = AttributesEnum.AccSubmitYesNo.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvJobhandovertolabVORowImpl() {
    }

    /**
     * Gets SrvJobhandovertolab entity object.
     * @return the SrvJobhandovertolab
     */
    public SrvJobhandovertolabImpl getSrvJobhandovertolab() {
        return (SrvJobhandovertolabImpl) getEntity(ENTITY_SRVJOBHANDOVERTOLAB);
    }

    /**
     * Gets the attribute value for JHOID using the alias name Jhoid.
     * @return the JHOID
     */
    public String getJhoid() {
        return (String) getAttributeInternal(JHOID);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getPosted().equals("Y")) {
            return false;
        } else
            return true;
    }
    /**
     * Sets <code>value</code> as attribute value for JHOID using the alias name Jhoid.
     * @param value value to set the JHOID
     */
    public void setJhoid(String value) {
        setAttributeInternal(JHOID, value);
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
     * Gets the attribute value for HODATE using the alias name Hodate.
     * @return the HODATE
     */
    public Date getHodate() {
        return (Date) getAttributeInternal(HODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for HODATE using the alias name Hodate.
     * @param value value to set the HODATE
     */
    public void setHodate(Date value) {
        setAttributeInternal(HODATE, value);
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
     * Gets the attribute value for JHOSEQ using the alias name Jhoseq.
     * @return the JHOSEQ
     */
    public Integer getJhoseq() {
        return (Integer) getAttributeInternal(JHOSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for JHOSEQ using the alias name Jhoseq.
     * @param value value to set the JHOSEQ
     */
    public void setJhoseq(Integer value) {
        setAttributeInternal(JHOSEQ, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrvJhotldetlVO.
     */
    public RowIterator getSrvJhotldetlVO() {
        return (RowIterator) getAttributeInternal(SRVJHOTLDETLVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysUserRightsWiseLocation.
     */
    public RowSet getAccSysUserRightsWiseLocation() {
        return (RowSet) getAttributeInternal(ACCSYSUSERRIGHTSWISELOCATION);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSubmitYesNo.
     */
    public RowSet getAccSubmitYesNo() {
        return (RowSet) getAttributeInternal(ACCSUBMITYESNO);
    }
}


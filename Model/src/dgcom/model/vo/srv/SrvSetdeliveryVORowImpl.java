package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvSetdeliveryImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 14 09:36:19 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvSetdeliveryVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVSETDELIVERY = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Setdeliid,
        Locationid,
        Jobcardno,
        Sddate,
        Remarks,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        PrevDoctype,
        PrevDocid,
        Cdate,
        Mdate,
        IsMigrated,
        MigratedDate,
        txtJobcardInfo,
        txtJobstatus,
        SrvJobcardVO,
        AccSrvSetDeliveryJobCardNo,
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


    public static final int SETDELIID = AttributesEnum.Setdeliid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int JOBCARDNO = AttributesEnum.Jobcardno.index();
    public static final int SDDATE = AttributesEnum.Sddate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int PREVDOCTYPE = AttributesEnum.PrevDoctype.index();
    public static final int PREVDOCID = AttributesEnum.PrevDocid.index();
    public static final int CDATE = AttributesEnum.Cdate.index();
    public static final int MDATE = AttributesEnum.Mdate.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int TXTJOBCARDINFO = AttributesEnum.txtJobcardInfo.index();
    public static final int TXTJOBSTATUS = AttributesEnum.txtJobstatus.index();
    public static final int SRVJOBCARDVO = AttributesEnum.SrvJobcardVO.index();
    public static final int ACCSRVSETDELIVERYJOBCARDNO = AttributesEnum.AccSrvSetDeliveryJobCardNo.index();
    public static final int ACCSYSUSERRIGHTSWISELOCATION = AttributesEnum.AccSysUserRightsWiseLocation.index();
    public static final int ACCSUBMITYESNO = AttributesEnum.AccSubmitYesNo.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvSetdeliveryVORowImpl() {
    }

    /**
     * Gets SrvSetdelivery entity object.
     * @return the SrvSetdelivery
     */
    public SrvSetdeliveryImpl getSrvSetdelivery() {
        return (SrvSetdeliveryImpl) getEntity(ENTITY_SRVSETDELIVERY);
    }

    /**
     * Gets the attribute value for SETDELIID using the alias name Setdeliid.
     * @return the SETDELIID
     */
    public String getSetdeliid() {
        return (String) getAttributeInternal(SETDELIID);
    }

    /**
     * Sets <code>value</code> as attribute value for SETDELIID using the alias name Setdeliid.
     * @param value value to set the SETDELIID
     */
    public void setSetdeliid(String value) {
        setAttributeInternal(SETDELIID, value);
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
     * Gets the attribute value for JOBCARDNO using the alias name Jobcardno.
     * @return the JOBCARDNO
     */
    public String getJobcardno() {
        return (String) getAttributeInternal(JOBCARDNO);
    }

    /**
     * Sets <code>value</code> as attribute value for JOBCARDNO using the alias name Jobcardno.
     * @param value value to set the JOBCARDNO
     */
    public void setJobcardno(String value) {
        setAttributeInternal(JOBCARDNO, value);
    }

    /**
     * Gets the attribute value for SDDATE using the alias name Sddate.
     * @return the SDDATE
     */
    public Date getSddate() {
        return (Date) getAttributeInternal(SDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SDDATE using the alias name Sddate.
     * @param value value to set the SDDATE
     */
    public void setSddate(Date value) {
        setAttributeInternal(SDDATE, value);
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
     * Gets the attribute value for PREV_DOCTYPE using the alias name PrevDoctype.
     * @return the PREV_DOCTYPE
     */
    public String getPrevDoctype() {
        return (String) getAttributeInternal(PREVDOCTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for PREV_DOCTYPE using the alias name PrevDoctype.
     * @param value value to set the PREV_DOCTYPE
     */
    public void setPrevDoctype(String value) {
        setAttributeInternal(PREVDOCTYPE, value);
    }

    /**
     * Gets the attribute value for PREV_DOCID using the alias name PrevDocid.
     * @return the PREV_DOCID
     */
    public String getPrevDocid() {
        return (String) getAttributeInternal(PREVDOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for PREV_DOCID using the alias name PrevDocid.
     * @param value value to set the PREV_DOCID
     */
    public void setPrevDocid(String value) {
        setAttributeInternal(PREVDOCID, value);
    }

    /**
     * Gets the attribute value for CDATE using the alias name Cdate.
     * @return the CDATE
     */
    public Date getCdate() {
        return (Date) getAttributeInternal(CDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CDATE using the alias name Cdate.
     * @param value value to set the CDATE
     */
    public void setCdate(Date value) {
        setAttributeInternal(CDATE, value);
    }

    /**
     * Gets the attribute value for MDATE using the alias name Mdate.
     * @return the MDATE
     */
    public Date getMdate() {
        return (Date) getAttributeInternal(MDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MDATE using the alias name Mdate.
     * @param value value to set the MDATE
     */
    public void setMdate(Date value) {
        setAttributeInternal(MDATE, value);
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
     * Gets the attribute value for TXT_JOBCARD_INFO using the alias name txtJobcardInfo.
     * @return the TXT_JOBCARD_INFO
     */
    public String gettxtJobcardInfo() {
        return (String) getAttributeInternal(TXTJOBCARDINFO);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_JOBCARD_INFO using the alias name txtJobcardInfo.
     * @param value value to set the TXT_JOBCARD_INFO
     */
    public void settxtJobcardInfo(String value) {
        setAttributeInternal(TXTJOBCARDINFO, value);
    }

    /**
     * Gets the attribute value for TXT_JOBSTATUS using the alias name txtJobstatus.
     * @return the TXT_JOBSTATUS
     */
    public String gettxtJobstatus() {
        return (String) getAttributeInternal(TXTJOBSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_JOBSTATUS using the alias name txtJobstatus.
     * @param value value to set the TXT_JOBSTATUS
     */
    public void settxtJobstatus(String value) {
        setAttributeInternal(TXTJOBSTATUS, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrvJobcardVO.
     */
    public Row getSrvJobcardVO() {
        return (Row) getAttributeInternal(SRVJOBCARDVO);
    }

    /**
     * Sets the master-detail link SrvJobcardVO between this object and <code>value</code>.
     */
    public void setSrvJobcardVO(Row value) {
        setAttributeInternal(SRVJOBCARDVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvSetDeliveryJobCardNo.
     */
    public RowSet getAccSrvSetDeliveryJobCardNo() {
        return (RowSet) getAttributeInternal(ACCSRVSETDELIVERYJOBCARDNO);
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

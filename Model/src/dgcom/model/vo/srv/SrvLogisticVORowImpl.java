package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvLogisticImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 04 13:59:53 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvLogisticVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVLOGISTIC = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Logid,
        Locationid,
        Fromlocationid,
        Logdate,
        Remarks,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Docid,
        Doctypeid,
        Doctype,
        IsMigrated,
        MigratedDate,
        txtLovName,
        Logidseq,
        SrvLogdetlVO,
        SrvLogDetSrvJobCardNoCIC_0082QVO,
        AccSrvLogisticDocumentIdJobDocument,
        AccSrvLogisticDocumentIdJobDocumentPendJobRec,
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


    public static final int LOGID = AttributesEnum.Logid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int FROMLOCATIONID = AttributesEnum.Fromlocationid.index();
    public static final int LOGDATE = AttributesEnum.Logdate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int DOCID = AttributesEnum.Docid.index();
    public static final int DOCTYPEID = AttributesEnum.Doctypeid.index();
    public static final int DOCTYPE = AttributesEnum.Doctype.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int TXTLOVNAME = AttributesEnum.txtLovName.index();
    public static final int LOGIDSEQ = AttributesEnum.Logidseq.index();
    public static final int SRVLOGDETLVO = AttributesEnum.SrvLogdetlVO.index();
    public static final int SRVLOGDETSRVJOBCARDNOCIC_0082QVO = AttributesEnum.SrvLogDetSrvJobCardNoCIC_0082QVO.index();
    public static final int ACCSRVLOGISTICDOCUMENTIDJOBDOCUMENT =
        AttributesEnum.AccSrvLogisticDocumentIdJobDocument.index();
    public static final int ACCSRVLOGISTICDOCUMENTIDJOBDOCUMENTPENDJOBREC =
        AttributesEnum.AccSrvLogisticDocumentIdJobDocumentPendJobRec.index();
    public static final int ACCSYSUSERRIGHTSWISELOCATION = AttributesEnum.AccSysUserRightsWiseLocation.index();
    public static final int ACCSUBMITYESNO = AttributesEnum.AccSubmitYesNo.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvLogisticVORowImpl() {
    }

    /**
     * Gets SrvLogistic entity object.
     * @return the SrvLogistic
     */
    public SrvLogisticImpl getSrvLogistic() {
        return (SrvLogisticImpl) getEntity(ENTITY_SRVLOGISTIC);
    }

    /**
     * Gets the attribute value for LOGID using the alias name Logid.
     * @return the LOGID
     */
    
    public String getLogid() {
        return (String) getAttributeInternal(LOGID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOGID using the alias name Logid.
     * @param value value to set the LOGID
     */
    public void setLogid(String value) {
        setAttributeInternal(LOGID, value);
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
     * Gets the attribute value for FROMLOCATIONID using the alias name Fromlocationid.
     * @return the FROMLOCATIONID
     */
    public String getFromlocationid() {
        return (String) getAttributeInternal(FROMLOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for FROMLOCATIONID using the alias name Fromlocationid.
     * @param value value to set the FROMLOCATIONID
     */
    public void setFromlocationid(String value) {
        setAttributeInternal(FROMLOCATIONID, value);
    }

    /**
     * Gets the attribute value for LOGDATE using the alias name Logdate.
     * @return the LOGDATE
     */
    public Date getLogdate() {
        return (Date) getAttributeInternal(LOGDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOGDATE using the alias name Logdate.
     * @param value value to set the LOGDATE
     */
    public void setLogdate(Date value) {
        setAttributeInternal(LOGDATE, value);
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
     * Gets the attribute value for DOCID using the alias name Docid.
     * @return the DOCID
     */
    public String getDocid() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOCID using the alias name Docid.
     * @param value value to set the DOCID
     */
    public void setDocid(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for DOCTYPEID using the alias name Doctypeid.
     * @return the DOCTYPEID
     */
    public String getDoctypeid() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOCTYPEID using the alias name Doctypeid.
     * @param value value to set the DOCTYPEID
     */
    public void setDoctypeid(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for DOCTYPE using the alias name Doctype.
     * @return the DOCTYPE
     */
    public String getDoctype() {
        return (String) getAttributeInternal(DOCTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for DOCTYPE using the alias name Doctype.
     * @param value value to set the DOCTYPE
     */
    public void setDoctype(String value) {
        setAttributeInternal(DOCTYPE, value);
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
     * Gets the attribute value for the calculated attribute txtLovName.
     * @return the txtLovName
     */
    public String gettxtLovName() {
        return (String) getAttributeInternal(TXTLOVNAME);
    }


    /**
     * Gets the attribute value for LOGIDSEQ using the alias name Logidseq.
     * @return the LOGIDSEQ
     */
    public Integer getLogidseq() {
        return (Integer) getAttributeInternal(LOGIDSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for LOGIDSEQ using the alias name Logidseq.
     * @param value value to set the LOGIDSEQ
     */
    public void setLogidseq(Integer value) {
        setAttributeInternal(LOGIDSEQ, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrvLogdetlVO.
     */
    public RowIterator getSrvLogdetlVO() {
        return (RowIterator) getAttributeInternal(SRVLOGDETLVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrvLogDetSrvJobCardNoCIC_0082QVO.
     */
    public RowIterator getSrvLogDetSrvJobCardNoCIC_0082QVO() {
        return (RowIterator) getAttributeInternal(SRVLOGDETSRVJOBCARDNOCIC_0082QVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvLogisticDocumentIdJobDocument.
     */
    public RowSet getAccSrvLogisticDocumentIdJobDocument() {
        return (RowSet) getAttributeInternal(ACCSRVLOGISTICDOCUMENTIDJOBDOCUMENT);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvLogisticDocumentIdJobDocumentPendJobRec.
     */
    public RowSet getAccSrvLogisticDocumentIdJobDocumentPendJobRec() {
        return (RowSet) getAttributeInternal(ACCSRVLOGISTICDOCUMENTIDJOBDOCUMENTPENDJOBREC);
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

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getPosted().equals("Y")) {
            return false;
       }
        else
        return super.isAttributeUpdateable(i);
    }
}


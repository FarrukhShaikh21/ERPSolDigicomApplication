package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvJobfaultImpl;
import dgcom.model.eo.srv.SrvJobsolutionImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 29 16:11:12 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJobfaultVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVJOBFAULT = 0;
    public static final int ENTITY_SRVJOBSOLUTION = 1;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        JsolutionId,
        Faultid,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Rowid,
        Jobcardno,
        MastJsolutionId,
        txtFaultDescription,
        SrvJobsolutionVO,
        SrvJobqcVO,
        AccSrvFaultsFaultID,
        AccSrvFaultsFaultDescription;
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


    public static final int JSOLUTIONID = AttributesEnum.JsolutionId.index();
    public static final int FAULTID = AttributesEnum.Faultid.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int JOBCARDNO = AttributesEnum.Jobcardno.index();
    public static final int MASTJSOLUTIONID = AttributesEnum.MastJsolutionId.index();
    public static final int TXTFAULTDESCRIPTION = AttributesEnum.txtFaultDescription.index();
    public static final int SRVJOBSOLUTIONVO = AttributesEnum.SrvJobsolutionVO.index();
    public static final int SRVJOBQCVO = AttributesEnum.SrvJobqcVO.index();
    public static final int ACCSRVFAULTSFAULTID = AttributesEnum.AccSrvFaultsFaultID.index();
    public static final int ACCSRVFAULTSFAULTDESCRIPTION = AttributesEnum.AccSrvFaultsFaultDescription.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvJobfaultVORowImpl() {
    }

    /**
     * Gets SrvJobfault entity object.
     * @return the SrvJobfault
     */
    public SrvJobfaultImpl getSrvJobfault() {
        return (SrvJobfaultImpl) getEntity(ENTITY_SRVJOBFAULT);
    }


    /**
     * Gets SrvJobsolution entity object.
     * @return the SrvJobsolution
     */
    public SrvJobsolutionImpl getSrvJobsolution() {
        return (SrvJobsolutionImpl) getEntity(ENTITY_SRVJOBSOLUTION);
    }

    /**
     * Gets the attribute value for JSOLUTION_ID using the alias name JsolutionId.
     * @return the JSOLUTION_ID
     */
    public String getJsolutionId() {
        return (String) getAttributeInternal(JSOLUTIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for JSOLUTION_ID using the alias name JsolutionId.
     * @param value value to set the JSOLUTION_ID
     */
    public void setJsolutionId(String value) {
        setAttributeInternal(JSOLUTIONID, value);
    }

    /**
     * Gets the attribute value for FAULTID using the alias name Faultid.
     * @return the FAULTID
     */
    public String getFaultid() {
        return (String) getAttributeInternal(FAULTID);
    }

    /**
     * Sets <code>value</code> as attribute value for FAULTID using the alias name Faultid.
     * @param value value to set the FAULTID
     */
    public void setFaultid(String value) {
        setAttributeInternal(FAULTID, value);
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
     * Gets the attribute value for JSOLUTION_ID using the alias name MastJsolutionId.
     * @return the JSOLUTION_ID
     */
    public String getMastJsolutionId() {
        return (String) getAttributeInternal(MASTJSOLUTIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for JSOLUTION_ID using the alias name MastJsolutionId.
     * @param value value to set the JSOLUTION_ID
     */
    public void setMastJsolutionId(String value) {
        setAttributeInternal(MASTJSOLUTIONID, value);
    }

    /**
     * Gets the attribute value for TXT_FAULT_DESCRIPTION using the alias name txtFaultDescription.
     * @return the TXT_FAULT_DESCRIPTION
     */
    public String gettxtFaultDescription() {
        return (String) getAttributeInternal(TXTFAULTDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_FAULT_DESCRIPTION using the alias name txtFaultDescription.
     * @param value value to set the TXT_FAULT_DESCRIPTION
     */
    public void settxtFaultDescription(String value) {
        setAttributeInternal(TXTFAULTDESCRIPTION, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrvJobsolutionVO.
     */
    public Row getSrvJobsolutionVO() {
        return (Row) getAttributeInternal(SRVJOBSOLUTIONVO);
    }

    /**
     * Sets the master-detail link SrvJobsolutionVO between this object and <code>value</code>.
     */
    public void setSrvJobsolutionVO(Row value) {
        setAttributeInternal(SRVJOBSOLUTIONVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrvJobqcVO.
     */
    public Row getSrvJobqcVO() {
        return (Row) getAttributeInternal(SRVJOBQCVO);
    }

    /**
     * Sets the master-detail link SrvJobqcVO between this object and <code>value</code>.
     */
    public void setSrvJobqcVO(Row value) {
        setAttributeInternal(SRVJOBQCVO, value);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccSrvFaultsFaultID.
     */
    public RowSet getAccSrvFaultsFaultID() {
        return (RowSet) getAttributeInternal(ACCSRVFAULTSFAULTID);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvFaultsFaultDescription.
     */
    public RowSet getAccSrvFaultsFaultDescription() {
        return (RowSet) getAttributeInternal(ACCSRVFAULTSFAULTDESCRIPTION);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        
        if (getSrvJobsolutionVO().getAttribute("Posted").equals("Y")) {
            return false;
        }
        else
        return super.isAttributeUpdateable(i);
    }
}

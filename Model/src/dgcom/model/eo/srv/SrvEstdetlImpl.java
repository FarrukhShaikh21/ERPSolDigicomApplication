package dgcom.model.eo.srv;

import dgcom.model.stand.DigicomEntityImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 07 11:42:42 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvEstdetlImpl extends DigicomEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        EstId,
        CalledPerson,
        CallDate,
        Remarks,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Rowid,
        Estseq,
        SrvJobestimation;
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
    public static final int ESTID = AttributesEnum.EstId.index();
    public static final int CALLEDPERSON = AttributesEnum.CalledPerson.index();
    public static final int CALLDATE = AttributesEnum.CallDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int ESTSEQ = AttributesEnum.Estseq.index();
    public static final int SRVJOBESTIMATION = AttributesEnum.SrvJobestimation.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvEstdetlImpl() {
    }

    /**
     * Gets the attribute value for EstId, using the alias name EstId.
     * @return the value of EstId
     */
    public String getEstId() {
        return (String) getAttributeInternal(ESTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EstId.
     * @param value value to set the EstId
     */
    public void setEstId(String value) {
        setAttributeInternal(ESTID, value);
    }

    /**
     * Gets the attribute value for CalledPerson, using the alias name CalledPerson.
     * @return the value of CalledPerson
     */
    public String getCalledPerson() {
        return (String) getAttributeInternal(CALLEDPERSON);
    }

    /**
     * Sets <code>value</code> as the attribute value for CalledPerson.
     * @param value value to set the CalledPerson
     */
    public void setCalledPerson(String value) {
        setAttributeInternal(CALLEDPERSON, value);
    }

    /**
     * Gets the attribute value for CallDate, using the alias name CallDate.
     * @return the value of CallDate
     */
    public Date getCallDate() {
        return (Date) getAttributeInternal(CALLDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CallDate.
     * @param value value to set the CallDate
     */
    public void setCallDate(Date value) {
        setAttributeInternal(CALLDATE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for Createdby, using the alias name Createdby.
     * @return the value of Createdby
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Createdby.
     * @param value value to set the Createdby
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for Modifiedby, using the alias name Modifiedby.
     * @return the value of Modifiedby
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifiedby.
     * @param value value to set the Modifiedby
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for Rowid, using the alias name Rowid.
     * @return the value of Rowid
     */
    public RowID getRowid() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * Gets the attribute value for Estseq, using the alias name Estseq.
     * @return the value of Estseq
     */
    public Integer getEstseq() {
        return (Integer) getAttributeInternal(ESTSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Estseq.
     * @param value value to set the Estseq
     */
    public void setEstseq(Integer value) {
        setAttributeInternal(ESTSEQ, value);
    }

    /**
     * @return the associated entity SrvJobestimationImpl.
     */
    public SrvJobestimationImpl getSrvJobestimation() {
        return (SrvJobestimationImpl) getAttributeInternal(SRVJOBESTIMATION);
    }

    /**
     * Sets <code>value</code> as the associated entity SrvJobestimationImpl.
     */
    public void setSrvJobestimation(SrvJobestimationImpl value) {
        setAttributeInternal(SRVJOBESTIMATION, value);
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("dgcom.model.eo.srv.SrvEstdetl");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation==DML_INSERT) {
           populateAttributeAsChanged(ESTID, getSrvJobestimation().getAttribute("EstId"));
           
       }
        super.doDML(operation, e);
    }
}

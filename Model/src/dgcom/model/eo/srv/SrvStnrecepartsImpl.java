package dgcom.model.eo.srv;

import dgcom.model.stand.DigicomEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 17 17:06:45 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvStnrecepartsImpl extends DigicomEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Receno,
        Stndetlid,
        Partid,
        Storeid,
        Receqty,
        Rate,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Salesrate,
        Rowid,
        txtQty,
        txtPartNo,
        txtPartName,
        txtStoreName,
        SrvStnreceiving,
        InParts,
        AllStores;
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


    public static final int RECENO = AttributesEnum.Receno.index();
    public static final int STNDETLID = AttributesEnum.Stndetlid.index();
    public static final int PARTID = AttributesEnum.Partid.index();
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int RECEQTY = AttributesEnum.Receqty.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int SALESRATE = AttributesEnum.Salesrate.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int TXTQTY = AttributesEnum.txtQty.index();
    public static final int TXTPARTNO = AttributesEnum.txtPartNo.index();
    public static final int TXTPARTNAME = AttributesEnum.txtPartName.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int SRVSTNRECEIVING = AttributesEnum.SrvStnreceiving.index();
    public static final int INPARTS = AttributesEnum.InParts.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvStnrecepartsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("dgcom.model.eo.srv.SrvStnreceparts");
    }


    /**
     * Gets the attribute value for Receno, using the alias name Receno.
     * @return the value of Receno
     */
    public String getReceno() {
        return (String) getAttributeInternal(RECENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Receno.
     * @param value value to set the Receno
     */
    public void setReceno(String value) {
        setAttributeInternal(RECENO, value);
    }

    /**
     * Gets the attribute value for Stndetlid, using the alias name Stndetlid.
     * @return the value of Stndetlid
     */
    public String getStndetlid() {
        return (String) getAttributeInternal(STNDETLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Stndetlid.
     * @param value value to set the Stndetlid
     */
    public void setStndetlid(String value) {
        setAttributeInternal(STNDETLID, value);
    }

    /**
     * Gets the attribute value for Partid, using the alias name Partid.
     * @return the value of Partid
     */
    public String getPartid() {
        return (String) getAttributeInternal(PARTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Partid.
     * @param value value to set the Partid
     */
    public void setPartid(String value) {
        setAttributeInternal(PARTID, value);
    }

    /**
     * Gets the attribute value for Storeid, using the alias name Storeid.
     * @return the value of Storeid
     */
    public String getStoreid() {
        return (String) getAttributeInternal(STOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Storeid.
     * @param value value to set the Storeid
     */
    public void setStoreid(String value) {
        setAttributeInternal(STOREID, value);
    }

    /**
     * Gets the attribute value for Receqty, using the alias name Receqty.
     * @return the value of Receqty
     */
    public BigDecimal getReceqty() {
        return (BigDecimal) getAttributeInternal(RECEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Receqty.
     * @param value value to set the Receqty
     */
    public void setReceqty(BigDecimal value) {
        setAttributeInternal(RECEQTY, value);
    }

    /**
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
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
     * Gets the attribute value for Salesrate, using the alias name Salesrate.
     * @return the value of Salesrate
     */
    public BigDecimal getSalesrate() {
        return (BigDecimal) getAttributeInternal(SALESRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salesrate.
     * @param value value to set the Salesrate
     */
    public void setSalesrate(BigDecimal value) {
        setAttributeInternal(SALESRATE, value);
    }

    /**
     * Gets the attribute value for Rowid, using the alias name Rowid.
     * @return the value of Rowid
     */
    public RowID getRowid() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * Gets the attribute value for txtQty, using the alias name txtQty.
     * @return the value of txtQty
     */
    public BigDecimal gettxtQty() {
        return (BigDecimal) getAttributeInternal(TXTQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtQty.
     * @param value value to set the txtQty
     */
    public void settxtQty(BigDecimal value) {
        setAttributeInternal(TXTQTY, value);
    }

    /**
     * Gets the attribute value for txtPartNo, using the alias name txtPartNo.
     * @return the value of txtPartNo
     */
    public String gettxtPartNo() {
        return (String) getAttributeInternal(TXTPARTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtPartNo.
     * @param value value to set the txtPartNo
     */
    public void settxtPartNo(String value) {
        setAttributeInternal(TXTPARTNO, value);
    }

    /**
     * Gets the attribute value for txtPartName, using the alias name txtPartName.
     * @return the value of txtPartName
     */
    public String gettxtPartName() {
        return (String) getAttributeInternal(TXTPARTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtPartName.
     * @param value value to set the txtPartName
     */
    public void settxtPartName(String value) {
        setAttributeInternal(TXTPARTNAME, value);
    }

    /**
     * Gets the attribute value for txtStoreName, using the alias name txtStoreName.
     * @return the value of txtStoreName
     */
    public String gettxtStoreName() {
        return (String) getAttributeInternal(TXTSTORENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtStoreName.
     * @param value value to set the txtStoreName
     */
    public void settxtStoreName(String value) {
        setAttributeInternal(TXTSTORENAME, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public SrvStnreceivingImpl getSrvStnreceiving() {
        return (SrvStnreceivingImpl) getAttributeInternal(SRVSTNRECEIVING);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSrvStnreceiving(SrvStnreceivingImpl value) {
        setAttributeInternal(SRVSTNRECEIVING, value);
    }


    /**
     * @return the associated entity InPartsImpl.
     */
    public InPartsImpl getInParts() {
        return (InPartsImpl) getAttributeInternal(INPARTS);
    }

    /**
     * Sets <code>value</code> as the associated entity InPartsImpl.
     */
    public void setInParts(InPartsImpl value) {
        setAttributeInternal(INPARTS, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllStores() {
        return (EntityImpl) getAttributeInternal(ALLSTORES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllStores(EntityImpl value) {
        setAttributeInternal(ALLSTORES, value);
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
        super.doDML(operation, e);
    }
}

package dgcom.model.eo.srv;

import dgcom.model.stand.DigicomClass;
import dgcom.model.stand.DigicomEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.ApplicationModule;
import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 04 22:40:05 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PuPurchaseOrdersImpl extends DigicomEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Poid,
        Locationid,
        Supplierid,
        Currcode,
        Deliverytermid,
        Paymenttermid,
        ReceStoreid,
        PoDate,
        Potype,
        Postatus,
        SuppRefno,
        SuppRefDate,
        ExchangeRate,
        Remarks,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        PoFor,
        ProdId,
        LcBankid,
        LcBranchid,
        LcRef,
        LcForId,
        IsMigrated,
        MigratedDate,
        txtItemID,
        txtRecStoreName,
        txtSupplierName,
        txtModelName,
        Poseq,
        PuPoLines,
        AllProdcategory,
        AllStores,
        PuSuppliers;
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


    public static final int POID = AttributesEnum.Poid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int CURRCODE = AttributesEnum.Currcode.index();
    public static final int DELIVERYTERMID = AttributesEnum.Deliverytermid.index();
    public static final int PAYMENTTERMID = AttributesEnum.Paymenttermid.index();
    public static final int RECESTOREID = AttributesEnum.ReceStoreid.index();
    public static final int PODATE = AttributesEnum.PoDate.index();
    public static final int POTYPE = AttributesEnum.Potype.index();
    public static final int POSTATUS = AttributesEnum.Postatus.index();
    public static final int SUPPREFNO = AttributesEnum.SuppRefno.index();
    public static final int SUPPREFDATE = AttributesEnum.SuppRefDate.index();
    public static final int EXCHANGERATE = AttributesEnum.ExchangeRate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int POFOR = AttributesEnum.PoFor.index();
    public static final int PRODID = AttributesEnum.ProdId.index();
    public static final int LCBANKID = AttributesEnum.LcBankid.index();
    public static final int LCBRANCHID = AttributesEnum.LcBranchid.index();
    public static final int LCREF = AttributesEnum.LcRef.index();
    public static final int LCFORID = AttributesEnum.LcForId.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int TXTITEMID = AttributesEnum.txtItemID.index();
    public static final int TXTRECSTORENAME = AttributesEnum.txtRecStoreName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int TXTMODELNAME = AttributesEnum.txtModelName.index();
    public static final int POSEQ = AttributesEnum.Poseq.index();
    public static final int PUPOLINES = AttributesEnum.PuPoLines.index();
    public static final int ALLPRODCATEGORY = AttributesEnum.AllProdcategory.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PuPurchaseOrdersImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("dgcom.model.eo.srv.PuPurchaseOrders");
    }


    /**
     * Gets the attribute value for Poid, using the alias name Poid.
     * @return the value of Poid
     */
    public String getPoid() {
        return (String) getAttributeInternal(POID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Poid.
     * @param value value to set the Poid
     */
    public void setPoid(String value) {
        setAttributeInternal(POID, value);
    }

    /**
     * Gets the attribute value for Locationid, using the alias name Locationid.
     * @return the value of Locationid
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Locationid.
     * @param value value to set the Locationid
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for Supplierid, using the alias name Supplierid.
     * @return the value of Supplierid
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Supplierid.
     * @param value value to set the Supplierid
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for Currcode, using the alias name Currcode.
     * @return the value of Currcode
     */
    public String getCurrcode() {
        return (String) getAttributeInternal(CURRCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Currcode.
     * @param value value to set the Currcode
     */
    public void setCurrcode(String value) {
        setAttributeInternal(CURRCODE, value);
    }

    /**
     * Gets the attribute value for Deliverytermid, using the alias name Deliverytermid.
     * @return the value of Deliverytermid
     */
    public String getDeliverytermid() {
        return (String) getAttributeInternal(DELIVERYTERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Deliverytermid.
     * @param value value to set the Deliverytermid
     */
    public void setDeliverytermid(String value) {
        setAttributeInternal(DELIVERYTERMID, value);
    }

    /**
     * Gets the attribute value for Paymenttermid, using the alias name Paymenttermid.
     * @return the value of Paymenttermid
     */
    public String getPaymenttermid() {
        return (String) getAttributeInternal(PAYMENTTERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Paymenttermid.
     * @param value value to set the Paymenttermid
     */
    public void setPaymenttermid(String value) {
        setAttributeInternal(PAYMENTTERMID, value);
    }

    /**
     * Gets the attribute value for ReceStoreid, using the alias name ReceStoreid.
     * @return the value of ReceStoreid
     */
    public String getReceStoreid() {
        return (String) getAttributeInternal(RECESTOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceStoreid.
     * @param value value to set the ReceStoreid
     */
    public void setReceStoreid(String value) {
        setAttributeInternal(RECESTOREID, value);
    }

    /**
     * Gets the attribute value for PoDate, using the alias name PoDate.
     * @return the value of PoDate
     */
    public Date getPoDate() {
        return (Date) getAttributeInternal(PODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoDate.
     * @param value value to set the PoDate
     */
    public void setPoDate(Date value) {
        setAttributeInternal(PODATE, value);
    }

    /**
     * Gets the attribute value for Potype, using the alias name Potype.
     * @return the value of Potype
     */
    public String getPotype() {
        return (String) getAttributeInternal(POTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Potype.
     * @param value value to set the Potype
     */
    public void setPotype(String value) {
        setAttributeInternal(POTYPE, value);
    }

    /**
     * Gets the attribute value for Postatus, using the alias name Postatus.
     * @return the value of Postatus
     */
    public String getPostatus() {
        return (String) getAttributeInternal(POSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Postatus.
     * @param value value to set the Postatus
     */
    public void setPostatus(String value) {
        setAttributeInternal(POSTATUS, value);
    }

    /**
     * Gets the attribute value for SuppRefno, using the alias name SuppRefno.
     * @return the value of SuppRefno
     */
    public String getSuppRefno() {
        return (String) getAttributeInternal(SUPPREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuppRefno.
     * @param value value to set the SuppRefno
     */
    public void setSuppRefno(String value) {
        setAttributeInternal(SUPPREFNO, value);
    }

    /**
     * Gets the attribute value for SuppRefDate, using the alias name SuppRefDate.
     * @return the value of SuppRefDate
     */
    public Date getSuppRefDate() {
        return (Date) getAttributeInternal(SUPPREFDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuppRefDate.
     * @param value value to set the SuppRefDate
     */
    public void setSuppRefDate(Date value) {
        setAttributeInternal(SUPPREFDATE, value);
    }

    /**
     * Gets the attribute value for ExchangeRate, using the alias name ExchangeRate.
     * @return the value of ExchangeRate
     */
    public BigDecimal getExchangeRate() {
        return (BigDecimal) getAttributeInternal(EXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExchangeRate.
     * @param value value to set the ExchangeRate
     */
    public void setExchangeRate(BigDecimal value) {
        setAttributeInternal(EXCHANGERATE, value);
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
     * Gets the attribute value for Posted, using the alias name Posted.
     * @return the value of Posted
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Posted.
     * @param value value to set the Posted
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for Postedby, using the alias name Postedby.
     * @return the value of Postedby
     */
    public String getPostedby() {
        return (String) getAttributeInternal(POSTEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Postedby.
     * @param value value to set the Postedby
     */
    public void setPostedby(String value) {
        setAttributeInternal(POSTEDBY, value);
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
     * Gets the attribute value for PoFor, using the alias name PoFor.
     * @return the value of PoFor
     */
    public String getPoFor() {
        return (String) getAttributeInternal(POFOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoFor.
     * @param value value to set the PoFor
     */
    public void setPoFor(String value) {
        setAttributeInternal(POFOR, value);
    }

    /**
     * Gets the attribute value for ProdId, using the alias name ProdId.
     * @return the value of ProdId
     */
    public String getProdId() {
        return (String) getAttributeInternal(PRODID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProdId.
     * @param value value to set the ProdId
     */
    public void setProdId(String value) {
        setAttributeInternal(PRODID, value);
    }

    /**
     * Gets the attribute value for LcBankid, using the alias name LcBankid.
     * @return the value of LcBankid
     */
    public String getLcBankid() {
        return (String) getAttributeInternal(LCBANKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcBankid.
     * @param value value to set the LcBankid
     */
    public void setLcBankid(String value) {
        setAttributeInternal(LCBANKID, value);
    }

    /**
     * Gets the attribute value for LcBranchid, using the alias name LcBranchid.
     * @return the value of LcBranchid
     */
    public String getLcBranchid() {
        return (String) getAttributeInternal(LCBRANCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcBranchid.
     * @param value value to set the LcBranchid
     */
    public void setLcBranchid(String value) {
        setAttributeInternal(LCBRANCHID, value);
    }

    /**
     * Gets the attribute value for LcRef, using the alias name LcRef.
     * @return the value of LcRef
     */
    public String getLcRef() {
        return (String) getAttributeInternal(LCREF);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcRef.
     * @param value value to set the LcRef
     */
    public void setLcRef(String value) {
        setAttributeInternal(LCREF, value);
    }

    /**
     * Gets the attribute value for LcForId, using the alias name LcForId.
     * @return the value of LcForId
     */
    public BigDecimal getLcForId() {
        return (BigDecimal) getAttributeInternal(LCFORID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcForId.
     * @param value value to set the LcForId
     */
    public void setLcForId(BigDecimal value) {
        setAttributeInternal(LCFORID, value);
    }

    /**
     * Gets the attribute value for IsMigrated, using the alias name IsMigrated.
     * @return the value of IsMigrated
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsMigrated.
     * @param value value to set the IsMigrated
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MigratedDate, using the alias name MigratedDate.
     * @return the value of MigratedDate
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MigratedDate.
     * @param value value to set the MigratedDate
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for txtItemID, using the alias name txtItemID.
     * @return the value of txtItemID
     */
    public String gettxtItemID() {
        return (String) getAttributeInternal(TXTITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtItemID.
     * @param value value to set the txtItemID
     */
    public void settxtItemID(String value) {
        setAttributeInternal(TXTITEMID, value);
    }

    /**
     * Gets the attribute value for txtRecStoreName, using the alias name txtRecStoreName.
     * @return the value of txtRecStoreName
     */
    public String gettxtRecStoreName() {
        return (String) getAttributeInternal(TXTRECSTORENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtRecStoreName.
     * @param value value to set the txtRecStoreName
     */
    public void settxtRecStoreName(String value) {
        setAttributeInternal(TXTRECSTORENAME, value);
    }

    /**
     * Gets the attribute value for txtSupplierName, using the alias name txtSupplierName.
     * @return the value of txtSupplierName
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSupplierName.
     * @param value value to set the txtSupplierName
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for txtModelName, using the alias name txtModelName.
     * @return the value of txtModelName
     */
    public String gettxtModelName() {
        return (String) getAttributeInternal(TXTMODELNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtModelName.
     * @param value value to set the txtModelName
     */
    public void settxtModelName(String value) {
        setAttributeInternal(TXTMODELNAME, value);
    }

    /**
     * Gets the attribute value for Poseq, using the alias name Poseq.
     * @return the value of Poseq
     */
    public Integer getPoseq() {
        return (Integer) getAttributeInternal(POSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Poseq.
     * @param value value to set the Poseq
     */
    public void setPoseq(Integer value) {
        setAttributeInternal(POSEQ, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPuPoLines() {
        return (RowIterator) getAttributeInternal(PUPOLINES);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllProdcategory() {
        return (EntityImpl) getAttributeInternal(ALLPRODCATEGORY);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllProdcategory(EntityImpl value) {
        setAttributeInternal(ALLPRODCATEGORY, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPuSuppliers() {
        return (EntityImpl) getAttributeInternal(PUSUPPLIERS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPuSuppliers(EntityImpl value) {
        setAttributeInternal(PUSUPPLIERS, value);
    }


    /**
     * @param poseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer poseq) {
        return new Key(new Object[] { poseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setSrvSequenceName("PU_PURCHASE_ORDERS_SEQ");
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
    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation==DML_INSERT) {
            ApplicationModule am=this.getDBTransaction().getRootApplicationModule();
            ViewObject        vo=am.findViewObject("myPuOrderPK");
            if (vo!=null)
                {
                   vo.remove();     
                }
            vo=am.createViewObjectFromQueryStmt("myPuOrderPK", "select imp_purchase_order_id('D','"+getLocationid()+"','B','"+DigicomClass.doGetFormattedDate(getPoDate().toString(), "dd-MMM-yyyy")+"') from dual");
//            vo=am.createViewObjectFromQueryStmt("myPuOrderPK",
//                                                "Select 2||'"+getLocationid()+"'||'"+DigicomClass.doGetFormattedDate(getPoDate().toString(), "yyMM")+"'||Lpad(nvl(max(to_number(substr(POID,-4)))+1,1) ,4,'0') as PK \n"+
//                                                "from pu_purchase_orders \n"+
//                                                "Where to_char(PO_DATE,'rrmm') ='"+ DigicomClass.doGetFormattedDate(getPoDate().toString(), "yyMM")+"' \n"+
//                                                "and locationid = '"+getLocationid()+"'");
            vo.executeQuery();
            populateAttributeAsChanged(POID,vo.first().getAttribute(0).toString());
        }  
        super.doDML(operation, e);
        }
}


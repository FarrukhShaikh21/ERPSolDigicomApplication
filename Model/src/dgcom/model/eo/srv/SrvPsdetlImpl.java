package dgcom.model.eo.srv;

import dgcom.model.eo.inv.InItemsImpl;
import dgcom.model.stand.DigicomEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 22 15:08:25 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvPsdetlImpl extends DigicomEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Psid,
        Storeid,
        Itemid,
        Partid,
        Salesqty,
        Rate,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        PurchaseRate,
        Rowid,
        txtStoreName,
        txtPartName,
        txtPartNo,
        txtModelNo,
        SrvPartsales,
        AllStores,
        InParts,
        InItems,
        AccSrvPartSaleDetailPartIdRate,
        AccSrvStnPartStnQtyCheckingQuery;
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


    public static final int PSID = AttributesEnum.Psid.index();
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int PARTID = AttributesEnum.Partid.index();
    public static final int SALESQTY = AttributesEnum.Salesqty.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int PURCHASERATE = AttributesEnum.PurchaseRate.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int TXTPARTNAME = AttributesEnum.txtPartName.index();
    public static final int TXTPARTNO = AttributesEnum.txtPartNo.index();
    public static final int TXTMODELNO = AttributesEnum.txtModelNo.index();
    public static final int SRVPARTSALES = AttributesEnum.SrvPartsales.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();
    public static final int INPARTS = AttributesEnum.InParts.index();
    public static final int INITEMS = AttributesEnum.InItems.index();
    public static final int ACCSRVPARTSALEDETAILPARTIDRATE = AttributesEnum.AccSrvPartSaleDetailPartIdRate.index();
    public static final int ACCSRVSTNPARTSTNQTYCHECKINGQUERY = AttributesEnum.AccSrvStnPartStnQtyCheckingQuery.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvPsdetlImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("dgcom.model.eo.srv.SrvPsdetl");
    }


    /**
     * Gets the attribute value for Psid, using the alias name Psid.
     * @return the value of Psid
     */
    public String getPsid() {
        return (String) getAttributeInternal(PSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Psid.
     * @param value value to set the Psid
     */
    public void setPsid(String value) {
        setAttributeInternal(PSID, value);
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
     * Gets the attribute value for Itemid, using the alias name Itemid.
     * @return the value of Itemid
     */
    public String getItemid() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Itemid.
     * @param value value to set the Itemid
     */
    public void setItemid(String value) {
        setAttributeInternal(ITEMID, value);
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
        getAccSrvPartSaleDetailPartIdRate().setNamedWhereClauseParam("P_ADF_PARTID", value);
        getAccSrvPartSaleDetailPartIdRate().setNamedWhereClauseParam("P_ADF_PSDATE", getSrvPartsales().getAttribute("Psdate"));
        getAccSrvPartSaleDetailPartIdRate().setNamedWhereClauseParam("P_ADF_STORE_ID", getSrvPartsales().getAttribute("txtStoreId"));
        getAccSrvPartSaleDetailPartIdRate().executeQuery();
        try {
            setRate(new BigDecimal(getAccSrvPartSaleDetailPartIdRate().first().getAttribute("Price").toString()));
       } catch (NullPointerException e) {
            // TODO: Add catch code
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            setRate(null);
        }
        
        
    }

    /**
     * Gets the attribute value for Salesqty, using the alias name Salesqty.
     * @return the value of Salesqty
     */
    public BigDecimal getSalesqty() {
        return (BigDecimal) getAttributeInternal(SALESQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salesqty.
     * @param value value to set the Salesqty
     */
    public void setSalesqty(BigDecimal value) {
        setAttributeInternal(SALESQTY, value);
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
     * Gets the attribute value for PurchaseRate, using the alias name PurchaseRate.
     * @return the value of PurchaseRate
     */
    public BigDecimal getPurchaseRate() {
        return (BigDecimal) getAttributeInternal(PURCHASERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PurchaseRate.
     * @param value value to set the PurchaseRate
     */
    public void setPurchaseRate(BigDecimal value) {
        setAttributeInternal(PURCHASERATE, value);
    }

    /**
     * Gets the attribute value for Rowid, using the alias name Rowid.
     * @return the value of Rowid
     */
    public RowID getRowid() {
        return (RowID) getAttributeInternal(ROWID);
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
     * Gets the attribute value for txtModelNo, using the alias name txtModelNo.
     * @return the value of txtModelNo
     */
    public String gettxtModelNo() {
        return (String) getAttributeInternal(TXTMODELNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtModelNo.
     * @param value value to set the txtModelNo
     */
    public void settxtModelNo(String value) {
        setAttributeInternal(TXTMODELNO, value);
    }

    /**
     * @return the associated entity dgcom.model.stand.DigicomEntityImpl.
     */
    public SrvPartsalesImpl getSrvPartsales() {
        return (SrvPartsalesImpl) getAttributeInternal(SRVPARTSALES);
    }

    /**
     * Sets <code>value</code> as the associated entity dgcom.model.stand.DigicomEntityImpl.
     */
    public void setSrvPartsales(SrvPartsalesImpl value) {
        setAttributeInternal(SRVPARTSALES, value);
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
     * @return the associated entity dgcom.model.eo.inv.InItemsImpl.
     */
    public InItemsImpl getInItems() {
        return (InItemsImpl) getAttributeInternal(INITEMS);
    }

    /**
     * Sets <code>value</code> as the associated entity dgcom.model.eo.inv.InItemsImpl.
     */
    public void setInItems(InItemsImpl value) {
        setAttributeInternal(INITEMS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvPartSaleDetailPartIdRate.
     */
    public RowSet getAccSrvPartSaleDetailPartIdRate() {
        return (RowSet) getAttributeInternal(ACCSRVPARTSALEDETAILPARTIDRATE);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccSrvStnPartStnQtyCheckingQuery.
     */
    public RowSet getAccSrvStnPartStnQtyCheckingQuery() {
        return (RowSet) getAttributeInternal(ACCSRVSTNPARTSTNQTYCHECKINGQUERY);
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
        if (operation==DML_INSERT && getPartid()==null) {
            remove();
            return;
        }        
        super.doDML(operation, e);
    }
}


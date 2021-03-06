package dgcom.model.eo.srv;

import dgcom.model.stand.DigicomClass;

import dgcom.model.stand.DigicomEntityImpl;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 13 13:22:36 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvDealersImpl extends DigicomEntityImpl {
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
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DealerId,
        Locationid,
        Name,
        City,
        Address,
        Phoneno1,
        Phoneno2,
        MobileNo,
        Email,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Cityid,
        Careof,
        Active,
        txtMobileContact,
        SrvJobcard,
        SrvCourierdeli,
        SrvReceiptMaster;
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


    public static final int DEALERID = AttributesEnum.DealerId.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int CITY = AttributesEnum.City.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int PHONENO1 = AttributesEnum.Phoneno1.index();
    public static final int PHONENO2 = AttributesEnum.Phoneno2.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int CITYID = AttributesEnum.Cityid.index();
    public static final int CAREOF = AttributesEnum.Careof.index();
    public static final int ACTIVE = AttributesEnum.Active.index();
    public static final int TXTMOBILECONTACT = AttributesEnum.txtMobileContact.index();
    public static final int SRVJOBCARD = AttributesEnum.SrvJobcard.index();
    public static final int SRVCOURIERDELI = AttributesEnum.SrvCourierdeli.index();
    public static final int SRVRECEIPTMASTER = AttributesEnum.SrvReceiptMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvDealersImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("dgcom.model.eo.srv.SrvDealers");
    }


    /**
     * Gets the attribute value for DealerId, using the alias name DealerId.
     * @return the value of DealerId
     */
    public String getDealerId() {
        return (String) getAttributeInternal(DEALERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DealerId.
     * @param value value to set the DealerId
     */
    public void setDealerId(String value) {
        setAttributeInternal(DEALERID, value);
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
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for City, using the alias name City.
     * @return the value of City
     */
    public String getCity() {
        return (String) getAttributeInternal(CITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for City.
     * @param value value to set the City
     */
    public void setCity(String value) {
        setAttributeInternal(CITY, value);
    }

    /**
     * Gets the attribute value for Address, using the alias name Address.
     * @return the value of Address
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Address.
     * @param value value to set the Address
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for Phoneno1, using the alias name Phoneno1.
     * @return the value of Phoneno1
     */
    public String getPhoneno1() {
        return (String) getAttributeInternal(PHONENO1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Phoneno1.
     * @param value value to set the Phoneno1
     */
    public void setPhoneno1(String value) {
        setAttributeInternal(PHONENO1, value);
    }

    /**
     * Gets the attribute value for Phoneno2, using the alias name Phoneno2.
     * @return the value of Phoneno2
     */
    public String getPhoneno2() {
        return (String) getAttributeInternal(PHONENO2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Phoneno2.
     * @param value value to set the Phoneno2
     */
    public void setPhoneno2(String value) {
        setAttributeInternal(PHONENO2, value);
    }

    /**
     * Gets the attribute value for MobileNo, using the alias name MobileNo.
     * @return the value of MobileNo
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for MobileNo.
     * @param value value to set the MobileNo
     */
    public void setMobileNo(String value) {
        setAttributeInternal(MOBILENO, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
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
     * Gets the attribute value for Cityid, using the alias name Cityid.
     * @return the value of Cityid
     */
    public String getCityid() {
        return (String) getAttributeInternal(CITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cityid.
     * @param value value to set the Cityid
     */
    public void setCityid(String value) {
        setAttributeInternal(CITYID, value);
    }

    /**
     * Gets the attribute value for Careof, using the alias name Careof.
     * @return the value of Careof
     */
    public String getCareof() {
        return (String) getAttributeInternal(CAREOF);
    }

    /**
     * Sets <code>value</code> as the attribute value for Careof.
     * @param value value to set the Careof
     */
    public void setCareof(String value) {
        setAttributeInternal(CAREOF, value);
    }

    /**
     * Gets the attribute value for Active, using the alias name Active.
     * @return the value of Active
     */
    public String getActive() {
        return (String) getAttributeInternal(ACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Active.
     * @param value value to set the Active
     */
    public void setActive(String value) {
        setAttributeInternal(ACTIVE, value);
    }

    /**
     * Gets the attribute value for txtMobileContact, using the alias name txtMobileContact.
     * @return the value of txtMobileContact
     */
    public String gettxtMobileContact() {
        return (String) getAttributeInternal(TXTMOBILECONTACT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtMobileContact.
     * @param value value to set the txtMobileContact
     */
    public void settxtMobileContact(String value) {
        setAttributeInternal(TXTMOBILECONTACT, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrvJobcard() {
        return (RowIterator) getAttributeInternal(SRVJOBCARD);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrvCourierdeli() {
        return (RowIterator) getAttributeInternal(SRVCOURIERDELI);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrvReceiptMaster() {
        return (RowIterator) getAttributeInternal(SRVRECEIPTMASTER);
    }


    /**
     * @param dealerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String dealerId) {
        return new Key(new Object[] { dealerId });
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation==DML_INSERT) {
            ApplicationModule am=this.getDBTransaction().getRootApplicationModule();
            ViewObject        vo=am.findViewObject("PKdealers");
            if (vo!=null)
                {
                   vo.remove();     
                }
            vo=am.createViewObjectFromQueryStmt("PKdealers",
                      "Select '"+getLocationid()+"'||LPAD(max(to_number(substr(dealer_id,-4)))+1,4,'0') as  PKdealers \n"+
                      "from srv_dealers \n"+
                      "Where locationid = '"+getLocationid()+"'");
            vo.executeQuery();
            setDealerId(vo.first().getAttribute(0).toString());
        }
        super.doDML(operation, e);
    }

}


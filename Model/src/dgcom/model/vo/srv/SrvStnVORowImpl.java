package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvStnImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 31 20:15:27 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvStnVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVSTN = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Stnno,
        Locationid,
        Tolocationid,
        Supplierid,
        DemandId,
        Stntype,
        Stndate,
        StnStatus,
        Fromdate,
        Todate,
        Remarks,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        IsMigrated,
        MigratedDate,
        txtDemandId,
        txtFromStore,
        txtToStore,
        txtModelID,
        txtCatID,
        txtToStoreName,
        txtFromStoreName,
        txtCatName,
        txtModelName,
        txtFromStoreLovName,
        SrvStnpartsVO,
        AccSysUserStoreUserWiseFromStore,
        AccAllLocationsToLocation,
        AccSrvStnAllDemandDemandID,
        AccSrvPartcategory,
        AccInItems,
        AccSysUserRightsWiseLocation,
        AccSubmitYesNo,
        AccAllStoreToStore,
        AccSysUserStoreUserWiseFromStoreName,
        AccAllStoreToStoreName,
        AccAllStoresFromStoreName;
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


    public static final int STNNO = AttributesEnum.Stnno.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int TOLOCATIONID = AttributesEnum.Tolocationid.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int DEMANDID = AttributesEnum.DemandId.index();
    public static final int STNTYPE = AttributesEnum.Stntype.index();
    public static final int STNDATE = AttributesEnum.Stndate.index();
    public static final int STNSTATUS = AttributesEnum.StnStatus.index();
    public static final int FROMDATE = AttributesEnum.Fromdate.index();
    public static final int TODATE = AttributesEnum.Todate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int TXTDEMANDID = AttributesEnum.txtDemandId.index();
    public static final int TXTFROMSTORE = AttributesEnum.txtFromStore.index();
    public static final int TXTTOSTORE = AttributesEnum.txtToStore.index();
    public static final int TXTMODELID = AttributesEnum.txtModelID.index();
    public static final int TXTCATID = AttributesEnum.txtCatID.index();
    public static final int TXTTOSTORENAME = AttributesEnum.txtToStoreName.index();
    public static final int TXTFROMSTORENAME = AttributesEnum.txtFromStoreName.index();
    public static final int TXTCATNAME = AttributesEnum.txtCatName.index();
    public static final int TXTMODELNAME = AttributesEnum.txtModelName.index();
    public static final int TXTFROMSTORELOVNAME = AttributesEnum.txtFromStoreLovName.index();
    public static final int SRVSTNPARTSVO = AttributesEnum.SrvStnpartsVO.index();
    public static final int ACCSYSUSERSTOREUSERWISEFROMSTORE = AttributesEnum.AccSysUserStoreUserWiseFromStore.index();
    public static final int ACCALLLOCATIONSTOLOCATION = AttributesEnum.AccAllLocationsToLocation.index();
    public static final int ACCSRVSTNALLDEMANDDEMANDID = AttributesEnum.AccSrvStnAllDemandDemandID.index();
    public static final int ACCSRVPARTCATEGORY = AttributesEnum.AccSrvPartcategory.index();
    public static final int ACCINITEMS = AttributesEnum.AccInItems.index();
    public static final int ACCSYSUSERRIGHTSWISELOCATION = AttributesEnum.AccSysUserRightsWiseLocation.index();
    public static final int ACCSUBMITYESNO = AttributesEnum.AccSubmitYesNo.index();
    public static final int ACCALLSTORETOSTORE = AttributesEnum.AccAllStoreToStore.index();
    public static final int ACCSYSUSERSTOREUSERWISEFROMSTORENAME =
        AttributesEnum.AccSysUserStoreUserWiseFromStoreName.index();
    public static final int ACCALLSTORETOSTORENAME = AttributesEnum.AccAllStoreToStoreName.index();
    public static final int ACCALLSTORESFROMSTORENAME = AttributesEnum.AccAllStoresFromStoreName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvStnVORowImpl() {
    }

    /**
     * Gets SrvStn entity object.
     * @return the SrvStn
     */
    public SrvStnImpl getSrvStn() {
        return (SrvStnImpl) getEntity(ENTITY_SRVSTN);
    }

    /**
     * Gets the attribute value for STNNO using the alias name Stnno.
     * @return the STNNO
     */
    public String getStnno() {
        return (String) getAttributeInternal(STNNO);
    }

    /**
     * Sets <code>value</code> as attribute value for STNNO using the alias name Stnno.
     * @param value value to set the STNNO
     */
    public void setStnno(String value) {
        setAttributeInternal(STNNO, value);
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
     * Gets the attribute value for TOLOCATIONID using the alias name Tolocationid.
     * @return the TOLOCATIONID
     */
    public String getTolocationid() {
        return (String) getAttributeInternal(TOLOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for TOLOCATIONID using the alias name Tolocationid.
     * @param value value to set the TOLOCATIONID
     */
    public void setTolocationid(String value) {
        setAttributeInternal(TOLOCATIONID, value);
    }

    /**
     * Gets the attribute value for SUPPLIERID using the alias name Supplierid.
     * @return the SUPPLIERID
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIERID using the alias name Supplierid.
     * @param value value to set the SUPPLIERID
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for DEMAND_ID using the alias name DemandId.
     * @return the DEMAND_ID
     */
    public String getDemandId() {
        return (String) getAttributeInternal(DEMANDID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_ID using the alias name DemandId.
     * @param value value to set the DEMAND_ID
     */
    public void setDemandId(String value) {
        setAttributeInternal(DEMANDID, value);
    }

    /**
     * Gets the attribute value for STNTYPE using the alias name Stntype.
     * @return the STNTYPE
     */
    public String getStntype() {
        return (String) getAttributeInternal(STNTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for STNTYPE using the alias name Stntype.
     * @param value value to set the STNTYPE
     */
    public void setStntype(String value) {
        setAttributeInternal(STNTYPE, value);
    }

    /**
     * Gets the attribute value for STNDATE using the alias name Stndate.
     * @return the STNDATE
     */
    public Date getStndate() {
        return (Date) getAttributeInternal(STNDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for STNDATE using the alias name Stndate.
     * @param value value to set the STNDATE
     */
    public void setStndate(Date value) {
        setAttributeInternal(STNDATE, value);
    }

    /**
     * Gets the attribute value for STN_STATUS using the alias name StnStatus.
     * @return the STN_STATUS
     */
    public String getStnStatus() {
        return (String) getAttributeInternal(STNSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STN_STATUS using the alias name StnStatus.
     * @param value value to set the STN_STATUS
     */
    public void setStnStatus(String value) {
        setAttributeInternal(STNSTATUS, value);
    }

    /**
     * Gets the attribute value for FROMDATE using the alias name Fromdate.
     * @return the FROMDATE
     */
    public Date getFromdate() {
        return (Date) getAttributeInternal(FROMDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for FROMDATE using the alias name Fromdate.
     * @param value value to set the FROMDATE
     */
    public void setFromdate(Date value) {
        setAttributeInternal(FROMDATE, value);
    }

    /**
     * Gets the attribute value for TODATE using the alias name Todate.
     * @return the TODATE
     */
    public Date getTodate() {
        return (Date) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TODATE using the alias name Todate.
     * @param value value to set the TODATE
     */
    public void setTodate(Date value) {
        setAttributeInternal(TODATE, value);
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
     * Gets the attribute value for TXT_DEMAND_ID using the alias name txtDemandId.
     * @return the TXT_DEMAND_ID
     */
    public String gettxtDemandId() {
        return (String) getAttributeInternal(TXTDEMANDID);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_DEMAND_ID using the alias name txtDemandId.
     * @param value value to set the TXT_DEMAND_ID
     */
    public void settxtDemandId(String value) {
        setAttributeInternal(TXTDEMANDID, value);
    }

    /**
     * Gets the attribute value for TXT_FROM_STORE using the alias name txtFromStore.
     * @return the TXT_FROM_STORE
     */
    public String gettxtFromStore() {
        return (String) getAttributeInternal(TXTFROMSTORE);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_FROM_STORE using the alias name txtFromStore.
     * @param value value to set the TXT_FROM_STORE
     */
    public void settxtFromStore(String value) {
        setAttributeInternal(TXTFROMSTORE, value);
        doPopulateDetail(value,"Fromstoreid");
    }

    public void doPopulateDetail(String pValue, String pColumnName) {
            ViewObject vo = this.getApplicationModule().findViewObject("SrvStnpartsStoreDETCRUD");
            //RowSetIterator iter = vo.getro`
        for (int i = 0; i <  getSrvStnpartsVO().getRowCount(); i++) {
           
       } 

        /*   while(iter.hasNext()){
                Row r=iter.next();
                r.setAttribute(pColumnName, (String) pValue);
            }
            iter.closeRowSetIterator(); */
            //int row = vo.getRowCount();
            //RowSet rs[]=vo.getRowSets();
            /*         RowSet rs=vo.getRowSet();
            System.out.println(rs.getRowCount());
            for (int i = 0; i < row; i++) {
                Row r=rs.getRowAtRangeIndex(i);
                r.setAttribute(pColumnName, (String) pValue);
                //vo.getRowAtRangeIndex(i).setAttribute(pColumnName,(String) pValue);
            } */
            /*   for (int i = 0; i < 4; i++) {
                Row r=vo.createRow();
                r.setAttribute("Stnno",  getStnno());
                r.setAttribute("Fromstoreid",  pValue);
                 *///vo.insertRow(r);
           //}
           // getDBTransaction().commit();

            //vo.setCurrentRow(vo.first());
        }
    /**
     * Gets the attribute value for TXT_TO_STORE using the alias name txtToStore.
     * @return the TXT_TO_STORE
     */
    public String gettxtToStore() {
        return (String) getAttributeInternal(TXTTOSTORE);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_TO_STORE using the alias name txtToStore.
     * @param value value to set the TXT_TO_STORE
     */
    public void settxtToStore(String value) {
        setAttributeInternal(TXTTOSTORE, value);
    }

    /**
     * Gets the attribute value for TXT_MODEL_ID using the alias name txtModelID.
     * @return the TXT_MODEL_ID
     */
    public String gettxtModelID() {
        return (String) getAttributeInternal(TXTMODELID);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_MODEL_ID using the alias name txtModelID.
     * @param value value to set the TXT_MODEL_ID
     */
    public void settxtModelID(String value) {
        setAttributeInternal(TXTMODELID, value);
    }

    /**
     * Gets the attribute value for TXT_CAT_ID using the alias name txtCatID.
     * @return the TXT_CAT_ID
     */
    public String gettxtCatID() {
        return (String) getAttributeInternal(TXTCATID);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_CAT_ID using the alias name txtCatID.
     * @param value value to set the TXT_CAT_ID
     */
    public void settxtCatID(String value) {
        setAttributeInternal(TXTCATID, value);
    }

    /**
     * Gets the attribute value for TXT_TO_STORE_NAME using the alias name txtToStoreName.
     * @return the TXT_TO_STORE_NAME
     */
    public String gettxtToStoreName() {
        return (String) getAttributeInternal(TXTTOSTORENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_TO_STORE_NAME using the alias name txtToStoreName.
     * @param value value to set the TXT_TO_STORE_NAME
     */
    public void settxtToStoreName(String value) {
        setAttributeInternal(TXTTOSTORENAME, value);
    }

    /**
     * Gets the attribute value for TXT_FROM_STORE_NAME using the alias name txtFromStoreName.
     * @return the TXT_FROM_STORE_NAME
     */
    public String gettxtFromStoreName() {
        return (String) getAttributeInternal(TXTFROMSTORENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_FROM_STORE_NAME using the alias name txtFromStoreName.
     * @param value value to set the TXT_FROM_STORE_NAME
     */
    public void settxtFromStoreName(String value) {
        setAttributeInternal(TXTFROMSTORENAME, value);
    }

    /**
     * Gets the attribute value for TXT_CAT_NAME using the alias name txtCatName.
     * @return the TXT_CAT_NAME
     */
    public String gettxtCatName() {
        return (String) getAttributeInternal(TXTCATNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_CAT_NAME using the alias name txtCatName.
     * @param value value to set the TXT_CAT_NAME
     */
    public void settxtCatName(String value) {
        setAttributeInternal(TXTCATNAME, value);
    }

    /**
     * Gets the attribute value for TXT_MODEL_NAME using the alias name txtModelName.
     * @return the TXT_MODEL_NAME
     */
    public String gettxtModelName() {
        return (String) getAttributeInternal(TXTMODELNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_MODEL_NAME using the alias name txtModelName.
     * @param value value to set the TXT_MODEL_NAME
     */
    public void settxtModelName(String value) {
        setAttributeInternal(TXTMODELNAME, value);
    }


    /**
     * Gets the attribute value for the calculated attribute txtFromStoreLovName.
     * @return the txtFromStoreLovName
     */
    public String gettxtFromStoreLovName() {
        return (String) getAttributeInternal(TXTFROMSTORELOVNAME);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrvStnpartsVO.
     */
    public RowIterator getSrvStnpartsVO() {
        return (RowIterator) getAttributeInternal(SRVSTNPARTSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysUserStoreUserWiseFromStore.
     */
    public RowSet getAccSysUserStoreUserWiseFromStore() {
        return (RowSet) getAttributeInternal(ACCSYSUSERSTOREUSERWISEFROMSTORE);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccAllLocationsToLocation.
     */
    public RowSet getAccAllLocationsToLocation() {
        return (RowSet) getAttributeInternal(ACCALLLOCATIONSTOLOCATION);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvStnAllDemandDemandID.
     */
    public RowSet getAccSrvStnAllDemandDemandID() {
        return (RowSet) getAttributeInternal(ACCSRVSTNALLDEMANDDEMANDID);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvPartcategory.
     */
    public RowSet getAccSrvPartcategory() {
        return (RowSet) getAttributeInternal(ACCSRVPARTCATEGORY);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInItems.
     */
    public RowSet getAccInItems() {
        return (RowSet) getAttributeInternal(ACCINITEMS);
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

    /**
     * Gets the view accessor <code>RowSet</code> AccAllStoreToStore.
     */
    public RowSet getAccAllStoreToStore() {
        return (RowSet) getAttributeInternal(ACCALLSTORETOSTORE);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysUserStoreUserWiseFromStoreName.
     */
    public RowSet getAccSysUserStoreUserWiseFromStoreName() {
        return (RowSet) getAttributeInternal(ACCSYSUSERSTOREUSERWISEFROMSTORENAME);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllStoreToStoreName.
     */
    public RowSet getAccAllStoreToStoreName() {
        return (RowSet) getAttributeInternal(ACCALLSTORETOSTORENAME);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllStoresFromStoreName.
     */
    public RowSet getAccAllStoresFromStoreName() {
        return (RowSet) getAttributeInternal(ACCALLSTORESFROMSTORENAME);
    }
}

package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvJccatImpl;
import dgcom.model.stand.DigicomViewRowImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 24 15:19:09 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJccatVORowImpl extends DigicomViewRowImpl {
    public static final int ENTITY_SRVJCCAT = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Compcatid,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Jcdetlid,
        Rowid,
        SrvJcdetlVO,
        AccSrvCompcategory;
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
    public static final int COMPCATID = AttributesEnum.Compcatid.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int JCDETLID = AttributesEnum.Jcdetlid.index();
    public static final int ROWID = AttributesEnum.Rowid.index();
    public static final int SRVJCDETLVO = AttributesEnum.SrvJcdetlVO.index();
    public static final int ACCSRVCOMPCATEGORY = AttributesEnum.AccSrvCompcategory.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvJccatVORowImpl() {
    }

    /**
     * Gets SrvJccat entity object.
     * @return the SrvJccat
     */
    public SrvJccatImpl getSrvJccat() {
        return (SrvJccatImpl) getEntity(ENTITY_SRVJCCAT);
    }

    /**
     * Gets the attribute value for COMPCATID using the alias name Compcatid.
     * @return the COMPCATID
     */
    public String getCompcatid() {
        return (String) getAttributeInternal(COMPCATID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPCATID using the alias name Compcatid.
     * @param value value to set the COMPCATID
     */
    public void setCompcatid(String value) {
        setAttributeInternal(COMPCATID, value);
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
     * Gets the attribute value for JCDETLID using the alias name Jcdetlid.
     * @return the JCDETLID
     */
    public String getJcdetlid() {
        return (String) getAttributeInternal(JCDETLID);
    }

    /**
     * Sets <code>value</code> as attribute value for JCDETLID using the alias name Jcdetlid.
     * @param value value to set the JCDETLID
     */
    public void setJcdetlid(String value) {
        setAttributeInternal(JCDETLID, value);
    }

    /**
     * Gets the attribute value for ROWID using the alias name Rowid.
     * @return the ROWID
     */
    public RowID getRowid() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrvJcdetlVO.
     */
    public Row getSrvJcdetlVO() {
        return (Row) getAttributeInternal(SRVJCDETLVO);
    }

    /**
     * Sets the master-detail link SrvJcdetlVO between this object and <code>value</code>.
     */
    public void setSrvJcdetlVO(Row value) {
        setAttributeInternal(SRVJCDETLVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvCompcategory.
     */
    public RowSet getAccSrvCompcategory() {
        return (RowSet) getAttributeInternal(ACCSRVCOMPCATEGORY);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        
        return super.isAttributeUpdateable(i);
    }

}


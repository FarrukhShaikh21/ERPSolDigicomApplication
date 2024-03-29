package dgcom.model.vo.srv;

import dgcom.model.eo.srv.SrvBomImpl;

import dgcom.model.stand.DigicomViewRowImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 11 15:45:19 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvBomVORowImpl extends DigicomViewRowImpl {


    public static final int ENTITY_SRVBOM = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BomId,
        Itemid,
        Description,
        Levelno,
        Bomdate,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Supplierid,
        txtModelName,
        txtSupplier,
        txtEOL,
        txtEOLRemarks,
        Bomseq,
        InItemsVO,
        SrvBompartsVO,
        PuSuppliersVO,
        AccSrvInItems,
        AccPuSuppliers;
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


    public static final int BOMID = AttributesEnum.BomId.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int LEVELNO = AttributesEnum.Levelno.index();
    public static final int BOMDATE = AttributesEnum.Bomdate.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int TXTMODELNAME = AttributesEnum.txtModelName.index();
    public static final int TXTSUPPLIER = AttributesEnum.txtSupplier.index();
    public static final int TXTEOL = AttributesEnum.txtEOL.index();
    public static final int TXTEOLREMARKS = AttributesEnum.txtEOLRemarks.index();
    public static final int BOMSEQ = AttributesEnum.Bomseq.index();
    public static final int INITEMSVO = AttributesEnum.InItemsVO.index();
    public static final int SRVBOMPARTSVO = AttributesEnum.SrvBompartsVO.index();
    public static final int PUSUPPLIERSVO = AttributesEnum.PuSuppliersVO.index();
    public static final int ACCSRVINITEMS = AttributesEnum.AccSrvInItems.index();
    public static final int ACCPUSUPPLIERS = AttributesEnum.AccPuSuppliers.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrvBomVORowImpl() {
    }

    /**
     * Gets SrvBom entity object.
     * @return the SrvBom
     */
    public SrvBomImpl getSrvBom() {
        return (SrvBomImpl) getEntity(ENTITY_SRVBOM);
    }

    /**
     * Gets the attribute value for BOM_ID using the alias name BomId.
     * @return the BOM_ID
     */
    public String getBomId() {
        return (String) getAttributeInternal(BOMID);
    }

    /**
     * Sets <code>value</code> as attribute value for BOM_ID using the alias name BomId.
     * @param value value to set the BOM_ID
     */
    public void setBomId(String value) {
        setAttributeInternal(BOMID, value);
    }

    /**
     * Gets the attribute value for ITEMID using the alias name Itemid.
     * @return the ITEMID
     */
    public String getItemid() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEMID using the alias name Itemid.
     * @param value value to set the ITEMID
     */
    public void setItemid(String value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for LEVELNO using the alias name Levelno.
     * @return the LEVELNO
     */
    public BigDecimal getLevelno() {
        return (BigDecimal) getAttributeInternal(LEVELNO);
    }

    /**
     * Sets <code>value</code> as attribute value for LEVELNO using the alias name Levelno.
     * @param value value to set the LEVELNO
     */
    public void setLevelno(BigDecimal value) {
        setAttributeInternal(LEVELNO, value);
    }

    /**
     * Gets the attribute value for BOMDATE using the alias name Bomdate.
     * @return the BOMDATE
     */
    public Date getBomdate() {
        return (Date) getAttributeInternal(BOMDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for BOMDATE using the alias name Bomdate.
     * @param value value to set the BOMDATE
     */
    public void setBomdate(Date value) {
        setAttributeInternal(BOMDATE, value);
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
     * Gets the attribute value for the calculated attribute txtModelName.
     * @return the txtModelName
     */
    public String gettxtModelName() {
        return (String) getAttributeInternal(TXTMODELNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtModelName.
     * @param value value to set the  txtModelName
     */
    public void settxtModelName(String value) {
        setAttributeInternal(TXTMODELNAME, value);
    }


    /**
     * Gets the attribute value for TXT_SUPPLIER using the alias name txtSupplier.
     * @return the TXT_SUPPLIER
     */
    public String gettxtSupplier() {
        return (String) getAttributeInternal(TXTSUPPLIER);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_SUPPLIER using the alias name txtSupplier.
     * @param value value to set the TXT_SUPPLIER
     */
    public void settxtSupplier(String value) {
        setAttributeInternal(TXTSUPPLIER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtEOL.
     * @return the txtEOL
     */
    public String gettxtEOL() {
        return (String) getAttributeInternal(TXTEOL);
    }

    /**
     * Gets the attribute value for the calculated attribute txtEOLRemarks.
     * @return the txtEOLRemarks
     */
    public String gettxtEOLRemarks() {
        return (String) getAttributeInternal(TXTEOLREMARKS);
    }

    /**
     * Gets the attribute value for BOMSEQ using the alias name Bomseq.
     * @return the BOMSEQ
     */
    public Integer getBomseq() {
        return (Integer) getAttributeInternal(BOMSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for BOMSEQ using the alias name Bomseq.
     * @param value value to set the BOMSEQ
     */
    public void setBomseq(Integer value) {
        setAttributeInternal(BOMSEQ, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InItemsVO.
     */
    public Row getInItemsVO() {
        return (Row) getAttributeInternal(INITEMSVO);
    }

    /**
     * Sets the master-detail link InItemsVO between this object and <code>value</code>.
     */
    public void setInItemsVO(Row value) {
        setAttributeInternal(INITEMSVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrvBompartsVO.
     */
    public RowIterator getSrvBompartsVO() {
        return (RowIterator) getAttributeInternal(SRVBOMPARTSVO);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link PuSuppliersVO.
     */
    public Row getPuSuppliersVO() {
        return (Row) getAttributeInternal(PUSUPPLIERSVO);
    }

    /**
     * Sets the master-detail link PuSuppliersVO between this object and <code>value</code>.
     */
    public void setPuSuppliersVO(Row value) {
        setAttributeInternal(PUSUPPLIERSVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrvInItems.
     */
    public RowSet getAccSrvInItems() {
        return (RowSet) getAttributeInternal(ACCSRVINITEMS);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccPuSuppliers.
     */
    public RowSet getAccPuSuppliers() {
        return (RowSet) getAttributeInternal(ACCPUSUPPLIERS);
    }
}


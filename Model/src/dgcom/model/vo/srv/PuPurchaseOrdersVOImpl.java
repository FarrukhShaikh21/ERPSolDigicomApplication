package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;
import dgcom.model.vo.srv.common.PuPurchaseOrdersVO;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 05 17:40:12 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PuPurchaseOrdersVOImpl extends DigicomViewObjectImpl implements PuPurchaseOrdersVO {
    /**
     * This is the default constructor (do not remove).
     */
    public PuPurchaseOrdersVOImpl() {
    }
    
    public void doSubmitPurchaseOrder() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=PKG_SERVICE.FUNC_SRV_PURCHASE_ORDER_SUBMIT('"+this.getCurrentRow().getAttribute("Poid")+"'); END;", 1);
        try {
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.executeUpdate();
            if (!cs.getString(1).equals("Y")) {
               this.getCurrentRow().setAttribute("Posted", "N");
               this.getDBTransaction().commit();
                throw new JboException("Unable to supervise due to "+cs.getString(1));
               
           }
            this.getDBTransaction().commit();
        } catch (SQLException e) {
            this.getCurrentRow().setAttribute("Posted", "N");
            this.getDBTransaction().commit();
            System.out.println(e.getMessage()+ "this is message");
            throw new JboException("Unable to supervise ");
        }
    }

    /**
     * Returns the variable value for P_ADF_SUPPLIER_ID.
     * @return variable value for P_ADF_SUPPLIER_ID
     */
    public String getP_ADF_SUPPLIER_ID() {
        return (String) ensureVariableManager().getVariableValue("P_ADF_SUPPLIER_ID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_SUPPLIER_ID.
     * @param value value to bind as P_ADF_SUPPLIER_ID
     */
    public void setP_ADF_SUPPLIER_ID(String value) {
        ensureVariableManager().setVariableValue("P_ADF_SUPPLIER_ID", value);
    }
    public void doCreateNewPurchaseOrderRow() {
        Row r=this.createRow();
        r.setNewRowState(Row.STATUS_NEW);
        this.insertRow(r);
    }    
}

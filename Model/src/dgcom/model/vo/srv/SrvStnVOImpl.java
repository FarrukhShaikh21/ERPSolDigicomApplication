package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;
import dgcom.model.vo.srv.common.SrvStnVO;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 16 23:13:05 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvStnVOImpl extends DigicomViewObjectImpl implements SrvStnVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvStnVOImpl() {
    }
    public void doSubmitSrvStn() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=PKG_SERVICE.FUNC_SRV_STN_SUBMIT('"+this.getCurrentRow().getAttribute("Stnno")+"'); END;", 1);
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

    public void doSubmitSrvStnStore() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=PKG_SERVICE.FUNC_SRV_STN_STORE_SUBMIT('"+this.getCurrentRow().getAttribute("Stnno")+"'); END;", 1);
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
     * Returns the variable value for P_ADF_LOCATIONID.
     * @return variable value for P_ADF_LOCATIONID
     */
    public String getP_ADF_LOCATIONID() {
        return (String) ensureVariableManager().getVariableValue("P_ADF_LOCATIONID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_LOCATIONID.
     * @param value value to bind as P_ADF_LOCATIONID
     */
    public void setP_ADF_LOCATIONID(String value) {
        ensureVariableManager().setVariableValue("P_ADF_LOCATIONID", value);
    }

    /**
     * Returns the variable value for P_ADF_STNTYPE.
     * @return variable value for P_ADF_STNTYPE
     */
    public String getP_ADF_STNTYPE() {
        return (String) ensureVariableManager().getVariableValue("P_ADF_STNTYPE");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_STNTYPE.
     * @param value value to bind as P_ADF_STNTYPE
     */
    public void setP_ADF_STNTYPE(String value) {
        ensureVariableManager().setVariableValue("P_ADF_STNTYPE", value);
    }
    
    public void doCreateNewStnRow() {
        Row r=this.createRow();
        r.setNewRowState(Row.STATUS_NEW);
        this.insertRow(r);
    } 
    
}

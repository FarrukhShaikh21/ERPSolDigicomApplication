package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;
import dgcom.model.vo.srv.common.SrvRfwarrantyVO;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 08 10:26:10 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvRfwarrantyVOImpl extends DigicomViewObjectImpl implements SrvRfwarrantyVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvRfwarrantyVOImpl() {
    }
    public void doSubmitWarrantyRefresh() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=PKG_SERVICE.FUNC_SRV_WARRANTY_REF_SUBMIT('"+this.getCurrentRow().getAttribute("Rfwid")+"'); END;", 1);
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
             throw new JboException("Unable to supervise ");
        }
    }    
    public void doCreateNewWarrantyRow() {
        Row r=this.createRow();
        r.setNewRowState(Row.STATUS_NEW);
        this.insertRow(r);
    }     
}

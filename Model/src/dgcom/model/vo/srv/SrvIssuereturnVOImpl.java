package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;

import dgcom.model.vo.srv.common.SrvIssuereturnVO;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jul 17 16:43:58 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvIssuereturnVOImpl extends DigicomViewObjectImpl implements SrvIssuereturnVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvIssuereturnVOImpl() {
    }
    
    public void doSubmitIssueReturn() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=PKG_SERVICE.FUNC_SRV_ISSUE_RETURN_SUBMIT('"+this.getCurrentRow().getAttribute("Issueretid")+"'); END;", 1);
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
}


package dgcom.model.vo.srv;

import dgcom.model.vo.srv.common.SysUsersVO;

import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 26 12:30:19 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SysUsersVOImpl extends ViewObjectImpl implements SysUsersVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SysUsersVOImpl() {
    }
    
    public String checkUserRights(String p_module_id, String  p_access_type) {
        ViewObject vo=this.getRootApplicationModule().findViewObject("SysUsersDetail1");
        vo.setWhereClause("userid='"+this.getViewObject().first().getAttribute("Userid").toString()+"' and moduleid='"+p_module_id.substring(4)+"'");
        vo.executeQuery();
        ViewObject vo1=this.getRootApplicationModule().findViewObject("SysUsersVO1");
        vo1.executeQuery();
        String s=vo.first().getAttribute("RestrictAccess").toString();
        return s;
    }

    public void doLogoutUser() {
        getViewObject().setWhereClause("2=1");
        executeQuery();
    }
}


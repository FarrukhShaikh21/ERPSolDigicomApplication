package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;
import dgcom.model.vo.srv.common.SrvCddetailVO;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 14 13:34:44 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvCddetailVOImpl extends DigicomViewObjectImpl implements SrvCddetailVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvCddetailVOImpl() {
    }

    public void doCreateNewCourierDelDetRow() {
        //ViewObject vo= this.getRootApplicationModule().findViewObject("SrvJobcardCRUD");
        for (int i = 0; i < 50; i++) {
            this.createRow();
            this.insertRow(this.createRow());
        }

    }     
}


package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;
import dgcom.model.vo.srv.common.SrvEstdetlVO;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 24 17:37:57 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvEstdetlVOImpl extends DigicomViewObjectImpl implements SrvEstdetlVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvEstdetlVOImpl() {
    }
    public void doCreateNewExtractPartDetRow() {
        //ViewObject vo= this.getRootApplicationModule().findViewObject("SrvJobcardCRUD");
        for (int i = 0; i < 5; i++) {
            this.createRow();
            this.insertRow(this.createRow());
        }

    }     
}


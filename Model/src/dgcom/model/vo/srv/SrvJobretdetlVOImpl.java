package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;
import dgcom.model.vo.srv.common.SrvJobretdetlVO;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Feb 25 11:15:31 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJobretdetlVOImpl extends DigicomViewObjectImpl implements SrvJobretdetlVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvJobretdetlVOImpl() {
    }


    public void doCreateNewJobRetDetRow() {
        //ViewObject vo= this.getRootApplicationModule().findViewObject("SrvJobcardCRUD");
        for (int i = 0; i < 100; i++) {
            this.createRow();
            this.insertRow(this.createRow());
        }

    }     
}

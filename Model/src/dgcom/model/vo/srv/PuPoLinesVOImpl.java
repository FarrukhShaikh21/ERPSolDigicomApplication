package dgcom.model.vo.srv;

import dgcom.model.stand.DigicomViewObjectImpl;
import dgcom.model.vo.srv.common.PuPoLinesVO;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 03 17:03:38 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PuPoLinesVOImpl extends DigicomViewObjectImpl implements PuPoLinesVO {
    /**
     * This is the default constructor (do not remove).
     */
    public PuPoLinesVOImpl() {
    }

    public void doCreatePurchaseDetailRow() {
       //ViewObject vo= this.getRootApplicationModule().findViewObject("SrvJobcardCRUD");
                 for (int i = 0; i < 20; i++) {
            this.createRow();
            this.insertRow(this.createRow());
       } 

    }      
}


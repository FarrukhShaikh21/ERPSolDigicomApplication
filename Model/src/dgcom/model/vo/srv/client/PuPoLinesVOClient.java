package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.PuPoLinesVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 03 17:05:23 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PuPoLinesVOClient extends ViewUsageImpl implements PuPoLinesVO {
    /**
     * This is the default constructor (do not remove).
     */
    public PuPoLinesVOClient() {
    }

    public void doCreatePurchaseDetailRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreatePurchaseDetailRow", null, null);
        return;
    }
}

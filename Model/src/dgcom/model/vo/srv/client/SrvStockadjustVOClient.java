package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvStockadjustVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 20 12:33:42 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvStockadjustVOClient extends ViewUsageImpl implements SrvStockadjustVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvStockadjustVOClient() {
    }


    public void doCreateNewStockAdjRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewStockAdjRow", null, null);
        return;
    }

    public void doSubmitSrvStockAdjust() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitSrvStockAdjust", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}

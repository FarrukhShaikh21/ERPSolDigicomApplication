package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvReviewjobwarrantyVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jul 16 13:16:45 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvReviewjobwarrantyVOClient extends ViewUsageImpl implements SrvReviewjobwarrantyVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvReviewjobwarrantyVOClient() {
    }

    public void doSubmitReviewJobWty() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitReviewJobWty", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}

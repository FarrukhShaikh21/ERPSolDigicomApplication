package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvIssuanceVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 27 13:06:25 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvIssuanceVOClient extends ViewUsageImpl implements SrvIssuanceVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvIssuanceVOClient() {
    }


    public void doCreateNewIssuanceRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewIssuanceRow", null, null);
        return;
    }

    public void doSubmitIssuance() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitIssuance", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}

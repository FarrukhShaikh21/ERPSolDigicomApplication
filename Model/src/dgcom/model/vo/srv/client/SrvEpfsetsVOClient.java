package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvEpfsetsVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 25 11:24:54 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvEpfsetsVOClient extends ViewUsageImpl implements SrvEpfsetsVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvEpfsetsVOClient() {
    }

    public void doCreateNewEetractPartRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewEetractPartRow", null, null);
        return;
    }

    public void doSubmitDismental() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitDismental", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}

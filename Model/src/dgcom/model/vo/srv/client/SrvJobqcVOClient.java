package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvJobqcVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jul 01 19:15:02 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJobqcVOClient extends ViewUsageImpl implements SrvJobqcVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvJobqcVOClient() {
    }


    public void doSubmitJobQC() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitJobQC", null, null);
        return;
    }

    public void doSubmitJobQCBefDeli() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitJobQCBefDeli", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}


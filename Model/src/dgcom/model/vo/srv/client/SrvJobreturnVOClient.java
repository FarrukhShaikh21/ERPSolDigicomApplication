package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvJobreturnVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jul 05 10:30:42 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJobreturnVOClient extends ViewUsageImpl implements SrvJobreturnVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvJobreturnVOClient() {
    }


    public void doCreateNewJobReturnRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewJobReturnRow", null, null);
        return;
    }

    public void doSubmitJobReturn() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitJobReturn", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}


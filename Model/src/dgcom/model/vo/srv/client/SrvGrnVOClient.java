package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvGrnVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 07 22:42:11 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvGrnVOClient extends ViewUsageImpl implements SrvGrnVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvGrnVOClient() {
    }


    public void doCreateNewGRNRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewGRNRow", null, null);
        return;
    }

    public void doSubmitSrvGrn() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doSubmitSrvGrn", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}

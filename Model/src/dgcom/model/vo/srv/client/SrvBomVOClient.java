package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvBomVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 05 12:06:38 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvBomVOClient extends ViewUsageImpl implements SrvBomVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvBomVOClient() {
    }

    public void doCreateNewBOMRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewBOMRow", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}


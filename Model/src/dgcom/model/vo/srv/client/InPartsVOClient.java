package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.InPartsVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 24 13:57:23 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InPartsVOClient extends ViewUsageImpl implements InPartsVO {
    /**
     * This is the default constructor (do not remove).
     */
    public InPartsVOClient() {
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}


package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvGrnPartsVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 24 16:49:47 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvGrnPartsVOClient extends ViewUsageImpl implements SrvGrnPartsVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvGrnPartsVOClient() {
    }

    public void doCreateNewGRNDetRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewGRNDetRow", null, null);
        return;
    }
}


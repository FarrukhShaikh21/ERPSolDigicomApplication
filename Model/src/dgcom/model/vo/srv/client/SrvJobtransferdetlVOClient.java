package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvJobtransferdetlVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 24 17:20:44 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJobtransferdetlVOClient extends ViewUsageImpl implements SrvJobtransferdetlVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvJobtransferdetlVOClient() {
    }

    public void doCreateNewJobTransDetRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewJobTransDetRow", null, null);
        return;
    }
}


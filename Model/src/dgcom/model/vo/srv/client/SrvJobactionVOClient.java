package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvJobactionVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 24 13:15:32 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJobactionVOClient extends ViewUsageImpl implements SrvJobactionVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvJobactionVOClient() {
    }

    public void doCreateNewJobActionRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewJobActionRow", null, null);
        return;
    }
}

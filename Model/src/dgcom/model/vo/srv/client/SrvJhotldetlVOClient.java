package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.SrvJhotldetlVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 23 18:02:10 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrvJhotldetlVOClient extends ViewUsageImpl implements SrvJhotldetlVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrvJhotldetlVOClient() {
    }

    public void doCreateNewJobHODetRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewJobHODetRow", null, null);
        return;
    }
}

package dgcom.model.vo.srv.client;

import dgcom.model.vo.srv.common.AllDemandNoteVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 28 15:03:28 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AllDemandNoteVOClient extends ViewUsageImpl implements AllDemandNoteVO {
    /**
     * This is the default constructor (do not remove).
     */
    public AllDemandNoteVOClient() {
    }

    public void doCreateNewDemandNoteRow() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCreateNewDemandNoteRow", null, null);
        return;
    }

    public void executeEmptyRowSet() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "executeEmptyRowSet", null, null);
        return;
    }
}


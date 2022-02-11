package dgcom.model.stand;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.server.ViewDefImpl;
import oracle.jbo.server.ViewObjectImpl;

public class DigicomViewObjectImpl extends ViewObjectImpl {
    public DigicomViewObjectImpl(String string, ViewDefImpl viewDefImpl) {
        super(string, viewDefImpl);
    }

    private String isCustomerWhere="N";
    
    public DigicomViewObjectImpl() {
        super();
    }

  
public void isCustomWhereClause(String pValue)
{
    this.isCustomerWhere=pValue;
}
//@Override
    public void executeQuery() {

        
        super.executeQuery();
        this.setWhereClause("");
    }
    @Override
    public void executeEmptyRowSet() {
        // TODO Implement this method
        super.executeEmptyRowSet();
    }
    
    public int getLocationid() {
        try {
            return (this.getViewObject().getAttributeIndexOf("Locationid"));
        } catch (Exception e) {
            // TODO: Add catch code
     //       System.out.println("viewimpl exception "+e);
            return -1;
        }
        
        
    }
}

package dgcom.model.stand;

import oracle.jbo.JboException;
import oracle.jbo.server.ViewRowImpl;

public class DigicomViewRowImpl extends ViewRowImpl {
    public DigicomViewRowImpl() {
        super();
    }

         @Override
    public void remove() {
        // TODO Implement this method
        System.out.println("-----------reove");
        if (new DigicomClass().dOOperationAllowed("Candelete").equals("Y")) {
            super.remove();
        } else {
            throw new JboException("Delete Not Allowed.");
        }
        System.out.println("**********row is being removed**********");
    } 
        @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
            
        try {
            if (getPosted().equals("Y")) {
                return false;
            } else
                return super.isAttributeUpdateable(i);
        } catch (Exception e) {
            // TODO: Add catch code
            return super.isAttributeUpdateable(i);
        }
    } 
    
    public String getPosted() {
        
        try {
            return (String) getAttributeInternal(this.getViewObject().getAttributeIndexOf("Posted"));
        } catch (Exception e) {
            return "N";
        }
        
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED using the alias name Posted.
     * @param value value to set the POSTED
     */
   
    
}

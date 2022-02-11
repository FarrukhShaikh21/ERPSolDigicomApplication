package dgcom.model.rules;

import oracle.jbo.ValidationException;
import oracle.jbo.rules.JboValidatorContext;
import oracle.jbo.rules.JboValidatorInterface;

public class ValidPhoneNo implements JboValidatorInterface {
    private String description = "";

    public ValidPhoneNo() {
    }

    /**
     * Return true if value is valid.
     */
    public boolean validateValue(Object value) {
  

       if (!String.valueOf(value).matches("[0-9]{3}-?[0-9]+")) {
           return false ;
       }
        return true;
    }

    /**
     * Invoked by framework for validation.
     */
    public void validate(JboValidatorContext ctx) {
        if (!validateValue(ctx.getNewValue())) {
            throw new ValidationException("smgt.model.eo.rules.ValidPhoneNo validation failed");
        }
    }

    /**
     * Description of what this class validates.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description of what this class validates.
     */
    public void setDescription(String str) {
        description = str;
    }
}

package dgcom.model.rules;
import oracle.jbo.ValidationException;
import oracle.jbo.rules.JboValidatorContext;
import oracle.jbo.rules.JboValidatorInterface;

public class ValidMobileNo implements JboValidatorInterface {
    private String description = "";

    public ValidMobileNo() {
    }

    /**
     * Return true if value is valid.
     */
    public boolean validateValue(Object value) {

        if (value==null) {
           return true;
       }

       if (!String.valueOf(value).matches("[0-9]{4}-?[0-9]{7}")) {
           return false ;
       }
        return true;
    }

    /**
     * Invoked by framework for validation.
     */
    public void validate(JboValidatorContext ctx) {
        if (!validateValue(ctx.getNewValue())) {
            throw new ValidationException("smgt.model.eo.rules.ValidMobileNo validation failed");
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

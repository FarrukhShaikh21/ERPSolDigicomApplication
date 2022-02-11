package dgcom.model.rules;

import oracle.jbo.ValidationException;
import oracle.jbo.rules.JboValidatorContext;
import oracle.jbo.rules.JboValidatorInterface;

public class ImeiLengthRule implements JboValidatorInterface {
    private String description = "";

    public ImeiLengthRule() {
    }

    /**
     * Return true if value is valid.
     */
    public boolean validateValue(Object value) {
        if (value!=null && value.toString().length()!=15) {
            return false;
       }
        return true;
    }

    /**
     * Invoked by framework for validation.
     */
    public void validate(JboValidatorContext ctx) {
        if (!validateValue(ctx.getNewValue())) {
            throw new ValidationException("dgcom.model.rules.ImeiLengthRule validation failed");
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

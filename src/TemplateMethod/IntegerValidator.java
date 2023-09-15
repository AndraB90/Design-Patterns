package TemplateMethod;

import Singleton.DataValidator;

public class IntegerValidator extends DataValidator {
    public IntegerValidator(String data) {
        super(data);
    }

    @Override
    protected boolean validateData() {
        // implement integer validation logic here
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

package TemplateMethod;

import Singleton.DataValidator;

public class StringValidator extends DataValidator {
    public StringValidator(String data) {
        super(data);
    }

    @Override
    protected boolean validateData() {
        // implement string validation logic here
        return data != null && !data.isEmpty();
    }
}



package Singleton;

public abstract class DataValidator {
    protected String data;

    public DataValidator(String data) {
        this.data = data;
    }

    public boolean validate() {
        boolean result = validateData();
        if (result) {
            System.out.println(data + " is valid");
        } else {
            System.out.println(data + " is invalid");
        }
        return result;
    }

    protected abstract boolean validateData();
}

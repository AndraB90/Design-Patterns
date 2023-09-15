package TemplateMethod;

public class MainData {
    public static void main(String[] args) {
        StringValidator stringValidator = new StringValidator("Hello, world!");
        stringValidator.validate(); // prints "Hello, world! is valid"

        IntegerValidator integerValidator = new IntegerValidator("42");
        integerValidator.validate(); // prints "42 is valid"

        IntegerValidator invalidIntegerValidator = new IntegerValidator("not a number");
        invalidIntegerValidator.validate(); // prints "not a number is invalid"

    }
}

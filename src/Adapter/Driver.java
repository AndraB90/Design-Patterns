package Adapter;

public class Driver {
    public static void main(String[] args) {

        // Create an instance of the LegacyCode class
        LegacyCode legacyCode = new LegacyCode();

        // Create an instance of the NewAPI class
        NewAPI newAPI = new NewAPI();

        // Create an instance of the Adapter class
        iAdapter adapter = new Adapter(legacyCode, newAPI);

        // Call the old method using the adapter
        adapter.callOldMethod("param1", 42);
    }
}

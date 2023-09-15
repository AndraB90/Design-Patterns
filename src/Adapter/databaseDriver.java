package Adapter;

public class databaseDriver {
    public static void main(String[] args) {
        ModernDatabase modernDatabase=new ModernDatabase();
        LegacyDatabase legacyDatabase=new LegacyDatabase();

        databaseAdapter databaseAdapter=new databaseAdapt(modernDatabase, legacyDatabase);
        databaseAdapter.mapRequests();
    }
}

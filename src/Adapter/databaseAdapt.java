package Adapter;

public class databaseAdapt implements databaseAdapter{
    private ModernDatabase modernDatabase;
    private LegacyDatabase legacyDatabase;

    public databaseAdapt(ModernDatabase modernDatabase, LegacyDatabase legacyDatabase) {
        this.modernDatabase = modernDatabase;
        this.legacyDatabase = legacyDatabase;
    }

    @Override
    public void mapRequests(){
        legacyDatabase.requestLegacyDatabase();
    }
}

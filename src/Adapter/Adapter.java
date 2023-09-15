package Adapter;

public class Adapter implements iAdapter{
    private LegacyCode legacyCode;
    private NewAPI newAPI;

    public Adapter(LegacyCode legacyCode, NewAPI newAPI) {
        this.legacyCode = legacyCode;
        this.newAPI = newAPI;
    }

    @Override
    public void callOldMethod(String param1, int param2) {
        // Map the old method call to the new method call
        newAPI.newMethod(param2, param1);
    }
}

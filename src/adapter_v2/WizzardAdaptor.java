package adapter_v2;

public class WizzardAdaptor implements Warrior{

    Wizzard wizzard;

    public WizzardAdaptor(Wizzard wizzard) {
        this.wizzard = wizzard;
    }

    @Override
    public void attack() {
        this.wizzard.castFireballSpell();
    }

    @Override
    public void defend() {
        this.wizzard.castShieldSpell();
    }

    @Override
    public void escape() {
        this.wizzard.openPortal();
    }
}

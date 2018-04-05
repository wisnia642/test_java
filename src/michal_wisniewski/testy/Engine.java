package michal_wisniewski.testy;

import test2.Testowa;

public class Engine {
    private boolean started;
    private Testowa_1 testowa_1;
    private Testowa testowa;

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public Engine()
    {
        testowa_1 = new Testowa_1(1,2);
        started = true;

        testowa = new Testowa(1);
        started = true;
    }

    public Engine(Testowa_1 testowa_1)
    {
        this.testowa_1 = testowa_1;
    }

    private boolean InitiateStartingSequence()
    {
        return true;

    }

    public void start()
    {
        started = InitiateStartingSequence();
    }

    public void stop()
    {
        started = false;
    }

    public boolean isStarted(boolean started)
    {
        this.started=started;
    }

    // ctrl + shift + spacja = popowiadanie kodu ktory aktualnie jest do u
}

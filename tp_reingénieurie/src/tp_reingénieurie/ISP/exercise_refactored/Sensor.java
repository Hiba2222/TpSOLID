package tp_reingénieurie.ISP.exercise_refactored;

import java.util.Random;


public class Sensor
{
    public void register(IProximity door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
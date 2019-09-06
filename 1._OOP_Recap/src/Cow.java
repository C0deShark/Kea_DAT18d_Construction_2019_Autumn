import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Cow implements SoundGenerator {
    @Override
    public String sound() {
        String[] moos = new String[5];

        moos[0] = "mooo";
        moos[1] = "moooooooo";
        moos[2] = "moOOOOOoo";
        moos[3] = "MOOOOOO";
        moos[4] = "mmmMMMMMOooooo";

        int upToTimes = new Random().nextInt(8);

        String cowSays = "";

        for (int i = 0; i < upToTimes; i++) {
            int index = new Random().nextInt(5);

            cowSays += moos[index] + " ";
        }

        return cowSays.trim();
    }

    public String collectionSounds() {
        String[] moos = new String[5];

        moos[0] = "mooo";
        moos[1] = "moooooooo";
        moos[2] = "moOOOOOoo";
        moos[3] = "MOOOOOO";
        moos[4] = "mmmMMMMMOooooo";

        List<String> listMoos = Arrays.asList(moos);

        Collections.shuffle(listMoos);

        String cowSays = "";

        for (String moo : listMoos) {
            cowSays += moo + " ";
        }
        return cowSays.trim();
    }
}

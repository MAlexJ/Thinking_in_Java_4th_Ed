package example_01;

/**
 * Created by Alex on 21.05.2015.
 */
public class Music {

    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);

    }
}

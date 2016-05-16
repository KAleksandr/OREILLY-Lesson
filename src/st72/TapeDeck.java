package st72;

/**
 * Created by EDBO on 15.05.2016.
 */
public  class TapeDeck {
    boolean canRecord = false;

    static void  playTape() {
        System.out.println("пленка приигрывается");
    }

    static void recordTape(){
        System.out.println("идет запись на пленку");
    }
}

class TapeDectTestDrive {
    public static void main(String [] args){
        TapeDeck k = new TapeDeck();
        k.canRecord = true;
        k.playTape();

        if (k.canRecord == true) {
            TapeDeck.recordTape();
        }
    }
}

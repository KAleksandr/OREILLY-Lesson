package st72;

/**
 * Created by EDBO on 15.05.2016.
 */
public class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat(){
        System.out.println("динь динь ди-динь");
    }
    void playSnare(){
        System.out.println("бах бах ба-бах");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();
         if (d.snare == true){
             d.playSnare();
         }
    }
}
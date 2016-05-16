package st72;

/**
 * Created by EDBO on 15.05.2016.
 */
public class DVDPlayar {
    boolean canRecord = false;

    void recordDVD(){
        System.out.println("идет запись");
    }
    void playDVD(){
        System.out.println("DVD проигрывается");
    }
}

class DVDPlayarTestDrive {
    public static void main(String[] args){
        DVDPlayar d = new DVDPlayar();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true){
            d.recordDVD();
        }
    }

}
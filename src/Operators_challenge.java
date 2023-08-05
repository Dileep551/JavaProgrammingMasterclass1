import java.awt.datatransfer.SystemFlavorMap;

public class Operators_challenge {

    public static void main(String[] args) {
        double val = 20.00;
        double val_1 =80.00;


        double val3 = (val + val_1) * 100;

        System.out.println(val3);

        double remainder = val3 % 40.00;

        System.out.println(remainder);

        boolean isValue = remainder == 0.00 ? true : false;

        System.out.println(isValue);

        if(!isValue){
            System.out.println("got some error");
        }




    }
}

public class Ternary_operator {

    public static void main(String[] args) {
        String car_name = "Honda";
        boolean isCar = car_name == "Honda" ? false : true;

        if(isCar){
            System.out.println("It's Honda Car");
        }

        String s = (isCar) ? "This car is Domestic" : "This car is not domestic";

        System.out.println(s);
    }
}

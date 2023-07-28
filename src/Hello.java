public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Dileep");

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not Alien");

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got top score");
        }
        int secondTopScore = 60;
        if(secondTopScore < topScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

    }
}

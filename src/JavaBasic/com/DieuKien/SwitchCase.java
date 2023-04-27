package JavaBasic.com.DieuKien;

public class SwitchCase {
    public static void main(String[] args) {
        int number = 17;
        switch (number){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10 , 20 , 30 ");
        }

        String OS = "Windowns";
        switch (OS){
            case "Windowns":
                System.out.println("Run test on platform  Windowns");
                break;
            case "MacOs":
                System.out.println("Run test on platform  Mac");
                break;
            default:
                System.out.println("Run test on platform ");
                break;
        }
    }
}

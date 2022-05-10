public class Case {
    public static void main(String[] args) {
        int month = 4;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
            default:
                System.out.println("didn't find a match");
        }

    }
}

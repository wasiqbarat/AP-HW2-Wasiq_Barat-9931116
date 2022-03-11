import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Q, N;
        String input = scanner.nextLine();
        String[] inputToArray = input.split(" ");
        Q = Integer.parseInt(inputToArray[0]);
        N = Integer.parseInt(inputToArray[1]);

        Cinema cinema = new Cinema(N);

        for (int i = 0; i < Q; i++) {
            String reserve = scanner.nextLine();
            String[] reserveToArray = reserve.split(" ");
            int l = Integer.parseInt(reserveToArray[0]);
            int r = Integer.parseInt(reserveToArray[1]);
            int x = Integer.parseInt(reserveToArray[2]);

            if ( x > N) {
                System.out.println("false");
            }else if ( x == 0 || l > r  || r < 0 || l > 10) {
                System.out.println("false");
            }else {

                for (int j = 0; j < cinema.getCinemaRows().length; j++) {

                    if (cinema.checkChair(l, r, x)) {
                        cinema.occupyChairs(l, r, x);
                    }
                }
            }
        }
    }
}
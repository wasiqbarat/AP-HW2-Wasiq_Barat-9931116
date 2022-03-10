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
        for ( Row row: cinema.getCinemaRows()) {

        }

        for (int i = 0; i < Q; i++) {
            String reserve = scanner.nextLine();
            String[] reserveToArray = reserve.split(" ");
            int l = Integer.parseInt(reserveToArray[0]);
            int r = Integer.parseInt(reserveToArray[1]);
            int x = Integer.parseInt(reserveToArray[2]);

            for ( int j = 0; j < cinema.getCinemaRows().length; j++) {
                if (cinema.checkChair(l, r, x)) {
                    cinema.occupyChairs(l, r, x);
                }
            }

        }




    }
}

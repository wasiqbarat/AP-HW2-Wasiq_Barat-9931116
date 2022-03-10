public class Cinema {
    private int rows;
    private final Row[] cinemaRows;

    public Row[] getCinemaRows() {
        return cinemaRows;
    }

    public Cinema( int rows) {
        cinemaRows = new Row[rows];
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getRows() {
        return rows;
    }

    public boolean getChair(int r, int c) {
        if ( c >= 0 && c < 3) {
            return cinemaRows[r - 1].getLeftPosition()[c - 1].isStatus();
        }else if ( c > 2 && c < 7) {
            return cinemaRows[r - 1].getMiddlePosition()[c - 1].isStatus();
        }else if ( c > 6 && c <10 ) {
            return cinemaRows[r - 1].getRightPosition()[c - 1].isStatus();
        }else System.out.println("Not valid chair!!!");
        return false;
    }


    public void setChair(int r, int c) {
        if ( c >= 0 && c < 3) {
            if ( cinemaRows[r - 1].getLeftPosition()[c - 1].isStatus()) {
                cinemaRows[r - 1].getLeftPosition()[c - 1].setStatus(false);
            }else cinemaRows[r - 1].getLeftPosition()[c - 1].setStatus(true);
        }else if (c > 2 && c < 7) {
            if (cinemaRows[r - 1].getMiddlePosition()[c - 1].isStatus()) {
                cinemaRows[r - 1].getMiddlePosition()[c - 1].setStatus(false);
            }else cinemaRows[r - 1].getMiddlePosition()[c - 1].setStatus(true);
        }else if (c > 6 && c < 10) {
            if (cinemaRows[r - 1].getRightPosition()[c - 1].isStatus()) {
                cinemaRows[r - 1].getRightPosition()[c - 1].setStatus(false);
            }else cinemaRows[r - 1].getRightPosition()[c - 1].setStatus(true);
        }else System.out.println("Not valid chair!!!!");
    }

    public boolean checkChair(int l,int r, int x) {
        boolean check = false;

        for ( int i = l; i <= r; i++ ) {
            if ( !cinemaRows[x - 1].getChair(i - 1)) {
                check = true;
            }
        }
        return check;
    }

    public void occupyChairs( int l, int r, int x) {
        for (int i = l; i <= r; i++) {
            if ( cinemaRows[ x - 1].getChair(i) ) {
                System.out.println("There is Another person");
                return;
            }else cinemaRows[x - 1].setChair(i);
        }
    }

}

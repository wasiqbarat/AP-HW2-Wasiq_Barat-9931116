public class Cinema {
    private int rows;
    private final Row[] cinemaRows;


    public Row[] getCinemaRows () {
        return cinemaRows;
    }

    public void init() {
        for (int i = 0; i < cinemaRows.length; i++) {
            Row row = new Row();
            cinemaRows[i] = row;
        }
    }

    public Cinema ( int rows) {
        cinemaRows = new Row[rows];
        init();
    }

    public void setRows (int rows) {
        this.rows = rows;
    }

    public int getRows () {
        return rows;
    }

    public boolean getChair (int r, int c) {
        return cinemaRows[r - 1].getrow()[c - 1].isStatus();
    }


    public void setChair (int r, int c) {
        if (cinemaRows[r - 1].getrow()[c - 1].isStatus()){
            cinemaRows[r - 1].getrow()[c - 1].setStatus(false);
        }else {
            cinemaRows[r - 1].getrow()[c - 1].setStatus(true);
        }
    }

    public boolean checkChair (int l, int r, int x) {
        boolean check = false;

        for ( int i = l; i <= r; i++ ) {
            if ( !cinemaRows[x - 1].getChair(i)) {
                check = true;
            }
        }
        return check;
    }

    public void occupyChairs ( int l, int r, int x) {
        for (int i = l; i <= r; i++) {
            if ( cinemaRows[ x - 1].getChair(i) ) {
                System.out.println("false");
            }else {
                cinemaRows[x - 1].setChair(i);
            }
        }
        System.out.println("true");
    }


}

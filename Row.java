public class Row {

    private final Chair[] row;
    
    public Row() {
        row = new Chair[10];
        init();
    }

    public void init() {
        for (int i = 0; i < 10; i++) {
            Chair chair = new Chair();
            row[i] = chair;
        }
    }

    public Chair[] getrow() {
        return row;
    }

    public boolean getChair(int c) {
        return row[c - 1].isStatus();
    }

    public void setChair(int c) {

        if ( getrow()[c - 1].isStatus()) {
            getrow()[c - 1].setStatus(false);
        }else {
            getrow()[c - 1].setStatus(true);
        }

    }
}


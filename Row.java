public class Row {
    private final Chair[] leftPosition;
    private final Chair[] middlePosition;
    private final Chair[] rightPosition;

    public Row() {
        leftPosition = new Chair[3];
        rightPosition = new Chair[3];
        middlePosition = new Chair[4];
    }

    public Chair[] getLeftPosition() {
        return leftPosition;
    }

    public Chair[] getMiddlePosition() {
        return middlePosition;
    }

    public Chair[] getRightPosition() {
        return rightPosition;
    }



    //get chair
    public boolean getChair(int c) {
        if (c < 3 && c >= 0) {
            return getLeftPosition()[c - 1].isStatus();
        } else if (c > 2 && c < 7) {
            return getMiddlePosition()[c - 1].isStatus();
        } else if (c > 6 && c < 10) {
            return getRightPosition()[c - 1].isStatus();
        } else System.out.println("Your entered chair in not valid!!!");
        return false;
    }

    public void setChair(int c) {
        if (c < 3 && c >= 0) {
            if (getLeftPosition()[c - 1].isStatus()) {
                leftPosition[c - 1].setStatus(false);
            }else {
                leftPosition[c - 1].setStatus(true);
            }
        } else if (c > 2 && c < 7) {
            if (getMiddlePosition()[c - 1].isStatus()) {
                middlePosition[c - 1].setStatus(false);
            }else {
                middlePosition[c - 1].setStatus(true);
            }

        } else if (c > 6 && c < 10) {
            if (getLeftPosition()[c - 1].isStatus()) {
                rightPosition[c - 1].setStatus(false);
            }else {
                rightPosition[c - 1].setStatus(true);
            }

        } else System.out.println("Your entered chair in not valid!!!");
    }
}


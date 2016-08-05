/**
 * Created by rb21776 on 2016-08-02.
 */
public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeigh(width);
    }

    public void setHeigh(int heigh) {
        super.setWidth(heigh);
        super.setHeigh(heigh);
    }
}

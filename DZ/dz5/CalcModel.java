package DZ.dz5;

public abstract class CalcModel implements Model {

    Double x, y;

    @Override
    public void setX(Double value) {
        this.x = value;
    }

    @Override
    public void setY(Double value) {
        this.y = value;
    }
}

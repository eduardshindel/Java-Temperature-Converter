public abstract class Temperature {

    private String scaleFrom, scaleTo;
    private double tempFrom, tempTo;

    public String getScaleFrom() {
        return scaleFrom;
    }

    public void setScaleFrom(String scaleFrom) {
        this.scaleFrom = scaleFrom;
    }

    public String getScaleTo() {
        return scaleTo;
    }

    public void setScaleTo(String scaleTo) {
        this.scaleTo = scaleTo;
    }

    public double getTempFrom() {
        return tempFrom;
    }

    public void setTempFrom(double tempFrom) {
        this.tempFrom = tempFrom;
    }

    public double getTempTo() {
        return tempTo;
    }

    public void setTempTo(double tempTo) {
        this.tempTo = tempTo;
    }
}

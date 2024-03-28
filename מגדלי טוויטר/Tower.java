public abstract class Tower {
    private double height;
    private double width;
    public Tower(double width,double height){
    setHeight(height);
    setWidth(width);
    }
    public void setHeight(double height) {
        if (height >= 2)
            this.height = height;
        else
            this.height = 2;
    }

    public void setWidth(double width) {
        if (width >0)
            this.width = width;
        else
            this.width = 1;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public abstract void Hekef();
    public  abstract void choice();

}


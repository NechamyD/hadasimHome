public class RectengleTower extends Tower{
public RectengleTower(double width,double height){
  super(width,height);
}
    @Override
    public void Hekef() {

     double hekef=(getHeight()+getWidth() )*2;
        System.out.println("hekef"+hekef);
    }
    public void Shetach(){

        double shetach=getHeight()*getWidth();
        System.out.println("shetach"+shetach);
    }

    @Override
    public void choice() {
        if(getHeight()==getWidth()||Math.abs(getHeight()-getWidth())>5)
            this.Shetach();
        else
            this.Hekef();
    }
}

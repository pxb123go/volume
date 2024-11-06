class shape{
    public double getVolume(){
        return 0;
    }
}
class triangle extends shape{
    private double base,height,lenght;
    public triangle(double base,double height,double lenght)
    {
this.base=base;
this.height=height;
this.lenght=lenght;
    }
    public double getVolume(){
        return 0.5*base*height*lenght;
    }
}
class square extends shape{
    private double side;
    public square(double side)
    {
this.side=side;
    }
    public double getArea(){
        return side*side*side;
    }
}
class program{
    public static void main(String[] args) {
        shape[] s1=new shape[2];
        s1[0] = new square(4);
        s1[1] = new triangle(5,6,6);
        System.out.println("The Volume of the Triangle is " + s1[1].getVolume());
        System.out.println("The Volume of the Square is " + s1[0].getVolume());
    }
}
class Triangle extends  Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("В облсти треугольника.");
        return dim1 * dim2 / 2;
    }

}

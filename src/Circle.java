
    class Circle {
double radius;
        double perimeter;
        double area;
        Circle(double radius)        {
         perimeter =  Math.PI * (radius * 2 );
         area = Math.PI * Math.pow(radius, 2);
        }
      public  void displayPerimeter(){
            System.out.print("Perimeter:" +  perimeter);
          System.out.print("Area:" +  area);
        }
    }




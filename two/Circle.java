//Thanavat 632115022
package two;
public class Circle {
    public void circle1(double pi){
    double r = 2.0;
    if (r < 0){
    r = 0;
    }
    System.out.println("Area of cir1 = "+r*r*pi);
    System.out.println("Circumferrene of cir 1 = "+2*r*pi);  
}
    public void circle2(double pi){
       double r=3.0;
        if (r < 0){
            r = 0;
        }
        System.out.println("Area of cir2 = "+r*r*pi);
        System.out.println("Circumferrene of cir 2 = "+2*r*pi);
}
    public void circle3(double pi){
        double r =1.0;
        if (r < 0){
            r = 0;
        }
        System.out.println("Area of cir3 = "+r*r*pi);
        System.out.println("Circumferrene of cir 3 = "+2*r*pi); 
}
    public void circle4(double pi){
        double r = -1.0;
        if (r < 0){
            r = 0;
        }
        System.out.println("Area of cir4 = "+r*r*pi);
        System.out.println("Circumferrene of cir 4 = "+2*r*pi);
}
public void cir1(double r1,double r2,double x1,double y1,double x2,double y2){
    double distSq = (x1 - x2) * (x1 - x2) +  (y1 - y2) * (y1 - y2); 
    double radSumSq = (r1 + r2) * (r1 + r2); 
    if (distSq <= radSumSq) 
    System.out.println ( "Is circle 1 intersec circle 2: true"); 
    else
    System.out.println ( "Is circle 1 intersec circle 2: false"); 
}
public void cir2(double r1,double r2,double x1,double y1,double x2,double y2){
    double distSq = (x1 - x2) * (x1 - x2) +  (y1 - y2) * (y1 - y2); 
    double radSumSq = (r1 + r2) * (r1 + r2); 
    if (distSq <= radSumSq) 
    System.out.println ( "Is circle 1 intersec circle 3: true"); 
    else
    System.out.println ( "Is circle 1 intersec circle 3: false");    
}
}

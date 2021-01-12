//Thanavat 632115022
package two;
public class MainCircle {
    public static void main(String[] args) {
    Circle no1 = new Circle();
    no1.circle1(3.141592653589793);
    no1.circle2(3.141592653589793);
    no1.circle3(3.141592653589793);
    no1.circle4(3.141592653589793);
    //2.0 is radius cir1 
    //3.0 is radius cir2
    //0.0 is origin of x cir1 and y cir1
    //0.1 and 0.2 is origin of x cir2 and y cir2
    no1.cir1(2.0,3.0,0.0,0.0,1.0,2.0);
    //cir 1 and cir3
    no1.cir2(2.0,1.0,0.0,0.0,3.0,5.0);
    }
}

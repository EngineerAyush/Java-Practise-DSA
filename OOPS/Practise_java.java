public class Practise_java {
    public static void main(String[] args) {

        Complex c= new Complex (4, 5) ;
        Complex d =new Complex (9, 4) ;
        Complex e =Complex.add (c, d) ;
        Complex f= Complex.diff (c, d) ;
        Complex g= Complex.product (c, d) ;
        e.printComp1ex( ) ;
        f.printComp1ex ( ) ;
        g. printComp1ex ( ) ;
                
    }
}
class Complex{
    int real;
    int img;
    public Complex(int r,int i){
        real=r;
        img=i;

    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real+b.real), (a.img+b.img));
    }
    public static Complex diff(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.img-b.img));
    }
    public static Complex product(Complex a,Complex b){
        return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
    }
    public void printComp1ex(){
    if(real==0&&img!=0){
        System.out.println(img+"i");
    }
    else if(img==0&&real!=0){
        System.err.println(real);
    }
    else{
        System.out.println(real+"+"+img+"i");
    }
}
}

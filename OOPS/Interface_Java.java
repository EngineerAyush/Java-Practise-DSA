public class Interface_Java {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.Moves();
    }
    
}

interface InnerOOp {
void Moves();
    
}
class Pen implements InnerOOp {
    public void Moves(){
        System.out.println("Pen Moves");
    }
}; 

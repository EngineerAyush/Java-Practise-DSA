public class Shortest_Path {
    public static float Path(String path) {
    int l=path.length();
    int x=0;
    int y=0;
    for (int i=0; i<l; i++){
        char dir=path.charAt(i);
        if(dir=='N'|| dir=='n'){
            y++;
            
        }
        if(dir=='S'|| dir=='s'){
            y--;

        }
        if(dir=='W'|| dir=='w'){
            x--;

        }
        if(dir=='E'|| dir=='e'){
            x++;

        }
    }
    float total_Dis=0;
    int X2=x*x;
    int Y2=y*y;
    total_Dis=(float)Math.sqrt(X2+Y2);
    return total_Dis;
    }
    public static void main(String[] args) {
        // String path ="WNEENESENNN";
        // float a1=Path(path);
        // System.out.println(a1);
        String hel="Hello, world";
        hel.substring(0, 5);
        String fruits[]={"apple", "orange", "Banana", "Mango", "Pineapple"};
        String larg=fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if(larg.compareTo(fruits[i])<0){
                larg=fruits[i];

            }


    }
    System.out.println(larg);
    
}
};

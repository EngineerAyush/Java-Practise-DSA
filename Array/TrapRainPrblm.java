public class TrapRainPrblm {
    public static int trap(int[] height) {
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        int rightMax[] = new int[height.length];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        rightMax[height.length-1]=height[height.length-1];   
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int totalTrapWater=0;
        for(int i=0;i<height.length;i++){
                    int water=Math.min(leftMax[i],rightMax[i]);
                    totalTrapWater+=water-height[i];

                    }
                    return totalTrapWater;
    }

    
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int a1=trap(height);
        System.out.println(a1);
}
};

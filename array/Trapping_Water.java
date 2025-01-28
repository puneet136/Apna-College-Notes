package array;
public class Trapping_Water {
    public static int trappedwater(int height [])
    {
        //calculate the left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];

        for(int i = 1 ; i<height.length ; i++)
        {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //calculate the right max boundary

        int rightmax[] = new int[height.length];

        rightmax[height.length-1] = height[height.length-1];

        for(int i = height.length-2; i>= 0 ; i--)
        {
                rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
                int Trappedwater = 0;
                                //loop
        for(int i = 0 ; i< height.length ; i++)
        {
            //water level = min(left max bound , right max bound)

            int waterlevel = Math.min(leftmax[i] , rightmax[i]);

            //trapped water = water level - height

            Trappedwater += waterlevel - height[i];
        }
        return Trappedwater;
        
        
    }

    public static void main (String args[]) {
        int height [] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedwater(height));
    }
}

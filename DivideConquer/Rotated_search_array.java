package DivideConquer;
public class Rotated_search_array {

    public static int search(int arr[] , int target , int si , int ei){

        //Kam
        int mid = si+(ei-si)/2;

        //Case Found
        if(arr[mid]==target){
            return mid;
        }

        //Mid lies on L1
        if(arr[si]<=arr[mid]){
            //Case a: Left of Line 1
            if(arr[si]<=target && target<= arr[mid])
            {
                return search(arr,target,si,mid-1);
            }
            //Case b: Right of Line 1
            else
            {
                return search(arr,target,mid+1,ei);
            }
        }

        //Mid lies on L2
        else{
                //Case c : Right Part of line 2
                if(arr[mid]<= target && target <= arr[ei])
                {
                    return search(arr,target,mid+1,ei);
                }

                //Case D: Left Part of line 2
                else
                {
                    return search(arr,target,si,mid-1);
                }
        }
    }
    public static void main(String [] args){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = search(arr, target , 0 , arr.length-1);
        System.out.println(tarIdx);
    }
}

import java.util.ArrayList;
/*
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(input==null||input.length==0||input.length<k){
            return result;
        }
        //构建大顶堆
        for(int i=k/2-1;i>=0;i--){
            adjustHeap(input,i,k-1);
        }
        //我们前k个元素的大顶堆已经构建好了，剩下的就是其余的和大顶堆的最大值比较了
        for(int i=k;i<input.length;i++){
            if(input[i]<input[0]){
                int temp=input[i];
                input[i]=input[0];
                input[0]=temp;
                adjustHeap(input,0,k-1);
                 
            }
        }
        //我们将调整好的前k个数放进链表里面
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;
         
         
    }
             
            //构建大顶堆
    public  void adjustHeap(int[] input,int i,int k){
        //先把最上面根节点保存了
        int temp=input[i];
        for(int j=i*2+1;j<=k;j=j*2+1){
            //j可以等于k，但是下面的程序不能，我们还要判断j和j+1呢
            if(j<k&&input[j]<input[j+1]){
                j++;
            }
            if(temp>input[j]){
                break;
            }
            input[i]=input[j];
            i=j;
        }
        input[i]=temp;
    }
}*/
	/*
import java.util.ArrayList;
public class Solution {
    public ArrayList GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList aList = new ArrayList();
        if(input.length == 0 || k > input.length || k <= 0)
            return aList;
        int low = 0;
        int high = input.length-1;
        int index = Partition(input,k,low,high);
        while(index != k-1){
            if (index > k-1) {
                high = index-1;
                index = Partition(input,k,low,high);
            }else{
                low = index+1;
                index = Partition(input,k,low,high);
            }
        }
        for (int i = 0; i < k; i++)
            aList.add(input[i]);
        return aList;
    }
     
    int Partition(int[] input,int k,int low,int high){
        int pivotkey = input[k-1];
        swap(input,k-1,low);
        while(low < high){
            while(low < high && input[high] >= pivotkey)
                high--;
            swap(input,low,high);
            while(low < high && input[low] <= pivotkey)
                low++;
            swap(input,low,high);
        }
        return low;
    }
 
 
    private void swap(int[] input, int low, int high) {
        int temp = input[high];
        input[high] = input[low];
        input[low] = temp;
    }
}
	*/
	
	


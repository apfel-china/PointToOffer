
public class FindNthUglyNUmber {
	
	public int GetUglyNumber_Solution(int index) {
		if(index<=0)
			return 0;
		int[] uglyArray=new int[index];
		int minUgly=1,i2=0,i3=0,i5=0;
        for(int i=0;i<index;i++) {
        	uglyArray[i]=minUgly;
        	int min2=uglyArray[i2]*2;
        	int min3=uglyArray[i3]*3;
        	int min5=uglyArray[i5]*5;
        	minUgly=Math.min(min2,Math.min(min3, min5));
        	if(minUgly==min2)i2++;
        	if(i>0) {
        		if(minUgly==min3)i3++;
        		if(minUgly==min5)i5++;
            }
        }
        return uglyArray[index-1];
    }
}

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coor=new int[4][n];
        int ans=1;
        if(n>=2 && n<=50) {
        for(int i = 0; i < 4; i++){
            for(int j=0;j<n;j++)
            	coor[i][j]=sc.nextInt();
        } 
        sc.close();
        for(int i=0;i<n-1;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(isInRect(coor[0][i],coor[1][i],Math.abs(coor[2][i]-coor[0][i]),Math.abs(coor[3][i]-coor[0][i]),coor[0][j],coor[1][j],Math.abs(coor[2][j]-coor[0][j]),Math.abs(coor[3][j]-coor[0][j])))
        			ans++;
        	}
        }
        }
        System.out.println(ans);
        	
    }
	public static boolean isInRect(int px, int py, int pw,int ph,int px2,int py2,int pw2,int ph2) {
		if (px+pw<=px2 || px>=px2+pw2 || py+ph<=py2 ||py+ph<=py2)    
			return false;
	     
	   
	    return true;
	}
	
}

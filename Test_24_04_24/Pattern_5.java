import java.util.Scanner;

class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix1 length:");
        int n=sc.nextInt();
        Spiralorder(n);
    }

    private static void Spiralorder( int n) {

        int[][] mat=new int[n][n];
        int value=1;
        int i,l=0,leftt=0,row=n,col=n;
        while(leftt<row && l<col) {
            for(i=leftt;i<col;i++)
            mat[leftt][i]=value;
            leftt++;
            for(i=leftt;i<row;i++)
            mat[i][col-1]=value;
            col--;
            if(leftt<row)
            for(i=col-1;i>=l;i--)
            mat[row-1][i]=value;
            row--;
            if(l<col)
            for(i=row-1;i>=leftt;i--)
            mat[i][l]=value;
            l++;
            if(value==0)
            value=1;
            else
            value=0;
        }

        for(int j=0;j<n;j++) {
        for(int k=0;k<n;k++)
        System.out.print(mat[j][k]+" ");
        System.out.println();
        }
        

        
    }
}
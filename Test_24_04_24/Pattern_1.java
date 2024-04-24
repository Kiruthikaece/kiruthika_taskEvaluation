import java.util.Scanner;

class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input character:");
        char ch=sc.next().charAt(0);
        PrintPattern(ch);
    }

    private static void PrintPattern(char ch) {
        int start=65;;
        int limit=(int)ch-'A';
        int sp=limit;
        for(int i=0;i<=limit;i++) {
            for(int x=1;x<=sp;x++)
            System.out.print(" ");
            for(int j=0;j<=i;j++) 
            if(j==0 || j==i) 
            System.out.print((char) ((char)start+i));
            else
            System.out.print(" ");
            System.out.println();
            sp--;
        }
        for(int i=limit-1;i>=0;i--) {
            for(int x=1;x<=sp;x++)
            System.out.print(" ");
            for(int j=0;j<=i;j++) 
            if(j==0 || j==i) 
            System.out.print((char) ((char)start+i));
            else
            System.out.print(" ");
            System.out.println();
            sp--;
        }
    }
}

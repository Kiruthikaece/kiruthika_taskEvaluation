import java.util.Scanner;

class Array_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length1:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter array:");

        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();

        System.out.println("Enter array length2:");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter array:");

        for(int i=0;i<m;i++)
        arr2[i]=sc.nextInt();

        sumArray(arr1,arr2);     
    }
    public static void sumArray(int[] arr1,int[] arr2) {

        
        int sm_limit=0,big_limit=0,add_digit=0,rem=0;

        if(arr1.length>arr2.length) {
            big_limit=arr1.length;
            sm_limit=arr2.length;
        }
       
        else
        {
            big_limit=arr2.length;
            sm_limit=arr1.length;
        }

        int[] sum=new int[big_limit];
        int k=0;
        
        while(sm_limit!=0) {
                add_digit=arr1[big_limit-1]+arr2[sm_limit-1]+rem;
                if(add_digit>9) {
                    System.out.println(add_digit+"add_digit");
                    sum[k++]=add_digit%10;
                    rem=add_digit/10;
                    System.out.println(rem+"rem");     
                }
                else {
                    sum[k++]= add_digit;
                    rem=0;
                }

            sm_limit--;
            big_limit--;
        }
        while(big_limit>0) {
            sum[k++]=arr1[--big_limit];
        } 
        
        for(int i=sum.length-1;i>=0;i--)
        System.out.print(sum[i]+" ");
    }
}
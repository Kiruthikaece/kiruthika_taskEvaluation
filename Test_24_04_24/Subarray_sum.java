import java.util.Scanner;

public class Subarray_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length1:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter array:");

        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        findSubarray(arr1);
    }

    public static void findSubarray(int[] arr){
        int sum = 0;
        int left = 0;
        int right =0;
        int maxLeft = 0;
        int maxRight = 0;
        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > maxSum){
                maxLeft = left;
                maxRight = i;
                maxSum = sum;
            }
            if(arr[i] < 0){
                sum = 0;
                left = i;
            }
            
        }
        System.out.println("Sum: "+maxSum);
        System.out.println("elements: ");
        for(int i=maxLeft+1;i<=maxRight;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
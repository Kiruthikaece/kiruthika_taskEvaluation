import java.util.Scanner;

class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array:");

        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        FindFrequencyArr(arr);
    }

    public static void FindFrequencyArr(int[] arr) {
        int[] count_arr=new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            int count=1;
            if(arr[i] != -1) {
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[i]==arr[j]) {
                        count++;
                        arr[j]=-1;
                    }
                }
                count_arr[i]=count;
            }
        }

        for(int i=0;i<count_arr.length;i++) {
            for(int j=i+1;j<count_arr.length;j++) {
                if(count_arr[i]<count_arr[j]) {
                    int t=count_arr[i]; 
                    count_arr[i]=count_arr[j]; 
                    count_arr[j]=t;

                    int t1=arr[i]; 
                    arr[i]=arr[j]; 
                    arr[j]=t1;
                }
            }
        }

        for(int j=0;j<arr.length;j++) {
            if(arr[j]!=-1) {
                for(int i=0;i<count_arr[j];i++)
                    System.out.print(arr[j]+" ");
            }
        }
    }
}

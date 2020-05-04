package BasicProblems;

public class FindPairEqualSum {
    //to find the pair of elements given equal to a givem sum(location of the element)
    public static void main(String[] args) {
        int arr[]={8,7,2,5,3,1};
        int size=arr.length;
        int sum=10;
        findPair(arr,size,sum);

    }
    public static void findPair(int[] arr,int n,int sum){
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;i++){
                if (arr[i]+arr[j]==sum){
                    System.out.println("Pair found at"+i+" "+j);
                }

            }
            return;
        }
        System.out.println("Pair not found");
    }
}

package others.demo;

public class Array {
    public static void main(String[] args) {
        int[] arr = {2,5,8,4,6,1,3,0,7,9};
        System.out.println("排序前：");
        for (int a=0 ;a<arr.length-1;a++)
        { System.out.print(arr[a]+","); }
        System.out.print(arr[9]);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for (int i= 0 ;i<arr.length-1;i++){
            System.out.println("第"+(i+1)+"趟排序");
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for (int a:arr) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

}


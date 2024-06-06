public class ArrayValues {
    public static void main(String[] args) {
        int A[]=new int[5];
        int B[]=new int[5];
        int C[]=new int[5];
        int num=5;
        for(int i=0;i<5;i++){
            A[i]=i;
        }
        for(int i=0;i<5;i++){
            B[i]=num;
            ++num;
        }
        System.out.println("Value of array 'A' : ");
        for(int i=0;i<5;i++){
            System.out.println(A[i]+" ");
        }
        System.out.println("Value of array 'B' : ");
        for(int i=0;i<5;i++){
            System.out.println(B[i]+" ");
    }
    for(int i=0;i<5;i++){
        C[i]=A[i]+B[i];    
    }
    System.out.println("Value of array 'C' : ");
    for(int i=0;i<5;i++){
        System.out.println(C[i]+" ");
}
}
}



public class arrays {
    public static void main(String[] args) {
        int a[][]=new int [4][4];
        int num=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                a[i][j]=num;
                ++num;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(a[i][j]+" ");
            }
         }
    }
}

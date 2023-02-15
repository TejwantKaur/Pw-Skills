public class A {

    public static void main(String args[]){
        int n=9;

        for(int i=0; i<n; i++){
            int mid = n/2;
            for(int j=0; j<n; j++){
                // if(i==0 || j==0 || j==n-1 || i==mid){
                //     System.out.print("* ");
                // }
                if(i==0 && j>0 && j<n-1 || i>0 && j==0 || i>0 && j==n-1 || i==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

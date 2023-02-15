public class X3rhombusFill {

    public static void leftUp(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j <= (n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void leftDown(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i-j >= (n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rightUp(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j-i >= (n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rightDown(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j >= (n-1)+((n-1)/2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // public static void rhombus(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j <= (n-1)/2 || j==0 && i<(n-1) || i==n-1  && j<(n-1)/2 || i-j >= (n-1)/2){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }   
    // }

    public static void rhombus2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j <= (n-1)/2 || i-j >= (n-1)/2 || j-i >= (n-1)/2 || i+j >= (n-1)+((n-1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                } 
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(i+j >= (n-1)/2 &&  i<=(n-1)/2 && j<=(n-1)/2 
                || i-j <= (n-1)/2 &&  i>=(n-1)/2 && j<=(n-1)/2
                || j-i <= (n-1)/2 &&  i<=(n-1)/2 && j>=(n-1)/2 
                || i+j <= (n-1)+((n-1)/2) && i>=(n-1)/2 && j>=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
        // for(int i=0; i<n; i++){
            
        //     System.out.println();
        // } 
    }

    public static void main(String args[]){
        int n=15; 
        // leftUp(n);
        // leftDown(n);
        // rightUp(n);
        // rightDown(n);

        // rhombus(n);
        rhombus2(n);
    }
    
}

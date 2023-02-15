class calc{
    public int add(int[] arr){
        int result = 0; 

        for(int a: arr){
            result += a;
        }
        return result;
    }
}
public class AdditionArray {
    public static void main(String[] args) {

        calc obj = new calc();

        int result = obj.add(new int[] {3,5,6,4});
        System.out.println(result);
    }
}

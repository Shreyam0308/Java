public class typeconv{
    public static void main(String[] args){
        
        float a = (float) 12.02;
        int b = 10;
        System.out.println(a+b);

        int c=20;
        float d=201.1f;
        int convertedInt = (int) d;
        int result = convertedInt / c;
        System.out.println(result);
    }
}
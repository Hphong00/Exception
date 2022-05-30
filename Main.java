package lamviecvoi_exception;

public class Main {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 4;

            int zero =0;
            int a = 10/zero;

            String obj = null;
            System.out.println(obj.length());

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("a");
            System.exit(0);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("b");
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("c");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("d");
        }finally {
            System.out.println("kết thúc khối lệnh");
        }
        System.out.println("kết thúc");
    }
}

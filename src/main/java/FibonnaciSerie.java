
public class FibonnaciSerie {

    public static void main(String[] args) {
        FibonnaciSerie fib = new FibonnaciSerie();
        int num=7;
        System.out.println(fib.Serie(num));
    }
        public int Serie(int dig){

           // int num1, num2=1;
            int res;
            int value=0;

            //pos 7 (13) = pos 6 +pos 5
            // 0 1 1 2 3 5 8 13, 21

            if (dig >1 ) {

                res = Serie(dig -1) + Serie(dig-2);

                //num1= (dig-1)+ (dig-2);
//                   num1=dig-1;
//                    num2=dig-2;
//                    res= num1+num2;
                value = res;
            }
            else if (dig==1){
                value =1;
            }
            else if (dig==0){
                return value;
            }
            return value;
        }
}
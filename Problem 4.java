//Problem 4
//앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//
//        두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//
//        세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?

public class Hello{
    public static void main(String[] args) {

        int max_mul=0;
        for (int i=100; i<1000; i++){
            for (int j=100; j<1000; j++){
                int mul=i*j;

                String isPalindrome=Integer.toString(mul);
                String reversed= new StringBuffer(isPalindrome).reverse().toString();

                if(isPalindrome.equals(reversed)){
                    if(mul>max_mul){
                        max_mul=mul;
                    }
                }
            }
        }
        System.out.println("max_mul = " + max_mul);
    };
};

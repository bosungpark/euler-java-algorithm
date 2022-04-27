//Problem 7
//소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//
//        이 때 10,001번째의 소수를 구하세요.

public class Hello{
    public static void main(String[] args) {
       int index=0;
       int i=2;
       while (index<10001){
           if(isPrime(i)){
               index+=1;
           }
           i++;
       }
        System.out.println(i-1);
    };

    public static boolean isPrime(int i){
        for(int j=2; j<i; j++){
            if (i%j==0){
                return false;
            }
        }
        return true;
    };
};

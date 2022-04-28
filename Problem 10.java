//Problem 10
//10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.
//
//        이백만(2,000,000) 이하 소수의 합은 얼마입니까?

import java.util.ArrayList;

public class Hello{
    static ArrayList<Long> primes= new  ArrayList<>();

    public static void findPrime(long i){
        for(long k: primes){
            if (i%k==0){
                return;
            }
        }
        primes.add(i);
        return;
    }

    public static void main(String[] args) {

        for (long i = 2; i <= 2000000; i++) {
            findPrime(i);
        }

        long sum=0;
        for (long prime : primes) {
            sum+= prime;
        }

        System.out.println(sum);
    }
}

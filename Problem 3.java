import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Problem 3.
//어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
//        예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
//
//        600851475143의 소인수 중에서 가장 큰 수를 구하세요.
public class Hello{
    public static void main(String[] args) {
        long n=600851475143L;
        int maxium=0;

        for (int i=1; i<n+1; i++) {
            if(n%i==0 & n!=0){
                n=n/i;

                boolean flag=true;
                if(maxium<i){
                    for(int j=2; j<i; j++){
                        if(i%j==0){
                            flag=false;
                            break;
                        }
                    }
                    if (flag) {
                        maxium = i;
                    }
                };
            };
        }

        System.out.println(maxium);
    };
};

//Problem 5
//1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//
//        그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까
public class Hello{
    public static void main(String[] args) {
        int n=1;
        boolean flag=false;

        while (true){
            for (int i=1; i<=20; i++) {
                if(n%i!=0){
                    n++;
                    flag=false;
                    break;
                }
                flag=true;
            }

            if(flag) {
                System.out.println(n);
                break;
            }
        }
    };
};

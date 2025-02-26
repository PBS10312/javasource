package op;

public class ArthmeticEx3 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';
        // 사칙연산 byte,short,char는 연산시 결과가 int형으로 변경   
        // c3 = c1 + 1; 

        // 해결책 1) 인트형으로 바꾸기
        int result = c1 + 1;

        // 해결책 2) 캐스팅하기 (변환하기)
        c3 = (char)(c1 + 1);

        c2++; // ==> c2 = c2+1;
        c2++; // ==> c2 = c2+1;

        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("result = "+result); // 98 => a(97)는 유니코드로 변경되서
        System.out.println("c3 = "+c3); // b

        // 문자가 연산이 되는 이유는 유니코드로 이루어져 있기때문에 

        



    }
}
        
        


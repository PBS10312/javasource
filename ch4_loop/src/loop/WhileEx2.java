package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        
        int i = 1;
        while (i < 11) {
            System.out.print(i+"   ");
            i++;
        }
        System.out.println();

        
        // 10에서 1로 반대로 셀때
        
        i = 10;
        while (i > 0) {
            System.out.print(i+"   ");
            i++;
        }
        System.out.println();

        // 짝수만 출력 1~10
        
        i = 1;
        while (i < 11) {
            if (i % 2 == 0) {
                System.out.print(i+"   ");
            }
        }
        System.out.println();

        // if 없이 짝수 만들기 , i+=2 : i=i+2
        for (int i = 2; i < 11; i+=2)
        while (i < 11) {
            System.out.println(i+"   ");
            i+=2
        }

    }
}

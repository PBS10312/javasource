package api.string;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        // String은 원본 문자열 변경 불가이기 때문에 매번 기존의 메모리를 해제하고 재생성하는 개념
        String str1 = "안녕하세요";
        str1 += " 반갑습니다.";
        str1 += "저는 홍길동 입니다";

        // StringBuffer sb = "안녀하세요"; <- xxx
        StringBuffer sb = new StringBuffer("안녕하세요");

        // sb.append("반갑습니다");
        // sb.append("저는 홍길동 입니다.");
        sb.append("반갑습니다").append("저는 홍길동 입니다.");

        String str2 = new String("Hello");
        String str3 = new String("Hello");

        System.out.println(str2.equals(str3) ? "문자열 같음" : "문자열 다름");

        // StringBuffer equals 확인 - 얘는 부모가 상속해준 그대로 사용중 그래서 주소 비교로 값이 다름
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1.equals(sb2) ? "문자열 같은" : "문자열 다름");

        // String equals 를 사용하기 위해서 변환을 해야함
        // String obj1 = sb1.toString();
        // String obj2 = sb1.toString();

        // new를 사용해서 StringBuffer로 돌아오는걸로 변환해도된다
        String obj1 = new String(sb1);
        String obj2 = new String(sb2);
        System.out.println(obj1.equals(obj2) ? "문자열 같은" : "문자열 다름");

        // str1 거꾸로 출력 : charAt(30)
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        // str1 을 StringBuffer로 변경해서 출력
        StringBuffer sb3 = new StringBuffer(str1);
        System.out.println(sb3.reverse());

        System.out.println("StringBuffer reverse() " + sb.reverse());

        // delete(), insert()
        System.out.println("sb1.delete(0,2) " + sb1.delete(0, 2));
        System.out.println("sb1.deleteCharAt(0,2) " + sb1.deleteCharAt(0));
        System.out.println(sb1);
        System.out.println("sb1.insert(0,H) " + sb1.insert(0, "H"));

        // replace()
        System.out.println("sb1.replace(0,2,java) " + sb1.replace(0, 2, "java"));
        System.out.println("원본 sb1 " + sb1);
    }
}

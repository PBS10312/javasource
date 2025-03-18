package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 추상클래스 : 클래스와 동일하나 추상 메서드를 가지고있음 new는 못함 (직접객체 생성불가)
// int read(), int read(byte[] b, int off, int len) , int read(byte b[])
// write(int b) , write(byte[] b, int off, int len) , write(byte b[])
public class InputStreamEx2 {
    public static void main(String[] args) {
        // ~~Stream : 입력값 byte 형태로 처리
        InputStream in = System.in;
        OutputStream out = System.out;

        try {

            System.out.print("이름 : ");
            byte[] b = new byte[1024];
            int input = in.read(b);

            // String 객체 생성
            // enter : 캐리지리턴(13) + 라인피드(10)
            String name = new String(b, 0, input - 2);
            System.out.println(name);

            out.write(input);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

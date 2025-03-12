package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithEx {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("file txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // =========================================================================
        // 추가 예제
        // try -with-resources : 자동 리소스닫기
        //

        try (FileInputStream fis2 = new FileInputStream("file txt")) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

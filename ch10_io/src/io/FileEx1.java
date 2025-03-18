package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {

        // 파일객체 생성
        File file1 = new File("c:/temp/test1.txt");
        File file2 = new File("c:/temp", "test1.txt");

        File dir = new File("c:/temp");
        File file3 = new File(dir, "test1.txt");

        System.out.println("경로를 제외한 파일명 : " + file1.getName());
        // file1.getName() => String 메소드 이용
        String fileName = file1.getName(); // test1.txt
        int pos = fileName.lastIndexOf(".");
        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, fileName.lastIndexOf("."))); // test1 만 출력
        System.out.println("확장자 : " + fileName.substring(pos + 1));
        System.out.println("경로를 포함한 파일명 : " + file1.getPath());
        System.out.println("파일의 절대 경로 : " + file1.getAbsolutePath());
        System.out.println("파일의 디렉토리 : " + file1.getParent());

        // 결과값 ;
        System.out.println("pathSeparator : " + file1.pathSeparator);
        System.out.println("pathSeparatorChar : " + file1.pathSeparatorChar);

        // 결과값 \
        // String path = "c://tmep" + File.separator + "text1.txt"; << 이렇게 쓰면 운영체제를 알아서
        // 잡아줌
        System.out.println("pathSeparator : " + file1.separator);
        System.out.println("pathSeparatorChar : " + file1.separatorChar);
    }
}

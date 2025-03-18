package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아들여 그 내용을 파일에 작성
        // 사용자가 q 입력하면 입력 중지

        System.out.println("파일에 입력할 문자를 입력하세요");
        System.out.println("중지하려면 q를 입력하세요");

        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:/temp/file1.txt");
                BufferedWriter br = new BufferedWriter(fw)) {
            String data = "";

            do {
                System.out.print(">> ");
                data = sc.nextLine();

                if (!data.equals("q")) {

                    br.write(data);
                    br.newLine();
                }

            } while (!data.equals("q"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package Codeacademy;

import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;
import com.sun.tools.javac.Main;

import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LanguageDetector detector = LanguageDetectorBuilder.fromAllLanguages().build();
        main main = new main();
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            main.menu();
            action = scanner.nextLine();
            main.action(action, detector, scanner);

        } while (!action.equals("2"));

    }

    private void menu (){
        System.out.println("""
                [1] -> enter text to detect the language
                [2] -> exit
                """);
    }

    private void action (String action, LanguageDetector detector, Scanner scanner){
        switch (action){
            case "1"->detectLanguage(detector,scanner);
            case "2"-> System.out.println("Exit");
            default -> System.out.println("no such action");
        }
    }

    private void detectLanguage(LanguageDetector detector, Scanner scanner) {
        System.out.println("Enter text to detect language");
        String line = scanner.nextLine();
        System.out.println(detector.detectLanguageOf(line));
    }



}

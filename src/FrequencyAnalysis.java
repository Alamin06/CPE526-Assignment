import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class FrequencyAnalysis {
    public static void main(String[] args) {
        // Cipher Character Analysing
        //read cipher text file
        FrequencyAnalysis frequencyAnalysis = new FrequencyAnalysis();
        String cipherText = frequencyAnalysis.getCipherText("path");
        System.out.println(cipherText);
        analysis(cipherText);

        System.out.println("Take replace rule"+"\n" + "1. Take replace rule" + "\n" + "2. Exit ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 2 ){
            System.exit(0);
        }
        System.out.println("Ciphertext:" + "\n" + cipherText);

        String replacementMatchStr = "M:a,A:b,N:c,U:d,S:e,C:f, R:g, P:i, B:k, D:l, E:m, F:n, G:o, H:p, L:s, V:v, W:w, Y:y";
        String letters[]= replacementMatchStr.split(",");
        String plaintext=cipherText;
        for (String letter :letters) {
            String[] match = letter.split(":");
           plaintext = plaintext.replaceAll(match[0], match[1]);
           // System.out.println(match[0]+" "+match[1]);
           // System.out.println("Plaintext" + "\n"+ plaintext);
        }
        System.out.println("Plaintext "+"\n"+ plaintext);

    }

    public String getCipherText(String path) {
        List<String> allLines = new ArrayList<String>();
        try {
            URI fileLocation = getClass().getResource("cipherText.txt").toURI();
            allLines = Files.readAllLines(Paths.get(fileLocation));

        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String line : allLines) {
            stringBuilder.append(line);
        }
        String cipherText = stringBuilder.toString();
        return cipherText;

    }

    public static void analysis(String cipherText)
    {
        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (Character c : cipherText.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        for (Character c : charFreq.keySet()) {
            System.out.print(c + "->" + charFreq.get(c) + "  ");
        }
    }

}


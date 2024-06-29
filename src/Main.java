import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1."Salam dunya" sozunu 'file.txt' faylina yazin ve hemin fayl-dan oxuyun.
//        try {
//            FileWriter write = new FileWriter("Task1.txt");
//            BufferedWriter writer = new BufferedWriter(write);
//            writer.write("Hello World");
//            writer.close();
//        }catch (Exception ex)
//        {
//            System.out.println(ex);
//        }
//
//        try {
//            FileReader read = new FileReader("Task1.txt");
//            BufferedReader reader = new BufferedReader(read);
//            System.out.println(reader.readLine());
//        }catch (Exception ex)
//        {
//            System.out.println(ex);
//        }

//        2.Fayla yazılacaq sözlərin sayını(request count) biz özümüz daxil edek (runtime-da)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Word count");
//        int count = sc.nextInt();
//        sc.nextLine();
//        String[] words = new String[count];
//        for (int i = 0;i<count;i++){
//            words[i] = sc.nextLine();
//        }
//        try(FileWriter write = new FileWriter("Task2.txt");) {
//            for(String word : words){
//                write.write(word + "\n");
//            }
//        }catch(Exception ex){
//            System.out.println(ex);
//        }
//        sc.close();

//        3.Fayla yazilmis melumati setirler seklinde oxuyan ve umumi nece setir oldugunu tapan proqram yazin
//        int count = 0;
//        try {
//            FileWriter fileWriter = new FileWriter("Task3.txt");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("hecer" + "\n" + "nigar" + "\n" + "Cefer");
//            bufferedWriter.close();
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Task3.txt"))){
//            boolean line;
//            while(line = bufferedReader.readLine() != null){
//                count++;
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println(count);

//        4.Istfadeci file-a istediyi qeder melumat daxil ede bilsin o vaxta qeder ki bitdiyini bildirene qeder
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bitirmek ucun -end- yazmalisiniz");
//        try(FileWriter fileWriter =new FileWriter("Task4.txt")){
//            while (true){
//               String input = scanner.nextLine();
//               if(input.equalsIgnoreCase("end")){
//                   break;
//               }
//                fileWriter.write(input + "\n");
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        
    }
}
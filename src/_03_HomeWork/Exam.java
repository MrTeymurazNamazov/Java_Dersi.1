package _03_HomeWork;

import java.util.Scanner;
import java.util.TreeMap;

public class Exam {
    static void main() {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        String cavab = "";
        String telebe = "";
        Integer bal = 0;
        TreeMap<String, Integer> tmap1 = new TreeMap<>();

        do {
            System.out.println("\n Tələbə Qiymətləndirmə Sistemini istifadə etmək üçün menyunu seçin:\n");
            System.out.println("1 - Tələbə adını daxil etmək. ");
            System.out.println("2 - Tələbə balını daxil etmək. ");
            System.out.println("3 - Tələbənin qiymətini göstərmək. ");
            System.out.println("4 - Tələbənin imtahandan keçib-keçmədiyini yoxlamaq .");
            System.out.println("5 - Butun telebelerin adlarini ve ballarini goster.");
            System.out.println("6 - Çıxış.");
            System.out.println("1-6 rəgəm kimi daxil edin:\n");


            cavab = inputStr.nextLine();


            switch (cavab) {
                case "1":

                    System.out.println("\nYeni Tələbə adını daxil edin:\n");
                    telebe = inputStr.nextLine();

                    if (tmap1.containsKey(telebe)) {
                        System.out.println("\nBu Tələbə artıq mövcuddur!!!\n");
                    } else {
                        tmap1.put(telebe.trim(), 0);
                        System.out.println("\nYeni Tələbə elavə olundu!!!\n");
                    }
                    break;
                case "2":
                    System.out.println("\nTələbə adını daxil edin:\n");
                    telebe = inputStr.nextLine();
                    if (tmap1.containsKey(telebe)) {
                        System.out.println("\nTələbə balını daxil edin:\n");
                        bal = inputInt.nextInt();
                        tmap1.put(telebe.trim(), bal);
                    } else {
                        System.out.println("\nBele adli telebe tapilmadi\n");
                    }
                    break;
                case "3":
                    System.out.println("\nTələbə adını daxil edin:\n");
                    telebe = inputStr.nextLine();

                    if (tmap1.get(telebe) > 100 || tmap1.get(telebe) < 0) {
                        System.out.println("bele qiymet yoxdur");
                    } else if (tmap1.get(telebe) >= 90) {
                        System.out.println("A qiymetini aldi.");
                    } else if (tmap1.get(telebe) >= 80) {
                        System.out.println("B qiymetini aldi.");
                    } else if (tmap1.get(telebe) >= 70) {
                        System.out.println("C qiymetini aldi.");
                    } else if (tmap1.get(telebe) >= 60) {
                        System.out.println("D qiymetini aldi.");

                    } else
                        System.out.println("F qiymetini aldi");
                    break;
                case "4":
                    System.out.println("\nTələbə adını daxil edin:\n");
                    telebe = inputStr.nextLine();

                    if (tmap1.containsKey(telebe)) {
                        if (tmap1.get(telebe) >= 60) {
                            System.out.println(telebe + " tələbə keçib.");
                        } else {
                            System.out.println(telebe + " tələbə kəsilib.");
                        }
                    } else System.out.println("Bele adli telebe tapilmadi.");

                    break;

                case "5":
                    System.out.println(tmap1);


                case "6":
                    System.out.println("\nProgramdan cixis edildi!!!\n");
                    break;

                default:
                    System.out.println("Səhv seçim! Zəhmət olmasa 1-6 arası rəqəm daxil edin.");
            }

        } while (!cavab.equals("6"));
    }

}


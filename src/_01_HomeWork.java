import java.util.Scanner;
import java.util.TreeMap;

public class _01_HomeWork {
    public static void main(String[] args) {
// Canli Luget yaratmaq istenilir (Map istifade edin)
        // Istifadeci ucun asagidaki kimi bir menyu cixmalidir
        // 1 - Elave et (Bu hissede soz ve menasi alinmalidir)
        // 2 - Redakte et (Bu secimde istifadeciden menasini deyismek istenilir)
        // 3 - Siyahini goster (Butun soz ve menalar)
        // 4 - Axtaris (Axtarilan sozun menasi cixmalidir)
        // 5 - Sil
        // 6 - Cixis

//        QEYD : Redakte et ucun -> Eyni key ucun yeni value teyin etmek mumkundur,
//                yeni value-ni put etmek ucun key oldugu kimi qalir, value-ni ferqli yazsaniz update olacaq
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
       String cavab ="";
        String soz = "";
        String tercume = "";
        TreeMap<String, String> tmap1 = new TreeMap<>();
        tmap1.put("Home", "Ev");
        do {
            System.out.println("\nInqlis-Azərbaycan Lügətini istifadə etmək üçün menyunu seçin:\n");
            System.out.println("1 - Söz əlavə et. ");
            System.out.println("2 - Sözü redakt et. ");
            System.out.println("3 - Lüğətin siyahini göstər. ");
            System.out.println("4 - Axtarış etmək .");
            System.out.println("5 - Söz Silmək.");
            System.out.println("6 - Çıxış.");
            System.out.println("1-6 rəgəm kimi daxil edin:\n");

            cavab = inputStr.nextLine();


            switch (cavab) {
                case "1":

                    System.out.println("\nYeni sözü daxil edin:\n");
                    soz = inputStr.nextLine();

                    if (tmap1.containsKey(soz)) {
                        System.out.println("\nBu söz artıq mövcuddur!!!\n");
                    } else {
                        System.out.println("\nYeni tercüməni daxil edin:\n");
                        tercume = inputStr.nextLine();
                        tmap1.put(soz.trim(), tercume.trim());
                        System.out.println("\nYeni söz elavə olundu!!!\n");

                    }
                    break;
                case "2":
                    System.out.println("\nRedakt etmək istədiyiniz sözü daxil edin:\n");
                    soz = inputStr.nextLine();

                    if (tmap1.containsKey(soz.trim())) {
                        System.out.println("\nRedakt etmək istədiyiniz söz: " + soz + "\n");
                        System.out.println("\nRedakt etmək istədiyiniz sözün tercüməsi: " + tmap1.get(soz) + "\n");
                        tercume = inputStr.nextLine();
                        tmap1.replace(soz.trim(), tercume.trim());
                    } else {
                        System.out.println("\nBu söz mövcud deyil!!!\n");
                        break;
                    }

                    break;
                case "3":
                    System.out.println("\nLüğət :" + tmap1);
                    break;
                case "4":
                    System.out.println("\nAxtardığınız söz daxil edin:\n");
                    soz = inputStr.nextLine();
                    if (tmap1.containsKey(soz.trim())) {
                        System.out.println("\n" + soz + " tərcüməsi :" + tmap1.get(soz.trim()));
                    } else {
                        System.out.println("\nBu söz mövcud deyil!!!\n");
                    }
                    break;
                case "5":
                    System.out.println("\nSilmək istədiyiniz sözü daxil edin:\n");
                    soz = inputStr.nextLine();
                    if (tmap1.containsKey(soz.trim())) {
                        tmap1.remove(soz.trim());
                        System.out.println("\nSilindi!!!\n");
                    } else {
                        System.out.println("\nBu söz mövcud deyil!!!\n");
                    }
                case "6":
                    System.out.println("\nLüğətə cixis edildi!!!\n");
                    break;

                default:
                    System.out.println("Səhv seçim! Zəhmət olmasa 1-6 arası rəqəm daxil edin.");
            }

        } while (!cavab.equals("6"));


    }

    }


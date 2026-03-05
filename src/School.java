public class School {
    public static void main(String[] args) {
//        Bir main olaraq mekteb yaradin,
//        Mektebe 3 shagirdi qeydiyyat edin
//        shagird melumatlari : Ad, Soyad, Ata Adi, Yash, MektebNo, Sinifi (int), Cinsi (K/Q)

        Schooler schlr = new Schooler();
        schlr.name = "Orxan";
        schlr.surname = "Quliyev";
        schlr.fatherName = "Chinqiz";
        schlr.age = 16;
        schlr.schoolNumber = 205;
        schlr.classNumber = 11;
        schlr.gender = 'M';

        Schooler schlr2 = new Schooler();
        schlr2.name = "Amina";
        schlr2.surname = "Quliyeva";
        schlr2.fatherName = "Orxan";
        schlr2.age = 10;
        schlr2.schoolNumber = 22;
        schlr2.classNumber = 4;
        schlr2.gender = 'F';

        Schooler schlr3 = new Schooler();
        schlr3.name = "Raul";
        schlr3.surname = "Mammedov";
        schlr3.fatherName = "Kamran";
        schlr3.age = 14;
        schlr3.schoolNumber = 49;
        schlr3.classNumber = 8;
        schlr3.gender = 'M';


    }
}

class Schooler {
    String name;
    String surname;
    String fatherName;
    int age;
    int schoolNumber;
    int classNumber;
    char gender;

}

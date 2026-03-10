package _02_HomeWork;

public class Rectangle {
    // 1. Addim : Rectangle adinda bir tip yaradin
//            xususiyyet : int tipinde  width, length
// 2. Addim : Bu classin icinde sahesini ve perimetrini tapan ayri iki metod yaradin (void)
// 3. Addim : 1 dene FigureMain classi icerisinde xususiyyetlere deyer vererek
// metodlardan istifade edib ekrana cap edin
    public int width;
    public int height;

    public void recPer(int width, int height) {
        int Perimeter = (width + height)*2;
        this.width = width;
        this.height = height;
        System.out.println("Perimeter : " + Perimeter);
    }

    public void recSquare(int width, int height) {
        int Square = (width * height);
        this.width = width;
        this.height = height;
        System.out.println("Square = " + Square);

    }
}

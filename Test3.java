import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("-----Menu-----\n"
                + "1. Caffe Latte\n"
                + "2. Capuchino\n"
                + "3. End");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a Number: ");
            int choise = input.nextInt();
            switch (choise) {
                case 1: {
                    Scanner size = new Scanner(System.in);
                    System.out.println("Enter a Size: ");
                    String nhap = size.nextLine();
                    switch (nhap) {
                        case "M": {
                            Scanner soluong = new Scanner(System.in);
                            System.out.println("Enter a So Luong: ");
                            int num = soluong.nextInt();
                            int gia = 70000 * num;
                            System.out.println("Tong gia tri ban phai tra: " + gia);
                            break;
                        }
                        case "L": {
                            Scanner soluong = new Scanner(System.in);
                            System.out.println("Enter a So Luong: ");
                            int num = soluong.nextInt();
                            int gia = 80000 * num;
                            System.out.println("Tong gia tri ban phai tra: " + gia);
                            break;
                        }
                        case "N": {
                            Scanner soluong = new Scanner(System.in);
                            System.out.println("Enter a So Luong: ");
                            int num = soluong.nextInt();
                            int gia = 90000 * num;
                            System.out.println("Tong gia tri ban phai tra: " + gia);
                            break;
                        }
                    }
                }
                case 2: {
                    Scanner size = new Scanner(System.in);
                    System.out.println("Enter a Size: ");
                    String nhap = size.nextLine();
                    switch (nhap) {
                        case "M": {
                            Scanner soluong = new Scanner(System.in);
                            System.out.println("Enter a So Luong: ");
                            int num = soluong.nextInt();
                            int gia = 40000 * num;
                            System.out.println("Tong gia tri ban phai tra: " + gia);
                            break;
                        }
                        case "L": {
                            Scanner soluong = new Scanner(System.in);
                            System.out.println("Enter a So Luong: ");
                            int num = soluong.nextInt();
                            int gia = 50000 * num;
                            System.out.println("Tong gia tri ban phai tra: " + gia);
                            break;
                        }
                        case "N": {
                            Scanner soluong = new Scanner(System.in);
                            System.out.println("Enter a So Luong: ");
                            int num = soluong.nextInt();
                            int gia = 60000 * num;
                            System.out.println("Tong gia tri ban phai tra: " + gia);
                            break;
                        }
                    }
                }
                case 3: {
                    x = 2;
                    System.out.println("Hẹn gặp lại lần sau ạ");
                    break;
                }
            }
        } while (x == 1);
    }
}

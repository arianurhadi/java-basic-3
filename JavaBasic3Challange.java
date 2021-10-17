import java.util.Scanner;

public class JavaBasic3Challange {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Segitiga\n2. Segitiga 2 (piramid)\n3. Layang-layang\n4. Persegi\n5. Jajar Genjang");

        System.out.print("Masukan Pilihan : ");
        int nilai = scanner.nextInt();

        if (nilai == 1) {
            segitiga();
        } else if (nilai == 2){
            segitiga2();
        } else if (nilai == 3){
            layangLayang();
        } else if (nilai == 4){
            persegi();
        } else if (nilai == 5){
            jajarGenjang();
        } else {
            System.out.println("Tidak ada pilihan");
        }

    }

    public static void segitiga() {

        int i,j;
        for(i = 0; i < 10; i++){
            for(j = 0; j < i; j++){
                System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

    public static void segitiga2() {

        int i,j,k;

        for(i = 5; i > 0; i--){
            for(j = 1; j < i; j++){
                System.out.print("   ");
            }
            for(k = 5; k >= j; k--){
                System.out.print(" 0 ");
            }
            for(k = 5; k >= j+1; k--){
                System.out.print(" 0 ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void layangLayang() {
        int i,j,k;

        for(i = 5; i > 0; i--){
            for(j = 1; j < i; j++){
                System.out.print("   ");
            }
            for(k = 5; k >= j; k--){
                System.out.print(" 0 ");
            }
            for(k = 5; k >= j+1; k--){
                System.out.print(" 0 ");
            }
            System.out.println();
            System.out.println();
        }
        for(i = 0; i < 4; i++){
            for(j = 0; j <= i; j++){
                System.out.print("   ");
            }
            for(k = j; k <= 4; k++){
                System.out.print(" 0 ");
            }
            for(k = j; k <= 4-1; k++){
                System.out.print(" 0 ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void persegi() {

        int i,j;

        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

    public static void jajarGenjang() {

        int i,j,k;

        for(i = 5; i > 0; i--){
            for(j = i-1; j > 0; j--){
                System.out.print("   ");
            }
            for(k = 0; k <= 5; k++){
                System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

}
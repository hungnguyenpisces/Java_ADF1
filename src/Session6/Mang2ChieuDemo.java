package Session6;

import java.util.Scanner;

// import buoi5.Book;

public class Mang2ChieuDemo {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] toaAnBinh = new String[10][5];
        toaAnBinh[0][0] = "A11";

        for (int i = 0; i < toaAnBinh.length; i++) {
            String[] tang = toaAnBinh[i];
            for (int j = 0; j < tang.length; j++) {
                toaAnBinh[i][j] = "A" + (i + 1) + (j + 1);
            }
        }
        for (String[] tang : toaAnBinh) {
            for (String canho : tang) {
                System.out.print(canho + "\t");
            }
            System.out.println();
            System.out.println();
        }

        // Book[][] nhaSach = new Book[30][50];
    }
}

package Session3;

public class LoopDemo {
    public static void main(String[] args) {
        int num = 1, sum = 0, count7 = 0, sum7 = 0;
        System.out.println("-----------while loop----------");
        while (num <= 100) {
            sum += num;
            if (num % 7 == 0) {
                count7++;
                sum7 += num;
            }
            num++;
        }
        System.out.printf("Tong tu 1->100 = %d\n", sum);
        System.out.printf("So luong so chia het cho 7: %d\n", count7);
        System.out.printf("Tong cac so chia het cho 7: %d\n", sum7);

        num = 1;
        sum = 0;
        count7 = 0;
        sum7 = 0;

        System.out.println("-----------do-while loop----------");
        do {
            sum += num;
            if (num % 7 == 0) {
                count7++;
                sum7 += num;
            }
            num++;
        } while (num <= 100);
        System.out.printf("Tong tu 1->100 = %d\n", sum);
        System.out.printf("So luong so chia het cho 7: %d\n", count7);
        System.out.printf("Tong cac so chia het cho 7: %d\n", sum7);

        num = 1;
        sum = 0;
        count7 = 0;
        sum7 = 0;

        System.out.println("-----------for loop----------");
        for (; num <= 100; num++) {
            sum += num;
            if (num % 7 == 0) {
                count7++;
                sum7 += num;
            }
        }
        System.out.printf("Tong tu 1->100 = %d\n", sum);
        System.out.printf("So luong so chia het cho 7: %d\n", count7);
        System.out.printf("Tong cac so chia het cho 7: %d\n", sum7);
    }
}

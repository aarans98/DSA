package com.example.dsa.number;

public class Number {

    public static void main(String[] args) {
        System.out.println(convertToBinary(35));
        System.out.println("bit wise AND operation of 0 and 0 : " + bitWiseAnd(0,0));
        System.out.println("bit wise AND operation of 1 and 1 : " + bitWiseAnd(1,1));
        System.out.println("bit wise AND operation of 29 and 300 : " + bitWiseAnd(29,300));
        System.out.println("bit wise OR operation of 5 and 3 : " + bitWiseOr(5,3));
    }

    /**
     * number : 35      32 16 8 4 2 1
     * binary           1 0 0 0 1 1 -> 100011
     * @param num
     * @return
     */
    public static int convertToBinary(int num) {
        if (num == 0) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 2);
            num = num/2;
        }

        return Integer.parseInt(sb.reverse().toString());
    }

    /**
     * Bitwise and operator will compare two decimal number by converting each number to binary format and perform AND operation
     * for each bit
     * example:
     *   0101 (5)
     * & 0011 (3)
     *   ----
     *   0001 (1)
     * @param num1
     * @param num2
     * @return
     */
    public static int bitWiseAnd(int num1, int num2) {
        return num1 & num2;
    }

    /**
     * Bitwise or operator will compare two decimal number by converting each number to binary format and perform OR operation
     * for each bit
     * example:
     *   0101 (5)
     * | 0011 (3)
     *   ----
     *   0111 (1)
     * @param num1
     * @param num2
     * @return
     */
    public static int bitWiseOr(int num1, int num2) {
        return num1 | num2;
    }
}

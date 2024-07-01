package com.example.dsa.number;

public class Number {

    public static void main(String[] args) {
        System.out.println(convertToBinary(35));
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
}

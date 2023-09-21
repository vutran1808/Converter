package common;

import java.util.Stack;

public class Agorithm {

    public void DecToHex(int n) {
        Stack<Character> arr = new Stack<>();
        while (n != 0) {
            int temp = n % 16;
            if (temp < 10) {
                arr.push((char) (48 + temp));
            } else {
                arr.push((char) (55 + temp));
            }
            n = n / 16;
        }
        while (!arr.empty()) {
            System.out.print(arr.pop());
        }
    }

    public void HextoDec(String n) {
        String digits = "0123456789ABCDEF";
        n = n.toUpperCase();
        int val = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int d = digits.indexOf(c);
            val = val * 16 + d;
        }
        System.out.println(val);
    }

    public void DectoBin(int dec) {
        Stack<Integer> arr = new Stack<>();
        while (dec != 0) {
            int remainder = dec % 2;
            arr.push(remainder);
            dec = dec / 2;
        }
        while (!arr.empty()) {
            System.out.print(arr.pop());
        }
    }

    public void BintoDec(String bin) {
        int result = 0;
        int power = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                result += (int) Math.pow(2, power);
            }
            power ++;
        }
        System.out.println(result);
    }

}

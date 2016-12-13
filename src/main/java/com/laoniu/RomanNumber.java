package com.laoniu;

public class RomanNumber {
    StringBuilder sb;
    String one;
    String five;
    String ten;

    public RomanNumber(StringBuilder sb, String one, String five, String ten) {
        this.sb = sb;
        this.one = one;
        this.five = five;
        this.ten = ten;
    }

    public void getNumberStringB(int number){
        if (number <= 4) {
            for (int i = 0; i < number; i++) {
                sb.append("M");
            }
        }
    }
    public void getNumberStringA(int number) {
        if (number < 4) {
            for (int i = 0; i < number; i++) {
                sb.append(one);
            }
        }
        if (number == 4) {
            sb.append(one).append(five);
        }
        if (number == 9) {
            sb.append(one).append(ten);
        }
        if (number < 9 && number >= 5) {
            sb.append(five);
            for (int i = 0; i < number - 5; i++) {
                sb.append(one);
            }
        }
    }
}

package santos.joseleno.utils;

import java.lang.Math;

class CriaInteiro {
    public static int CreateC(String a, String b) {
       
        String c = "";
        int limite = Math.max(a.length(), b.length());
        for (int i = 0; i <= limite; i++) {
            if (i < a.length()) {
                c += a.charAt(i);
            }
            if (i < b.length()) {
                c += b.charAt(i);
            }
        }
        return c.length() > 6 ? -1 : Integer.valueOf(c.toString()); 
    }

    public static void play(String a, String b) {
        System.out.println("Number A: " + a + " || Number B: " + b);
        System.out.println("Number C: " + CreateC(a, b));
    }

    public static void main(String[] args) {
        play("50", "111111111111111111");
    }
}
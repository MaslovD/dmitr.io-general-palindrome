/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpalindrome;

/**
 *
 * @author dmaslov
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String tstString = "abcba";

        System.out.println(isPalindrome(tstString));
    }

    public static boolean isPalindrome(String s) {
        final int strLenght = s.length();
        for (int i = 0; i < strLenght; i++) {

            if (s.charAt(i) != s.charAt((strLenght - i) - 1)) {
                return false;
            }
        }
        return true;
    }
}

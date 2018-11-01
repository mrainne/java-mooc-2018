/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class StringUtils {
    public static boolean sisaltaa(String sana, String haettava) {
        return sana.toUpperCase().trim().contains(haettava.toUpperCase().trim());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author W7
 */
public class DaliProst {
    public static boolean prost (int n){
        for (int i=0;i<n;i++){
            if(n%i != 0){
                return false;
            }
            
        }
        return true;
    }
}

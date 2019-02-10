/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondyear_hashmap;

/**
 *
 * @author jit
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap();
        
        list.put("ps", "Palestine");
        list.put("EGY", "Egypt");
        
        System.out.println(list.get("ps"));
    }
}

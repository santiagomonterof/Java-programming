/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programation.practice00;

/**
 *
 * @author user
 */
public class Console {

    public static void main(String[] args) {

        Clock bolivia = new Clock();
        bolivia.setHour(8, 5, 20);
        
        Clock japon = new Clock();

        String result = bolivia.showHour();
        System.out.println(result);

        System.out.println(japon.showHour());

    }
}

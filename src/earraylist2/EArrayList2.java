/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earraylist2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aalvarezbretana
 */
public class EArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayList lista = new ArrayList();
        //engadimos elementos
        String dato = "pizarra";
        int num1= 1;
        float num2= 2.0f;
        lista.add(dato);
        lista.add(num1);
        lista.add(num2);
        lista.add("ivan alaves");
        lista.add(new Integer(5));
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }*/
        ArrayList<Integer> lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(5);
        lista.add(5);
        lista.add(3);
        lista.add(2);
        //cambiar valor posicion
        lista.set(2, 3);
        Metodos obx = new Metodos();
        //eliminar un elemento de una posicion
        lista.remove(2);
        //eliminar un elemento por su valor
        lista.remove(new Integer(5));
        //cambiar valor sin conocer la posicion
        int posicion = lista.indexOf(new Integer(5));
        lista.set(posicion, 7);
        obx.amosar(lista);
        obx.amosarForEach(lista);
        obx.amosarIterator(lista);
        obx.ver(lista);
        //ordenar
        System.out.println("-.-.-.-.-.-Ordenado-.-.-.-.-.-");
        Collections.sort(lista);
        obx.amosar(lista);
        obx.amosarForEach(lista);
        obx.amosarIterator(lista);
        obx.ver(lista);
    }
}

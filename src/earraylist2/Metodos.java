/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earraylist2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aalvarezbretana
 */
public class Metodos {
    //distintos xeitos de percorrer unha coleccion:
    //for
    public void amosar(ArrayList<Integer> lista){
        System.out.println("For:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
    }
    //for each
    public void amosarForEach(ArrayList<Integer> lista){
        System.out.println("For each:");
        for(Integer amosforeach:lista){
            System.out.println(amosforeach);
        }
    }
    //utilizando iteradores
    public void amosarIterator(ArrayList<Integer> lista){
        System.out.println("For Iterator:");
       Iterator it= lista.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
           /*
           tambien se puede asi
           int valor=(Integer)it.next();
           System.out.println(valor);
           */
       }
    }
    public void ver(ArrayList<Integer> lista){
        System.out.println("Ver lista:");
        System.out.println(lista);
    }
}

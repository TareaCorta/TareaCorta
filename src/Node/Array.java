/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Node;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author estadm
 */
public class Array <T>{
    private ArrayList<T> array;
    
    public Array(){
        array = new ArrayList();
    }
    public void llenar(int CantMax){
        Random rnd = new Random();
        for (int i=0; i<CantMax; i++){
            array.add((T)(Integer)rnd.nextInt(1000));
        }
    }
    public void imprimir(){
        for (int i=0;i<array.size(); i++){
            System.out.println(array.get(i));
        }
    
    }
}

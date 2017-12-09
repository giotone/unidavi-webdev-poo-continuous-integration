/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenPOO;

import java.util.List;

/**
 *
 * @author gt2a
 */
public class BookStore {

    public double calculateBasketCost(List<Integer> books) {
        
        int idLivro = 0;
        double returno = 8;
        
        for(int i=0; i<books.size();i++){
            
            if (idLivro == 0){
                idLivro = books.get(i);
            }else{
                if (books.get(i) == idLivro){
                    returno = 16;
                }else{
                    returno = 15.20;
                }
            }
                        
        }
        return returno;
    }
    
}

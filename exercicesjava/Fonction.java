package cal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgane
 */
public class Fonction {
    private String sms=null;
    public String isEmpty( char nbre){
        if(nbre==null){
           if(sms==null){
               sms="Le Nombre est obligatoire";
           }
            return sms;
        }
    }
    
    public boolean isNumeric( char nbre){
        if('0'<=nbre && nbre<='9'){
            if(sms==null){
               sms="Le Nombre doit etre un numérique";
           }
            return sms;
        }
    }
    
    
   
    
    
    
    public static void main(String args[]) {
        // TODO code application logic here
    }
}

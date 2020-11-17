
package programa;

import javax.swing.JOptionPane;


/**
 *
 * @author Hind
 */
public class Estancia {
    public static void main(String[] args) {
     
         int i;
         Integer[] habitacionsM= new Integer[9];//declare list of 9 intereges "the metters that the user will introduce"
        
        // a loop with the condition of Metros between 1 and 100
       // for ((habitacionsM.length>1 && habitacionsM.length<100)){ 
            
             for ( i=0;i<5;i++){ 
              
                  habitacionsM[i]=Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de Metros de habitación " + (i+1) + " entre 1 y 100m: "));                  
                        
                    }                           
            
                            JOptionPane.showMessageDialog(null,"metros are " + habitacionsM[i]);
        }
             
        
        
    }
   
 

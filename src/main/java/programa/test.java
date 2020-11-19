package programa;
import javax.swing.JOptionPane;
/**
 *
 * @author Hind
 */
public class test {
           
    public static void main(String[] args) {
        
        //double NmrEstancia;
         int i = 0;
         double RestCharge=0;//equation to count how much charge will rest in asperadora after limpiar
         String[] habitacion = {"Cocina", "Baño", "salón", "dormitorio1", "dormitorio2"};
         double[] habitacionsM= {25,15,3,2,4};//declare list of 5 intereges "the metters that the user will introduce for our 5habitaciones"
         double cargaEstablecida=40;// value charge the user enter in first opcion "configuration del sistema"
         double limpiarNeedCharge=0;//equation to know how much charge the aspiradora losted dependce the M of the habitacion
         double cargaActual;//the value of charge after cleaning
         int x=0;
         String cas;
         String opc;
         int option2=0;
        double[] habPermanenteM= new double[x];//the permanent list for stocking the metros of habitacions that a user will choose, for "modo dependencias"
        String[] habPermanente= new String[x]; 
        double sumLimpiarCharge=0; 
         String BaseDeCarga="Cocina";
        
       opc= JOptionPane.showInputDialog("Como Quieres Limpiar : \n" + "1.Aspiracion\n" + "2.aspiracion y fregado ? " );
       int option=Integer.parseInt(opc);
          cargaEstablecida=80;
        switch(option){   
                     
            case 1: 
           /*String opc2=JOptionPane.showInputDialog(null, "1.aspiracion modo completo\n" 
                       + "2.aspiracion dependencias\n");  
            option2=Integer.parseInt(opc2);
              if(option==1){   
             
       
               
            //aspiration 
               //there is 2 modes, the user have to choose the mode want and inside every mode there also 2 type also 
               //when the user choose mode aspiracion and mode complito en aspiration then i do 
              //loops for the 2 listes and inside i count how much charge aspiradora need every time enter in a new room 
               //then i compare the charge it have with "cargadaEstablecida" the charge the user enter if the charge it need for this room 
               //more > bigger than the charge she have then i show error msg if else i show the habitacion cleaned
                JOptionPane.showMessageDialog(null,"you choose Aspiracion ,modo completo"
                        + ""); 
                if(cargaEstablecida>3){
                 
                 //   for(int j=0;j<habitacion.length;j++){ //loop for the moving in the rooms if there is charge
                             for(int m=0;m<habitacionsM.length;m++){
                               limpiarNeedCharge=habitacionsM[m]*1.5;
                               
                                
                               if(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showMessageDialog(null, "no se puede limpiar porque la carga no es suficiente" + ","
                                           + "aspiradora se detuvo en esta habitación" + habitacion[m] );  
                                                                  }
                               else  {
                                      sumLimpiarCharge+=limpiarNeedCharge;
                                      JOptionPane.showMessageDialog(null, "tu" + "" + habitacion[m] + "" + "limpiado");   
                               }

                  }
                             cargaActual=cargaEstablecida-sumLimpiarCharge; 
                     JOptionPane.showMessageDialog(null, "el cargo ahora es :" + cargaActual + "%");        
                     JOptionPane.showMessageDialog(null, "su aspiradora necesita cargarse y volverá a la base de carga para cargar");           
                      limpiarNeedCharge=0; //initial this variable because we will need it again 
                      while(BaseDeCarga != "Cocina"){
                               JOptionPane.showMessageDialog(null, "su aspiradora volvere a base de cargar:" + "" + BaseDeCarga);  
                              }
                              
           }
                
        }*/
               // else  if(option2==2){
            /*Modo dependencias: Sólo limpia las habitaciones que se le indiquen, si tiene batería.
En ambos modos, cada metro cuadrado de limpieza agota un 1,5% de batería. Cada vez que se limpia una habitación se actualiza el estado de la batería, para controlar si puede limpiar la siguiente habitación.
En ningún caso, si está limpiando la casa o una dependencia, el nivel de batería no puede ser inferior al 3%, para que el robot tenga autonomía y pueda volver a su base de carga.
*/  
           
                    JOptionPane.showMessageDialog(null,"you choose Aspiracion ,modo Dependencias"
                        + ""); 
                    if(cargaEstablecida>3){          
                        String num= JOptionPane.showInputDialog("introduzca el numero de habitaciones quieres limpiar:");
                         x=Integer.parseInt(num);
   
                     // for (i=0;i<x;i++){ 
                        
                           for(int j=0;j<x;j++){ 
                           String h= JOptionPane.showInputDialog("introduzca el habitaciones que quieres limpiar:");//introduce the habitation you want to clean 
                         //  habPermanente[j]=String.valueOf(h);
                           String metros=(JOptionPane.showInputDialog("introduzca el número de Metros de habitación \n" + habPermanente[i] + " entre 1 y 100m: ")); 
                            habPermanenteM[j]=Double.parseDouble(metros);
                         
                             limpiarNeedCharge=habPermanenteM[j]*1.5;
                            
                             
                               if(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                                            
                        
                           
                            JOptionPane.showMessageDialog(null, "tu" + habitacion[j] + "limpiado");                        
                          }
                       sumLimpiarCharge+=limpiarNeedCharge;
                      cargaActual=cargaEstablecida-sumLimpiarCharge; 
                      JOptionPane.showMessageDialog(null, "habitaciones limpiado y el cargo ahora es :" + cargaActual + "%");
                      limpiarNeedCharge=0;
                                                   
                    }
                     
                     }
                 } 
                }
           // }
             //case 2:    
                   
                
        
       
    
      
   
      
    
    //}
        
        
        
        
        
        
        /* for (int k=0;k<habitacionsM.length;k++){        
                        for (i=0;i<habitacion.length;i++){ 
                      habitacionsM[k]=Double.parseDouble(JOptionPane.showInputDialog("introduzca el número de Metros de habitación \n" + habitacion[i] + " entre 1 y 100m: "));                  
                               
                               limpiarNeedCharge=habitacionsM[k]*2.25;
                               RestCharge=cargaEstablecida-limpiarNeedCharge;
                               
                        }
                        if(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                               else if(RestCharge<=3){
                               JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga es menos de 3%",JOptionPane.ERROR_MESSAGE);
                                }
                               else{
                                       JOptionPane.showMessageDialog(null, "start limpiar");
                                    }        
                    } 
                      cargaActual=RestCharge;
                      limpiarNeedCharge=0;
                      RestCharge=0;
                        } 
                
                    } 
      /*   for(int j=0;j<habitacion.length;j++){ //loop for the moving in the rooms if there is charge
                        
                          for(int m=0;m<habitacionsM.length;m++){
                               limpiarNeedCharge=habitacionsM[m]*2.25;
                               RestCharge=cargaEstablecida-limpiarNeedCharge;
                               
                               if(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                               else if(RestCharge<=3){
                               JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                                }
                               else{
                                       JOptionPane.showMessageDialog(null, "start limpiar");
                                    }    
                        }
                          
                    } 
                      cargaActual=RestCharge;
                      limpiarNeedCharge=0;
                      RestCharge=0;*/
       /*
                String num = JOptionPane.showInputDialog("introduzca el numero de habitaciones quieres limpiar:");
                x=Integer.parseInt(num);
              if (x<5) { 
                          String h= JOptionPane.showInputDialog("introduzca el habitaciones que quieres limpiar:");
                          
                 for (i=0;i<habitacion.length;i++){ 
                         habPermanente[x]=String.valueOf(h);
                       for(int j=0;j<habPermanenteM.length;j++){ 
                         
                             habPermanenteM[x]=Double.parseDouble(JOptionPane.showInputDialog("introduzca el número de Metros de habitación \n" + habPermanente[i] + " entre 1 y 100m: "));                  
                             limpiarNeedCharge=habPermanenteM[j]*2.25;
                             RestCharge=cargaEstablecida-limpiarNeedCharge;
                             
                               if(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                                else if(RestCharge<=3){
                                       JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga es menos de 3%",JOptionPane.ERROR_MESSAGE);
                                }
                               else{
                                       JOptionPane.showMessageDialog(null, "start limpiar");
                                    }        
                        }                                             
                    }
                } 
                 else {
                         JOptionPane.showInputDialog(null, "Error numero Max de Habitacion es :5");
                         }
                     cargaActual=RestCharge;
                      limpiarNeedCharge=0;
                      RestCharge=0;    */
       
       
       
  

   


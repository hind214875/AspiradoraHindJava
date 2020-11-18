package programa;
import javax.swing.JOptionPane;
/**
 *
 * @author Hind
 */
public class test {
           
    public static void main(String[] args) {
        
        //double NmrEstancia;
         int i;
         double RestCharge=0;//equation to count how much charge will rest in asperadora after limpiar
         String[] habitacion = {"Cocina", "Baño", "salón", "dormitorio1", "dormitorio2"};
         double[] habitacionsM= new double[5];//declare list of 5 intereges "the metters that the user will introduce for our 5habitaciones"
         double cargaEstablecida=100;// value charge the user enter in first opcion "configuration del sistema"
         double limpiarNeedCharge=0;//equation to know how much charge the aspiradora losted dependce the M of the habitacion
         double cargaActual;//the value of charge after cleaning
         int x=0;
        double[] habPermanenteM= new double[x];//the permanent list for stocking the metros of habitacions that a user will choose, for "modo dependencias"
        String[] habPermanente= new String[x];  
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
       
       
       
   }
}

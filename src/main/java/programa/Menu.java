package programa;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Hind
 */
public class Menu {
    
    //public static final int opcion = 9;
    //ArrayList<Double> destancia = new ArrayList<Double>();//lista de valores de destancia dando por el usuario

    public static void main(String[] args) {
        double NmrEstancia;
         int i;
         double RestCharge=0;//equation to count how much charge will rest in asperadora after limpiar
         String[] habitacion = {"Cocina", "Baño", "salón", "dormitorio1", "dormitorio2"};
         double[] habitacionsM= new double[5];//declare list of 5 intereges "the metters that the user will introduce for our 5habitaciones"
         double cargaEstablecida=0;// value charge the user enter in first opcion "configuration del sistema"
         double limpiarNeedCharge=0;//equation to know how much charge the aspiradora losted dependce the M of the habitacion
         double cargaActual;//the value of charge after cleaning
         int x=0;
         double[] habPermanenteM= new double[x];//the permanent list for stocking the metros of habitacions that a user will choose, for "modo dependencias"
         String[] habPermanente= new String[x];
//create menu 
        int opcion=0; String op="";
        op=JOptionPane.showInputDialog("Seleccionar una Opcion: \n" + 
                "1.configuracion del sistema \n" + 
                "2.CARGA\n" +
                "3. aspiracion completo\n" +
                "4. aspiracion dependencias\n" +
                "5. aspiracion y fregado completo\n" +
                "6. aspiracion y fregado dependencias\n" +
                "7. estado general\n" +
                "8. base de carga\n" +
                "9. salir\n");
         JOptionPane.showInputDialog("la primera opción tiene que ser configuracion del sistema\n" );
        opcion=Integer.parseInt(op);
        switch(opcion){
            case 1:
                // the user have to enter a nbr of metros between 1 && 100
                  for (int k=0;k<habitacionsM.length;k++){        
                        for (i=0;i<habitacion.length;i++){ 
                      habitacionsM[k]=Double.parseDouble(JOptionPane.showInputDialog("introduzca el número de Metros de habitación \n" + habitacion[i] + " entre 1 y 100m: "));                  
                      } 
                    if((habitacionsM[i]<1 || habitacionsM[i]>100))  { 
                 
                         JOptionPane.showMessageDialog( null, "ErrorMsg", "Invalid Metros input", JOptionPane.ERROR_MESSAGE);   
                        }                           
               
                    } 
                
                          
            case 2:
               // CARGA Establishes the level of the battery (between 0 and 100)
             String carga =JOptionPane.showInputDialog("Indica el nivel de carga del aspirador 0%...100%");
               cargaEstablecida=Double.parseDouble(carga);
              while(cargaEstablecida<0 || cargaEstablecida>100){ 
              JOptionPane.showInputDialog(null,"Indica de nuevo el nivel de carga del aspirador 0%...100%",JOptionPane.ERROR_MESSAGE);   
                  cargaEstablecida=Double.parseDouble(carga);
              }break;
            
          case 3:    
              /*ASPIRACIÓN.
Modo completo. En este modo, la aspiradora limpia el piso entero. El robot va limpiando habitaciones en función de su batería. Si al entrar en una habitación no le llega la batería para poder completarla entonces la aspiradora se para e informa al usuario que no puede terminar y también informa de las dependencias que ha podido limpiar. */  
                   
              for(int j=0;j<habitacion.length;j++){ //loop for the moving in the rooms if there is charge
                        
                          for(int m=0;m<habitacionsM.length;m++){
                               limpiarNeedCharge=habitacionsM[m]*0.15;
                               while(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                          }
                          
                          cargaActual=cargaEstablecida-limpiarNeedCharge;
                          
                      }
                      cargaActual=0;
                      limpiarNeedCharge=0;
                break;
            case 4:
               String num= JOptionPane.showInputDialog("introduzca el numero de habitaciones quieres limpiar:");
                x=Integer.parseInt(num);
               
                  
                 for (i=0;i<habPermanente.length;i++){ 
                         String h= JOptionPane.showInputDialog("introduzca el habitaciones que quieres limpiar:");
                          habPermanente[x]=String.valueOf(h);
                       for(int j=0;j<habPermanenteM.length;j++){ 
                         
                          habPermanenteM[x]=Double.parseDouble(JOptionPane.showInputDialog("introduzca el número de Metros de habitación \n" + habPermanente[i] + " entre 1 y 100m: "));                  
                             limpiarNeedCharge=habPermanenteM[i]*0.15;
                               while(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                        }
                                                                 
                    }
                      cargaActual=0;
                      limpiarNeedCharge=0;
                      break;
                
                
            case 5:
                for(int j=0;j<habitacion.length;j++){ //loop for the moving in the rooms if there is charge
                        
                        for(int m=0;m<habitacionsM.length;m++){ //loop for habitaciones metters
                                limpiarNeedCharge=habitacionsM[m]*2.25;
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
            case 6:
                
                
                
                
            case 7://estado general\n" +
               Frame frame=null;
                
                
                
                
            default: JOptionPane.showMessageDialog(null,"elija una opcion valida\n","Error Opcion",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
           
        }
        
       
        // a loop with the condition of Metros between 1 and 100
            
             }   
        
        
        
    }
    
    
            
            
            
          // }
            
      
        
    
    
    
//}

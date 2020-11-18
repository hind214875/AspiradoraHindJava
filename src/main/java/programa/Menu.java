package programa;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
         int i = 0;
         double RestCharge=0;//equation to count how much charge will rest in asperadora after limpiar
         String[] habitacion = {"Cocina", "Baño", "salón", "dormitorio1", "dormitorio2"};
         double[] habitacionsM= new double[5];//declare list of 5 intereges "the metters that the user will introduce for our 5habitaciones"
         double cargaEstablecida=0;// value charge the user enter in first opcion "configuration del sistema"
         double limpiarNeedCharge=0;// how much charge needing for cleaning the room where is the aspiradora now
         double cargaActual;//the value of charge after cleaning
         int x=0;
         int k;
         double[] habPermanenteM= new double[x];//the permanent list for stocking the metros of habitacions that a user will choose, for "modo dependencias"
         String[] habPermanente= new String[x];
         String aspiraPlace="";//the place where is the aspiradora now 
         double MettersCasa=0;//thesum of how much metters the casa have 
           // case 1:
                               // JOptionPane.showInputDialog("by default you house have por defecto tu casa tiene\n: 1 cocina ,1 sala ,1 cuarto de baño ,2 dormitorios \n"
                //        + "quieres cambialo " ,JOptionPane.YES_NO_OPTION );
                
                //if (){
                    
              //JOptionPane.showConfirmDialog(null,"la primera opción tiene que ser configuracion del sistema\n" );// is obligatory to choose first option first befor anything for giving the information 
              
                  //}
            menuLoop:     
            while(true) { 
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
        
                opcion=Integer.parseInt(op);
        switch(opcion){   
                     
            case 1:             
                // the user have to enter a nbr of metros between 1 && 100
                /*loop taking mettres of every habitation and stocke it in ARRAY "habitacionM " 
                then inside the loop i put the condition if the numero of metters <1 or >100 
                the program show Error msg */
                for (k=0;k<habitacionsM.length;k++){
                     habitacionsM[k]=Double.parseDouble(JOptionPane.showInputDialog("introduzca el número de Metros de habitación \n" + (k+1) + "," + " entre 1 y 100m: "));                                   
                    
                          while((habitacionsM[k]<1 || habitacionsM[k]>100)){ 
                           JOptionPane.showMessageDialog( null, "Entrada de medidores no válida", "ErrorMsg", JOptionPane.ERROR_MESSAGE); 
                           JOptionPane.showMessageDialog(null,"ingrese un número válido, los metros deben ingresar 1 y 100");
                            k=1; 
                          }  
                           
                            MettersCasa+=habitacionsM[k]; //operacion para saber cuando metros en la casa        
                } 
                                               
            case 2:
               // CARGA Establishes the level of the battery (between 0 and 100)
             String carga =JOptionPane.showInputDialog("Indica el nivel de carga del aspirador 0%...100%");
               cargaEstablecida=Double.parseDouble(carga);
               
               // condition to check if the level of charge <0 or >100 then i show the error msg
              while(cargaEstablecida<0 || cargaEstablecida>100){ 
              carga=JOptionPane.showInputDialog(null,"Indica de nuevo el nivel de carga del aspirador 0%...100%",JOptionPane.ERROR_MESSAGE);   
                  cargaEstablecida=Double.parseDouble(carga);
              }
                  JOptionPane.showMessageDialog(null,"tu insperadora tiene\n" + cargaEstablecida + "%" + " " + "de carga" );
               
            
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
                         JOptionPane.showMessageDialog(null, "tu" + habitacion[j] + "limpiado");  
                      }
              
                      cargaActual=0;
                      limpiarNeedCharge=0;
                     
                
            case 4:
               String num= JOptionPane.showInputDialog("introduzca el numero de habitaciones quieres limpiar:");
                x=Integer.parseInt(num);
               
                  
                 for (i=0;i<x;i++){ 
                         String h= JOptionPane.showInputDialog("introduzca el habitaciones que quieres limpiar:");//introduce the habitation you want to clean 
                          habPermanente[x]=String.valueOf(h);
                       for(int j=0;j<x;j++){ 
                         
                          habPermanenteM[x]=Double.parseDouble(JOptionPane.showInputDialog("introduzca el número de Metros de habitación \n" + habPermanente[i] + " entre 1 y 100m: "));                  
                             limpiarNeedCharge=habPermanenteM[i]*0.15;
                             
                               while(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                        }
                                                                 
                    }
                      cargaActual=limpiarNeedCharge;
                      
                
                
            case 5:
                //   "5. aspiracion y fregado completo\n" 
                /*The vacuum cleaner cleans the whole house. The robot is going to clean rooms in function of the battery 
                remaining. If the robot enters a room and it doesn’t have sufficient battery to clean it the robot stops
                and informs the user that it can’t finish and informs of which rooms it has cleaned so far.
*/         while(cargaEstablecida>3){
                for(int j=0;j<habitacion.length;j++){ //loop for the moving in the rooms if there is charge
                        
                        for(int m=0;m<habitacionsM.length;m++){ //loop for habitaciones metters
                                limpiarNeedCharge=habitacionsM[m]*2.25;
                                RestCharge=cargaEstablecida-limpiarNeedCharge;
                                
                             if(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               } 
                        }
                                
                       JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga es menos de 3%",JOptionPane.ERROR_MESSAGE);
                               habPermanente[j]=String.valueOf(j);
                               aspiraPlace= habPermanente[j];
                                }
          
                    } 
                //limpiarNeedCharge+=limpiarNeedCharge;
                
                      cargaActual=RestCharge;
                      limpiarNeedCharge=0;
                      RestCharge=0;
                      
            case 6:
                        num = JOptionPane.showInputDialog("introduzca el numero de habitaciones quieres limpiar:");
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
                      RestCharge=0;   
                
                
                
            case 7://estado general\n" +//This option has to show:
                     //current date and time 
                     //level of battery,place where the robot is located,rooms and m^2 of the house
               
               DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
               String formattedDate = formatter.format(LocalDate.now());
               JOptionPane.showInternalMessageDialog(null, "la fecha y hora ahora es:" + formattedDate + "\n" + "y el nivel de batería ahora es:" + RestCharge
               + "la aspiradora en :\n" + aspiraPlace +"y tienes:\n" + habitacion + "tu casa tiene:\n" + MettersCasa);
                
           
            case 8:
               // BASE DE CARGA
            // This indicates the robot to return to the charge base and charge the battery till it gets to 100%
             for(int c=0;c<101;c++){
                
                 System.out.print("\n" + c +"%");
                 
             }
            JOptionPane.showMessageDialog(null, "la carga de la batería est:100%");
            
            case 9:
                   JOptionPane.showMessageDialog(null,"Quieres Salir","!",JOptionPane.WARNING_MESSAGE);
                               System.exit(0);
        }
            }  
         
        
       }  
    }
    
     
            
            
            
          // }
            
      
        
    
    
    
//}

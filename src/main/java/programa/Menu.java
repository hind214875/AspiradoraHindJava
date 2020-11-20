package programa;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Hind
 */
public class Menu  {
    public static void main(String[] args) {
         double NmrEstancia;
         int i = 0;
         double RestCharge=0;//equation to count how much charge will rest in asperadora after limpiar
         String[] habitacion = {"Cocina", "Baño", "salón", "dormitorio1", "dormitorio2"};
         double[] habitacionsM= new double[5];//declare list of 5 intereges "the metters that the user will introduce for our 5habitaciones"
         double cargaEstablecida=0;// value charge the user enter in first opcion "configuration del sistema"
         double limpiarNeedCharge=0;// how much charge needing for cleaning the room where is the aspiradora now
         double cargaActual=0;//the value of charge after cleaning
         int x=0;
         int k;
         int c;
         double[] habPermanenteM= new double[x];//the permanent list for stocking the metros of habitacions that a user will choose, for "modo dependencias"
         String[] habPermanente= new String[x];
         String aspiraPlace="";//the place where is the aspiradora now 
         double MettersCasa=0;//thesum of how much metters the casa have 
         String BaseDeCarga="Cocina";
         double sumLimpiarCharge=0; 
         double M=0;
         double cg=0;
         
         // the user have to login first then the program show the menu ,login should be "login" and password "password"
         String user=JOptionPane.showInputDialog(null, "Login");
         String password=JOptionPane.showInputDialog(null, "Password");
         while("login".equals(user) && "password".equals(password)){ 
             JOptionPane.showMessageDialog(null, "Login ok "); //if it the user enter the right value of user and password then he get msg that he login and he can see the menu
              
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
                           
                            M+=habitacionsM[k]; //operacion para saber cuando metros en la casa        
                } 
                 MettersCasa=M;                              
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
Modo completo: En este modo, la aspiradora limpia el piso entero. El robot va limpiando habitaciones en función de su batería. 
              Si al entrar en una habitación no le llega la batería para poder completarla entonces la aspiradora se para
              e informa al usuario que no puede terminar y también informa de las dependencias que ha podido limpiar. */  
                   
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
                
        
                     
                
            case 4:
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
                      
                
                
            case 5:
                //   "5. aspiracion y fregado completo\n" 
                /*The vacuum cleaner cleans the whole house. The robot is going to clean rooms in function of the battery 
                remaining. If the robot enters a room and it doesn’t have sufficient battery to clean it the robot stops
                and informs the user that it can’t finish and informs of which rooms it has cleaned so far.
*/      
                      
            case 6:
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
                     cg=cargaActual;
                
                
            case 7://estado general\n" +//This option has to show:
                     //current date and time 
                     //level of battery,place where the robot is located,rooms and m^2 of the house
               String timeStamp = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());

               JOptionPane.showInternalMessageDialog(null, "la fecha y hora ahora es:\n" + timeStamp + " \n" + "  el nivel de batería ahora es:\n" + " " + cg
               + "\n" +"la aspiradora en :\n" + BaseDeCarga + "\n " + "y tienes:\n" + "Cocina ,Baño ,salón ,dormitorio1 ,dormitorio2"+ "\n " + "tu casa tiene:\n" + MettersCasa);
                
           
            case 8:
               // BASE DE CARGA
            // This indicates the robot to return to the charge base and charge the battery till it gets to 100%
                
             for(c=0;c<101;c++){
                
                 System.out.print("\n" + c +"%");
                 
             }
             while(c==101){
                JOptionPane.showMessageDialog(null, "la carga de la batería est:100%");
                 cargaEstablecida=c;
                
            }
            
            
            case 9:
                   JOptionPane.showMessageDialog(null,"Quieres Salir","!",JOptionPane.WARNING_MESSAGE);
                               System.exit(0);
        }
         }
         
             JOptionPane.showMessageDialog(null, "Login Failed");
              
         
           }       
              
    }
  
              
         

        
        
    




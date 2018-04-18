
package exaprac2;

import javax.swing.JOptionPane;

/**
 * Nombre de la clase: CarlosCampos
 * Fecha: 18/04/2018
 * Version:1.0
 * copyRight Carlos Campos
 * @author Laboratorio2
 */
public class CarlosCampos {
    public static void main(String[] args) {
        
        
        //declaracion de vectores y variables
        boolean condicion=true;
        int opcion=0;
        int contador=100;
        String nombre[]= new String[contador];
        double salarioxhora[]= new  double[contador];
        double cantidadH[]= new double[contador];
        double salarioNeto[]= new double[contador];
        boolean estado=true; 
        double salario[]= new double[contador];
        int i=0;
          int count=0;
          int sup=0;
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("..::MENU PRINCIPAL"
                                                                   +"\n 1. Agregar Empleado"
                                                                   +"\n 2. Calcuar Planilla"
                                                                   +"\n 3. Salir"));
            switch(opcion)
            {
                case 1:
                    estado=true;
                    do
                    {
                     nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre del emleado No. "+i+1 );
                     salarioxhora[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora del emleado No. "+i+1 ));
                     cantidadH[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de horas trabajadas por el emleado No. "+i+1 ));
                     
                     salario[i]=cantidadH[i]*salarioxhora[i];
                     salarioNeto[i]=salario[i]-(salario[i]*0.10);
                     
                   
                    i=i+1;
                    
                    
                  
                    count=count+1;
                    estado=false;
                    }while(estado==true);
                    
                    break;
                    
                case 2:
                  
                            
                    for(int y=0; y<count; y++)
                    {
                      if(salarioNeto[y]<800)
                      {
                          sup=sup+1;
                      }
                    }
                    
                    for(int k=0; k<count ; k++)
                    {
                      JOptionPane.showMessageDialog(null, "DATOS DE LOS EMPLEADOS:"+count
                                                    + "\n nombre:"+nombre[k]
                                                    +"\n horas trabajadad: " +cantidadH[k]
                                                    +"\n precio por hora: "+ salarioxhora[k]
                                                    +"\n salario: "+salario[k]
                                                    +"\n salario Neto: "+salarioNeto[k]);
                    }
                    
                    JOptionPane.showMessageDialog(null, "DATOS GENERALES: "
                                                        +" \n CANTIDAD DE EMPLEADOS QUE SUPERAN LOS $800: " +sup);
                    
                    break;
                    
                case 3:
                    System.exit(0);
                    break;
                    
                default:JOptionPane.showMessageDialog(null,"Por favor ingrese una opcion valida");
            }
             
        }while(condicion==true);
    }
}

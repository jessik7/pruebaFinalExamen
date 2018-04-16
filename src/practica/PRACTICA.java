
package practica;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *Nombre de la clase: PRACTICA
 * Fecha: 15-04-2018
 * Version: 1.0
 * CopyRight: Jessica Menjivar
 * @author jessica Linares
 */
public class PRACTICA {

    
    public static void main(String[] args) {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat df = new DecimalFormat("##.##");
        
        int cantidad, u=1;
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingre Cantidad de Alumnos"));
        
        String nombre[] = new String[cantidad];
        String apellido[] = new String[cantidad];
        int anioNacimiento[] = new int[cantidad];
        String sexo[] = new String[cantidad];
        double notaTarea1[] = new double[cantidad];
        double notaTarea2[] = new double[cantidad];
        double notaExamen1[] = new double[cantidad];
        double notaExamen2[] = new double[cantidad];
        double notaExamen3[] = new double[cantidad];
        
        for(int i=0; i<cantidad; i++)
        {
            JOptionPane.showMessageDialog(null, "Alumno: "+ u , "Mensaje", 1);
            nombre[i] = JOptionPane.showInputDialog("Ingrese Nombre: ");
            apellido[i] = JOptionPane.showInputDialog("Ingrese Apellido: ");
            anioNacimiento[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Anio de Nacimiento: "));
            JOptionPane.showMessageDialog(null, "Ingrese" + "\n" +
            "F si es Femenino " + "\n" +
            "M si es Masculino"
            , "OJO",2);
            sexo[i] = JOptionPane.showInputDialog("Ingrese Sexo: ");
            notaTarea1[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de tarea 1 :"));
            notaTarea2[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de tarea 2 :"));
            notaExamen1[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de Examen 1: "));
            notaExamen2[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de Examen 2: "));
            notaExamen3[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de Examen 3: "));
            u++;
        }
        
        //Operaciones
        
        int edad[] = new int[cantidad];
        double smTarea[] = new double[cantidad];
        double smExamen[] = new double[cantidad];
        double promedioTarea[] = new double[cantidad];
        double promedioExamen[] = new double[cantidad];
        double promedioFinal[] = new double[cantidad];      
        double porcentajeTarea[] = new double[cantidad];
        double porcentajeExamen[] = new double[cantidad];
        
        for(int i=0; i<cantidad; i++)
        {
            edad[i] = 2018- anioNacimiento[i];
            smTarea[i] = notaTarea1[i] + notaTarea2[i];
            smExamen[i] = notaExamen1[i] + notaExamen2[i];
            
            promedioTarea[i] = (smTarea[i] / 2);
            promedioExamen[i] = (smExamen[i] / 2);
            
            porcentajeTarea[i] = promedioTarea[i] * 0.4;
            porcentajeExamen[i] = promedioExamen[i] * 0.6;
            
            promedioFinal[i] = porcentajeTarea[i] + porcentajeExamen[i]; 
            
            
        }
        
        for(int i=0; i<cantidad; i++)
        {
            JOptionPane.showMessageDialog(null, "Datos" + "\n\n" +
                    "Nombre: " + nombre[i] + "\n" +
                    "APellido: " + apellido[i] + "\n" +
                    "Edad: " + edad[i] + "\n" +
                    "Sexo" + sexo[i] + "\n" +
                    "Promedio Tareas: " + df.format(promedioTarea[i]) + "\n" +
                    "Porcentaje de tareas: " + df.format(porcentajeTarea[i]) + "\n\n" +
             
                    "Promedio Examenes: " + df.format(promedioExamen[i]) + "\n" +
                    "Porcentaje de Examenes: " + df.format(porcentajeExamen[i]) + "\n\n" +
                    "Promedio Final: " + df.format(promedioFinal[i])
                    , "Alumnos", 1);        

        }
        
        
  

    }
    
}

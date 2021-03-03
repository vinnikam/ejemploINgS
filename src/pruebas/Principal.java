package pruebas;

import java.util.Date;
import java.util.Scanner;
import dao.Cliente;
import java.io.File;
import logica.Prestamo;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Vinni
 */
public class Principal { 
    
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Digite el nombre :");
        String nombre = sc.next();
        System.out.print(" Digite el Fecha de nacimiento :");
        String fechaNac = sc.next();
        System.out.print(" Digite el Valor solicitado :");
        String valor = sc.next();
        System.out.print(" Digite el plazo :");
        String plazo = sc.next();
        
        int elPlazo = Integer.parseInt(plazo);
        Double elvalor = new Double(valor);
        Cliente elCliente = new Cliente(nombre, new Date());
        Prestamo pre = new Prestamo(elCliente, elPlazo, elvalor);
        Double res = pre.hacerSimulacion();
        if (res == null ){
            System.out.println("No tiene edad para simular ");
            
        }else {
            //JOptionPane.showMessageDialog(this, "Su pago mensual es  "+res.toString());
            System.out.println("El valor de la cuota es "+res.toString());
            
        }
        
    }
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);
        System.out.println(File.separatorChar);
        
        
        System.out.println(""+new DecimalFormatSymbols().getDecimalSeparator());
    }
}

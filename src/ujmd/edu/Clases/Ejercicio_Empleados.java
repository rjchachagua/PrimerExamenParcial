package ujmd.edu.Clases;
import java.util.Scanner;

public class Ejercicio_Empleados {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String Nombres, Apellidos, Cargo;
        double Hora, sueldoBase=0, aux, isss, afp, renta,sueldoLiquido;
        
        System.out.println("Ingrese los nombres del empleado");
        Nombres= teclado.nextLine();
        System.out.println("Ingrese los apellidos del empleado");
        Apellidos= teclado.nextLine();
        System.out.println("Ingrese el cargo del empleado");
        Cargo= teclado.nextLine();
        System.out.println("Ingrese las horas trabajadas en el mes");
        Hora= teclado.nextDouble();
        if (Hora>0){
        if (Hora<=160) {
            sueldoBase =(Hora * 9.75);
        }else{
            if (Hora>160) {
                aux=Hora-160;
                sueldoBase=(aux*11.5)+(160*9.75);
            }
        }
        isss=sueldoBase*0.0525;
        afp=sueldoBase*0.0688;
        renta=sueldoBase*0.10;
        sueldoLiquido=sueldoBase-isss-afp-renta;
        System.out.println("Empleado "+Nombres+" "+ Apellidos);
        System.out.println("Salario horas "+sueldoBase);
        System.out.println("Descuento isss "+isss);
        System.out.println("Descuento afp "+afp);
        System.out.println("Descuento renta "+renta);
        System.out.println("Sueldo liquido a pagar "+sueldoLiquido);
        }else{
            System.out.println("Error, las horas trabajadas deben ser mayor a 0");
        }
    }
}

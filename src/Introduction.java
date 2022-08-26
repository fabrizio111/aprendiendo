import javax.swing.*;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args){

        int entero = 828182;
        float decimal= 231.54f;
        char caracter='e';
        Integer noPrimitivo=null;
        String cadena="Hola que tal?";
        final int valor=14; // es un valor constante, no cambia nunca su valor

        System.out.println("La variable entero vale: " + entero);
        System.out.println("La variable decimal vale: " + decimal);
        System.out.println("La variable caracter vale: " + caracter);
        System.out.println("La variable noPrimitivo vale: " + noPrimitivo);
        System.out.println("La variable cadena vale: " + cadena);
        System.out.println("La variable valor vale: " + entero);

        //Entrada y salida de datos
        Scanner entrada = new Scanner(System.in);
        //Guardamos numeros
        /*
        int numero; //puede ser int, double o float
        System.out.println("Digite un número: ");
        numero = entrada.nextInt(); //el nextInt() cambia segun el tipo de dato: float, int, double
        System.out.println("El numero es: "+ numero);
        */
        //Guardamos cadenas
        /*
        String cadena2;
        System.out.println("Digite una cadena: ");
        cadena2= entrada.nextLine();
        System.out.println("La cadena es: "+cadena2);
        */
        String cadena3;
        int entero2;
        char letra;
        double decimal2;

        cadena3= JOptionPane.showInputDialog("Digite una cadena: ");
        entero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); //convierte esto: JOptionPane.showInputDialog("Digite un entero: ") en un entero para que no hayan errores
        letra=JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal2=Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: ")); //convierte esto: JOptionPane.showInputDialog("Digite un entero: ") en un DECIMAL para que no hayan errore

        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena3);
        JOptionPane.showMessageDialog(null,"El numero entero es: "+entero2);
        JOptionPane.showMessageDialog(null,"El caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"El numero decimal es: "+decimal2);

    }
}


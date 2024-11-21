import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//ALEJANDRO ASENCIO GURAU
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char opcionUsuario;
        boolean condicionEntradUser=true;

        //VARIABLES PARA EL CASO A
        boolean condicionNotas;
        int notas,cantAprobados=0,cantSuspensos=0;
        double notaAlumno;

        // VARIABLES PARA EL CASO B
        int numMiembros,edad,tarifaNormal=32;
        String nombre;
        boolean condicionViaje;
        //considero cada descuento distinto al otro
        double aplicarDescuento1=0,aplicarDescuento2=0,aplicarDescuento3=0,aplicarDescuento4=0,noDescuento=0,precioFinal=0;

        while (condicionEntradUser) {
            System.out.println("(a)Aprobados y Suspendidos. "+"\n(b)Billetes a Madrid. "+"\n(c)Salir.");
            System.out.println("Elige una de estas opciones: ");
            opcionUsuario = sc.next().toLowerCase().charAt(0);
            switch (opcionUsuario) {
                case 'a':
                    System.out.println("Introduce el numero de notas para evaluar: ");
                    notas=sc.nextInt();
                    for (int i = 1; i <=notas ; i++) {
                        condicionNotas=true;//Inicialzo la varibel del bucle while con true
                        while (condicionNotas) {
                            System.out.println("La nota del alumno " + i+" :");
                            notaAlumno = sc.nextDouble();
                            if (notaAlumno >= 0 && notaAlumno <= 10) {
                                if (notaAlumno >= 5 && notaAlumno <= 10) {
                                    cantAprobados++;
                                    condicionNotas=false;
                                } else if (notaAlumno >= 0 && notaAlumno <= 4.99) {
                                    cantSuspensos++;
                                    condicionNotas=false;
                                }
                            } else {
                                System.err.println("No cumple con el rango entre 0 y10. Vuelva a introducir la nota");
                            }
                        }
                    }
                    if (cantAprobados>cantSuspensos){
                        System.out.println("Hay mas aprobados");
                    }else {
                        System.out.println("Hay mas suspensos");
                    }
                    break;

                case 'b':
                    System.out.println("Introduce el numero de miembros que lo acompañan(incluyendo a usted): ");
                    numMiembros=sc.nextInt();
                    for (int i = 1; i <=numMiembros ; i++) {
                        condicionViaje=true;//Inicialzo la varibel del bucle while con true
                            System.out.println("Introduce los datos del acompañante " + i);
                            System.out.println("Nombre: ");
                            sc.nextLine();//basura, para que no me salte el siguiente scanner
                            nombre = sc.nextLine();
                        while (condicionViaje) {
                            System.out.println("Edad de "+nombre+" :");
                            edad = sc.nextInt();
                            if (edad>0) {
                                if (edad >= 65) {
                                    aplicarDescuento1 = ((double)tarifaNormal * ((double) 10 / 100));
                                    condicionViaje=false;
                                } else if (edad >= 12 && edad <= 15) {
                                    aplicarDescuento2 = ((double) tarifaNormal * ((double) 8 / 100));
                                    condicionViaje=false;
                                } else if (edad >= 4 && edad <= 11) {
                                    aplicarDescuento3 = ((double)tarifaNormal * ((double) 35 / 100));
                                    condicionViaje=false;
                                } else if (edad <= 4) {
                                    aplicarDescuento4 = ((double)0*tarifaNormal);
                                    condicionViaje=false;
                                }else {
                                    noDescuento=tarifaNormal;
                                    condicionViaje=false;
                                }
                            }else{
                                System.err.println("ERROR: La edad no puede ser negativo o 0");
                            }
                            precioFinal=aplicarDescuento1+aplicarDescuento2+aplicarDescuento3+aplicarDescuento4+noDescuento;
                        }
                    }
                    System.out.println("EL precio final que ha de pagar es "+precioFinal+" €");
                    break;
                case 'c':
                    System.out.println("Saliendo del programa...");
                    condicionEntradUser=false;
                    break;
            }
        }
        sc.close();
    }
}
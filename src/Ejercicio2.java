import java.util.Scanner;

//ALEJANDRO ASENCIO GURAU
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horas,min,minResto=60,horasResto=24;
        int diferenciaHoras=8,horaContrario;
        String pais,diaSemana="",diaSemanaContrario="";
        char accionUser;
        boolean condicionUsuario=true,condicionAccionUser,condicionPais,condicionSemana;

        //El calculo de las horas no me entraba en la cabeza, al menso he puesto lo que pasaria si es mayor a las 24 horas,
        // cambio de dia de semana y la estructura de control
        while (condicionUsuario){
            condicionPais=true;
            System.out.println("Introduce la hora: ");
            horas=sc.nextInt();
            System.out.println("Introduce los minutos: ");
            min=sc.nextInt();
            sc.nextLine();//Variabel basura, para no saltar el nextLine
            //Bucle que compruebo en caso de no poner los paises indicados(japon/spain), que vuelva para que lo ponga bien
            while (condicionPais) {
                System.out.println("Introduce el nombre del pais(en ingles): ");
                pais = sc.nextLine().toLowerCase();
                switch (pais) {
                    case "spain":
                        condicionSemana=true;
                        while (condicionSemana){
                            System.out.println("Introduce el dia de la semana(en español): ");
                            diaSemana=sc.nextLine();
                            //Me he podido equivocar en el calculo de pasar de un horario a otro en los dias de la semana.
                            switch (diaSemana){
                                case "lunes":
                                    //Con las variables min y horas resto por el min o horas acabado en Resto.EJem:(80-60=20) y asi con las horas y minutos
                                    if (min>=60){
                                        min-=horasResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="martes";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "martes":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="miercoles";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "miercoles":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="jueves";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "jueves":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="viernes";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "viernes":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="sabado";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "sabado":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="domingo";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "domingo":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="lunes";
                                    }
                                    condicionSemana=false;
                                    break;
                                default:
                                    System.out.println("ERROR: Dia no reconocido");
                            }
                        }
                        //EN caso de que sea mayor a 24 horas el dia del contrario cambia
                        if (horas>=24) {
                            System.out.println(pais + " " + horas + ":" + min + " " + diaSemana + "; la salida seria Japon " + diferenciaHoras + ":" + min + " ---> " + diaSemanaContrario);
                        }else {
                            System.out.println(pais + " " + horas + ":" + min + " " + diaSemana + "; la salida seria Japon " + diferenciaHoras + ":" + min + " ---> " + diaSemana);
                        }

                        condicionPais=false;
                        break;
                    case "japon":
                        condicionSemana=true;
                        while (condicionSemana){
                            System.out.println("Introduce el dia de la semana(en español): ");
                            diaSemana=sc.nextLine();
                            //Me he podido equivocar en el calculo de pasar de un horario a otro en los dias de la semana.
                            switch (diaSemana){
                                case "lunes":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    //Con las variables min y horas resto por el min o horas acabado en Resto.EJem:(80-60=20) y asi con las horas y minutos
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="martes";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "martes":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="miercoles";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "miercoles":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="jueves";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "jueves":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="viernes";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "viernes":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="sabado";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "sabado":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="domingo";
                                    }
                                    condicionSemana=false;
                                    break;
                                case "domingo":
                                    if (min>=60){
                                        min-=minResto;
                                        horas++;
                                    }
                                    if (horas>=24){
                                        horas-=horasResto;
                                        diferenciaHoras+=horas;//incremento con la suma del horario del contrario
                                        diaSemanaContrario="lunes";
                                    }
                                    condicionSemana=false;
                                    break;
                                default:
                                    System.out.println("ERROR: Dia no reconocido");
                            }
                        }
                        diferenciaHoras+=horas;
                        //EN caso de que sea mayor a 24 horas el dia del contrario cambia
                        if (horas>=24) {
                            System.out.println(pais + " " + horas + ":" + min + " " + diaSemana + "; la salida seria Japon " + diferenciaHoras + ":" + min + " ---> " + diaSemanaContrario);
                        }else {
                            System.out.println(pais + " " + horas + ":" + min + " " + diaSemana + "; la salida seria Japon " + diferenciaHoras + ":" + min + " ---> " + diaSemana);
                        }
                        condicionPais=false;
                        break;
                    default:
                        System.out.println("Error: pais no reconocido");
                }
            }
            //Bucle que compruebo en caso de no poner y o n, que vuelva para que lo ponga bien
            condicionAccionUser=true;
            while (condicionAccionUser) {
                System.out.println("Desea volver a utlizar el progrma(y/n): ");
                accionUser = sc.next().toLowerCase().charAt(0);
                switch (accionUser) {
                    case 'y':
                        condicionUsuario = true;
                        condicionAccionUser=false;
                        break;
                    case 'n':
                        System.out.println("Saliendo del progrma...");
                        condicionUsuario = false;
                        condicionAccionUser=false;
                        break;
                    default:
                        System.err.println("Error: repita la accion");
                }
            }
        }
        sc.close();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
     /*   Empresa E1 = new Empresa();
        System.out.println("ingrese el nombre del personaje:");
       E1.setNombre(sc.next());

        System.out.println("ingrese el nivlel:");
        E1.setNivel(sc.nextInt());

        System.out.println("ingrese la experiencia:");
        E1.setExperiencia(sc.nextInt());

        System.out.println("ingrese la vida:");
        E1.setVida(sc.nextInt());

        System.out.println("ingrese si esta vivo:");
        E1.setVivo(sc.nextBoolean());
*/
        //menu de opciones
        List<Empresa> lst =new ArrayList<>();
        int op;



         do{
             System.out.println(" 1. CREAR OBJETO");
             System.out.println(" 2. MOSTRAR LISTA");
             System.out.println(" 3. SALIR");
             System.out.println(" 4. SELECCIONA UNA OPCION");
             op = sc.nextInt();
             switch (op ){
                 case 1:
                     System.out.println(" 1. CREAR OBJETO");
                     System.out.println("INGRESE EL CODIGO DE LA PERSONA");
                     String codigo = sc.next();
                     System.out.println("INGRESE EL NIVEL DE LA PERSONA");
                     int nivel = sc.nextInt();
                     System.out.println("INGRESE LA EXPERIENCIA");
                     int XP = sc.nextInt();
                     System.out.println("INGRESE LA VIDA");
                     int LIFE = sc.nextInt();
                     System.out.println("INGRESE SI ESTA VIVO ");
                     Boolean VIVO = sc.nextBoolean();
                     Empresa E1 = new Empresa(codigo , nivel , XP, LIFE , VIVO );

                     lst.add( E1);






           /*  case 2:
                 int experiencia;
                 System.out.println("Cuanta experiencia desea");
                 experiencia = sc.nextInt();
                 E1.ganarExperiencia(experiencia);
                 break;
             case 3:
                 int subirNivel;
                 System.out.println("cuanto nivel tiene");
                 subirNivel = sc.nextInt()
                 E1.subirNivel (subirNivel);
             case 4:
                 int recibirDanio;
                 System.out.println("cuanto daño tiene");
                 recibirDanio = sc.nextInt();
                 E1.recibirDanio(recibirDanio);
                 break;
             case 5:
                 int curarse;
                 System.out.println("esta curado");
                 curarse = sc.nextInt();
                 E1.curarse(curarse);
                 break;
             case 6:
                 System.out.println("Estado final");
                 E1.mostrarEstado();
                 break;
            */
                 case 2:
                     System.out.println("2.MOSTRAR LISTA");
                     for (Empresa E2: lst){
                         System.out.println(E2);
                     }
                     break;
                 default:
                     System.out.println("Opcion invalida");

                 case 3:
                     String Empresa1;
                     System.out.println("INGRESE EL CODIGO DEL PRODUCTO BUSCAR");
                     Empresa1 = sc.next();

                     if (lst.isEmpty()){
                         System.out.println("LA LISTA NO TIENE ELEMENTOS");
                     }

                     Empresa1 =null;


                     for (Empresa E: lst){
                         if (E.getNombre().equalsIgnoreCase(Empresa1)){
                             E1 = E;
                             System.out.println(E1.toString());
                         }
                     }


             }

         }while (op !=3);


    }
}
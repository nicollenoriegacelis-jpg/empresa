import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empresa E1 = new Empresa();
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

        //menu de opciones
        int opcion;
        {
         System.out.println(" 1. Mostrar estado");
         System.out.println(" 2. Ganar experiencia");
         System.out.println(" 3. subir nivel");
         System.out.println(" 4. aplicar daño");
         System.out.println(" 5. curarse ");
         System.out.println(" 5. Mostrar estado final ");
         System.out.println(" 6. seleccione una opcion  ");
         opcion = sc.nextInt();

         switch (opcion ){
             case 1:
                 E1.mostrarEstado();
                 break;
             case 2:
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
             default:
                 System.out.println("Opcion invalida");
         }



        }



    }
}
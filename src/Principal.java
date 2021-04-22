import java.util.Scanner;

public class Principal {

    public static boolean iniciarSesion (int tipo, String email, String contraseña){
        switch (tipo){
            case 1: //Recepcionista
                break;
            case 2: //Paciente
                break;
            case 3: //Medico
                break;
            case 4: //Administrador
                break;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Boolean inicioSesion = false;
        int tipo_usuario=0;
        String email, contraseña;

        System.out.println("   --- Bienvenido a MediTech (varsión 1.0) --- \n");

        do {
            //Preguntamos el tipo de usuario
            System.out.print(
                    "\t 1) Recepcionista\n" +
                    "\t 2) Paciente\n" +
                    "\t 3) Medico\n" +
                    "\t 4) Administrador\n" +
                    "Introduce el tipo de usuario con el que vas a iniciar sesion: ");

            if(input.hasNextInt())
                tipo_usuario = input.nextInt();

            else
                System.out.println("ERROR al introducir el tipo de usuario");


            input.nextLine(); //limpiar buffer Scanner

            //Solicitamos los datos de inicio de sesion
            System.out.print("Introduce el email:");
            email = input.nextLine();
            System.out.print("Introduce la contraseña:");
            contraseña = input.nextLine();

            inicioSesion = iniciarSesion(tipo_usuario, email, contraseña);
            if (inicioSesion) {
                System.out.print("Has iniciado sesión correctamente");
            } else {
                System.out.print("Los datos introducidos no son correctos");
            }
        }while (inicioSesion==false);

    }
}

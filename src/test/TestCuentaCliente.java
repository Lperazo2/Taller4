package test;

import dominio.*;
import java.util.Scanner;

public class TestCuentaCliente {

    static Scanner entrada;

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int opc;
        boolean salir = false;
        while (!salir) {
            System.out.println("---------------- MENU ----------------\n\n"
                    + "1.-CREAR CLIENTE\n2.-ASIGNAR CUENTA O CUENTAS AL CLIENTE");
            System.out.println("3.-DEPOSITAR\n4.-RETIRAR\n5.-CONSULTAR SALDO"
                    + "\n6.-SALIR\n--->");
            opc = ent.nextInt();
        int deposito=10,retiro=10,saldo=10;
            switch (opc) {
                case 1:
                    System.out.println("CREAR CLIENTE");
                    Cuenta cu0 = new Cuenta(" ");
                    Registrar_Clientes(cu0);
                    break;
                case 2:
                    System.out.println("ASIGNAR CUENTA O CUENTAS AL CLIENTE");
                    System.out.println("ELJA LA OPCION QUE DESEE: \n1.-CUENTA DE AHORROS"
                            + "\n2.-CUENTA CORRIENTE\n3.-CUENTA AMIGA");
                    int opci = entrada.nextInt();
                    if (opci == 1) {
                        int[] detalles = new int[2];
                        Cuenta cu1 = new Cuenta("CUENTA DE AHORROS");
                        Cliente CA = new Cliente(" ", 0, detalles);
                        GenerarCuenta(CA, cu1);
                        cu1.MostrarDatosCuenta();
                    }
                    if (opci == 2) {
                        Cuenta cu2 = new Cuenta("CUENTA CORRIENTE");
                        int[] detalles = new int[2];
                        Cliente CA = new Cliente(" ", 0, detalles);
                        GenerarCuenta(CA, cu2);
                        cu2.MostrarDatosCuenta();

                    }
                    if (opci == 3) {
                        Cuenta cu3 = new Cuenta("CUENTA AMIGA");
                        int[] detalles = new int[2];
                        Cliente CA = new Cliente(" ", 0, detalles);
                        GenerarCuenta(CA, cu3);
                        cu3.MostrarDatosCuenta();
                    }

                    break;
                case 3:
                    System.out.println("INGRESE LA CANTIDAD A DEPOSITAR");
                    deposito =entrada.nextInt();
                    break;
                    
                case 4:
                    System.out.println("INGRESE LA CANTIDAD A RETIRAR");
                    retiro =entrada.nextInt();
                    break;
                    
                case 5:
                    System.out.println("SU SALDO ACTUAL ES:");
                        System.out.println((retiro)+((deposito))+" $ Dolares");
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA.. INTENTELO DE NUEVO");

            }
        }
    }

    public static void Registrar_Clientes(Cuenta cu) {
        entrada = new Scanner(System.in);
        String nombre;
        int cedula;
        int[] Datos_cuenta = new int[2];
        System.out.print("INGRESE LOS NOMBRES COMPLETOS DEL USUARIO: ");
        nombre = entrada.nextLine();
        System.out.print("INGRESE EL NUMERO DE CEDULA: ");
        cedula = entrada.nextInt();
        Datos_cuenta[0] = 0;
        Datos_cuenta[1] = 0;
        Cliente Cli = new Cliente(nombre, cedula, Datos_cuenta);
        cu.AgregarClientes(Cli);
        System.out.println(Cli);

    }

    public static void GenerarCuenta(Cliente Cli, Cuenta Cue) {
        entrada = new Scanner(System.in);
        int[] Datos_cuenta = new int[2];
        int codigo;
        int saldo;
        System.out.println("SE HA GENERADO SU CUENTA");
        codigo = (int) Math.floor(Math.random() * (205000 - 200000 + 1) + 200000);
        System.out.println("SU NUMERO DE CUENTA ES: " + codigo);
        System.out.println("INGRESE EL MONTO CON EL QUE QUIERE INICIALIZAR SU CUENTA: ");
        saldo = entrada.nextInt();
        Datos_cuenta[0] = codigo;
        Datos_cuenta[1] = saldo;
        Cliente cli = new Cliente(Cli.getNombre(), Cli.getCedula(), Datos_cuenta);
        System.out.println(cli);

    }
}

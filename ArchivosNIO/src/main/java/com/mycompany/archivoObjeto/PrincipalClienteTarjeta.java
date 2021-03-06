/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.archivoObjeto;

import java.util.Scanner;

/**
 *
 * @author FERMIN
 */
public class PrincipalClienteTarjeta {
    public static void main(String[] args) {
        int opc=0;
        OperacionesClienteTarjeta obj = new OperacionesClienteTarjeta();
        boolean continuar = true;
        Scanner leer=new Scanner(System.in);
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Crear Archivo");
            System.out.println("2. Registrar Cliente_Tarjeta");
            System.out.println("3. Guardar los registros");
            System.out.println("4. Mostrar Datos");
            System.out.println("5. Bloquear la tarjeta");
            System.out.println("6. Depositar dinero");
            System.out.println("7. Retirar dinero");
            System.out.println("8. Salir");
            System.out.println("Digite una opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    obj.crearArchivo();
                    break;
                case 2:
                    String res="s";
                    while(res.equalsIgnoreCase("s")){
                        obj.crearClienteTarjeta();
                        System.out.println("¿Desea seguir registrando clientes S/N?");
                        res=leer.nextLine();
                    }
                    break;
                case 3:
                    obj.guardarObjetos();
                    break;
                case 4:
                    obj.leerClientes();
                    obj.mostrarCliente();
                    break;
                case 5:
                    obj.leerClientes();
                    System.out.println("Digite el numero de cedula del cliente");
                    int c=leer.nextInt();
                    obj.cambiarEstado(c);
                    obj.guardarObjetos();
                    break;
                case 6:
                    obj.leerClientes();
                    System.out.println("Digite el numero de cedula");
                    int ced=leer.nextInt();
                    System.out.println("Digite el monto que desea depositar");
                    double m=leer.nextDouble();
                    obj.depositar(ced, m);
                    obj.guardarObjetos();
                    break;
                case 7:
                    obj.leerClientes();
                    System.out.println("Digite el numero de cedula");
                    int ce=leer.nextInt();
                    System.out.println("Digite el monto que desea retirar");
                    double mr=leer.nextDouble();
                    obj.retirar(ce, mr);
                    obj.guardarObjetos();
                    break;
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
    
}

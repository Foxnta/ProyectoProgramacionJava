import java.util.Scanner;
public class Principal{
    public static void main(String [] args){
        Principal.mostrarmenu();
    }
    public static void mostrarmenu(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Si ingresa 0: Finaliza el Programa");
            System.out.println("Si ingresa 1: Se piden parametros para alamcenar un vehiculo");
            System.out.println("Si ingresa 2: Informacion de todos los vehiculos");
            System.out.println("Si ingresa 3: Cantidad de Vehiculos");
            System.out.println("Si ingresa 5:Todos los vehiculos entre el 2000-2021");
            System.out.println("Si ingresa 6: Se crea un Sensor con 2 parametros");
            System.out.println("Si ingresa 7: Informacion de todos los sensores almacenados");
            System.out.println("Si ingresa 8: Cantidad de sensores hasta el momento");
            System.out.println("Si ingresa 9: Informacion de todos los sensores de tipo Temperatura");
            System.out.println("Si ingresa 666: Todos los sensores de tipo Temperatura ordenados por valor");
            System.out.println("Ingresa un numero: ");
            int numero = scan.nextInt();

            if (numero==0){
                break;
            }
            else if(numero==1){
                int tamanov = Vehiculo.posAnadir;
                if (tamanov<10){
                    System.out.println("Modelo: ");
                    int modelo = scan.nextInt();
                    System.out.println("Marca: ");
                    String marca = scan.nextLine();
                    System.out.println("Valor Comercial: "); 
                    double valorComercial = scan.nextDouble(); 
                    System.out.println("Color: ");
                    String color = scan.nextLine();
                    // Preguntar cuando se ejecuta el segundo constructor de 3 atributos
                    Vehiculo Objvehiculo = new Vehiculo(modelo,marca,valorComercial,color); 
                }
                else{
                    System.out.println("Error base de datos llena");
                }
            }
            else if(numero==2){
                //Imprimir toda la informacion de los objetos vehiculos 
            }
            else if(numero==3){
                //Imprimir la cantidad de vehiculos almacenados
                System.out.println("cantidad de vehiculos almacenados: "+ Vehiculo.cantidadVehiculos());
            }
            else if(numero==4){
                //imprimir info por pantalla de los verdes    
            }
            else if(numero==5){
                //imprimir info de los vehículos que tengan modelo entre 2000 y 2021 
            }
            else if(numero==6){
                int tamanos = Sensor.posAnadir;
                if (tamanos<8){
                    
                    System.out.println("Tipo: ");
                    String tipo = scan.nextLine();
                    System.out.println("Valor: "); 
                    double valor = scan.nextDouble(); 
                  
                    // Preguntar cuando se ejecuta el segundo constructor de 3 atributos
                    Sensor objSensor = new Sensor(tipo,valor); 
                }
                else{
                    System.out.println("Error base de datos llena");
                }
            }
            else if(numero==7){
                //Imprimir toda la informacion de los objetos sensores
            }
            else if(numero==8){
                //Imprimir la cantidad de sensores almacenados
                System.out.println("cantidad de sensores almacenados: "+ Sensor.cantidadSensores());
            }
            else if(numero==9){
                //imprimir info por pantalla de los tipo temperatura   

            }
            else if(numero==666){

                // muestre por pantalla los sensores tipo temperatura ordenados por valor. 
                // Para esto deberá crear un nuevo método, que retorne un nuevo arreglo con
                // los sensores tipo temperatura ordenados por valor (el menor valor al principio).
                // Y luego dentro de la ejecución del caso 666, se invoque ese método,
                // se recoja el nuevo arreglo recibido, y se muestre la información de ese arreglo
                // (cree los métodos que considere pertinentes y/o haga las modificaciones pertinentes 
                // // verifique bien a que clases le asigna esas responsabilidades).


            }

            
            

        }
    }
}
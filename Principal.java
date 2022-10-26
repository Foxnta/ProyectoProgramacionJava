import java.util.Scanner;
public class Principal{
    public static void main(String [] args){
        Principal.mostrarmenu();
    }
    public static void mostrarmenu(){
        try (Scanner scan = new Scanner(System.in)) {
            while(true){
                System.out.println("Si ingresa 0: Finalizar el Programa");
                System.out.println("Si ingresa 1: Almacenar un vehiculo");
                System.out.println("Si ingresa 2: Informacion de todos los vehiculos");
                System.out.println("Si ingresa 3: Cantidad de vehiculos");
                System.out.println("Si ingresa 4: Informacion de todos los vehiculos verdes");
                System.out.println("Si ingresa 5: Todos los vehiculos entre el 2000-2021");
                System.out.println("Si ingresa 6: Almacenar un sensor");
                System.out.println("Si ingresa 7: Informacion de todos los sensores almacenados");
                System.out.println("Si ingresa 8: Cantidad de sensores");
                System.out.println("Si ingresa 9: Informacion de todos los sensores de tipo temperatura");
                System.out.println("Si ingresa 666: Todos los sensores de tipo temperatura ordenados por valor");
                System.out.println("Ingresa un numero: ");
                int numero = scan.nextInt();

                if (numero==0){
                    System.out.println("Programa Finalizado "); 
                    break;
                }
                else if(numero==1){
                    int tamanov = Vehiculo.posAnadir;
                    if (tamanov<10){
                        System.out.println("\n");
                        System.out.println("Modelo: ");
                        int modelo = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Marca: ");
                        String marca = scan.nextLine();
                        System.out.println("Valor Comercial: "); 
                        double valorComercial = scan.nextDouble(); 
                        scan.nextLine();
                        System.out.println("Color: ");
                        String color = scan.nextLine();
                        
                        // Preguntar cuando se ejecuta el segundo constructor de 3 atributos
                        if(color.isEmpty()||color.isBlank()){
                            Vehiculo.vehiculos[Vehiculo.posAnadir]= new Vehiculo(modelo,marca,valorComercial);
                        }
                        else{
                            Vehiculo.vehiculos[Vehiculo.posAnadir]= new Vehiculo(modelo,marca,valorComercial,color);
                        }
                        System.out.println("\n");
                        
                        Vehiculo.posAnadir++;
                        
                    }
                    else{
                        System.out.println("\n");
                        System.out.println("Error base de datos llena");
                        System.out.println("\n");
                    }
                }
                else if(numero==2){
                    //Imprimir toda la informacion de los objetos vehiculos   
                    System.out.println("\n");             
                    for(int i=0; i<Vehiculo.posAnadir;i++){
                        System.out.println(Vehiculo.vehiculos[i].toString());                    
                    }                
                    System.out.println("\n");
                }
                else if(numero==3){
                    //Imprimir la cantidad de vehiculos almacenados
                    System.out.println("\n");
                    System.out.println("Cantidad de vehiculos almacenados: "+ Vehiculo.cantidadVehiculos());
                    System.out.println("\n");
                }
                else if(numero==4){
                    //Imprimir info por pantalla de los verdes
                    System.out.println("\n");
                    for(int i=0; i<Vehiculo.posAnadir;i++){
                        if(Vehiculo.vehiculos[i].getColor().equals("verde")){
                            System.out.println(Vehiculo.vehiculos[i].toString());
                        }
                    }
                    System.out.println("\n");
                }
                else if(numero==5){
                    //imprimir info de los vehículos que tengan modelo entre 2000 y 2021 
                    System.out.println("\n");
                    for(int i=0; i<Vehiculo.posAnadir;i++){
                        if(Vehiculo.vehiculos[i].getModelo()>2000 && Vehiculo.vehiculos[i].getModelo()<2021){
                            System.out.println(Vehiculo.vehiculos[i].toString());
                        }
                    }
                    System.out.println("\n");
                }

                else if(numero==6){
                    int tamanos = Sensor.posAnadir;

                    if (tamanos<8){
                        
                        System.out.println("\n");
                        System.out.println("Tipo: ");
                        scan.nextLine();
                        String tipo = scan.nextLine();
                        System.out.println("Valor: "); 
                        double valor = scan.nextDouble(); 
                        scan.nextLine();


                        Sensor.sensores[Sensor.posAnadir]= new Sensor(tipo, valor);
                        Sensor.posAnadir++;
                        System.out.println("\n");
                    }
                    else{
                        System.out.println("\n");
                        System.out.println("Error base de datos llena");
                        System.out.println("\n");
                    }
                }
                else if(numero==7){
                    //Imprimir toda la informacion de los objetos sensores
                    System.out.println("\n");
                    System.out.println(Sensor.toStringSensores());
                    System.out.println("\n");
                }
                else if(numero==8){
                     //Imprimir la cantidad de sensores almacenados
                    System.out.println("\n");                   
                    System.out.println("cantidad de sensores almacenados: "+ Sensor.cantidadSensores());
                    System.out.println("\n");

                }
                else if(numero==9){
                    //imprimir info por pantalla de los tipo temperatura
                    System.out.println("\n");  
                    for(int i=0; i<Sensor.posAnadir;i++){
                        if(Sensor.sensores[i].getTipo().equals("temperatura")){
                            System.out.println(Sensor.sensores[i].toString());
                        }
                    }
                    System.out.println("\n");

                }
                else if(numero==666){

                    // muestre por pantalla los sensores tipo temperatura ordenados por valor. 
                    // Para esto deberá crear un nuevo método, que retorne un nuevo arreglo con
                    // los sensores tipo temperatura ordenados por valor (el menor valor al principio).
                    // Y luego dentro de la ejecución del caso 666, se invoque ese método,
                    // se recoja el nuevo arreglo recibido, y se muestre la información de ese arreglo
                    // (cree los métodos que considere pertinentes y/o haga las modificaciones pertinentes 
                    // // verifique bien a que clases le asigna esas responsabilidades).
                    
                    
                    int cont = 0;
        
                    for(int i=0; i<Sensor.posAnadir;i++){
                        if(Sensor.sensores[i].getTipo().equals("temperatura")){
                            cont++;
                        } 
                    }

                    Sensor [] senTempOrd = Sensor.ordenarSensores(Sensor.sensores);
                    
                    
                    System.out.println("\n");
                    for(int i=0; i<cont;i++){
                        System.out.println(senTempOrd[i].toString());                    
                    } 
                    
                    System.out.println("\n");




                }

            
            }
        }
    }
}
public class Vehiculo
{
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano=10; 
    public  static int posAnadir=0;
    private int modelo;
    private String marca; 
    private double valorComercial; 
    private String color; 

    // -----------------------------------Constructores----------------------------------------
    public Vehiculo(){

    }
    public Vehiculo(int mo,String ma, double va){
        this(mo,ma,va,"verde"); 
    }


    public Vehiculo(int mo,String ma, double va,String co){
        this.modelo=mo;
        this.marca=ma;
        this.valorComercial = va; 
        this.color=co;
        
         
    }

    // --------------------------------Setters and Getters------------------------------------------
    public void setTamano(int tamano){
        Vehiculo.tamano=tamano;
    }
    public int getTamano(){
        return Vehiculo.tamano;
    }
    public void setposAnadir(int posAnadir){
        Vehiculo.posAnadir=posAnadir;
    }
    public int getposAnadir(){
        return Vehiculo.posAnadir;
    }
    public void setModelo(int modelo){
        this.modelo=modelo;
    }
    public int getModelo(){
        return this.modelo;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setValorComercial(double valorComercial){
        this.valorComercial=valorComercial;
    }
    public double getValorComercial(){
        return this.valorComercial;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    // --------------------------------Metodos------------------------------------------


    public String toString(){
        String mensaje;
        mensaje = "Modelo: "+ modelo+ " Marca: " + marca+ " Valor Comercial: "+ valorComercial + " color: " + color;
        return mensaje;
    }

    public static String toStringVehiculos(){
        String mensaje="";
        for(int i=0; i<posAnadir;i++){
            mensaje= mensaje + vehiculos[i].toString()+" / ";
        }
        return mensaje;
    }

    public static int cantidadVehiculos(){
        return posAnadir;
         
    }

}



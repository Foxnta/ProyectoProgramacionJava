public class Sensor {

    public static Sensor[] sensores = new Sensor[8];
    public static int tamano=8; 
    public static int posAnadir=0;
    private String tipo;
    private double valor;
    
    // -----------------------------------Constructores----------------------------------------
    public Sensor(){

    }
    public Sensor(String t, double v){
        this.tipo=t;
        this.valor=v;
    }
    // --------------------------------Setters and Getters------------------------------------------
   
    public void setTamano(int tamano){
        Sensor.tamano=tamano;
    }
    public int getTamano(){
        return Sensor.tamano;
    }
    public void setPosAnadir(int posAnadir){
        Sensor.posAnadir=posAnadir;
    }
    public int getPosAnadir(){
        return Sensor.posAnadir;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setValor(double valor){
        this.valor=valor;
    }
    public double getValor(){
        return this.valor;
    }


    // --------------------------------Metodos------------------------------------------
    public String toString(){
        String mensaje;
        mensaje = "Tipo: "+ tipo+ " Valor: " + valor;
        return mensaje;
    }
    public static String toStringSensores(){
        String mensaje="";
        for(int i=0; i<posAnadir;i++){
            mensaje = mensaje + "/" +  Sensor.sensores[i].toString();     
        }    
        return mensaje;
    }
    public static int cantidadSensores(){
        return posAnadir; 
    }

    public static S

}

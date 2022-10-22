public class Sensor {

    static int[] sensores = new int[8];
    public  int tamano=8; 
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
        this.tamano=tamano;
    }
    public int getTamano(){
        return this.tamano;
    }
    public void setPosAnadir(int posAnadir){
        this.posAnadir=posAnadir;
    }
    public int getPosAnadir(){
        return this.posAnadir;
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
    public String toStringSensores(){
        String mensaje="";
        return mensaje;
    }
    public static int cantidadSensores(){
        return sensores.length; 
    }

}



public class Sensor {

    public static Sensor[] sensores = new Sensor[8];
    public static int tamano=8; 
    public static int posAnadir=0;
    private String tipo;
    private double valor;
    public static int cont;
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
            mensaje = mensaje + "\n" +  Sensor.sensores[i].toString();     
        }    
        
        return mensaje;
    }
    public static int cantidadSensores(){
        return posAnadir; 
    }

    public static Sensor[] ordenarSensores(Sensor[] lista){
       
        Sensor[] sensoressort = new Sensor[8];
        int cont = 0;
        
        for(int i=0; i<Sensor.posAnadir;i++){
            if(sensores[i].getTipo().equals("temperatura")){
                sensoressort[cont]=sensores[i];
                cont++;
            } 
        }

        for (int i=0; i<cont-1;i++){
            int pos_menor;
            Sensor temp;
            pos_menor = i;

            for(int j=i+1; j<cont;j++){
                if (sensoressort[j].getValor()<sensoressort[pos_menor].getValor()){
                    pos_menor=j;
                }
            }
            temp=sensoressort[i];
            sensoressort[i]=sensoressort[pos_menor];
            sensoressort[pos_menor]=temp;
        }

        return sensoressort;
    }

}

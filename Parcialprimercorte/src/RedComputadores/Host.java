
package RedComputadores;


public class Host {
    private String nombre;
    private String SO;
    private String msg;
    private InterfazRed IP;
    private Red red;

    public InterfazRed getIP() {
        return IP;
    }

    public void setIP(InterfazRed IP) {
        this.IP = IP;
    }

    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Red getRed() {
        return red;
    }

    public void setRed(Red red) {
        this.red = red;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
    
    
     public Host (String nombre,String SO){
        this.nombre="PC1";
        this.SO="IOS";
    }
    
    
    public void configurar (int A, int B, int C, int D){
       
    }
    
    public boolean conectar (Red red){
            
       return true;  
    }
    
    public void ping (Host host, String msg){
        
    }
    
    public void ping (String msg){

}
}

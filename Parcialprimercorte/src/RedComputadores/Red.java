
package RedComputadores;


public class Red {
    
    private String nombre;
    private String tipo;
    private int maxhost;
    private Host hostconec;

    public Host getHostconec() {
        return hostconec;
    }

    public void setHostconec(Host hostconec) {
        this.hostconec = hostconec;
    }

    public int getMaxhost() {
        return maxhost;
    }

    public void setMaxhost(int maxhost) {
        this.maxhost = maxhost;
    }
    
    public Red (String nombre,String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     
    public void details(){
        System.out.println("Host en la red: "+nombre);
        System.out.println("----------------------");
        System.out.println("Host: "+hostconec.getNombre());
    }
    
    public boolean isLimitHost(){
        return false;
    }
}



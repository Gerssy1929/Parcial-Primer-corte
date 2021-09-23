
package RedComputadores;


public class Test {
    
    public static void main(String[] args) {
        Red red=new Red("UPC","C");
        
        Host host1 = new Host ("PC1", "IOS");
        host1.configurar(192, 168, 0, 1);
        
        Host host2 = new Host ("PC2", "IOS");
        host1.configurar(192, 168, 0, 1);
        
        Host host3 = new Host ("PC3", "IOS");
        host1.configurar(196, 168, 0, 1);
        
        Host host4 = new Host ("PC4", "IOS");
        host1.configurar(182, 168, 0, 1);
        
        System.out.println(host1.conectar(red));
        System.out.println(host2.conectar(red));
        System.out.println(host3.conectar(red));
        System.out.println(host4.conectar(red));
        
        red.details();
        System.out.println("");
        
    }
    
    
}

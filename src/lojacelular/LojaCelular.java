package lojacelular;
import javax.swing.JOptionPane;
public class LojaCelular {

    public static void main(String[] args) {
       
        // SII
        
        Modelo modelo1 = new Modelo ();
        
        modelo1.setNome("SII");
        modelo1.setChips(1);
        modelo1.setMemoria(3.0);
        
        Fabricante fabricante1 = new Fabricante ();
        
        fabricante1.setNome("Android");
        fabricante1.setDatafund("20/11/1990");
       
        Pais país1 = new Pais ();
        
        país1.setNome("China");
        país1.setCapital("Pequim");
        país1.setHabitantes(1375000000.0);
        
        // SIII
        
        Modelo modelo2 = new Modelo ();
        
        modelo2.setNome("SIII");
        modelo2.setChips(2);
        modelo2.setMemoria(8.0);
        
        Fabricante fabricante2 = new Fabricante ();
        
        fabricante2.setNome("Samsung");
        fabricante2.setDatafund("15/08/1970");
       
        Pais país2 = new Pais ();
        país2.setNome("Coréia do Sul");
        país2.setCapital("Seul");
        país2.setHabitantes(12000000.0);
        
        // Iphone 6
        
        Modelo modelo3 = new Modelo ();
        
        modelo3.setNome("Iphone 6");
        modelo3.setChips(8);
        modelo3.setMemoria(64.0);
        
        Fabricante fabricante3 = new Fabricante ();
        
        fabricante3.setNome("Apple");
        fabricante3.setDatafund("01/04/1976");
       
        Pais país3 = new Pais ();
        país3.setNome("Estados Unidos");
        país3.setCapital("Washington");
        país3.setHabitantes(3189000000.0);
        
        
        JOptionPane.showMessageDialog(null, "Modelo:" + modelo1.getNome() + "\nFabricante:\nNome:" + modelo1.getFabricante().getNome() + 
                "\nPaís de origem:"
                + modelo1.getFabricante().getPais() +  "Modelo:" + modelo2.getNome() + "\nFabricante:\nNome:" + modelo2.getFabricante().getNome() 
                + "\nPaís de origem:"
                + modelo2.getFabricante().getPais() +  "Modelo:" + modelo3.getNome() + "\nFabricante:\nNome:" + modelo3.getFabricante().getNome() 
                + "\nPaís de origem:"
                + modelo3.getFabricante().getPais() );

        
        
        
    }
    
}

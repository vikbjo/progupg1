

public class Djur
{
    private static int antalDjur = 0;
    private static String name;
    public static void main(String[] args){
        Haj haj = new Haj();
        Fagel fagel = new Fagel();
        Fisk fisk = new Fisk();
        Torsk torsk = new Torsk();
        haj.at(haj);
        fisk.simma();
        System.out.println(fagel.vingspann(120));
        System.out.println(torsk.maxdjup(200));
        System.out.println(getDjur());
    }
    public static int getDjur() {
        return antalDjur;
    }
    void at() {
        System.out.println("Djuret äter");
    
    }
    public void sov() {
        System.out.println("Djuret sover");
    }
     public Djur() {
      antalDjur++;
   }
    }


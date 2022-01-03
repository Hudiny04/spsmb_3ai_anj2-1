package _22._01m._03d_34;

import _12m._20d_33.Vaha;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class UbiraniZHashMapy {
    static void naplneniMapyATisk(HashMap<String, Vaha> hm) {
        hm.clear();
        for (int i = 1; i <= 4 ; i++) {
            String jmeno = "Robot" + i;
            hm.put(jmeno, new Vaha(50 + i));
        }
        System.out.println("Mapa: " + hm);
    }
    public static void main(String[] args) {
        HashMap<String, Vaha> hm = new HashMap<>();
        naplneniMapyATisk(hm);
        Set<String> kl = hm.keySet();
        //odstranění prvku z množiny klíčů a tím i z mapy:
        kl.remove("Robot1");
        kl.remove("Robot2");
        System.out.println("mapa bez Robot1,2: " + hm);
        //odstranění prvku z množiny hodnot a tím i z mapy:
        naplneniMapyATisk(hm);
        Collection<Vaha> hod = hm.values();
        hod.remove(new Vaha(51));
        System.out.println("Hodnoty bez Váhy 51:" + hm);

    }
}


package gang;

public class WeLoveYou {

    
    public static void main(String[] args) {
        Gang kc = new Gang("Katarina",7,"<3<3<3");
	Gang kp = new Gang("Kosta",7,"<3<3");
	Gang jm = new Gang("Jovana",6,"<3<3<3");
        Gang nj= new Gang("Nemanja",4,"<3<3<3<3<3<3");
        Gang lj = new Gang("Lazar",5,"<3<3");
        
        kc.predavanja(kc.ime,true);
        kc.ljubav();
        kc.znanje(kc.pracenje);
        System.out.println(kc.ime+" loves Marina "+kc.love+" and knowledge rises to "+kc.znanje+"/10 because of her!");
        
        kp.predavanja(kp.ime,false);
        kp.ljubav();
        kp.znanje(kp.pracenje);
        System.out.println(kp.ime+" loves Marina "+kp.love+" and knowledge rises to "+kp.znanje+"/10 because of her!");
        
        jm.predavanja(jm.ime,false);
        jm.ljubav();
        jm.znanje(jm.pracenje);
        System.out.println(jm.ime+" loves Marina "+jm.love+" and knowledge rises to "+jm.znanje+"/10 because of her!");
        
        nj.predavanja(nj.ime,false);
        nj.ljubav();
        nj.znanje(nj.pracenje);
        System.out.println(nj.ime+" loves Marina "+nj.love+" and knowledge rises to "+nj.znanje+"/10 because of her!");
        
        lj.predavanja(lj.ime,false);
        lj.ljubav();
        lj.znanje(lj.pracenje);
        System.out.println(lj.ime+" loves Marina "+lj.love+" and knowledge rises to "+lj.znanje+"/10 because of her!");
        
    }
    
}

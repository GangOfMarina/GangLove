
package gang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gang extends Vsar implements Marina{

    String ime;
    int znanje;
    String love;
    boolean pracenje;
    
    
    
    @Override
    boolean predavanja(String ime,boolean pracenje) {
        if(pracenje == true){
            System.out.println(this.ime + " payed attention in class!");
        }else{
            System.out.println(this.ime + " didn't pay attention in class!");
            this.pracenje = false;
        }
        return pracenje;
    }

    @Override
    public void znanje(boolean pracenje) {
        if(pracenje=true){
            znanje ++;
        }else{
            znanje += 2;
        }
        
    }

    public Gang(String ime, int znanje, String love) {
        this.ime = ime;
        this.znanje = znanje;
        this.love = love;
    }
    
    @Override
    public void ljubav() {
        String srce = "<3";
        Pattern pattern = Pattern.compile("<3");
        Matcher matcher = pattern.matcher(love);
        int count = 0;
        while(matcher.find()){
            count ++;
        }
        StringBuilder sb = new StringBuilder(count);
        for(int i=0; i<count+1;i++){
            sb.append(srce);
        }
//        System.out.println(count);
//        System.out.println(sb);
        String s = sb.toString();
        this.love = s;
    }
    
}

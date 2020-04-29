import java.util.Random;
public class Pokemon{
    private String name;
    private int hp;
    private int chp;
    private int atk;
    private int def;
    private int lv;
    private int exp;
    private int m_xp;

    public Pokemon(String P_name) {
        name = P_name;
        lv = 1;
        exp = 0;
        m_xp = 5;
        Random r = new Random();
        int iv = r.nextInt(5);
        hp = iv +10;
        atk = iv + 3;
        def = iv + 3;
        chp=hp;
 }
    public String showstatus(){
        return "Name :" + name +"\nLevel :" + lv +"\nHP :"+ chp +" / "+hp+"\nAttack" + atk +"\nDefend" + def ;
    }
    public void eat(){
        Random r = new Random();
        int i = r.nextInt(3);
        if (i==0){
            hp+=1;
        }
        if (i==1){
            hp+=1;
        }
        if (i==2){
            hp+=1;
        }
    }
    public void rename(String nname){
        name = nname;
    }
    public void lvup(){
        lv++;
        hp += 5 ;
        atk += 5;
        def += 5;
        m_xp+=5;
    }
    public void heal(){
        chp=hp;
    }
}
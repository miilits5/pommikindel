/**
 * Created by kasutaja on 4.10.2015.
 */
public class Konteiner {
    private String liik;
    private boolean onPommikindel;

    Konteiner(String liik,boolean onPommikindel){
        super();
        this.liik = liik;
        this.onPommikindel = onPommikindel;
    }
    String getLiik () {
        return liik;
    }
    void setLiik (String liik){
        this.liik = liik;
    }
    boolean getOnPommikindel (){
        return onPommikindel;
    }
    void setOnPommikindel (boolean onPommikindel){
        this.onPommikindel= onPommikindel;
    }

}

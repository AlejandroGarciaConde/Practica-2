package condicionescompetencias;
import javax.swing.JTextArea;
public class Hilo extends Thread {
    private JTextArea area;
    private RCompartido rc;
    Hilo(JTextArea area, RCompartido rc){
        this.area=area;
        this.rc=rc;
    }
    public void run(){
        while(true){
            try{
                rc.setRc(this.getName());
                area.append(rc.getRc()+":  Eats"+"\n");
                Thread.sleep(2000);
            }catch(Exception e){e.printStackTrace();}
        }
    }
}

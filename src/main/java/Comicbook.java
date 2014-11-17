import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Comicbook implements Serializable{
    private static int count = 1;
    private int comicbook_id;
    private String name;
    private String image;

    public LinkedList<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(LinkedList<Volume> volumes) {
        this.volumes = volumes;
    }

    public int getComicbook_id() {
        return comicbook_id;
    }

    public void setComicbook_id(int comicbook_id) {
        this.comicbook_id = comicbook_id;
    }

    private LinkedList<Volume> volumes = new LinkedList<Volume>();

    Comicbook(){
        comicbook_id = count++;
    }

    Comicbook(String name){
        this.name = name;
        comicbook_id = count++;
    }

    public void addVolume(Volume vol){
        if (volumes.size() == 0){
            image = vol.getImg();
        }
        volumes.add(vol);
        vol.setComicbook_id(comicbook_id);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

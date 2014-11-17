import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by nofuture on 11/5/2014.
 */
public class Volume implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume_id() {
        return volume_id;
    }

    public void setVolume_id(int volume_id) {
        this.volume_id = volume_id;
    }

    public int getComics_id() {
        return comicbook_id;
    }

    public void setComics_id(int comic_id) {
        this.comicbook_id = comicbook_id;
    }

    private String name;
    private static int count = 1;
    private int comicbook_id;
    private int volume_id;
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getComicbook_id() {
        return comicbook_id;
    }

    public void setComicbook_id(int comicbook_id) {
        this.comicbook_id = comicbook_id;
    }

    public LinkedList<Issue> getIssues() {
        return issues;
    }

    public void setIssues(LinkedList<Issue> issues) {
        this.issues = issues;
    }

    private String imprint;

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    LinkedList<Issue> issues = new LinkedList<Issue>();

    Volume(String name){
        this.name = name;
        volume_id = count++;
    }

    public void printIssues(){
        for(Issue i: issues){
            System.out.println(volume_id + " " + i.getName());
        }
    }

    public void addIssue(IssueFinal a){
        if(issues.size() == 0){
            img = a.getImage();
        }
        a.setVolume_id(volume_id);
        issues.add(a);
    }
}

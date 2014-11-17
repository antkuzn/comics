import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Issue implements Serializable{
    private static int count = 1;
    private String name;
    private int volume_id;
    private int issue_id;
    private String publisher;
    private String imprint;
    private int year;
    private LinkedList<Character> characters = new LinkedList<Character>();

    Issue(){
        issue_id = count++;;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume_id(int volume_id) {
        this.volume_id = volume_id;
    }

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LinkedList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(LinkedList<Character> characters) {
        this.characters = characters;
    }

    public int getVolume_id() {

        return volume_id;
    }

    public void appendCharacter(Character character){
        characters.add(character);
    }

    public String getName() {
        return name;
    }
}

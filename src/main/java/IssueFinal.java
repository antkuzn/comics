import java.util.LinkedList;

/**
 * Created by nofuture on 11/15/2014.
 */
public class IssueFinal extends Issue{
    private String image;

    private static int count = 1;
    private String name;
    private int volume_id;
    private int issue_id;
    private String publisher;
    private String imprint;
    private int year;
    private LinkedList<Character> characters = new LinkedList<Character>();

    IssueFinal(){
        issue_id = count++;;
    }

    IssueFinal(Issue i){
        this.name = i.getName();
        this.issue_id = i.getIssue_id();
        this.imprint = i.getImprint();
        this.publisher = i.getPublisher();
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

    IssueFinal(String name){
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

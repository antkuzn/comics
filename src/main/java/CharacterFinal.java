import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nofuture on 11/16/2014.
 */
public class CharacterFinal extends Character {
    private String image;
    private String universe;
    private String realm;
    private static int count = 1;
    private int character_id;
    private String name;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public int getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(int character_id) {
        this.character_id = character_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    CharacterFinal(Character ch, String universe, int id){
        super(ch.getName());
        this.universe = universe;
        character_id = id;
        image = ch.getImage();
        name = ch.getName();
        realm();
        name();
    }

    void realm(){
        Pattern pattern = Pattern.compile(".*\\((Earth-\\d+)\\).*");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            realm = matcher.group(1);
        }
    }

    void name(){
        Pattern pattern = Pattern.compile("(.*)\\(page does not exist\\)");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            name = matcher.group(1);
        }
    }
}

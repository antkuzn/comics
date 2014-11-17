/**
 * Created by nofuture on 11/16/2014.
 */
public class CharacterEntity {
    private String name;
    private String image;
    private int char_id;
    private String universe;
    private String realm;
    private String description;
    String realName;

    String sqlInsert(){
        return String.format("insert into Character (char_id, name, image, universe, realm) values (%d, '%s', '%s', '%s', '%s');",
                char_id, name.replaceAll("'", "''"),
                image == null ? "" : image.replaceAll("'", "''"), universe, realm);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return char_id;
    }

    public int getChar_id() {
        return char_id;
    }

    public void setChar_id(int char_id) {
        this.char_id = char_id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 * Created by nofuture on 11/10/2014.
 */
public class Character implements Serializable {
    private static int count = 1;
    private int character_id;
    private String name;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String image;

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

    Character(String name){
        this.name = name;
        character_id = count++;

    }
}

/**
 * Created by nofuture on 11/16/2014.
 */
public class VolumeEntity {
    private int comics_id;
    private String name;
    private String description;
    private String image = "";
    private float rating;

    public int getComics_id() {
        return comics_id;
    }

    public void setComics_id(int comics_id) {
        this.comics_id = comics_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getVolume_id() {
        return volume_id;
    }

    public void setVolume_id(int volume_id) {
        this.volume_id = volume_id;
    }

    private int volume_id;

    String sqlInsert(){
        return String.format("insert into volume (comics_id, volume_id, name, image) values (%d, %d, '%s', '%s')",
                comics_id, volume_id, name.replaceAll("'", "''"),
                image == null ? "" : image.replaceAll("'", "''"));
    }

}

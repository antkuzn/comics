/**
 * Created by nofuture on 11/16/2014.
 */
public class ComicbookEntity {
    private int comics_id;
    private String name;
    private String description;
    private String image = "";
    private float rating;
    private int releaseDate;

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

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    String sqlInsert(){
        return String.format("insert into comics (comics_id, name, image) values (%d, '%s', '%s')",
                comics_id,
                name.replaceAll("'", "''"),
                image == null ? "" : image.replaceAll("'", "''"));
    }
}

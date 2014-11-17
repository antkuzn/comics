/**
 * Created by nofuture on 11/16/2014.
 */
public class IssueEntity {
    private String name;
    private String image = "";
    private int issue_id;
    private int volume_id;
    private String publisher;
    private int releaseDate;
    private String imprint;
    private float rating;
    private String description;

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

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public int getVolume_id() {
        return volume_id;
    }

    public void setVolume_id(int volume_id) {
        this.volume_id = volume_id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    String sqlInsert(){
        return String.format("insert into issue (issue_id, name, image, volume_id, publisher, imprint) values (%d, '%s', '%s', %d, '%s', '%s')",
                issue_id, name.replaceAll("'", "''"),
                image == null ? "" : image.replaceAll("'", "''"),
                volume_id, publisher, imprint);
    }
}

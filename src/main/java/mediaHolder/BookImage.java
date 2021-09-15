package mediaHolder;

public class BookImage {

    private int id;
    private String image;
    
    public BookImage(){};
    
    public BookImage(int id, String image){
        this.id = id;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BookImage{id=").append(id);
        sb.append(", image=").append(image);
        sb.append('}');
        return sb.toString();
    }

}

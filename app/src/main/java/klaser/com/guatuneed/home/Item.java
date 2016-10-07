package klaser.com.guatuneed.home;

/**
 * Created by enrique on 20/04/16.
 */
public class Item {
    private String name;
    private String image;
    private String descripcion;

    public Item(){
        super();
    }
    public Item(String name,String image, String descripcion){
        super();
        this.descripcion=descripcion;
        this.image=image;
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

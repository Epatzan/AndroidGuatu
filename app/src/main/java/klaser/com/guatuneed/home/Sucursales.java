package klaser.com.guatuneed.home;

import java.util.Date;

/**
 * Created by enrique on 18/04/16.
 */
public class Sucursales {
    private Identificacion id;
    private Compania compania;
    private double coord_lat;
    private double coord_lng;
    private Date create_at = new Date();
    private  String direccion;
    private int number;
    private Date uptade_at = new Date();
    private String uuid ;

    public Identificacion getId() {
        return id;
    }

    public void setId(Identificacion id) {
        this.id = id;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    /******************* Clases para los Gets y Sets  ****************************/

   public double getCoord_lat(){
       return  coord_lat;
   }
    public void setCoord_lat(double coord_lat){
        this.coord_lat= coord_lat;
    }

    public  double getCoord_lng(){
        return  coord_lng;
    }
    public  void  setCoord_lng(double coord_lng){
        this.coord_lng = coord_lng;
    }
    public Date getCreate_at(){
        return create_at;
    }
    public void setCreate_at(Date create_at){
        this.create_at=create_at;
    }
    public  String getDireccion(){
        return direccion;
    }
    public  void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public  Date getUptade_at(){
        return  uptade_at;
    }
    public void  setUptade_at(Date uptade_at){
        this.uptade_at=uptade_at;
    }
    public String getUuid(){
        return uuid;
    }
    public void  setUuid(String uuid){
        this.uuid=uuid;
    }

}

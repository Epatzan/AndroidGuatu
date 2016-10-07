package klaser.com.guatuneed.home;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by enrique on 12/04/16.
 */
public class dataHome {
   //private List<String> _id = new ArrayList<String>();


    public List<Sucursales> sucursales;
    private String address;
    private String category;
    private Date create_at = new Date();
    private String departamento;
    private String description;
    private String fb_url;
    private double latitude;
    private  double logitude;
    private String municipio;
    private String name;
    private String ofertas;
    private int phone_number;
    private int precio;
    private String tw_url;
    private String type;
    private Date updated_at = new Date();
    private String uuid;
    private String web_url;
    private String youtube;
    private Identificacion IdOrgin;

    public Identificacion getIdOrgin() {
        return IdOrgin;
    }

    public void setIdOrgin(Identificacion idOrgin) {
        IdOrgin = idOrgin;
    }

    public List<Sucursales> getSucursales() {
        return sucursales;
    }
    public void setSucursales(List<Sucursales> sucursales){
        this.sucursales=sucursales;
    }

    /*************************** Metodos Set y Get *********************/



    /*
       public  get_id(){
            return _id;
        }
        public void set_id( _id){
            this._id=_id;
        } */

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getCategory(){
        return category;
    }
    public void  setCategory(String category){
        this.category=category;
    }
    public Date getCreate_at(){
        return create_at;
    }
    public void setCreate_at(Date create_at){
        this.create_at=create_at;
    }
    public String getDepartamento(){
        return  departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    public String getDescripcion(){
        return  description;
    }
    public void setDescripcion(String description){
        this.description=description;
    }
    public String getFb_url(){
        return  fb_url;
    }
    public void setFb_url(String fb_url){
        this.fb_url=fb_url;
    }
    public double getLatitude(){
        return latitude;
    }
    public void  setLatitude(double latitude){
        this.latitude=latitude;
    }
    public double getLogitude(){
        return  logitude;
    }
    public void  setLogitude(double logitude){
        this.logitude=logitude;
    }
    public String getMunicipio(){
        return municipio;
    }
    public void setMunicipio(String municipio){
        this.municipio=municipio;
    }
    public String getName(){
        return  name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getOfertas(){
        return  ofertas;
    }
    public  void setOfertas(String ofertas){
        this.ofertas=ofertas;
    }
    public int getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(int phone_number){
        this.phone_number=phone_number;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public String getTw_url(){
        return  tw_url;
    }
    public void setTw_url(String tw_url){
        this.tw_url=tw_url;
    }
    public String getType(){
        return type;
    }
    public  void setType(String type){
        this.type=type;
    }
    public  Date getUpdated_at(){
        return  updated_at;
    }
    public  void setUpdated_at(Date updated_at){
        this.updated_at=updated_at;
    }
    public String getUuid(){
        return  uuid;
    }
    public void setUuid(String uuid){
        this.uuid=uuid;
    }
    public String getWeb_url(){
        return  web_url;
    }
    public  void  setWeb_url(String web_url){
        this.web_url=web_url;
    }
    public String getYoutube(){
        return youtube;
    }
    public void setYoutube(String youtube){
        this.youtube=youtube;
    }
}

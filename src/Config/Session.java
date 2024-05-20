/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author AJ
 */
public class Session {
    
    private static Session instance;
    private int uid;
    private String fname , lname;
    private String uname;
    private String email;
    private String type;
    private String status;
    private String con;
    private String sx;
    private String idad;
    private String bdate;
    private String location;
    
    private Session(){
        
    }

    public static synchronized Session getInstance() {
        if(instance==null){
            instance=new Session();
        }
        return instance;
    }

    public static boolean setIntanceEmpty() {
        return instance==null;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }
    
    public String getSx() {
        return sx;
    }

    public void setSx(String sx) {
        this.sx = sx;
    }
     public String getIdad() {
        return idad;
    }

    public void setIdad(String idad) {
        this.idad = idad;
    }
     public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }
    
     public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}

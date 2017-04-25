package edu.upc.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos on 21/04/2017.
 */
public class User {
    private String username;
    private String mail;
    private String password;
    public List<Etakemon> list = new ArrayList<Etakemon>();


    public User (String username, String mail, String password){
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.list = new ArrayList<Etakemon>();
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setList (List<Etakemon> list){this.list=list;}

    public List getList(){return this.list;}

}

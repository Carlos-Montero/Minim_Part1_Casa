package edu.upc.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Carlos on 21/04/2017.
 */
public class EtakemonManagerImpl implements EtakemonManager {

    final static org.apache.log4j.Logger  Logger = org.apache.log4j.Logger.getLogger(EtakemonManagerImpl.class);
    private static EtakemonManagerImpl ourInstance = new EtakemonManagerImpl();
    private Map<String,User> usermap;
    private ArrayList<Object> objectList;

    public static EtakemonManagerImpl getInstance() {
        return ourInstance;
    }

    private EtakemonManagerImpl() {
        this.usermap = new HashMap<String,User>();
    }



    public Map<String,User> listUsers(){

        return this.usermap;
    }

    public boolean addUser (User u){
        User res = this.usermap.putIfAbsent(u.getUsername(),u);
        if (res==null) {
            usermap.put(u.getUsername(), u);
            Logger.info("Added: Username " + u.getUsername() + " Mail: " + u.getMail() + " Password: " + u.getPassword());
            return true;
        }
        else{
            Logger.info("edu.upc.dsa.User aldready exists");
            return false;
        }
    }

    public boolean modifyUser (User u){
        User res = this.usermap.putIfAbsent(u.getUsername(),u);
        if (res==null) {
            Logger.info("This user don't exists");
            return false;
        }
        else{
            usermap.put(u.getUsername(), u);
            Logger.info("Modified: Username " + u.getUsername() + " Mail: " + u.getMail() + " Password: " + u.getPassword());
            return true;
        }
    }

    public User infoUser (String username){
        User u = usermap.get(username);
        if (u != null){
            return u;
        }
        else {
            return null;
        }
    }

    public List<Etakemon> infoUserObject (String username){
        User u = usermap.get(username);
        if (u != null){
            return u.getList();
        }
        else {
            return null;
        }
    }

    public boolean addUserObject(User u,String name, int level) {
        Etakemon e = new Etakemon (name, level);
        User res = this.usermap.get(u.getUsername());
        if (res==null) {
            Logger.info("This user don't exists");
            return false;
        }
        else{
            u.getList().add(e);
            usermap.put(u.getUsername(), u);
            Logger.info("Object added");
            return true;
        }
    }

}

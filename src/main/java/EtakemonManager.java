import java.util.List;
import java.util.Map;

/**
 * Created by Carlos on 21/04/2017.
 */
public interface EtakemonManager {

public Map<String,User> listUsers();

public boolean addUser (User u);

public boolean modifyUser (User u);

public User infoUser (String username);

public List<Object> infoUserObject (String username);

public boolean addUserObject (User u, Object o);

}

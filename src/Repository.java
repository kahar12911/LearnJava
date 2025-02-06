import java.util.ArrayList;
import java.util.List;

public class Repository {
    ArrayList<User> list = new ArrayList<>();
    User user1 = new User(101,"kahar12911","12345","Deepika");
    User user2 = new User(102,"dpk12911","12345","Kahar");
    User user3 = new User(101,"ashok12911","12345","Ashok");

    public Repository() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
    }

    public List<User> findall(){
        return list;
    }

}

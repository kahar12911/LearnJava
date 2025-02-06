import java.util.List;

public class Controller {
    Service service = new Service();

    public List<User> findUsers(){
        return service.listUser();
    }
}

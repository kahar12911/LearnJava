import java.util.List;

public class Service {
    Repository repository = new Repository();

    public List<User> listUser(){
        return repository.findall();
    }
}

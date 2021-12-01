package core.annotation;

@Service(name = "Super simple service")
public class SimpleService {
    @Init
    public void initService() {

    }

    public void getInfo() {
        System.out.println("SimpleSimple");
    }
}

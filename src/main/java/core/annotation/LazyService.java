package core.annotation;

@Service(name = "Duper lazy service")
public class LazyService {
    @Init
    public void lazyInit() throws Exception {

    }
}

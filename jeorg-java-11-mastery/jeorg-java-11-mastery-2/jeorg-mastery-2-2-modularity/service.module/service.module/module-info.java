import org.jesperancinha.java11.service.module.ServiceInterface;
import org.jesperancinha.java11.service.module.ServiceModule;

module service.module {
    requires consolerizer;
    exports org.jesperancinha.java11.service.module;
    provides ServiceInterface with ServiceModule;

}
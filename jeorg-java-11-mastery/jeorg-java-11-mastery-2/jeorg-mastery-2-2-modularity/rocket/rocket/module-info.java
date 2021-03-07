import org.jesperancinha.java11.lunar.module.LunarInterface;
import org.jesperancinha.java11.service.module.ServiceInterface;

module rocket {
    uses LunarInterface;
    uses ServiceInterface;
//    requires consolerizer;
    requires service.module;
    requires lunar.module;
}
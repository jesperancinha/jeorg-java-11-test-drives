import org.jesperancinha.java11.lunar.module.LunarInterface;
import org.jesperancinha.java11.lunar.module.LunarModule;

module lunar.module {
    requires consolerizer;
    exports org.jesperancinha.java11.lunar.module;
//    exports org.jesperancinha.java11.lunar.extra;
    provides LunarInterface with LunarModule;

}
package SpringScopeLearning.connection;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
/*
 * The proxyMode = ScopedProxyMode.TARGET_CLASS property in @Scope annotation ensures that whenever this Bean is
 * initialized from any dependency injection and if this Bean has scope of prototype and the source bean has scope of
 * singleton then instead of getting the same instance for the source Bean it will send a new instance every time the source
 * bean ask for it.
 * */

public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }
}

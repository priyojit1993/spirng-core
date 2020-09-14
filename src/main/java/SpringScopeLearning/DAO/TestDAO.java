package SpringScopeLearning.DAO;

import SpringScopeLearning.connection.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestDAO {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}

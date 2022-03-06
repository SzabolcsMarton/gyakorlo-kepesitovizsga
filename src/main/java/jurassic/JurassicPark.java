package jurassic;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

        private JdbcTemplate jdbcTemplate;

    public JurassicPark(MariaDbDataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String>  checkOverpopulation() {
        List<String> result = new ArrayList<>();
        jdbcTemplate.query("select breed from dinosaur where actual > expected order by breed asc", (rs, i) -> result.add(rs.getString("breed")));
        return result;
    }
}

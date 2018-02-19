import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoodsDAOimpl implements GoodsDAO {


    private SimpleJdbcTemplate dataSource;
    public void setdataSource(SimpleJdbcTemplate dataSource) {
        this.dataSource = dataSource;
    }


    public ArrayList<goods> selectall() {

    return dataSource.queryForObject("select * from goods",new ParameterizedRowMapper<ArrayList<goods>>()
    {
        public ArrayList<goods> mapRow(ResultSet rs, int rowNum) throws SQLException {
            ArrayList<goods> res= new ArrayList<goods>();
            while (rs.next())
            {
                goods good =new goods();
                good.setCode(rs.getString("code"));
                good.setName(rs.getString("name"));
                good.setQuan(rs.getInt("quan"));
                good.setEd(rs.getString("ed"));
                good.setWeight(rs.getInt("w_brutto"));
                good.setInvoice(rs.getString("invoice"));
                res.add(good);
            }
            return res;
        }
    });
    }

}

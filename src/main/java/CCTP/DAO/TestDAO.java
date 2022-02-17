package CCTP.DAO;

import CCTP.Entity.TestForBuild;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDAO {

    /**
     * 查询所有数据
     */
    @Select("select id FROM test")
    List<TestForBuild> findAll();

}

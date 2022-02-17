package CCTP.Service;

import CCTP.Entity.TestForBuild;

import java.util.List;

public interface TestService {
    /**
     * 查询所有数据
     * @return
     */
    List<TestForBuild> findAll();
}

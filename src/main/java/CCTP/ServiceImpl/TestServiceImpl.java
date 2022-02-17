package CCTP.ServiceImpl;

import CCTP.DAO.TestDAO;
import CCTP.Entity.TestForBuild;
import CCTP.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDAO testDAO;

    @Override
    public List<TestForBuild> findAll() {
        return testDAO.findAll();
    }
}

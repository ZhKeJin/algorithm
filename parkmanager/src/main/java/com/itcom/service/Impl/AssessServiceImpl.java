package main.java.com.itcom.service.Impl;

import com.itcom.bean.Assess;
import com.itcom.mapper.AssessMapper;
import com.itcom.service.IAssessService;
import main.java.com.itcom.bean.Assess;
import main.java.com.itcom.mapper.AssessMapper;
import main.java.com.itcom.service.IAssessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-06-11-16:50
 */
@Service
public class AssessServiceImpl implements IAssessService {

    @Autowired
    private AssessMapper assessMapper;

    @Override
    public int addAssess(Assess assess) {
        return assessMapper.insertAssess(assess);
    }

    @Override
    public List<Assess> queryAssess() {
        return assessMapper.selectAssess();
    }
}

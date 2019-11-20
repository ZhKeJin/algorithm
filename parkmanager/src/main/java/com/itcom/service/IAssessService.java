package main.java.com.itcom.service;

import com.itcom.bean.Assess;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-06-11-16:50
 */
public interface IAssessService {
    int addAssess(Assess assess);

    List<Assess> queryAssess();

}

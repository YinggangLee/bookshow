package yinggang.com.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import yinggang.com.pojo.Paper;

import java.util.List;

@Component
public interface PaperDao {

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();






}

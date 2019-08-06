package yinggang.com.service;

import org.springframework.stereotype.Service;
import yinggang.com.pojo.Paper;

import java.util.List;

@Service
public interface PaperService {

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();


}

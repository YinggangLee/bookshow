package yinggang.com.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yinggang.com.dao.PaperDao;
import yinggang.com.pojo.Paper;
import yinggang.com.service.PaperService;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDao paperDao;




    public PaperDao getPaperDao() {
        return paperDao;
    }

    @Override
    public int addPaper(Paper paper) {
        return paperDao.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return paperDao.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperDao.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        return paperDao.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return paperDao.queryAllPaper();
    }
}

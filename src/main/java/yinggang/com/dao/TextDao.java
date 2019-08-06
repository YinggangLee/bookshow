package yinggang.com.dao;

import org.springframework.stereotype.Component;
import yinggang.com.pojo.Text;

import java.util.List;

@Component
public interface TextDao {

    public List<Text> getTextList();

    public Text getText(int id);


}

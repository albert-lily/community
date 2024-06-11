package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;   //上一页
    private boolean showFirstPage; //最前页
    private boolean showNext;      //下一页
    private boolean showEndPage;   //最后页
    private Integer page;
    private List<Integer> pages = new ArrayList<>();

    public void setPagination(Integer totalCount, Integer page, Integer size) {

        Integer totalPage;
        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        }else {
            totalPage = totalCount / size + 1;
        }
        this.page = page;
        // 1 2 3 4 5 6 7
        pages.add(page);
        for (int i = 1; i <= 6; i++) {
            if(pages.size()==7){
                break;
            }
            if(page-i>0){
                pages.add(0,page-i);
            }
            if(pages.size()==7){
                break;
            }
            if(page+i<=totalPage){
                pages.add(page+i);
            }
        }
        //是否显示上一页
        showPrevious = !page.equals(1);
        //是否显示下一页
        showNext = !page.equals(totalPage);
        //是否显示首页
        showFirstPage = !pages.contains(1);
        //是否显示尾页
        showEndPage = !pages.contains(totalPage);
    }
}

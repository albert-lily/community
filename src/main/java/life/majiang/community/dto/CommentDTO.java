package life.majiang.community.dto;

import lombok.Data;

@Data
public class CommentDTO {
    private Long parentId;
    private  String commentDetail;
    private Integer type;
}

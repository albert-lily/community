alter table community.comment
    change commentCount comment_count bigint default 0 null comment '评论数';
/**
 提交回复
 **/
function post(){
    var questionId = $("#question_id").val();
    var commentDetail = $("#comment_content").val();
    comment2Target(questionId,  1,commentDetail);
}
function comment2Target(targetId,type,commentDetail){
    if(!commentDetail){
        alert("请输入回复内容！！！");
        return ;
    }
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType: "application/json",
        data: JSON.stringify({
            "parentId": targetId,
            "commentDetail": commentDetail,
            "type":type
        }),
        success: function (response){
            if(response.code == 200){
                window.location.reload();
                // $("#comment_section").hide();
            }else {
                if(response.code == 2003){
                    var  isAccepted= confirm(response.message);
                    if(isAccepted){
                        window.open("https://github.com/login/oauth/authorize?client_id=Ov23lieEve75bFr56170&redirect_uri=http://localhost:8887/callback&scope=user&state=1");
                        window.localStorage.setItem("closable",true);
                    }
                } else {
                    alert(response.message);
                }
            }
        },
        dataType: "json"
    });
}
function  comment(e){
    var commentId = e.getAttribute("data-id");
    var commentDetail = $("#input-"+commentId).val();
    console.log(commentId);
    console.log(commentDetail);
    comment2Target(commentId, 2, commentDetail);
}
/**
 展开二级评论
**/
function collapseComments(e){
    var id = e.getAttribute("data-id");
    var comments = $("#comment-"+id);
    var collapse = e.getAttribute("data-collapse");
    if(collapse){
        //折叠二级评论
        comments.removeClass("in");
        e.removeAttribute("data-collapse");
        e.classList.remove("active");
    }else {
        var subCommentContainer = $("#comment-" + id);
        if(subCommentContainer.children().length > 1){
            //展开二级评论
            comments.addClass("in");
            // 标记二级评论展开状态
            e.setAttribute("data-collapse", "in");
            e.classList.add("active");
        }
        else{
            $.getJSON("/comment/" + id, function (data) {
            $.each(data.data.reverse(), function (index, comment) {

                var mediaLeftElement = $("<div/>",{
                    "class": "media-left"
                }).append($("<img/>", {
                    "class": "media-object img-rounded",
                    "src": comment.user.avatarUrl
                }));
                var mediaBodyElement = $("<div/>",{
                    "class": "media-body media-body-another"
                }).append($("<h5/>", {
                    "class": "media-heading",
                    "html": comment.user.name
                })).append($("<div/>", {
                    "class": "text-m",
                    "html": comment.commentDetail
                })).append($("<div/>", {
                    "class": "menu",
                })).append($("<span/>", {
                    "class": "pull-right time",
                    "html": moment(comment.gmtCreate).format("YYYY-MM-DD"),
                }));
                var mediaElement = $("<div/>",{
                    "class": "media comments"
                }).append(mediaLeftElement).append(mediaBodyElement);
                var commentElement = $("<div/>", {
                    "class": "col-lg-12 col-md-12 col-sm-12 col-xs-12  sub-comments"
                }).append(mediaElement);
                subCommentContainer.prepend(commentElement);
            });
            //展开二级评论
            comments.addClass("in");
            // 标记二级评论展开状态
            e.setAttribute("data-collapse", "in");
            e.classList.add("active");
        });
        }
    }
}
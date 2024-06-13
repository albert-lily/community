function post(){
    var questionId = $("#question_id").val();
    var commentDetail = $("#comment_content").val();
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType: "application/json",
        data: JSON.stringify({
            "parentId": questionId,
            "commentDetail": commentDetail,
            "type":1
        }),
        success: function (response){
            if(response.code == 200){
                $("#comment_section").hide();
            }else {
                alert(response.message);
            }
            console.log(response);
        },
        dataType: "json"
    });
}

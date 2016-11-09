$(function(){
	   $(".logout,#loginLink").bind("click",function(){
      var backUrl=window.location.href;
      $.ajax({
          type:"post",
          url:"/home/logout.htm?callback=?",
          dataType:"jsonp",
          error:function(XMLHttpRequest,textStatus,errorThrown){
              if(XMLHttpRequest.status==200){
                  $("#formErrMsg").html("ÕËºÅÒì³££¬Çë<a href='/home/login.htm'>ÖØÐÂµÇÂ¼</a>")
              }else{
                  $("#formErrMsg").html("·þÎñÆ÷·±Ã¦£¬ÇëÉÔºóÔÙÊÔ")}
          },
          success:function(str){
              if(str!=null&&str.length>0){
                  if(str[0].result=="S"){
                      var logout = new getLoginFrame({
                          loginOrLogout: 'logout',
                          logoutSuccess:function(){
                              var nowHref=window.location.href;
                              nowHref=nowHref.replace("http://","").replace("https://","").split("/")[0].split(".");
                              var len=nowHref.length;
                              if(nowHref[len-2]=="cibntv"){
                                var nowDomain=nowHref[len-2]+"."+nowHref[len-1];
                                nowDomain=nowDomain.split(":")[0];
                                document.domain=nowDomain;
                                var keys=document.cookie.match(/[^ =;]+(?=\=)/g);
                                if(keys){
                                  for (var i = keys.length; i--;){
                                    $.cookie(keys[i],null,{expires:-1,path:'/', domain:nowDomain,secure: true});
                                  }
                                }
                                window.location.href="http://passport.cp31.ott.cibntv.net/user/ottLogin?cburl="+encodeURIComponent(window.location.href);
                              }else{
                                  window.location.href="https://account.youku.com/?callback="+encodeURIComponent(window.location.href);
                              }
                          }
                      });
                  }
              }
          }
      })
  })
    $(".closeTips").click(function(event) {
      $(this).parent(".tipsWrap").remove();
    });
})
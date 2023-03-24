//header include	  
$(document).ready(function () {
  $("#header").load("header.html");
  $("#footer").load("footer.html");
});



//$(window).resize(function() {
//  if ($(window).width() < 768) {
//    $('.navArea').removeClass('test1');
//   }else{
//    $('.navArea').addClass('test1');
//   }
//});



//faq slide
$(document).ready(function () {
  $('.userName').click(function () {
    $(this).next().slideToggle(100);
  });
});

//faq tab
$(document).ready(function () {
  $(function () {
    $(".tabBtnList li").click(function () {
      $(".tabBtnList li").removeClass('on');
      $(".faqCon").removeClass('on');
      $(this).addClass('on');
      $("#" + $(this).data('id')).addClass('on');
    });
  });
});


//fish ani
$(document).ready(function () {
  $('.previewFish').click(function () {
    $(this).addClass('previewFishMove');
  });
});


//객관식문제 선택 체크
$(document).ready(function () {
  $('.testMultiSelectList li').click(function () {
    $('.testMultiSelectList li').removeClass('testSelected');
    $(this).addClass('testSelected');
  });
});


//객관식이미지 문제 선택 체크
$(document).ready(function () {
  $('.testMultiSelectImgList li').click(function () {
    $('.testMultiSelectImgList li').removeClass('testSelected');
    $(this).addClass('testSelected');
  });
});


//아코디언 슬라이드
 $(document).ready(function() {
  $(".sectionCont").hide();
  $(".sectionHead").click(function() {
    $(this).toggleClass("sectionHeadOn");
    $(this).next(".sectionCont").slideToggle(100);
  });
});


//play btn
$(document).ready(function () {
  $('.listenPlay').click(function () {
    $(this).toggleClass('listenPause');
  });
});


//역할선택
$(document).ready(function () {
  $('.screenRoleSelect li').click(function () {
    $('.screenRoleSelect li').removeClass('on');
    $(this).addClass('on');
  });
});

//자막선택
$(document).ready(function () {
  $('.screenSubtitleBtnList li').click(function () {
    $('.screenSubtitleBtnList li').removeClass('on');
    $(this).addClass('on');
  });
});

//자막tab
$(document).ready(function () {
  $(".screenSubtitle").hide();
  $(".screenSubtitle:first").show();
  $(".screenSubtitleBtnList li").click(function () {
    $(".screenSubtitle").hide();
    var activeTab = $(this).find("a").attr("href");
    $(activeTab).fadeIn();
    return false;
  });

});

//text check
$(document).ready(function () {
  $('.listenFindExplain em').click(function () {
    $(this).toggleClass('checkMark');
  });
});

//text select
$(document).ready(function () {
  $('#readingTwoLineList li').click(function () {
    $('#readingTwoLineList li').removeClass('clickSelected');
    $(this).toggleClass('clickSelected');
  });
});
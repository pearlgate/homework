$(window).scroll(function() {
    if($(this).scrollTop()>100) {
        $('.menu').addClass('sticky')
    }
    else {
        $('.menu').removeClass('sticky')
    }
});
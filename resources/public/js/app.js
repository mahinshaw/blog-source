$(document).ready(function() {
  var menu = $('.centered-navigation-menu');
  var menuToggle = $('.centered-navigation-menu-button');

  $(menuToggle).on('click', function(e) {
    e.preventDefault();
    menu.slideToggle(funtion(){
      if(menu.is(':hidden')) {
        menu.removeAttr('style');
      }
    });
  });
});

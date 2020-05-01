$(document).ready(function(){
    $(".semester").first().addClass("selected-button");
    
    $(".module").first().addClass("selected-button");
    
    $(".semester").click(function() {
        console.log("start");
        $(".semester").each(function() {
            $(this).removeClass("selected-button");
        });
        $(this).addClass("selected-button");
        console.log("end");
    });
    
    $(".module").click(function() {
        console.log("start");
        $(".module").each(function() {
            $(this).removeClass("selected-button");
        });
        $(this).addClass("selected-button");
        console.log("end");
    });
});


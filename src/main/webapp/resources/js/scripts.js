$(document).ready(function(){
    $(".semester").first().addClass("selected-button");
    
    $(".module").first().addClass("selected-button");
   
    $(document).on("DOMNodeInserted", document, function(e) {
        console.log(e.target);
        if ( $(e.target).hasClass('modules-semesters') ) {
            console.log(2);
            $(".module").first().addClass("selected-button");
        }
         
    });
    
    $(document).on("click", ".semester", function() {
        $(".semester").each(function() {
            $(this).removeClass("selected-button");
        });
        $(this).addClass("selected-button");
    });
    
    $(document).on("click", ".module", function() {
        $(".module").each(function() {
            $(this).removeClass("selected-button");
        });
        $(this).addClass("selected-button");
    });
});


var locomotives = locomotives || {};
locomotives.controllers = locomotives.controllers || {};

locomotives.controllers.index = function(){
    var initialize = function () {
        $.getJSON("/resteasy-hey-world/api/locomotives").success(
            function(trains){
                trains.forEach(
                    function(train){
                        $("body").append("<div>TRAIN: "+ train.name + " "+ train.id + "</div>")
                    }
            );
        });
    }
    return {
        initialize:initialize
    };
};
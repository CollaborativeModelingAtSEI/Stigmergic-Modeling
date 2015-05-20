define(function (require, exports, module) {

    /*  -------  *
     *  载入模块
     *  -------  */

    // 通用库模块
    var $ = require('../lib/jquery');

    // page 模块
    var Page = require('../module/page');


    /*  ---------  *
     *  初始化页面
     *  ---------  */

    $(document).ready(function () {

        // 初始化组件
        var pageInfo = {
            userName: dataPassedIn.user,
            icmId: dataPassedIn.modelID,
            icmName: dataPassedIn.modelName
        };
        var page = new Page(pageInfo, dataPassedIn.model);
        page.init();


    });

});
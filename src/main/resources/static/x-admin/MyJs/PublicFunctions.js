/**
 * PublicFunctions.js 一些公共的函数
 */

/**
 * 一个值如果是null或者''返回-
 * @param value 需要处理的值
 * @param length 需要截取的字符的长度的值,未指定的时候返回全部
 * @returns {*} 处理过的值
 */
function replaceNull(value,length) {
    //判断截取的值是否为空
    if(value == null || value==undefined || value == "" || value=='undefined'){
        return "-";
    }
    //判断长度是否为空
    if(length == null || length == ''){
        return value;
    }
    return value.toString().substr(0,length);
}

/**
 * 关闭当前页的函数
 */
function closeNowPage() {
    var closeTable = $(".layui-tab-title", parent.document).children("li");
    closeTable.each(function () {
        if ($(this).attr("class") == "layui-this") {
            $(this).children("i").trigger("click");//触发其点击事件(关闭当前tab)--trigger用于触发一个元素的指定事件
        }
    })
}


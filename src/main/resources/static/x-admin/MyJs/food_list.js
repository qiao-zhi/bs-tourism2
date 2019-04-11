$(function(){
	queryFoodsFY();
});

/*****S 分页查询相关方法**********/
function queryFoodsFY(){
    $.ajax({
       url:"food/getFoods.html",
       data:$("#queryTicketForm").serialize(),
       dataType:'json',
        type:'post',
        async:true,
        success:showTicketsTable
    });
}

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showTicketsTable(pageInfo){
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var tickets = pageInfo.list;
    $("#memberTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = tickets.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr>"
            +'<td>'+index+'</td>'
            +'<td>'+replaceNull(tickets[i].id)+'</td>'
            +'<td>'+replaceNull(tickets[i].foodname)+'</td>'
            +'<td>'+replaceNull(tickets[i].price)+'</td>'
            +'<td>'+replaceNull(tickets[i].foodblank)+'</td>'
            +'<td>'+replaceNull(tickets[i].createtime)+'</td>'
            +'<td>';
            if("undefined" != typeof admin){
            tr+='<a href=javascript:void(0) title="点击修改美食信息" onclick="updateTicket('+tickets[i].id+')"><i class="layui-icon">&#xe642;</i></a>'
            +'<a href=javascript:void(0) title="点击删除该美食信息" onclick="deleteTicket('+tickets[i].id+')"><i class="layui-icon">&#xe640;</i></a>'
            }else{
            	tr+='-- --'
            }
            tr +='</td></tr>'
            
        $("#memberTbody").append(tr);
    }

    //开启分页组件
    usersPage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function usersPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'pageDiv', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='pageNum']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                	queryFoodsFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/**
 * 清空查询条件的按钮
 * 1.清空所有的条件，包括隐藏域的条件，2.重新查询一次
 * @param obj   将清空条件按钮自己传下来
 */
function clearQueryCondition(obj) {
    //1.清空条件
    var form = $(obj).parents("form");
    form.find("input").val("");
    form.find("select").val("");
    //2.重新查询一次
    queryFoodsFY();
}



/*****E 分页查询相关方法**********/

function deleteTicket(id){
	var layer = layui.layer;
	layer.confirm('确认删除?', function(index){
		$.post("food/deleteFood.html",{"id":id},function(result){
			if(result.success == true){
				layer.msg("删除成功!");
				queryFoodsFY();
			}else{
				layer.msg(result.msg);
			}
		});
	  layer.close(index);
	});
}

function updateTicket(id){
	var url = 'food/updateFood.html?id='+id;
	x_admin_show('修改门票信息',url,600,400);
}
//新增
var faIcon = {
	valid : 'fa fa-check-circle fa-lg text-success',
	invalid : 'fa fa-times-circle fa-lg',
	validating : 'fa fa-refresh'
}

$(window).on('load',function() {
	$("#highchart").hide();
});

function platformdataModal(type){
	var text1;
	var text2;
	var text3;
	if(type==0){
		text1='当天登陆人数图表';
		text2='登陆人数';
		text3='人数';
	}else if(type==1){
		text1='当月登陆人数图表';
		text2='登陆人数';
		text3='人数';
	}else if(type==2){
		text1='图书收藏人数图表';
		text2='收藏人数';
		text3='人数';
	}else if(type==3){
		text1='图书销量图表';
		text2='图书销量';
		text3='销量';
	}
	$.ajax({
		url:"personal/platformdataByType",
		data:{'type':type},
		dataType:"json",
		type:"POST",
		success:function(data){
			if(data==','){
				alert("没有数据");
			}else{
				$("#highchart").show();
				var chart = Highcharts.chart('container', {
			        chart: {
			            type: 'column'
			        },
			        title: {
			            text: text1
			        },
			        subtitle: {
			            text: '请点击按钮查看坐标轴变化'
			        },
			        xAxis: {
			            categories: data[0]
			        },
			        yAxis: {
			            labels: {
			                x: -15
			            },
			            title: {
			                text: text2
			            }
			        },
			        series: [{
			            name: text3,
			            data: data[1]
			        }],
			        responsive: {
			            rules: [{
			                condition: {
			                    maxWidth: 500
			                },
			                chartOptions: {
			                    xAxis: {
			                        labels: {
			                            formatter: function () {
			                                return this.value.replace('月', '')
			                            }
			                        }
			                    },
			                    yAxis: {
			                        labels: {
			                            align: 'left',
			                            x: 0,
			                            y: -2
			                        },
			                        title: {
			                            text: ''
			                        }
			                    }
			                }
			            }]
			        }
			    });
			}	
			    $('#small').click(function () {
			        chart.setSize(400, 300);
			    });
			    $('#large').click(function () {
			        chart.setSize(800, 500);
			    });
			}
		});
}

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="expires" content="0" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>代码自动生成</title>
<%@include file="/common/head.jsp" %>
</head>
<body>
	<div class="ibox-content">
		<div id="DataTables_Table_0_wrapper" class="dataTables_wrapper form-inline" role="grid">
			<div class="row" >
				<form id="inputForm"  method="post"
					class="form-horizontal m-t-xs" novalidate="novalidate">
					<div class="form-group col-sm-12 icon-right pb15">
							
					
					</div>
					<div class="form-group col-sm-12 icon-left">
						<button class="m-btn maincolor main-btn" id="genButton" type="button"><span>生成代码</span></button>
					</div>
				</form>
			</div>
		</div>
		<div class="jqGrid_wrapper" style="height:400px;"> 
            <table id="table_list"></table>
            <div id="pager_list"></div>
        </div>
	</div>

	<%@ include file="/common/footer.jsp"%>
	<script type="text/javascript" src="${base}/js/sysgenerator/list.js?v=<wei:version/>"></script>
</body>

</html>
	
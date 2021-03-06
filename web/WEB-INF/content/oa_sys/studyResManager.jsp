<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}\oa_sys\datepicker/WdatePicker.js"></script>
  </head><body>
    <div class="cover">
      <div class="navbar navbar-default">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-ex-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand"><img height="45" alt="Brand" src="${pageContext.request.contextPath}\oa_sys\images\hlzj.jpg"></a>
          </div>
          <div class="collapse navbar-collapse" id="navbar-ex-collapse">
            <ul class="nav navbar-nav navbar-right">
              <li>
                <a href="/OASystem/sys/logout.action"><i class="fa fa-fw fa-share-alt"></i>欢迎您,点击退出</a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <br>
      <br>
      <div class="cover-image"></div>
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="btn-group">
                <a href="/OASystem/sys/userList.action" class="btn btn-default btn-lg">成员管理</a>
              <a href="/OASystem/sys/prjManager.action" class="btn btn-default btn-lg">项目管理</a>
              <a href="/OASystem/sys/studyPlan.action" class="btn btn-default btn-lg">培养方案管理</a>
              <a href="/OASystem/sys/studyResManager.action" class="btn btn-default btn-lg">学习资源管理</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <hr>
        <div class="row">
          <div class="col-md-12">
            <div class="panel panel-primary">
              <div class="panel-heading">
                <h3 class="panel-title">学习资源列表内容</h3>
              </div>
              <div class="panel-body">
                <table class="table table-bordered">
                  <tbody>
                    <tr>
                      <td colspan="3">
                        <a href="#" class="btn btn-primary">删除选中资源</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <button class="btn btn-primary" data-toggle="modal" data-target="#addStudyRes">新增资源</button>
                      </td>
                      <td></td>
                    </tr>
                    <tr>
                      <td>
                        <input type="checkbox">
                      </td>
                      <td>资源名</td>
                      <td>发布时间</td>
                      <td>操作</td>
                    </tr>
                    <tr>
                      <td>
                        <input type="checkbox">
                      </td>
                      <td>java学习</td>
                      <td>16/06/06</td>
                      <td>
                        <a href="#" class="btn btn-primary">删除</a>
                      </td>
                    </tr>
                  </tbody>
                </table>
                <br>
              </div>
            </div>
            <form>
              <table class="table table-bordered">
                <tbody>
                  <tr></tr>
                  <tr></tr>
                </tbody>
              </table>
            </form>
          </div>
        </div>
      </div>
    </div>
    <br>
    <br>
    <div class="modal fade" id="addStudyRes" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <form role="form">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h4 class="modal-title" id="myModalLabel">添加学习资源</h4>
            </div>
            <div class="modal-body">
              <div class="form-group">
                <label class="control-label">资源名</label>
                <input class="form-control input-lg" placeholder="输入资源名" type="text">
              </div>
              <div class="form-group">
                <label class="control-label" for="exampleInputPassword1">资源内容</label>
                <textarea rows="10" class="form-control" placeholder="输入内容..." id="message" name="Content" data-validation-required-message=""></textarea>
              </div>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
              <button type="submit" class="btn btn-primary">提交修改</button>
            </div>
          </div>
        </form>
        <!-- /.modal-content -->
      </div>
    </div>
    <br>
    <br>
    <footer class="section section-primary">
      <div class="container">
        <div class="row">
          <div class="col-sm-6">
            <h1>PowerBy-护理专家软件组</h1>
            <p>
              <br>地址：南昌市-南昌大学前湖校区-天健圆19栋11楼工作室</p>
            <br>© 2016-2066 hlzjrjz.com 版权所有</div>
          <div class="col-sm-6">
            <p class="text-info text-right">
              <br>
              <br>
            </p>
            <div class="row">
              <div class="col-md-12 hidden-lg hidden-md hidden-sm text-left">
                <a href="#"><i class="fa fa-3x fa-fw fa-instagram text-inverse"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-facebook text-inverse"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-github text-inverse"></i></a>
              </div>
            </div>
            <div class="row">
              <div class="col-md-12 hidden-xs text-right">
                <button type="button" class="btn btn-link popover-hide" title="联系邮箱" data-toggle="popover" data-content="442961832@qq.com" data-placement="left" data-container="body">
                  <i class="fa fa-3x fa-fw text-inverse fa-envelope-o"></i>
                </button>
                <button type="button" class="btn btn-link popover-hide" title="联系qq" data-toggle="popover" data-content="442961832" data-placement="left" data-container="body">
                  <i class="fa fa-3x fa-fw text-inverse fa-qq"></i>
                </button>
                <button type="button" class="btn btn-link popover-hide" title="联系电话" data-toggle="popover" data-content="13037239781" data-placement="left" data-container="body">
                  <i class="fa fa-3x fa-fw text-inverse fa-phone"></i>
                </button>
                <button type="button" class="btn btn-link popover-hide" title="github" data-toggle="popover" data-content="https://github.com/hlzjrjz" data-placement="left" data-container="body">
                  <i class="fa fa-3x fa-fw fa-github text-inverse"></i>
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </footer>
    <br>
    <script>
      $(function () { $('.popover-show').popover('show');});
                                      		$(function () { $('.popover-hide').popover('hide');});
                                      		$(function () { $('.popover-destroy').popover('destroy');});
                                      		$(function () { $('.popover-toggle').popover('toggle');});
                                      		$(function () { $(".popover-options a").popover({html : true });});
    </script>
  

</body></html>
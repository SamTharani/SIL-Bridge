<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Student Account - SIL-Bridge</title>
</head>
<body>
<br>
<div class="main">
<div class="main-inner">
<div class="container">
    <div class="row">
        <div class="span12">
            <div class="widget ">
                <div class="widget-header">
                    <i class="icon-user"></i>
                    <h3>Create Your Account</h3>
                </div>
                <!-- /widget-header -->

                <div class="widget-content"><br>
                    <div class="tab-pane" id="formcontrols">
                        <form:form id="add-profile" class="form-horizontal" method="post" action="addStudent" commandName="student">
                            <fieldset>

                                <div class="control-group">
                                    <label class="control-label" for="firstName">First Name</label>

                                    <div class="controls">
                                        <form:input type="text" class="span6" id="firstName" value="John" path="firstName"/>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->


                                <div class="control-group">
                                    <label class="control-label" for="lastName">Last Name</label>

                                    <div class="controls">
                                        <form:input type="text" class="span6" id="lastName" value="Donga" path="lastName"/>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->


                                <div class="control-group">
                                    <label class="control-label" for="email">Email Address</label>

                                    <div class="controls">
                                        <input type="text" class="span4" id="email"
                                               value="john.donga@egrappler.com">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="homeaddress">Home Address</label>

                                    <div class="controls">
                                        <input type="text" class="span4" id="homeaddress"
                                               value="john.donga@egrappler.com">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->


                                <div class="control-group">
                                    <label class="control-label">Gender</label>


                                    <div class="controls">
                                        <label class="radio inline">
                                            <input type="radio" name="male"> Male
                                        </label>

                                        <label class="radio inline">
                                            <input type="radio" name="female"> Female
                                        </label>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="dob">Date Of Birth</label>

                                    <div class="controls">
                                        <input type="date" class="span6" id="dob" value=" ">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="studentid">Student Id</label>

                                    <div class="controls">
                                        <input type="text" class="span6" id="studentid" value=" ">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label">University Name</label>

                                    <div class="controls">
                                        <div class="btn-group">
                                            <a class="btn btn-primary" href="#"><i class=""></i>Universities</a>
                                            <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"></span></a>
                                            <ul class="dropdown-menu">
                                                <li><a href="#"><i class=""></i> UOJ</a></li>
                                                <li><a href="#"><i class=""></i> UOM</a></li>
                                                <li><a href="#"><i class=""></i> UVA</a></li>
                                                <li class="divider"></li>
                                                <!--  <li><a href="#"><i class="i"></i> Make admin</a></li>     -->
                                            </ul>
                                        </div>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label">Faculty Name</label>

                                    <div class="controls">
                                        <div class="btn-group">
                                            <a class="btn btn-primary" href="#"><i class=""></i> Faculties</a>
                                            <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown"
                                               href="#"><span class="caret"></span></a>
                                            <ul class="dropdown-menu">
                                                <li><a href="#"><i class=""></i> Science</a></li>
                                                <li><a href="#"><i class=""></i> Arts</a></li>
                                                <li><a href="#"><i class=""></i> Management</a></li>
                                                <li class="divider"></li>
                                                <!--  <li><a href="#"><i class="i"></i> Make admin</a></li>     -->
                                            </ul>
                                        </div>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="course">Course Of Studies</label>

                                    <div class="controls">
                                        <input type="text" class="span6" id="course" value=" ">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="username">User Name</label>

                                    <div class="controls">
                                        <input type="text" class="span6" id="username" value=" ">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="password1">Password</label>

                                    <div class="controls">
                                        <input type="password" class="span4" id="password1"
                                               value="thisispassword">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->


                                <div class="control-group">
                                    <label class="control-label" for="password2">Confirm Password</label>

                                    <div class="controls">
                                        <input type="password" class="span4" id="password2"
                                               value="thisispassword">
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <br/>


                                <div class="form-actions">
                                    <form:button type="submit" class="btn btn-primary">Save</form:button>
                                    <button class="btn">Cancel</button>
                                </div>
                                <!-- /form-actions -->
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
            <!-- /widget-content -->
        </div>
        <!-- /widget -->
    </div>
    <!-- /span8 -->
</div>
<!-- /row -->
</div>
<!-- /container -->
</div>
<!-- /main-inner -->
</div> <!-- /main -->
</body>
</html>

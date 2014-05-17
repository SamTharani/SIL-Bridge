<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Account - Bootstrap Admin Template</title>
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

                        <h3>Your Account</h3>
                    </div>
                    <!-- /widget-header -->

                    <div class="widget-content">

                        <div class="tab-pane" id="formcontrols">
                            <form:form id="edit-profile" class="form-horizontal" method="post" action="addLecturer" commandName="lecturer">
                                <fieldset>

                                    <div class="control-group">
                                        <label class="control-label" for="firstName">First Name</label>

                                        <div class="controls">
                                            <form:input type="text" class="span6" id="firstName" path="firstName"/>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->


                                    <div class="control-group">
                                        <%--@declare id="lastname"--%>
                                            <label class="control-label" for="lastName">Last Name</label>

                                        <div class="controls">
                                            <form:input type="text" class="span6" id="lastname" path="lastName"/>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->


                                    <div class="control-group">
                                        <label class="control-label" for="email">Email Address</label>

                                        <div class="controls">
                                            <form:input type="text" class="span4" id="email" path="email" />
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->

                                    <div class="control-group">
                                        <label class="control-label" for="homeAddress">Home Address</label>

                                        <div class="controls">
                                            <form:input type="text" class="span4" id="homeAddress" path="homeAddress"/>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->


                                    <div class="control-group">
                                        <label class="control-label">Gender</label>


                                        <div class="controls">
                                            <label class="radio inline">
                                                <form:radiobutton  value="male" path="gender"/> Male
                                            </label>

                                            <label class="radio inline">
                                                <form:radiobutton value="female" path="gender"/> Female
                                            </label>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->

                                    <div class="control-group">
                                        <label class="control-label" for="dob">Date Of Birth</label>

                                        <div class="controls">
                                            <form:input type="date" class="span6" id="dob" path="dob"/>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->

                                    <div class="control-group">
                                        <label class="control-label">University Name</label>

                                        <form:select id="grade" class="selectpicker" path="university">
                                            <form:option value="1">UOJ</form:option>
                                            <form:option value="2">UMO</form:option>
                                            <form:option value="3">UCC</form:option>
                                            <form:option value="4">Rukunu</form:option>
                                            <form:option value="5">SLIIT</form:option>
                                        </form:select>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->

                                    <div class="control-group">
                                        <label class="control-label">Faculty Name</label>

                                        <form:select id="grade" class="selectpicker" path="faculty">
                                            <form:option value="1">Science</form:option>
                                            <form:option value="2">Arts</form:option>
                                            <form:option value="3">Management</form:option>
                                            <form:option value="4">Agriculture</form:option>
                                            <form:option value="5">Medicine</form:option>
                                        </form:select>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->


                                    <div class="control-group">
                                        <label class="control-label" for="username">User Name</label>

                                        <div class="controls">
                                            <form:input type="text" class="span6" id="username" path="username"/>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->

                                    <div class="control-group">
                                        <label class="control-label" for="password1">Password</label>

                                        <div class="controls">
                                            <input type="password" class="span4" id="password1">
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->


                                    <div class="control-group">
                                        <label class="control-label" for="password2">Confirm Password</label>

                                        <div class="controls">
                                            <form:input type="password" class="span4" id="password2"
                                                   path="repassword"/>
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

</div> <!-- /main-inner -->

</div> <!-- /main -->

</body>

</html>

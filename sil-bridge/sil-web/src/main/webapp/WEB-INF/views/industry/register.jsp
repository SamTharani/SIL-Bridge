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
                                <form:form id="edit-profile" class="form-horizontal" method="post" action="addIndustry" commandName="industry">
                                    <fieldset>

                                        <div class="control-group">
                                            <%--@declare id="name"--%><label class="control-label" for="name">Name</label>

                                            <div class="controls">
                                                <form:input type="text" class="span6" id="name" path="name"/>
                                            </div>
                                            <!-- /controls -->
                                        </div>
                                        <!-- /control-group -->


                                        <div class="control-group">
                                            <label class="control-label" for="email">Email Address</label>

                                            <div class="controls">
                                                <form:input type="text" class="span4" id="email" path="email"/>
                                            </div>
                                            <!-- /controls -->
                                        </div>
                                        <!-- /control-group -->

                                        <div class="control-group">
                                            <label class="control-label" for="address">Address</label>

                                            <div class="controls">
                                                <input type="text" class="span4" id="address" path="address">
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

                                        <div class="control-group">
                                            <label class="control-label" for="webid">Web Address</label>

                                            <div class="controls">
                                                <input type="text" class="span4" id="webid" value="">
                                            </div>
                                            <!-- /controls -->
                                        </div>
                                        <!-- /control-group -->


                                        <div class="control-group">
                                            <label class="control-label" for="payment">Membership Payment</label>

                                            <div class="controls">
                                                <input type="decimal" class="span4" id="payment" value="">
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


            </div>
            <!-- /widget-content -->

        </div>
        <!-- /widget -->

    </div>
    <!-- /span8 -->


</div>
<!-- /row -->

<%--</div> <!-- /container -->

</div> <!-- /main-inner -->

</div> <!-- /main -->--%>

</body>

</html>

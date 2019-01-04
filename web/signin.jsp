<!--
-- Simple sign in from with bootstrap.
--
--
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in</title>
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <div class="span3">
            <h2>Sign In</h2>
            <form class="form" action="UserServletSignin" method="post" align="center">
                <label>Email Address</label>
                <input type="email" name="mail" id="email" class="span3" required="true">
                <label>Password</label>
                <input type="password" name="password" class="span3" required="true">
                <input type="submit" value="Sign in" class="btn btn-primary pull-right">
                <a href="signup.jsp">Sign UP</a>
                <div class="clearfix"></div>
                <br/><br/>
                <spam class="message">${message}</spam>
            </form>
        </div>
    </div>
</div>
</div>
</body>
</html>



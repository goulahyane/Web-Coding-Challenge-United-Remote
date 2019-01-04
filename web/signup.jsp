<!--
-- Simple sign up form with bootstrap.
-- 
--
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>        
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>

        <div class="span3">
            <h2>Sign Up</h2>
            <form id="i" action="UserServletSignup" method="post" align="center">
                <label>First Name</label>
                <input type="text" name="firstName" class="span3" required="true">
                <label>Last Name</label>
                <input type="text" name="secondName" class="span3" required="true">
                <label>Email Address</label>
                <input type="email" name="mail" id="email" class="span3" required="true">
                <label>Password</label>
                <input type="password" name="password" class="span3">
                <input type="submit" value="Sign up" class="btn btn-primary pull-right" required="true">
                <a href="signin.jsp">Sign In</a>
                <div class="clearfix"></div>
                <br/><br/>
                <spam class="message">${message}</spam>
            </form>
        </div>
    </body>
</html>

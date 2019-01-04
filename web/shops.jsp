<!--
-- This jsp file, list shops in a from using bootstrap and html5.
-->
<%@page import="Controller.ShopController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Model.Shop"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nearby Shops</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous"/>
        <link href="http://www.w3.org/html/logo/downloads/HTML5_Badge_512.png" rel="icon"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <div></div>
        <div align="right">
            <form class="form" action="logOut" method="post" >
                <input type="submit" value="Log Out" class="btn btn-primary pull-right"/>
            </form>
        </div> <!--Log out button-->
        <div align="left">
            <form action="preferredShopsServlet" method="get" id="preferred" class="form">
                <a href="javascript:{}" onclick="document.getElementById('preferred').submit();">Preferred Shops</a> 
            </form>
        </div> <!-- Preferred shops redirections  -->


        <form action="ShopServelet" method="POST">
            <!--
            -- The following java code call and instantiate the Array list of shops
            -->
            <% ArrayList<Shop> shops = new ArrayList<Shop>();
                if (request.getAttribute("shops") != null) {
                    shops = (ArrayList) request.getAttribute("shops");
                } else {
                    shops = new ArrayList<Shop>();
                }

                Iterator<Shop> list = shops.iterator();
            %>
        </form> 
        <div class="container bg-light">
            <div id="cards" class="bg-light">
                <h3 class="font-weight-light text-center my-3">Nearby Shops</h3>
                <div class="container-fluid mx-auto d-none d-md-block my-3">
                    <div class="row">
                        <!--
                        -- Browse all items in shop list then print name, id and the image.
                        -->
                        <% while (list.hasNext()) {
                                Shop s = list.next();
                        %>
                        <!-- For shop in shops show print name, image and id in the right position.-->
                        <div class="col-6 col-lg-3 d-flex mb-3">
                            <form action="likedShopsServlet" method="post" >
                                <div class="card flex-fill">
                                    <div class="card-header bg-primary text-light rounded"> <%= s.getName()%></div>
                                    <div class="card-body">
                                        <img src="images/<%= s.getImg()%>" alt="card-alt-img-text" class="card-img-top img-fluid" />
                                    </div>
                                    <div class="card-footer">
                                        <input type="hidden" name="id" value="<%= s.getId()%>"/>
                                        <input class="btn btn-outline-primary text-primary d-block w-75 mx-auto" type="submit" value="like" />
                                    </div>
                                </div>
                            </form> <!-- Liked shops servlet -->
                        </div>
                        <%}%>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

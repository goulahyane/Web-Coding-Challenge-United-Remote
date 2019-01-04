<!--
-- The same with preferred shops, a java code included in ths jsp file in order to load data from 
-- preferred array list, 
-->
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Shop"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Preferred Shops</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous"/>
        <link href="http://www.w3.org/html/logo/downloads/HTML5_Badge_512.png" rel="icon"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>

        <div align="right">
            <form class="form" action="logOut" method="post" >
                <input type="submit" value="Log Out" class="btn btn-primary pull-right"/>
            </form>
        </div>
        <div align="left">
            <form action="ShopServlet" method="get" id="shops" class="form" >
                <a href="javascript:{}" onclick="document.getElementById('shops').submit();">Shops</a> 
            </form>
        </div>

        <div>
             <!--Load data from preferred shops array list-->
            <% ArrayList<Shop> shops = new ArrayList<Shop>();

                if (request.getAttribute("preferredShops") != null) {
                    shops = (ArrayList) request.getAttribute("preferredShops");
                } else {
                    shops = new ArrayList<Shop>();
                }
            %>
            <div class="container bg-light">
                <div id="cards" class="bg-light">
                    <h3 class="font-weight-light text-center my-3">Preferred Shops</h3>
                    <div class="container-fluid mx-auto d-none d-md-block my-3">
                        <div class="row">
                            <% Iterator<Shop> list = shops.iterator();
                                while (list.hasNext()) {
                                    Shop s = list.next();
                            %>
                            <div class="col-6 col-lg-3 d-flex mb-3">
                                <form action="removeLikedShop" method="post">
                                    <div class="card flex-fill">
                                        <div class="card-header bg-primary text-light rounded"> <%= s.getName()%></div>
                                        <div class="card-body">
                                            <img src="images/<%= s.getImg()%>" alt="card-alt-img-text" class="card-img-top img-fluid" />
                                        </div>
                                        <div class="card-footer">
                                            <input type="hidden" name="id" value="<%= s.getId()%>"/>
                                            <input type="submit" value="Remove" class="btn btn-outline-primary text-primary d-block w-75 mx-auto"/>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <%}%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@taglib uri="/struts-tags" prefix="s"%>
    <head>
    <title>Ropa's - Tu tienda online</title>
    	<link rel="shortcut icon" href="images/favicon.png">
    	        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
    	<link href="css/main.css" rel="stylesheet">
    	<link href="css/responsive.css" rel="stylesheet">
    	<script src="js/jquery-1.10.2.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
    		<div class="header-bottom responsive">
    			<div class="container">
    				<div class="row">
    					<div class="col-sm-12">
    						<div class="navbar-header">
    							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
    								<span class="sr-only">Toggle navigation</span>
    								<span class="icon-bar"></span>
    								<span class="icon-bar"></span>
    								<span class="icon-bar"></span>
    							</button>
    						</div>
    						<div class="mainmenu">
    							<ul class="nav navbar-nav collapse navbar-collapse">
    								<li><a href="/ropa/home" class="active">INICIO</a></li>
    								<li class="dropdown keep-open"><a href="">PRODUCTOS<i class="fa fa-angle-down"></i></a>
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="/ropa/productosMu">Mujeres</a></li>
    										<li><a href="/ropa/productosHo">Hombres</a></li>
    										<li><a href="/ropa/productosNi">Niños</a></li>
                                        </ul>
                                    </li>
    								<li><a href="/ropa/registro">REGISTRO</a></li>
    								<li><a href="Contacto">CONTACTO</a></li>
    							</ul>
    						</div>
    					</div>
    				</div>
    			</div>
    		</div>

    	</header>

        <h1><s:property value="Mensaje" /></h1>
    </body>
</html>
<%@ include file="/includes/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<title>Usuario - LogistikApp</title>
	
	<!-- bootstrap -->
	<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet" />
	<link href="css/bootstrap/fileinput.css" rel="stylesheet" />
	
	<!-- libraries -->
	<link href="css/libs/font-awesome.css" type="text/css" rel="stylesheet" />
	<link rel="stylesheet" href="css/libs/nanoscroller.css" type="text/css" />
	
	<!-- global styles -->
	<link rel="stylesheet" type="text/css" href="css/compiled/theme_styles.css">
	
    <!-- this page specific styles -->
    <link rel="stylesheet" type="text/css" href="css/logistikapp.css">
	
	<!-- Favicon -->
	<link type="image/x-icon" href="favicon.png" rel="shortcut icon" />
	
	<!-- Dwr script -->
	<script type='text/javascript' src='dwr/interface/UserServiceBean.js'></script>
	<script type='text/javascript' src='dwr/engine.js'></script>
	<script type='text/javascript' src='dwr/util.js'></script>
	
	<!-- google font libraries -->
	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700,300|Titillium+Web:200,300,400' rel='stylesheet' type='text/css'>
	
	<!--[if lt IE 9]>
			<script src="js/html5shiv.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
</head>

<body class="fixed-header fixed-leftmenu theme-blue">

	<header class="navbar" id="header-navbar">
		<c:import url="/html/menu-top.jsp" />
	</header>

		<div id="page-wrapper" class="container">
			<div class="row">
				<div id="nav-col">
					<section id="col-left" class="col-left-nano">
						<c:import url="/html/menu-left.jsp" />
					</section>
				</div>

				<div id="content-wrapper">
					<div class="row">
						<div class="col-lg-12">

							<div class="row">
								<div class="col-lg-6">
									<ol class="breadcrumb">
                                        <li><a href="home.htm"><spring:message code="label.breadcrumb.dashboard"/></a></li>
                                        <li><span><spring:message code="label.breadcrumb.configuration"/></span></li>
                                        <li class="active"><a href="userlist.htm"><spring:message code="label.breadcrumb.user"/></a></li>
									</ol>

									<div class="clearfix">
										<h1 class="pull-left"><spring:message code="${accion == 'add' ? 'label.config.user.add.title1' : 'label.config.user.upd.title1'}"/></h1>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
									<div class="main-box">
									
                                        <header class="main-box-header clearfix">
                                            <h2><spring:message code="${accion == 'add' ? 'label.config.user.add.title2' : 'label.config.user.upd.title2'}"/></h2>
                                        </header>
                                    
                                        <div class="main-box-body clearfix">
                                            <form id="form" method="post">
                                                <spring:bind path="command.login"><input type="hidden" id="login" name="login" value="${login}"/></spring:bind>
                                                <spring:bind path="command.id_user"><input type="hidden" id="id_user" name="id_user" value="${status.value}"/></spring:bind>
                                            
                                                <div class="form-group">
                                                    <label for="username">Nombre completo</label>
                                                    <spring:bind path="command.username">
                                                        <input type="text" class="form-control" id="username" name="username" placeholder="Ingresa el nombre del usuario" value="${status.value}" >
                                                    </spring:bind>
                                                </div>
                                                
                                                <div class="form-group">
                                                    <label for="passwd">Contrase?a</label>
                                                    <spring:bind path="command.passwd">
                                                        <input type="text" class="form-control" id="passwd" name="passwd" placeholder="Ingresa la contrase?a" value="${status.value}">
                                                    </spring:bind>
                                                </div>
                                                
                                                <div class="form-group">
                                                    <label for="email">Correo Electr&oacute;nico</label>
                                                    <spring:bind path="command.email">
                                                        <input type="email" class="form-control" id="email" name="email" placeholder="Ingresa correo electr&oacute;nico" value="${status.value}">
                                                    </spring:bind>
                                                </div>

                                                <button type="button" class="btn btn-default" onclick="javascript:cancelar();">Cancelar</button>
                                                <button type="submit" class="btn btn-success"><spring:message code="${accion == 'add' ? 'label.config.user.add.button' : 'label.config.user.upd.button'}"/></button>
                                                
                                            </form>
										</div>
								        <!-- BLOQUE DE ERROR -->
								        <div class="span4">
								        
								            <spring:hasBindErrors name="command">
									            <div class="alert alert-danger">
									                 ${errors.errorCount} error${errors.errorCount==1?'':'es'} al agregar el usuario:
									                 <ul>
									                    <c:forEach var="errMsgObj" items="${errors.allErrors}">
									                       <li>
									                          <spring:message code="${errMsgObj.code}" text="${errMsgObj.defaultMessage}"/>
									                       </li>
									                    </c:forEach>
									                 </ul>
									            </div>
								            </spring:hasBindErrors>
								        
								        </div>
								        <!-- /bloque error -->
										
									</div>
								</div>
							</div>

						</div>
					</div>

					<footer id="footer-bar" class="row">
						<c:import url="/html/footer.html" />
					</footer>
					
				</div>
			</div>
		</div>

	<!-- global scripts -->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/fileinput.js"></script>
	<script src="js/jquery.nanoscroller.min.js"></script>

	<!-- theme scripts -->
	<script src="js/scripts.js"></script>
	
	<!-- this page specific scripts -->
	<script>
	function cancelar() {
        location.href = "user-profile.htm";
        return true;
	};
	</script>
	
</body>

</html>
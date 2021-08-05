<%@ include file="/includes/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<title>Pa&iacute;ses - LogistikApp</title>
	
	<!-- bootstrap -->
	<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet" />
	
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
										<li class="active"><a href="countrylist.htm"><spring:message code="label.breadcrumb.country"/></a></li>
									</ol>

									<div class="clearfix">
										<h1 class="pull-left"><spring:message code="${accion == 'add' ? 'label.config.country.add.title1' : 'label.config.country.upd.title1'}"/></h1>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-lg-6">
									<div class="main-box">
									
                                        <header class="main-box-header clearfix">
                                            <h2><spring:message code="${accion == 'add' ? 'label.config.country.add.title2' : 'label.config.country.upd.title2'}"/></h2>
                                        </header>
                                    
                                        <div class="main-box-body clearfix">
                                            <form id="form" method="post">
                                            
                                                <div class="form-group">
                                                    <spring:hasBindErrors name="command">
                                                        <div class="alert alert-danger">
                                                            ${errors.errorCount} error${errors.errorCount==1?'':'es'} al ${accion == 'add' ? 'agregar' : 'modificar'} un pa�s
                                                         </div>
                                                    </spring:hasBindErrors>
                                                </div>
                                                
							                    <spring:bind path="command.id_country"><input type="hidden" id="id_country" name="id_country" value="${status.value}"/></spring:bind>
                                            
								                <spring:bind path="command.name">
								                    <div class="form-group ${status.error ? 'has-error' : '' }">
								                        <label for="passwd">Nombre (*)</label>
								                        <input type="text" class="form-control" id="name" name="name" placeholder="Ingresa nombre del pais" value="${status.value}" >
								                        <c:if test="${status.error}"><span class="help-block"><i class="fa fa-exclamation-triangle"></i> ${status.errorMessage}</span></c:if>
								                    </div>
                                                </spring:bind>
                                                
                                                <spring:bind path="command.code">
                                                    <div class="form-group ${status.error ? 'has-error' : '' }">
                                                        <label for="passwd">Codigo (*)</label>
                                                        <input type="text" class="form-control" id="code" name="code" placeholder="Ingresa un codigo" value="${status.value}">
                                                        <c:if test="${status.error}"><span class="help-block"><i class="fa fa-exclamation-triangle"></i> ${status.errorMessage}</span></c:if>
                                                    </div>
                                                </spring:bind>
                                                
                                                <spring:bind path="command.prefix">
                                                    <div class="form-group ${status.error ? 'has-error' : '' }">
                                                        <label for="prefix">Prefijo</label>
                                                        <input type="text" class="form-control" id="prefix" name="prefix" placeholder="Define un prefijo" value="${status.value}">
                                                        <c:if test="${status.error}"><span class="help-block"><i class="fa fa-exclamation-triangle"></i> ${status.errorMessage}</span></c:if>
                                                    </div>
                                                </spring:bind>
                                                
                                                <spring:bind path="command.orderby">
                                                    <div class="form-group">
                                                        <label for="orderby">Orden</label>
                                                        <input type="text" class="form-control" id="orderby" name="orderby" placeholder="Especifica un criterio de orden" value="${status.value}">
                                                    </div>
                                                </spring:bind>

                                                <spring:bind path="command.active">
                                                    <div class="form-group">
                                                        <div class="checkbox-nice">
                                                            <input type="checkbox" id="active" name="active" value="S" ${command.active == ACTIVE ? 'checked=checked' : ''} />
                                                            <label for="active">�Activo?</label>
                                                        </div>
                                                    </div>
                                                </spring:bind>
                                                
                                                <div class="form-group">
                                                    <button type="button" class="btn btn-default btn-xs pull-left" onclick="location.href = 'countrylist.htm';"><i class="fa fa-times fa-lg"/></i> Cancelar</button>
                                                    <button type="submit" class="btn btn-success btn-xs pull-right"><i class="fa fa-check fa-lg"/></i> <spring:message code="${accion == 'add' ? 'label.config.country.add.button' : 'label.config.country.upd.button'}"/></button>
                                                </div>
                                                
                                            </form>
										</div>
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
	<script src="js/jquery.nanoscroller.min.js"></script>

	<!-- theme scripts -->
	<script src="js/scripts.js"></script>
	
</body>

</html>

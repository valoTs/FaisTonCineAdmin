<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="CSS/Form.css" />
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Insert title here</title>
</head>
<body>

	<h1>Fais ton cine : Administration</h1>
	<div>
		<div class="bouton">
			<button id="ButonUser" onclick="affichage_users(0,null,null);">Utilisateurs</button>
			<button id="ButonIdea" onclick="affichage_idees(0,null,null);">Idées</button>
		</div>
		<div class="tri">
			<p id="trierPar">Trier par :</p>
			<select id="trier">
			<option></option>
			</select>
			<p id="textRecherche">Recherche :</p>
			<select id="recherche">
			<option></option>
			</select> 
			<input type="text" id="inputSearch" onchange="">
			<button id="boutonSearch"></button>
		</div>
	</div>
	<div class="tbl-content">
		<table id="table" cellpadding="0" cellspacing="0" border="0">
		</table>
	</div>



	<script>
		$('.js-pscroll').each(function() {
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function() {
				ps.update();
			})
		});
	</script>

	<script type="text/javascript" charset="UTF-8" src="http://localhost:8080/FaisTonCineAdmin/Idea.js"></script>
	<script type="text/javascript" charset="UTF-8" src="http://localhost:8080/FaisTonCineAdmin/User.js"></script>

</body>
</html>
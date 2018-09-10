$(document).ready(affichage_users(0));	


						
//state rpz l etat de recherche 
//si 0 : pas de recherche on a appelé la fonction via le tri 
//si 1 : recherche dans user
//si 2 : recherche dans idea

function affichage_users(etat,libelleSearch, paramSearch){
	if (window.XMLHttpRequest) {
		
		var selectTri = document.getElementById("trier");
		var selectSearch = document.getElementById("recherche");
		var indiceTri = selectTri.selectedIndex;
		var indiceSearch = selectSearch.selectedIndex;
		
		var libelleRecherche = selectSearch.options[indiceSearch].value;
		var inputSearch = document.getElementById("inputSearch").value;
		var path;
		if(libelleSearch==null && paramSearch==null){
			 path = "indiceTri="+indiceTri+"&indiceSearch="+indiceSearch+"&etat="+etat+"&libelleSearch="+libelleSearch+"&paramSearch="+paramSearch;
		}else{
			 path = "indiceTri="+indiceTri+"&indiceSearch="+indiceSearch+"&etat="+etat+"&libelleRecherche="+libelleRecherche+"&inputSearch="+inputSearch;
		}
		var url="RecuperationDonneeUser?"+path;
		console.log("url " + url);
		requete = new XMLHttpRequest();
		requete.open("GET", url,true);
		//TODO mettre condition sur le requete.send 
		requete.send(path);
		var table = requete.responseText;
		alert("affichage données utilisateur");
		
		
		console.log("indiceTri ="+indiceTri+"indiceSearch ="+ indiceSearch +"etat ="+etat+"libelle = "+ libelleRecherche+"valeure =" + inputSearch);
		document.getElementById("boutonSearch").innerHTML ="<button id=\"boutonSearch\" onclick=\"affichage_users(1,"+libelleRecherche+","+inputSearch+");\">Rechercher</button>";
		document.getElementById("table").innerHTML = requete.responseText;
		document.getElementById("trier").innerHTML = "<option onclick=\"affichage_users(0,null,null);\">Identifiant</option>"
			                                        +"<option onclick=\"affichage_users(0,null,null);\">Prénom</option>"
			                                        +"<option onclick=\"affichage_users(0,null,null);\">Nom</option>"
			                                        +"<option onclick=\"affichage_users(0,null,null);\">Email</option>"
			                                        +"<option onclick=\"affichage_users(0,null,null);\">Nombre d'idées</option>";
		
		document.getElementById("recherche").innerHTML = "<option>Identifiant</option>"
				                                        +"<option>Prénom</option>"
				                                        +"<option>Nom</option>"
				                                        +"<option>Email</option>"
				                                        +"<option>Nombre d'idées</option>";
		
		
		
		console.log("reponse texte : "+ requete.responseText);

	} else if (window.ActiveXObject) {
		console.log("statut : 2");
		document.getElementById("boutonSearch").innerHTML ="<button id=\"boutonSearch\" onclick=\"affichage_users(1,"+libelleSearch+","+inputSearch+");\">Rechercher</button>";
		requete = new ActiveXObject(
				"Microsoft.XMLHTTP");
		if (requete) {
			console.log("statut : 3");
			document.getElementById("boutonSearch").innerHTML ="<button id=\"boutonSearch\" onclick=\"affichage_users(1,"+libelleSearch+","+inputSearch+");\">Rechercher</button>";
			requete.open("GET",url, true);
			requete.send();
		}
	} else {
		alert("Le navigateur ne supporte pas la technologie AJAX");
	}
}

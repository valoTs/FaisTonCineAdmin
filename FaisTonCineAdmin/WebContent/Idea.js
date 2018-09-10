

function affichage_idees(etat){
	if (window.XMLHttpRequest) {
		console.log("statut : 1");
		var selectTri = document.getElementById("trier");
		var selectSearch = document.getElementById("recherche");
		
		var indiceTri = selectTri.selectedIndex;
		var indiceSearch = selectSearch.selectedIndex;
		console.log("indiceTri :"+indiceTri);
		console.log("indiceSearch :"+indiceSearch);
		console.log("etat" + etat);
		var url = "RecuperationDonneeIdea?indiceTri="+indiceTri+"&indiceSearch="+indiceSearch+"&etat="+etat;
		requete = new XMLHttpRequest();
		requete.open("GET", url,true);
		requete.send("indiceTri"+indiceTri +"&indiceSearch"+indiceSearch+"&etat"+etat);
		var table = requete.responseText;
		alert("affichage données idées");
		document.getElementById("table").innerHTML = requete.responseText;
		document.getElementById("trier").innerHTML = "<option onclick=\"affichage_idees(0);\">Identifiant idée</option>"
		                                            +"<option onclick=\"affichage_idees(0);\">Identifiant Utilisateur</option>"
		                                            +"<option onclick=\"affichage_idees(0);\">Libelle</option>"
		                                            +"<option onclick=\"affichage_idees(0);\">Diffusabilité</option>"
		                                            +"<option onclick=\"affichage_idees(0);\">Date</option>";
		
		document.getElementById("recherche").innerHTML = "<option>Identifiant</option>"
				                                        +"<option>Id Utilisateur</option>"
				                                        +"<option>Libelle</option>"
				                                        +"<option>Diffusable</option>"
				                                        +"<option>Date</option>"
				                                        +"<option>Contenu</option";
		
		document.getElementById("boutonSearch").innerHTML ="<button id=\"boutonSearch\" onclick=\"affichage_idees(2);\">Rechercher</button>";
		console.log("reponse texte : "+ requete.responseText);

	} else if (window.ActiveXObject) {
		console.log("statut : 2");
		requete = new ActiveXObject(
				"Microsoft.XMLHTTP");
		if (requete) {
			console
					.log("statut : 3");
			requete.open("GET",
					url, true);
			//requete.onreadystatechange = majIHM;
			requete.send();
		}
	} else {
		alert("Le navigateur ne supporte pas la technologie AJAX");
	}
}
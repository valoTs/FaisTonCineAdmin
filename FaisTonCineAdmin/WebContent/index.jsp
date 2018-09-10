
<!DOCTYPE html5>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="CSS/Form.css" />
<title>Insert title here</title>
</head>
<body>

     
     <form method="Post" action="Connexion" >
                
                <fieldset class="formulaire">
                     
                    
                    <label for="Username">Username </label>
                    <input type="text" id="Username" name="Username" size="20" maxlength="25" />
                    <span class="erreur">${erreurs['Username']}</span>
                    
                    <br />
                    <label for="Password">Password </label>
                    <input type="text" id="Password" name="Password" size="20" maxlength="25" />
                    <span class="erreur">${erreurs['Password']}</span>                  
                    
                </fieldset>
                
                <fieldset>
                 <label>
                        <button type='submit'>Envoyer</button>
                    </label>
                    
                    <p class="${empty MapError ? 'succes' : 'erreur'}">${message}</p>
                </fieldset>
     
            </form>
</body>
</html>
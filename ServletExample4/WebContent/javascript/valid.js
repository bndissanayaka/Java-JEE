/*  
 * Function checkInput() in validate.js does following
 * Validates username and password to be not null
 * Restrict the number of attempts to 3 
 *
 * Date: 2016-09-22
 */
var attempt = 3;
/*if (attempt == 0) {
	document.getElementById("u_id").disabled = true;
	document.getElementById("pid").disabled = true;
	document.getElementById("submit").disabled = true;
}*/
function checkInput() {

	var username = document.getElementById("u_id").value;
	var password = document.getElementById("pid").value;

	if (username == null || username == "" || password == null
			|| password == "") {
		if (username == null || username == "") {
			alert("Please Enter User Name");
		} else {
			alert("Please Enter Password");
		}
		/*attempt--;

		alert("You have left " + attempt + " attempt;");*/

		return false;

	} else {
		return true;
	}

}

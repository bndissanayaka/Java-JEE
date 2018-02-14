/**
 * This script validates registration form data
 */
function validRegData() {
	var fname = document.getElementById("fn").value;
	var lname = document.getElementById("ln").value;
	var studId = document.getElementById("sid").value;
	var age = document.getElementById("age").value;
	var dob = document.getElementById("dob").value;
	var telNo = document.getElementById("tel").value;
	var address = document.getElementById("addrs").value;
	var nicNo = document.getElementById("nic").value;
	var country = document.getElementById("cntry").value;
	var city = document.getElementById("city").value;
	var other = document.getElementById("other").value;
	var returnRes;

	if (studId.length < 9) {
		alert("Invalid ID, please re-enter");
	}
	if (age > 50) {
		alert("You are not in the allowed age limit");
	}
	if (telNo.length > 10) {
		alert("Invalid phone number, please re-enter");
	}
	/*if (nicNo.length < 11) {
		alert("Invalid NIC, please re-enter");*/
	}
	if (!/^\d{4}\/\d{1,2}\/\d{1,2}$/.test(dob)){
		alert("Invalid date format, Please enter as yyyy/mm/dd");
	}
	/*else{
	// Parse the date parts to integers
	var parts = dob.split("/");
	var day = parseInt(parts[1], 10);
	var month = parseInt(parts[0], 10);
	var year = parseInt(parts[2], 10);
	
	// Check the ranges of month and year
	if ( month == 0 || month > 12)
		alert("Invalid /month!!");
	
	var monthLength = [ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];
	
	// Adjust for leap years
	if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		monthLength[1] = 29;
	
	// Check the range of the day
	return day > 0 && day <= monthLength[month - 1];
	}*/

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
...
<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<sb:head />
</head>
<body>
	<s:actionerror theme="bootstrap" />
	<s:actionmessage theme="bootstrap" />
	<s:fielderror theme="bootstrap" />


	<s:form action="index" enctype="multipart/form-data" theme="bootstrap" method="POST"
		cssClass="form-horizontal" label="A sample horizontal Form">
		<s:textfield label="Name" name="name" tooltip="Enter your Name here" />

		<s:textfield label="Textfield with Error" name="error" />

		<s:textarea tooltip="Enter your Biography" label="Biography"
			name="bio" cols="20" rows="3" />

		<s:select tooltip="Choose Your Favourite Color" label="Favorite Color"
			list="{'Red', 'Blue', 'Green'}" name="favouriteColor"
			emptyOption="true" headerKey="None" headerValue="None" />

		<s:checkboxlist tooltip="Choose your Friends" label="Friends"
			list="{'Wes', 'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}"
			name="friends" />

		<s:checkboxlist tooltip="Checkboxes with inline position"
			labelposition="inline" label="Friends Inline"
			list="{'Wes', 'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}"
			name="friendsInline" />

		<s:radio tooltip="Choose your Best Friend" label="Best Friend"
			list="{'Wes', 'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}"
			name="bestFriend" cssErrorClass="foo" />

		<s:radio tooltip="Radio Buttons with inline position"
			label="Best Friend Inline" labelposition="inline"
			list="{'Wes', 'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}"
			name="bestFriend" cssErrorClass="foo" />

		<s:checkbox tooltip="Confirmed that your are Over 18" label="Age 18+"
			name="legalAge" />

		<s:file tooltip="Upload Your Picture" label="Picture" name="picture" />

		<s:optiontransferselect
			tooltip="Select Your Favourite Cartoon Characters"
			label="Favourite Cartoons Characters"
			name="leftSideCartoonCharacters" leftTitle="Left Title"
			rightTitle="Right Title" list="{'Popeye', 'He-Man', 'Spiderman'}"
			multiple="true" headerKey="headerKey"
			headerValue="--- Please Select ---" emptyOption="true"
			doubleList="{'Superman', 'Mickey Mouse', 'Donald Duck'}"
			doubleName="rightSideCartoonCharacters"
			doubleHeaderKey="doubleHeaderKey"
			doubleHeaderValue="--- Please Select ---" doubleEmptyOption="true"
			doubleMultiple="true" />

		<s:textarea label="Your Thougths" name="thoughts"
			tooltip="Enter your thoughts here" />

		<s:submit cssClass="btn" />
	</s:form>
</body>
</html>
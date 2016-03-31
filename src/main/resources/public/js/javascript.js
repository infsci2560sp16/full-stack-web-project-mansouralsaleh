function init(){
	document.getElementById("SignIn").onclick=function(){
		if(document.getElementById("sign").style.display=="block"){
		
			this.style.backgroundColor = "gray";
			this.style.borderColor = "gray";
			document.getElementById("sign").style.display="none";
		}
		else {
				this.style.backgroundColor = "#909090";
				this.style.borderColor = "#909090";
				document.getElementById("sign").style.display="block";
			}
	};	
}
function init2(){
	document.getElementById("MyInfo").style.backgroundColor="#424242";
}
function clickedMe(menu, div){
	document.getElementById(div).style.display="block";
	document.getElementById(menu).style.backgroundColor="#424242";
	
	if(div=="MyInfoDiv"){
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#909090";
		document.getElementById("MyBooks").style.backgroundColor="#909090";
		document.getElementById("RecView").style.backgroundColor="#909090";
		document.getElementById("MyCom").style.backgroundColor="#909090";
	}
	else if(div=="AddBookDiv"){
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("MyBooks").style.backgroundColor="#909090";
		document.getElementById("MyInfo").style.backgroundColor="#909090";
		document.getElementById("RecView").style.backgroundColor="#909090";
		document.getElementById("MyCom").style.backgroundColor="#909090";
	}
	else if(div=="MyBooksDiv"){
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#909090";
		document.getElementById("MyInfo").style.backgroundColor="#909090";
		document.getElementById("RecView").style.backgroundColor="#909090";
		document.getElementById("MyCom").style.backgroundColor="#909090";
	}
	else if(div=="RecViewDiv"){
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#909090";
		document.getElementById("MyBooks").style.backgroundColor="#909090";
		document.getElementById("MyInfo").style.backgroundColor="#909090";
		document.getElementById("MyCom").style.backgroundColor="#909090";
	}
	else if(div=="MyComDiv"){
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#909090";
		document.getElementById("MyBooks").style.backgroundColor="#909090";
		document.getElementById("RecView").style.backgroundColor="#909090";
		document.getElementById("MyInfo").style.backgroundColor="#909090";
	}
}
//This function and code associated with it was taken from http://www.jquerybyexample.net/2012/06/get-url-parameters-using-jquery.html
function GetURLParameter(sParam)
{
    var sPageURL = window.location.search.substring(1);
    var sURLVariables = sPageURL.split('&');
    for (var i = 0; i < sURLVariables.length; i++)
    {
        var sParameterName = sURLVariables[i].split('=');
        if (sParameterName[0] == sParam)
        {
            return sParameterName[1];
        }
	}
}
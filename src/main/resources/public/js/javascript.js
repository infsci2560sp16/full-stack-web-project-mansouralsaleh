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
	document.getElementById("MyInfo").style.backgroundColor="#0099cc";
}
function clickedMe(menu, div){
	document.getElementById(div).style.display="block";
	document.getElementById(menu).style.backgroundColor="#0099cc";
	
	if(div=="MyInfoDiv"){
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#33b5e5";
		document.getElementById("MyBooks").style.backgroundColor="#33b5e5";
		document.getElementById("RecView").style.backgroundColor="#33b5e5";
		document.getElementById("MyCom").style.backgroundColor="#33b5e5";
	}
	else if(div=="AddBookDiv"){
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("MyBooks").style.backgroundColor="#33b5e5";
		document.getElementById("MyInfo").style.backgroundColor="#33b5e5";
		document.getElementById("RecView").style.backgroundColor="#33b5e5";
		document.getElementById("MyCom").style.backgroundColor="#33b5e5";
	}
	else if(div=="MyBooksDiv"){
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#33b5e5";
		document.getElementById("MyInfo").style.backgroundColor="#33b5e5";
		document.getElementById("RecView").style.backgroundColor="#33b5e5";
		document.getElementById("MyCom").style.backgroundColor="#33b5e5";
	}
	else if(div=="RecViewDiv"){
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("MyComDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#33b5e5";
		document.getElementById("MyBooks").style.backgroundColor="#33b5e5";
		document.getElementById("MyInfo").style.backgroundColor="#33b5e5";
		document.getElementById("MyCom").style.backgroundColor="#33b5e5";
	}
	else if(div=="MyComDiv"){
		document.getElementById("MyBooksDiv").style.display="none";
		document.getElementById("RecViewDiv").style.display="none";
		document.getElementById("MyInfoDiv").style.display="none";
		document.getElementById("AddBookDiv").style.display="none";
		document.getElementById("AddBook").style.backgroundColor="#33b5e5";
		document.getElementById("MyBooks").style.backgroundColor="#33b5e5";
		document.getElementById("RecView").style.backgroundColor="#33b5e5";
		document.getElementById("MyInfo").style.backgroundColor="#33b5e5";
	}
}
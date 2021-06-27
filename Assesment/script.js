
 const signUp = e =>{
    var fname = document.getElementById("loginname").value;
         localStorage.setItem("textname",fname);
    var  femail = document.getElementById("loginemail").value;
    localStorage.setItem("textemail",femail);
    var   fnumber = document.getElementById("loginnumber").value;
    localStorage.setItem("textnumber",fnumber);
    var  faddress = document.getElementById("loginaddress").value;
    localStorage.setItem("textaddress",faddress);
    var  flinkedin = document.getElementById("loginlinkedin").value;
    localStorage.setItem("textlinkedin",flinkedin);


   
      e.preventdefault();
     
 }


 

    document.getElementById('name').innerHTML=localStorage.getItem("textname");
    document.getElementById('mail').innerHTML=localStorage.getItem("textemail");
    document.getElementById('number').innerHTML=localStorage.getItem("textnumber");
    document.getElementById('address').innerHTML=localStorage.getItem("textaddress");
    document.getElementById('linkedin').innerHTML=localStorage.getItem("textlinkedin");

 

 

 const signUp = e =>{
     let formdata ={
         fname : document.getElementById("loginname").value,
         femail : document.getElementById("loginemail").value,
         fnumber : document.getElementById("loginnumber").value,
         faddress : document.getElementById("loginaddress").value,
         flinkedin : document.getElementById("loginlinkedin").value,
     }
     localStorage.setItem("formdata",JSON.stringify(formdata));
     e.preventDefault();
     
 }


 function display(){
    let[fname , femail, fnumber, faddress, flinkedin] = JSON.parse(localStorage.getItem('formdata'));

    document.getElementById('name').innerHTML=`${fname}`;
    document.getElementById('email').innerHTML=`${femail}`;
    document.getElementById('number').innerHTML=`${fnumber}`;
    document.getElementById('address').innerHTML=`${faddress}`;
    document.getElementById('linkedin').innerHTML=`${flinkedin}`;

 }

 
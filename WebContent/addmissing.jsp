<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Missing Person Identification</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha512-SfTiTlX6kk+qitfevl/7LibUOeJWlt9rbyDn92a1DqWOw9vWG2MFoays0sgObmWazO5BQPiFucnnEAjpAB+/Sw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/typed.js/2.0.11/typed.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"/>

</head>
<body>
    <div class="scroll-up-btn">
        <i class="fa fa-angle-up"></i>
    </div>
    <nav class="navbar">
        <div class="max-width">
            <div class="logo"><a href="dashboardpolice.html">We <span>Care...</span></a></div>
            <ul class="menu">
                <li><a href="addmissing.jsp" class="menu-btn">Add Missing Person</a></li>
                <li><a href="viewmissingtopolice.jsp" class="menu-btn">View Missing Person</a></li>
                <li><a href="viewfinder.jsp" class="menu-btn">View Finder Log</a></li>
                
                <li><a href="#contact" class="menu-btn">Contact</a></li>
            </ul>
            <div class="menu-btn">
                <i class="fa fa-bars"></i>
            </div>
        </div>
    </nav>

    <!-- home-->
    <section class="home" id="home">
        <div class="max-width">
            <div class="home-content">
                
                <!DOCTYPE html>
<html>
<head>
    <title>Missing Person Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .form-container {
            width: 400px;
            margin: 0 auto;
            padding: 8px;
            background-color: #050303;
            border-radius: 30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .form-container h2 {
            text-align: center;
        }

        .form-container label {
            display: block;
            margin-bottom: 10px;
        }

        .form-container input[type="text"],
        .form-container input[type="email"],
        .form-container input[type="password"]
        
        {
            width: 90%;
            padding: 9px;
            border: 1px solid #ccc;
            border-radius: 13px;
             margin-left: 20px;
            
        }
        

        .form-container input[type="submit"] {
            width: 80%;
            padding: 10px;
            background-color: #2fcea4;
            border: none;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            border-radius: 5px;
            margin-left: 40px;
           
        }

        .form-container input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="form-container">
    
        <h2>Missing Person Form</h2>
        <form action="AddMissing" method="post" enctype="multipart/form-data">
        
            <label for="code"></label>
            <input type="text" placeholder="Name" id="code" name="name" required>

            <label for="name"></label>
            <input type="text" placeholder="Age"id="name" name="age" required>

            <label for="location"></label>
            <input type="text" placeholder="City" id="location" name="city" required>

            <label for="mobile"></label>
            <input type="text" placeholder="Last Seen" id="mobile" name="lastseen" required>

            <label for="password"></label>
            <input type="text"  placeholder="Identification Mark" id="password" name="idmark" required>
            
             <label for="password"></label>
            <input type="text"  placeholder="Height(in ft)" id="password" name="height" required>
             
            <label for="password"></label>
            <input type="text"  placeholder="Gender" id="password" name="gender" required>
            
              <label for="password"></label>
            <input type="text"  placeholder="color" id="password" name="color" required>
                      
            <label for="password" style="margin-left: 125px;margin-top: 5px;">upload image</label>
			<input type="file" name="photo" placeholder="Select file" accept=".gif, .jpg, .png" style="margin-left: 125px;margin-bottom: 5px;">
            
              <label for="password"></label>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
                
                
            </div>
        </div>
    </section>


    <!-- contact -->
    <section class="contact" id="contact">
        <div class="max-width">
            <h2 class="title">Contact us.</h2>
            <div class="contact-content">
                <div class="column left">
                    <div class="text"></div>
                   <!--   <p><li align="center" style="color: rgb(40, 216, 99);">To stay in my Contacts:</li> <br> <li>Just Follow me on GitHub. <div class="fa fa-github" style="color: rgb(62, 60, 60);"> </div></li> <li>Add me at snapchat. <div class="fa fa-snapchat" style="color: rgb(35, 209, 44);"> </div></li> <li>Follow me on Intagram and message me.<div class="fa fa-instagram" style="color: rgba(64, 64, 245, 0.919);"></div></li><li>You can also message me on Email given below.<div class="fa fa-handshake-o" style="color: rgb(67, 165, 54);"></div></li><li>Links Are given bellow just click on Icons.<div class="fa fa-hand-o-down" style="color: rgb(239, 231, 6);"></div></li> </p> -->
                    <div class="icons">
                        <div class="row">
                            <i class="fa fa-user"></i>
                            <div class="info">
                                <div class="head">Name :</div>
                                <div class="sub-title">Harsh Jain.</div>
                            </div>
                        </div>
                        <div class="row">
                            <i class="fa fa-map-marker"></i>
                            <div class="info">
                                <div class="head">Address :</div>
                                <div class="sub-title">Shirpur,India.</div>
                            </div>
                        </div>
                        <div class="row">
                            <i class="fa fa-envelope"></i>
                            <div class="info">
                                <div class="head">Email :</div>
                                <div class="sub-title">harshjain76200@gmail.com</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="column right">
                    <div class="text">Hello... <br>The impact of missing person can be life changing for families,friends and communities.<br> You should immediately report someone who is missing to the police <br><br> <span align="center" style="color: rgb(20, 219, 209); border: 2px; border-color: rgb(0, 255, 213); text-shadow:3px 4px 5px ; text-align: center; text-size-adjust: 24;  align-items: center; justify-content: center;">Empowering police through IT.</span> </div>
                    <!-- <form> action="https://formspree.io/f/mdobjndw" method="post">
                        <div class="fields">
                            <div class="field name">
                                <input type="text" placeholder="Name" required>
                            </div>
                            <div class="field email">
                                <input type="email" placeholder="Email" required>
                            </div>
                        </div>
                        <div class="field">
                            <input type="text" placeholder="Subject" required>
                        </div>
                        <div class="field textarea">
                            <textarea cols="30" rows="10" placeholder="Message.." required></textarea>-->
                        <div style="justify-content: center; align-items: center; width: 40px;
                        height: 40px;">
                     
                        
                        
                          </div>
                        <div><span><b syle="color:red;">Need Help ?</b> : &nbsp; <span class="foot">&nbsp; </span> | <span >Follow Us.&nbsp; <a href="https://www.instagram.com/techie_harsh_/" target="_blank"><i class="fa fa-instagram"></i> </a></span> &nbsp;& 
       <!--   <span><a href="https://github.com/Harsh76200" target="_blank"> &nbsp; <i class="fa fa-github"></i> </a></span>
        | &nbsp;   <span>Add me.<a href="https://accounts.snapchat.com/accounts/welcome" target="_blank"> &nbsp; <i class="fa fa-snapchat"></i> </a></span>
        | &nbsp; --><span>Email<a href="https://mail.google.com/mail/u/0/#inbox?compose=DmwnWrRspPbdVSbxHBJTXZxlbcZTXKtSHCVlNNKHnRLrddRGSLKPzdwQGVnSfjrdjdFDWXZnsPjG" target="_blank">&nbsp;<i class="fa fa-envelope"></i> </a></span></div> 
            
                         <footer>
        <span>Visit:&nbsp; <span class="foot"> &nbsp; </span> | <span >Follow Us.&nbsp; <a href="https://www.instagram.com/techie_harsh_/" target="_blank"><i class="fa fa-instagram"></i> </a></span> &nbsp;& 
        <!--<span><a href="https://github.com/Harsh76200" target="_blank"> &nbsp; <i class="fa fa-github"></i> </a></span>
        | &nbsp; <span>Add me.<a href="https://accounts.snapchat.com/accounts/welcome" target="_blank"> &nbsp; <i class="fa fa-snapchat"></i> </a></span>-->
        | &nbsp; <span>Email<a href="https://mail.google.com/mail/u/0/#inbox" target="_blank">&nbsp;<i class="fa fa-envelope"></i> </a></span>
    </footer>
                </div>
            </div>
        </div>
    </section>

    <!-- footer -->
   
    <script src="script.js"></script>

</html>
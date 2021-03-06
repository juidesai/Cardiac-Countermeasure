<%-- 
    Document   : doctor_reg
    Created on : 10 Jan, 2016, 9:52:10 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>CARDIAC COUNTERMEASURE : Doctor Registration </title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="css/font-awesome.min.css" rel="stylesheet">       
    <!-- Default Theme css file -->
    <link id="switcher" href="css/themes/default-theme.css" rel="stylesheet">      
    <!-- Slick slider css file -->
    <link href="css/slick.css" rel="stylesheet"> 
    <!-- Photo Swipe Image Gallery -->     
    <link rel='stylesheet prefetch' href='css/photoswipe.css'>
    <link rel='stylesheet prefetch' href='css/default-skin.css'>    

    <!-- Main structure css file -->
    <link href="style.css" rel="stylesheet">
   
    <!-- Google fonts -->
    <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]--> 
  </head>
  <body>    
    <!-- BEGAIN PRELOADER -->
    <div id="preloader">
      <div id="status">&nbsp;</div>
    </div>
    <!-- END PRELOADER -->

    <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"><i class="fa fa-heartbeat"></i></a>
    <!-- END SCROLL TOP BUTTON -->

    <!--=========== BEGIN HEADER SECTION ================-->
   <header id="header">
      <!-- BEGIN MENU -->
      <div class="menu_area">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">  
            <div class="container" style="height: 88px;">
            <div class="navbar-header">
              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>

              <!-- LOGO -->              
              <!-- TEXT BASED LOGO -->
              <a class="navbar-brand" href="index.html"><i class="fa fa-heartbeat"></i> <span>Cardiac Countermeasure</span></a>              
              <!-- IMG BASED LOGO  -->
              <!--  <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>   -->     
                     
            </div>
          </div>     
        </nav>  
      </div>
      <!-- END MENU -->    
    </header>
     <!--=========== END HEADER SECTION ================-->            
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2></h2>
                 <section id="contact">
      <div class="container">
        <div class="row">
          <div class="col-lg-7 col-md-7 col-sm-6">
            <div class="contact-form">
              <div class="section-heading">
                <h2> Doctor Registration Page</h2>
                <div class="line"></div>
              </div>
              <p>Fields mark with * are compulsory</p>
              <form name="doctorreg" method="post" class="submitphoto_form" action="docreg">
                  First Name: <input required type="text" class="wp-form-control wpcf7-text" placeholder="First name" name="d_firstname"></br>
                  Last Name: <input required type="text" class="wp-form-control wpcf7-text" placeholder="Last name" name="d_lastname"></br>
                Gender: <select name="gender"class="wp-form-control wpcf7-text" placeholder="Gender">
                    <option value="null">Select one</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
               </select></br>
               Birth Date: <input required type="date" class="wp-form-control wpcf7-text" placeholder="Birth Date" name="birth_date"></br>
               Email id: <input required type="mail" class="wp-form-control wpcf7-email" placeholder="Email address" name="email_id"></br>
               Contact number: <input required type="text" class="wp-form-control wpcf7-text" placeholder="Contact Number" name="Cont_num"></br>
               Address line1:  <input required type="text" class="wp-form-control wpcf7-text"  placeholder="street"name="line1"></br>
               Address line2:  <input type="text" class="wp-form-control wpcf7-text"  placeholder="nearby" name="line2"></br>
               State:  <input required type="text" class="wp-form-control wpcf7-text" placeholder="State"name="state"></br>
               City: <input required type="text" class="wp-form-control wpcf7-text" placeholder="city" name="city"></br>
               Pincode: <input required type="text" class="wp-form-control wpcf7-text" placeholder="pincode" name="pincode"></br>
               Speciality: <select required name="spec_name" class="wp-form-control wpcf7-text" placeholder="Speciality" >
                    <option value="null">select one </option>
                    <option value="1st speciality">1st speciality </option>
                    <option value="2nd speciality">2nd speciality </option>
                    <option value="3rd speciality">3rd speciality  </option>
                    <option value="4th speciality">4th speciality </option>
                </select></br>
                Degree: <select required name="qualification_name" class="wp-form-control wpcf7-text" placeholder="Speciality">
                    <option value="null">select any one </option>
                    <option value="1st degree">1st degree </option>
                    <option value="2nd degree">2nd degree </option>
                    <option value="3rd degree">3rd degree </option>
                    <option value="4th degree">4th degree  </option>
                    <option value="5th degree">5th degree </option>
                </select></br>
                User id: <input required type="text" class="wp-form-control wpcf7-text" placeholder="user id" name="user_id"></br>
                Password: <input required name="password" type="password" class="wp-form-control wpcf7-text" placeholder="Password"></br>
                Confirm Password <input required name="confirm" type="password" class="wp-form-control wpcf7-text" placeholder="Confirm Password"></br>
               <button class="wpcf7-submit button--itzel" type="submit"><i class="button__icon fa fa-envelope"></i><span>REGISTER</span></button>                
              </form>
            </div>
          </div>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li></li>
                  <li><a href="#"></a></li>                  
                  <li class="active"></li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>
                
   
   
    <!--=========== Start Footer SECTION ================-->
    <footer id="footer">
      <!-- Start Footer Top -->
      <div class="footer-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>About Us</h2>
                <div class="line"></div>
              </div>           
              <p> 'Cardiac Countermeasure' is a link between the Artificial Intelligence Cardiac System and the needy patient. It provides the person with a detailed list of Factors and functions related to heart-attack and after the user provides the correct information then System will generate the chances of the person of having heart-attack. Not only that after the system based report is generated it also provides the further asylum to the user for consulting laboratory as well as cardiologist.</p>
              </div>
            </div>
            <div class="col-lg-5 col-md-5 col-sm-5">
              
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>Contact Info</h2>
                <div class="line"></div>
              </div>
              <p>Feel free to contact us at any time for suggestions or complaints</p>
              <address class="contact-info">
                <p><span class="fa fa-home"></span>305 Satyam mall,
                jodhpur,Ahmedabad</p>
                <p><span class="fa fa-phone"></span>+919974911232</p>
                <p><span class="fa fa-envelope"></span>info@Cardiaccountermeasure.com</p>
              </address>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Start Footer Middle -->
      <div class="footer-middle">
        <div class="container">
          <div class="row">
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-copyright">
              <p>&copy; Copyright 2015 <a href="index.html">R&J</a></p>
            </div>
          </div>
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-social">              
                <a href="#"><span class="fa fa-facebook"></span></a>
                <a href="#"><span class="fa fa-twitter"></span></a>
                <a href="#"><span class="fa fa-google-plus"></span></a>
                <a href="#"><span class="fa fa-linkedin"></span></a>     
            </div>
          </div>
        </div>
        </div>
      </div>
      <!-- Start Footer Bottom -->
      <div class="footer-bottom">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <p>Design & Developed By <a rel="nofollow" href="https://www.facebook.com/rishabh.shah.18"> R&J</a></p>
            </div>
          </div>
        </div>
      </div>
    </footer>
    <!--=========== End Footer SECTION ================-->

    <!-- jQuery Library  -->
    <script src="js/jquery.js"></script>    
    <!-- Bootstrap default js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- slick slider -->
    <script src="js/slick.min.js"></script>    
    <script type="text/javascript" src="js/modernizr.custom.79639.js"></script>   
    <!-- counter -->
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <!-- Doctors hover effect -->
    <script src="js/snap.svg-min.js"></script>
    <script src="js/hovers.js"></script>
    <!-- Photo Swipe Gallery Slider -->
    <script src='js/photoswipe.min.js'></script>
    <script src='js/photoswipe-ui-default.min.js'></script>    
    <script src="js/photoswipe-gallery.js"></script>

    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     
  </body>
</html>
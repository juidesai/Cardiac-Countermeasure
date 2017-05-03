package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class heartattack4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("   \n");
      out.write("    <!-- Basic Page Needs\n");
      out.write("    ================================================== -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("     <title>CARDIAC COUNTERMEASURE :Heart-attack Detection</title>\n");
      out.write("\n");
      out.write("    <!-- Mobile Specific Metas\n");
      out.write("    ================================================== -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/icon\" href=\"images/favicon.ico\"/>\n");
      out.write("\n");
      out.write("    <!-- CSS\n");
      out.write("    ================================================== -->       \n");
      out.write("    <!-- Bootstrap css file-->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font awesome css file-->\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">       \n");
      out.write("    <!-- Default Theme css file -->\n");
      out.write("    <link id=\"switcher\" href=\"css/themes/default-theme.css\" rel=\"stylesheet\">      \n");
      out.write("    <!-- Slick slider css file -->\n");
      out.write("    <link href=\"css/slick.css\" rel=\"stylesheet\"> \n");
      out.write("    <!-- Photo Swipe Image Gallery -->     \n");
      out.write("    <link rel='stylesheet prefetch' href='css/photoswipe.css'>\n");
      out.write("    <link rel='stylesheet prefetch' href='css/default-skin.css'>    \n");
      out.write("\n");
      out.write("    <!-- Main structure css file -->\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("    <!-- Google fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  \n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>  \n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]--> \n");
      out.write("    <meta name=\"description\" content=\"chart created using amCharts live editor\" />\n");
      out.write("\n");
      out.write("\t\t<!-- amCharts custom font -->\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Covered+By+Your+Grace' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t\t<!-- amCharts javascript sources -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/amcharts.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://cdn.amcharts.com/lib/3/gauge.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/themes/chalk.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- amCharts javascript code -->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tAmCharts.makeChart(\"chartdiv\",\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\t\"type\": \"gauge\",\n");
      out.write("\t\t\t\t\t\"clockWiseOnly\": true,\n");
      out.write("\t\t\t\t\t\"faceBorderColor\": \"#FF8000\",\n");
      out.write("\t\t\t\t\t\"faceBorderWidth\": 0,\n");
      out.write("\t\t\t\t\t\"gaugeX\": 421,\n");
      out.write("\t\t\t\t\t\"gaugeY\": 206,\n");
      out.write("\t\t\t\t\t\"marginTop\": 90,\n");
      out.write("\t\t\t\t\t\"minRadius\": 29,\n");
      out.write("\t\t\t\t\t\"startDuration\": 6,\n");
      out.write("\t\t\t\t\t\"startEffect\": \"bounce\",\n");
      out.write("\t\t\t\t\t\"autoDisplay\": true,\n");
      out.write("\t\t\t\t\t\"backgroundColor\": \"#f7f7f7\",\n");
      out.write("\t\t\t\t\t\"classNamePrefix\": \"CC\",\n");
      out.write("\t\t\t\t\t\"color\": \"#ff0000\",\n");
      out.write("\t\t\t\t\t\"fontSize\": 20,\n");
      out.write("\t\t\t\t\t\"handDrawScatter\": 1,\n");
      out.write("\t\t\t\t\t\"handDrawThickness\": 3,\n");
      out.write("\t\t\t\t\t\"path\": \"CC/\",\n");
      out.write("\t\t\t\t\t\"theme\": \"chalk\",\n");
      out.write("\t\t\t\t\t\"arrows\": [\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\"alpha\": 0,\n");
      out.write("\t\t\t\t\t\t\t\"axis\": \"GaugeAxis-1\",\n");
      out.write("\t\t\t\t\t\t\t\"color\": \"#333\",\n");
      out.write("\t\t\t\t\t\t\t\"id\": \"GaugeArrow-1\",\n");
      out.write("\t\t\t\t\t\t\t\"innerRadius\": 21,\n");
      out.write("\t\t\t\t\t\t\t\"radius\": \"88%\",\n");
      out.write("\t\t\t\t\t\t\t\"startWidth\": 30,\n");
      out.write("\t\t\t\t\t\t\t\"value\": 15\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t],\n");
      out.write("\t\t\t\t\t\"axes\": [\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\"bottomText\": \"15.00 %\",\n");
      out.write("\t\t\t\t\t\t\t\"bottomTextYOffset\": -20,\n");
      out.write("\t\t\t\t\t\t\t\"endValue\": 100,\n");
      out.write("\t\t\t\t\t\t\t\"id\": \"GaugeAxis-1\",\n");
      out.write("\t\t\t\t\t\t\t\"valueInterval\": 10,\n");
      out.write("\t\t\t\t\t\t\t\"bands\": [\n");
      out.write("\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\"alpha\": 0.7,\n");
      out.write("\t\t\t\t\t\t\t\t\t\"color\": \"#00CC00\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"endValue\": 30,\n");
      out.write("\t\t\t\t\t\t\t\t\t\"id\": \"GaugeBand-1\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"startValue\": 0\n");
      out.write("\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\"alpha\": 0.7,\n");
      out.write("\t\t\t\t\t\t\t\t\t\"color\": \"#F9F900\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"endValue\": 70,\n");
      out.write("\t\t\t\t\t\t\t\t\t\"id\": \"GaugeBand-2\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"startValue\": 31\n");
      out.write("\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\"alpha\": 0.7,\n");
      out.write("\t\t\t\t\t\t\t\t\t\"color\": \"#ea3838\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"endValue\": 100,\n");
      out.write("\t\t\t\t\t\t\t\t\t\"id\": \"GaugeBand-3\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"innerRadius\": \"95%\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"startValue\": 71\n");
      out.write("\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\"id\": \"GaugeBand-4\"\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t]\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t],\n");
      out.write("\t\t\t\t\t\"allLabels\": [\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\"align\": \"center\",\n");
      out.write("\t\t\t\t\t\t\t\"alpha\": 0.9,\n");
      out.write("\t\t\t\t\t\t\t\"color\": \"#FF8000\",\n");
      out.write("\t\t\t\t\t\t\t\"id\": \"Label-1\",\n");
      out.write("\t\t\t\t\t\t\t\"size\": 25,\n");
      out.write("\t\t\t\t\t\t\t\"text\": \"Heart-Attack Meter\",\n");
      out.write("\t\t\t\t\t\t\t\"x\": -90,\n");
      out.write("\t\t\t\t\t\t\t\"y\": 21\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t],\n");
      out.write("\t\t\t\t\t\"balloon\": {\n");
      out.write("\t\t\t\t\t\t\"animationDuration\": 0.66,\n");
      out.write("\t\t\t\t\t\t\"color\": \"#FF8000\",\n");
      out.write("\t\t\t\t\t\t\"fadeOutDuration\": 0.76\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\"titles\": []\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t);\n");
      out.write("\t\t</script>\n");
      out.write("  </head>\n");
      out.write("  <body>    \n");
      out.write("    <!-- BEGAIN PRELOADER -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("      <div id=\"status\">&nbsp;</div>\n");
      out.write("    </div>\n");
      out.write("    <!-- END PRELOADER -->\n");
      out.write("\n");
      out.write("    <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-heartbeat\"></i></a>\n");
      out.write("    <!-- END SCROLL TOP BUTTON -->\n");
      out.write("\n");
      out.write("      <!--=========== BEGIN HEADER SECTION ================-->\n");
      out.write("    <header id=\"header\">\n");
      out.write("      <!-- BEGIN MENU -->\n");
      out.write("      <div class=\"menu_area\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">  \n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <!-- LOGO -->              \n");
      out.write("              <!-- TEXT BASED LOGO -->\n");
      out.write("              <a class=\"navbar-brand\" href=\"home.jsp\"><i class=\"fa fa-heartbeat\"></i><span style=\"font-family: cursive\">CARDIAC COUNTERMEASURE</span></a>              \n");
      out.write("              <!-- IMG BASED LOGO  -->\n");
      out.write("              <!--  <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>   -->                    \n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("              <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right main-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Services <span class=\"fa fa-angle-down\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                    <li><a href=\"medical-counseling.html\">Heart-attack detection</a></li>\n");
      out.write("                    <li><a href=\"medical-research.html\">Consult Cariac</a></li>\n");
      out.write("                    <li><a href=\"blood-bank.html\">Laboratory test</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("                  \n");
      out.write("                <li><a href=\"blog-archive-with-left-sidebar.html\">Blogs</a></li>\n");
      out.write("                <li><a href=\"features.html\">FAQs</a></li>\n");
      out.write("                <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"features.html\">My Profile</a></li>\n");
      out.write("              </ul>           \n");
      out.write("            </div><!--/.nav-collapse -->\n");
      out.write("          </div>     \n");
      out.write("        </nav>  \n");
      out.write("      </div>\n");
      out.write("      <!-- END MENU -->    \n");
      out.write("    </header>\n");
      out.write("      \n");
      out.write("       <section id=\"blogArchive\">      \n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12 col-md-12\">\n");
      out.write("          <div class=\"blog-breadcrumbs-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"blog-breadcrumbs-left\">\n");
      out.write("                <h2>Heart-attack Detection</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"blog-breadcrumbs-right\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                  <li>You are here</li>\n");
      out.write("                  <li><a href=\"#\">Home</a></li>                  \n");
      out.write("                  <li class=\"active\">Heart-attack Detection</li>\n");
      out.write("                </ol>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>        \n");
      out.write("      </div>      \n");
      out.write("    </section>\n");
      out.write("       \n");
      out.write("\n");
      out.write("  \n");
      out.write("    <!--=========== BEGIN Heart-attack detection SECTION ================-->\n");
      out.write("    <section id=\"whychooseSection\">\n");
      out.write("        <div style=\"width: 37%;\n");
      out.write("    float: right;\n");
      out.write("    padding: 100px;\n");
      out.write("    margin-left: 80px;\n");
      out.write("    font-size: 33px;\n");
      out.write("    color: initial;\">\n");
      out.write("            <h1  style=\"color:#31708F;\"> <u>Factors</u></h1></br>\n");
      out.write("            <p style=\"color: darkorange;\">Do your father ever have an heart-attack after passing age of 60?</p>\n");
      out.write("             <input type=\"radio\" name=\"radio\" value=\"\" checked=\"checked\" style=\"color: red\" /> Yes<br>\n");
      out.write("             <input type=\"radio\" name=\"radio\" value=\"\" style=\"color: green\" /> No\n");
      out.write("          </div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("          \n");
      out.write("       \t<div id=\"chartdiv\" style=\"width: 57%; height: 367px;     background-color: rgb(247, 247, 247);\" >\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!--=========== END Heart-attack detection SECTION ================-->\n");
      out.write(" \n");
      out.write("    <!--=========== Start Footer SECTION ================-->\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("      <!-- Start Footer Top -->\n");
      out.write("      <div class=\"footer-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single-footer-widget\">\n");
      out.write("                <div class=\"section-heading\">\n");
      out.write("                <h2>About Us</h2>\n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("              </div>           \n");
      out.write("              <p> 'Cardiac Countermeasure' is a link between the Artificial Intelligence Cardiac System and the needy patient. It provides the person with a detailed list of Factors and functions related to heart-attack and after the user provides the correct information then System will generate the chances of the person of having heart-attack. Not only that after the system based report is generated it also provides the further asylum to the user for consulting laboratory as well as cardiologist.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-5 col-md-5 col-sm-5\">\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single-footer-widget\">\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single-footer-widget\">\n");
      out.write("                <div class=\"section-heading\">\n");
      out.write("                <h2>Contact Info</h2>\n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("              </div>\n");
      out.write("              <p>Feel free to contact us at any time for suggestions or complaints</p>\n");
      out.write("              <address class=\"contact-info\">\n");
      out.write("                <p><span class=\"fa fa-home\"></span>305 Satyam mall,\n");
      out.write("                jodhpur,Ahmedabad</p>\n");
      out.write("                <p><span class=\"fa fa-phone\"></span>+919974911232</p>\n");
      out.write("                <p><span class=\"fa fa-envelope\"></span>info@Cardiaccountermeasure.com</p>\n");
      out.write("              </address>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Start Footer Middle -->\n");
      out.write("      <div class=\"footer-middle\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("              <p>&copy; Copyright 2015 <a href=\"index.html\">R&J</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("            <div class=\"footer-social\">              \n");
      out.write("                <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-google-plus\"></span></a>\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-linkedin\"></span></a>     \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Start Footer Bottom -->\n");
      out.write("      <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("              <p>Design & Developed By <a rel=\"nofollow\" href=\"https://www.facebook.com/rishabh.shah.18\"> R&J</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!--=========== End Footer SECTION ================-->\n");
      out.write("\n");
      out.write("    <!-- jQuery Library  -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>    \n");
      out.write("    <!-- Bootstrap default js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- slick slider -->\n");
      out.write("    <script src=\"js/slick.min.js\"></script>    \n");
      out.write("    <script type=\"text/javascript\" src=\"js/modernizr.custom.79639.js\"></script>   \n");
      out.write("    <!-- counter -->\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("    <!-- Doctors hover effect -->\n");
      out.write("    <script src=\"js/snap.svg-min.js\"></script>\n");
      out.write("    <script src=\"js/hovers.js\"></script>\n");
      out.write("    <!-- Photo Swipe Gallery Slider -->\n");
      out.write("    <script src='js/photoswipe.min.js'></script>\n");
      out.write("    <script src='js/photoswipe-ui-default.min.js'></script>    \n");
      out.write("    <script src=\"js/photoswipe-gallery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom JS -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("     \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

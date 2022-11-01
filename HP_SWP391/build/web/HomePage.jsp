<%-- 
    Document   : HomePage
    Created on : Oct 5, 2022, 9:46:55 AM
    Author     : DELL
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Happy Programming - Home Page</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="assets/img/favicon.png" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">

        <!-- =======================================================
        * Template Name: Mentor - v4.9.0
        * Template URL: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top">
            <div class="container d-flex align-items-center">

                <h1 class="logo me-auto"><a href="HomePage.jsp">Happy Programming</a></h1>
                <!-- Uncomment below if you prefer to use an image logo -->
                <!-- <a href="HomePage.jsp" class="logo me-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

                <nav id="navbar" class="navbar order-last order-lg-0">
                    <ul>
                        <li><a class="active" href="home">Home</a></li>
                        <li><a href="trainers.html">Trainers</a></li>

                        <li><a href="contact.html">Contact</a></li>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

                <c:if test="${sessionScope.active!=null}">
                    <a href="#" class="get-started-btn"> Profile</a>
                    <a href="logout" class="get-started-btn"> Log out</a>
                </c:if>
                <c:if test="${sessionScope.active==null}">
                    <a href="login.jsp" class="get-started-btn">Sign in</a>
                    <a href="SignUp.jsp" class="get-started-btn">Sign Up</a>
                </c:if>

            </div>
        </header><!-- End Header -->

        <!-- ======= Hero Section ======= -->
        <section id="hero" class="d-flex justify-content-center align-items-center">
            <div class="container position-relative" data-aos="zoom-in" data-aos-delay="100">
                <h1>Learning Today,<br>Leading Tomorrow</h1><br>
            </div>
        </section><!-- End Hero -->

        <main id="main">

            <!-- ======= About Section ======= -->
            <section id="about" class="about">
                <div class="container" data-aos="fade-up">

                    <div class="row">
                        <div class="col-lg-6 order-1 order-lg-2" data-aos="fade-left" data-aos-delay="100">
                            <img src="assets/img/about.jpg" class="img-fluid" alt="">
                        </div>
                        <div class="col-lg-6 pt-4 pt-lg-0 order-2 order-lg-1 content">
                            <h3>Why choose Happy Programming ?</h3>
                            <p class="fst-italic">
                                The Happy Programming is based on 3 criteria such as effective teaching, rapid progress, and especially 2 trial lessons.
                            </p>
                            <ul>
                                <li><i class="bi bi-check-circle"></i> You can only study well if you love learning. The mentor at Happy Programming always knows how to motivate you, with interesting, easy-to-understand and effective teaching methods.</li>
                                <li><i class="bi bi-check-circle"></i> With a good mentor at Happy Programming, you will quickly learn to progress, have different results after only 10 lessons: study hard, study better, score higher.</li>
                                <li><i class="bi bi-check-circle"></i> After the first 2 trial lessons, if you are not satisfied with the tutor, you do not need to pay the tuition fee. Of course, Happy Programming always has mentors that make you most satisfied.</li>
                            </ul>
                        </div>
                    </div>

                </div>
            </section><!-- End About Section -->

            <!-- ======= Counts Section ======= -->
            <section id="counts" class="counts section-bg">
                <div class="container">

                    <div class="row counters">

                        <div class="col-lg-4 col-6 text-center">
                            <span data-purecounter-start="0" data-purecounter-end="${mentee}" data-purecounter-duration="1" class="purecounter"></span>
                            <p>Mentees</p>
                        </div>

                        <div class="col-lg-4 col-6 text-center">
                            <span data-purecounter-start="0" data-purecounter-end="${skill}" data-purecounter-duration="1" class="purecounter"></span>
                            <p>Skills</p>
                        </div>

                        <div class="col-lg-4 col-6 text-center">
                            <span data-purecounter-start="0" data-purecounter-end="${mentor}" data-purecounter-duration="1" class="purecounter"></span>
                            <p>Mentors</p>
                        </div>

                    </div>

                </div>
            </section><!-- End Counts Section -->

            <!-- ======= Why Us Section ======= -->
            <section id="why-us" class="why-us">
                <div class="container" data-aos="fade-up">

                    <div class="row">
                        <div class="col-lg-4 d-flex align-items-stretch">
                            <div class="content">
                                <h3>Why Choose Mentor?</h3>
                                <p>There are many people who have no direction and lose their roots in some subjects but don't know where to start over. With Happy programming you can find yourself the best mentors who are well trained and have clear certifications that are thoroughly vetted. Thereby they can guide you starting from the most basic steps and bring you absolute satisfaction
                                </p>
                            </div>
                        </div>
                        <div class="col-lg-8 d-flex align-items-stretch" data-aos="zoom-in" data-aos-delay="100">
                            <div class="icon-boxes d-flex flex-column justify-content-center">
                                <div class="row">
                                    <div class="col-xl-4 d-flex align-items-stretch">
                                        <div class="icon-box mt-4 mt-xl-0">
                                            <i class="bx bx-receipt"></i>
                                            <h4>Carefully selected study materials</h4>
                                            <p>Study materials are carefully prepared by qualified mentors</p>
                                        </div>
                                    </div>
                                    <div class="col-xl-4 d-flex align-items-stretch">
                                        <div class="icon-box mt-4 mt-xl-0">
                                            <i class="bx bx-cube-alt"></i>
                                            <h4>Modern teaching methods</h4>
                                            <p>Advanced modern teaching methods make students interested in learning</p>
                                        </div>
                                    </div>
                                    <div class="col-xl-4 d-flex align-items-stretch">
                                        <div class="icon-box mt-4 mt-xl-0">
                                            <i class="bx bx-images"></i>
                                            <h4> illustrating images</h4>
                                            <p> The illustrations make learning closer and more accessible to students</p>
                                        </div>
                                    </div>
                                </div>
                            </div><!-- End .content-->
                        </div>
                    </div>

                </div>
            </section><!-- End Why Us Section -->

            <!-- ======= Trainers Section ======= -->

            <section id="trainers" class="trainers">
                <div class="container" data-aos="fade-up">
                    <div class="section-title">
                        <p>Popular Mentor</p>
                    </div>
                    <div class="row" data-aos="zoom-in" data-aos-delay="100">
                        <div class="col-lg-4 col-md-6 d-flex align-items-stretch">
                            <div class="member">
                                <img src="assets/img/trainers/trainer-1.jpg" class="img-fluid" alt="">
                                <div class="member-content">
                                    <h4>Le Vu Hieu</h4>
                                    <span>Fullstack Developer</span>
                                    <p>
                                        Today's failure is tomorrow's victory.
                                    </p>
                                    <div class="social">
                                        <a href=""><i class="bi bi-twitter"></i></a>
                                        <a href=""><i class="bi bi-facebook"></i></a>
                                        <a href=""><i class="bi bi-instagram"></i></a>
                                        <a href=""><i class="bi bi-linkedin"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 d-flex align-items-stretch">
                            <div class="member">
                                <img src="assets/img/trainers/trainer-2.jpg" class="img-fluid" alt="">
                                <div class="member-content">
                                    <h4>Sarah Jhinson</h4>
                                    <span>Front-end Developer</span>
                                    <p>
                                        No one has ever said that learning is easy .Remove the word "easy" from your mind to be successful,
                                    </p>
                                    <div class="social">
                                        <a href=""><i class="bi bi-twitter"></i></a>
                                        <a href=""><i class="bi bi-facebook"></i></a>
                                        <a href=""><i class="bi bi-instagram"></i></a>
                                        <a href=""><i class="bi bi-linkedin"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 d-flex align-items-stretch">
                            <div class="member">
                                <img src="assets/img/trainers/trainer-3.jpg" class="img-fluid" alt="">
                                <div class="member-content">
                                    <h4>William Anderson</h4>
                                    <span>Back-end Developer</span>
                                    <p>
                                        One minute of good thought is better than a day of hard work.
                                    </p>
                                    <div class="social">
                                        <a href=""><i class="bi bi-twitter"></i></a>
                                        <a href=""><i class="bi bi-facebook"></i></a>
                                        <a href=""><i class="bi bi-instagram"></i></a>
                                        <a href=""><i class="bi bi-linkedin"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>
            </section><!-- End Trainers Section -->

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer">

            <div class="footer-top">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-4 col-md-6 footer-contact">
                            <h3>Contact</h3>
                            <p>
                                Pham Hong Phuc <br>
                                FPT University<br>
                                Ha Noi, Viet Nam<br><br>
                                <strong>Phone: </strong>0385066816<br>
                                <strong>Email: </strong>phamhongphuc161202@gmail.com<br>
                            </p>
                        </div>

                        <div class="col-lg-4 col-md-6 footer-links">
                            <h4>Useful Links</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Home</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">About us</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Services</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Terms of service</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Privacy policy</a></li>
                            </ul>
                        </div>
                        
                        <div class="col-lg-4 col-md-6 footer-newsletter">
                            <h4>Join Our Newsletter</h4>
                            <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
                            <form action="" method="post">
                                <input type="email" name="email"><input type="submit" value="Subscribe">
                            </form>
                        </div>

                    </div>
                </div>
            </div>

            <div class="container d-md-flex py-4">

                <div class="me-md-auto text-center text-md-start">
                    <div class="copyright">
                        &copy; Copyright <strong><span>Mentor</span></strong>. All Rights Reserved
                    </div>
                    <div class="credits">
                        <!-- All the links in the footer should remain intact. -->
                        <!-- You can delete the links only if you purchased the pro version. -->
                        <!-- Licensing information: https://bootstrapmade.com/license/ -->
                        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/ -->
                        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
                    </div>
                </div>
                <div class="social-links text-center text-md-right pt-3 pt-md-0">
                    <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                    <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                    <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                    <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                    <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                </div>
            </div>
        </footer><!-- End Footer -->

        <div id="preloader"></div>
        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
        <script src="assets/vendor/aos/aos.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>

    </body>

</html>

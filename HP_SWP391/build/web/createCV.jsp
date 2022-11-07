<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Create CV</title>

        <!-- Custom fonts for this template -->
        <link href="Hieu/vendor/fontawesome-free/css/all.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="Hieu/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="Hieu/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <jsp:include page="Sidebar.jsp"></jsp:include>

                <!-- Content Wrapper -->
                <div id="content-wrapper" class="d-flex flex-column">

                    <!-- Main Content -->
                    <div id="content">

                    <jsp:include page="Topbar.jsp"></jsp:include>

                        <!-- Begin Page Content -->
                        <div class="container-fluid">

                            <!-- Page Heading -->
                            <!--<h1 class="h3 mb-2 text-gray-800">Manage Mentee</h1>-->
                            <!-- <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below.
                                For more information about DataTables, please visit the <a target="_blank"
                                    href="https://datatables.net">official DataTables documentation</a>.</p>
                            -->
                            <!-- DataTales Example -->
                            <form action="createCV" method="post">
                                <section id="horizontal-input">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="card">
                                                <div class="card-header">
                                                    <h4 class="card-title">Create CV</h4>
                                                </div>

                                                <div class="card-body" style="display: flex">
                                                    <div class="col-md-6">
                                                        <div class="row">
                                                            <input type="hidden" name="kid" value="${user.userID}">
                                                        <input type="hidden" name="role" value="${user.role}">
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Full Name</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="text" id="helperText" class="form-control" name="Fullname"
                                                                           placeholder="Fullname"value="${user.fullname}" disabled="">
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Gender</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <select class="form-control" name="Gender" disabled="">
                                                                        <c:if test="${user.gender}">
                                                                            <option selected value="1">Male</option>
                                                                            <option value="0">Female</option> 
                                                                        </c:if>
                                                                        <c:if test="${!user.gender}">
                                                                            <option value="1">Male</option>
                                                                            <option selected value="0">Female</option> 
                                                                        </c:if>
                                                                    </select>
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div> 
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Email</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="email" id="helperText" class="form-control" name="Email"
                                                                           placeholder="Email"value="${user.email}" disabled="">
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div> 
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Dob</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="date" id="helperText" class="form-control" name="Dob"
                                                                           placeholder="Dob"value="${user.dob}" disabled="">
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Address</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="text" id="helperText" class="form-control" name="Address"
                                                                           placeholder="Address"value="${user.address}" disabled="">
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                    <input type="hidden" name="Status" value="${user.status}">
                                                </div>

                                                <div class="col-md-6">
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Avatar</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="text" id="helperText" class="form-control" name="avatar"
                                                                           placeholder="Avatar" required="">
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Profession</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="text" id="helperText" class="form-control" name="prof"
                                                                           placeholder="Enter Your Profession" required="">
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">Introduction</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <textarea id="helperText" class="form-control" name="intro"
                                                                              placeholder="Give some words about your profession and the service you will provide" required=""></textarea>
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">LinkedIn</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="text" id="helperText" class="form-control" name="lnkdin"
                                                                           placeholder="Your LinkedIn (Optional)" >
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group row align-items-center">
                                                                <div class="col-lg-2 col-3">
                                                                    <label class="col-form-label">GitHub</label>
                                                                </div>
                                                                <div class="col-lg-10 col-9">
                                                                    <input type="text" id="helperText" class="form-control" name="github"
                                                                           placeholder="Your GitHub (Optional)" >
                                                                </div>
                                                            </div> 
                                                        </div>                                           
                                                    </div>
                                                </div>



                                            </div>
                                            <div class="card-body">
                                                <div class="col-md-12">
                                                    <div class="form-group row align-items-center">
                                                        <div class="col-lg-2 col-3">
                                                            <label class="col-form-label">Choose 3 different skill</label>
                                                        </div>
                                                        <div class="col-lg-10 col-9">
                                                            <div style="display: flex; justify-content: space-between">
                                                                <select class="form-control" name="skill1">
                                                                    <option disabled="disabled" selected="selected">Choose skill</option>
                                                                    <c:forEach items="${listS}" var="l">
                                                                        <c:if test="${l.status}">
                                                                            <option value="${l.skillID}">${l.skillName}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                                <input type="number" min="1" class="form-control" name="yoe1"
                                                                       placeholder="Years of experience">
                                                                <input type="text" id="helperText" class="form-control" name="desc1"
                                                                       placeholder="Short description">
                                                            </div>

                                                            <div style="display: flex; justify-content: space-between">
                                                                <select class="form-control" name="skill2">
                                                                    <option disabled="disabled" selected="selected">Choose skill</option>
                                                                    <c:forEach items="${listS}" var="l">
                                                                        <c:if test="${l.status}">
                                                                            <option value="${l.skillID}">${l.skillName}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                                <input type="number" min="1" class="form-control" name="yoe2"
                                                                       placeholder="Years of experience">
                                                                <input type="text" id="helperText" class="form-control" name="desc2"
                                                                       placeholder="Short description">
                                                            </div>

                                                            <div style="display: flex; justify-content: space-between">
                                                                <select class="form-control" name="skill3">
                                                                    <option disabled="disabled" selected="selected">Choose skill</option>
                                                                    <c:forEach items="${listS}" var="l">
                                                                        <c:if test="${l.status}">
                                                                            <option value="${l.skillID}">${l.skillName}</option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                                <input type="number" min="1" class="form-control" name="yoe3"
                                                                       placeholder="Years of experience">
                                                                <input type="text" id="helperText" class="form-control" name="desc3"
                                                                       placeholder="Short description">
                                                            </div>

                                                        </div>
                                                    </div> 
                                                </div>                                           
                                            </div>
                                                <p style="color: red;text-align: center">${alert}</p>
                                        </div>

                                    </div>
                                </div>
                            </section>
                            <button type="submit" id="sweet" class="btn btn-primary" id="sweet" style="padding-left:25px;padding-right: 25px;padding-top: 10px; padding-bottom: 10px; margin-bottom: 20px;"><i
                                    style="margin-right: 5px;">
                                </i>Create</button>
                        </form>
                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; Your Website 2022</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <jsp:include page="LogOutModal.jsp"></jsp:include>

        <!-- Bootstrap core JavaScript-->
        <script src="Hieu/vendor/jquery/jquery.min.js"></script>
        <script src="Hieu/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="Hieu/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="Hieu/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="Hieu/vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="Hieu/vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="Hieu/js/demo/datatables-demo.js"></script>

    </body>

</html>

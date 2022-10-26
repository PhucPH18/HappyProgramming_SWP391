<%-- 
    Document   : ManageSkill
    Created on : Oct 15, 2022, 11:06:21 PM
    Author     : MSI KATANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>HP Admin - Manage Request</title>

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
                        <div class="page-heading">
                            <div class="page-title">
                                <div class="row">
                                    <div class="col-12 col-md-6 order-md-1 order-last">
                                        <h1 class="h3 mb-2 text-gray-800">Manage Skill</h1>
                                        <p class="text-subtitle text-muted" style="margin-top:50px"></p>
                                        <a href="Skill_form.jsp">
                                            <button class="btn btn-info" style="padding-top: 10px; padding-bottom: 10px; margin-bottom: 20px;"><i class="bi-plus-circle" style="margin-right: 5px;">
                                                </i>Add new </button>
                                        </a>


                                    </div>

                                </div>
                            </div>
                            <!-- Table head options start -->
                            <section class="section">
                                <div class="row" id="table-head">
                                    <div class="col-12">
                                        <div class="card">
                                            <div class="card-content">
                                                <!-- table head dark -->
                                                <div class="table-responsive">
                                                    <table class="table mb-0 text-center">
                                                        <thead class="thead-dark">
                                                            <tr>
                                                                <th>Skill ID</th>
                                                                <th>Skill Name</th>
                                                                <th>Status</th>
                                                                <th>Edit</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${scList}" var="l">
                                                            <tr>
                                                                <td class="text-bold-500">${l.skillID}</td>
                                                                <td>${l.skillName}</td>
                                                                <td class="text-bold-500">${l.status?"Active":"Inactive"}</td>
                                                                <td> <a href="Skill_update?kid=${l.skillID}"><i
                                                                            class="fas fa-address-book"></i>
                                                                    </a>
                                                                    <a href="Skill_delete?kid=${l.skillID}" 
                                                                       onclick="if (!(confirm('Delete this skill?')))
                                                                                   return false"><i class="fas fa-trash"></i></a></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                        <!-- Table head options end -->
                        <nav aria-label="Page navigation example">
                            <ul class="pagination pagination-primary  justify-content-center">


                            </ul>
                        </nav>

                    </div>
                    <!-- End of Main Content -->

                    <!-- Footer -->
                    <footer class="sticky-footer bg-white">
                        <div class="container my-auto">
                            <div class="copyright text-center my-auto">
                                <span>Copyright &copy; Your Website 2020</span>
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

            <!-- Logout Modal-->
            <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">×</span>
                            </button>
                        </div>
                        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                            <a class="btn btn-primary" href="login.jsp">Logout</a>
                        </div>
                    </div>
                </div>
            </div>

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

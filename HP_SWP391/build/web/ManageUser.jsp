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
                        <div class="container-fluid">
                            <h1 class="h3 mb-2 text-gray-800">Manage User</h1>

                            <!-- DataTales Example -->
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">List of Skills</h6>
                                </div>
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                            <thead>
                                                <tr>
                                                    <th>ID</th>
                                                    <th>Username</th>
                                                    <th>Fullname</th>
                                                    <th>Gender</th>
                                                    <th>Phone</th>
                                                    <th>Email</th>
                                                    <th>DoB</th>
                                                    <th>Address</th>
                                                    <th>Status</th>
                                                    <th>Role</th>
                                                    <th>Edit</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${listU}" var="l">
                                                <tr>
                                                    <td>${l.userID}</td>
                                                    <td>${l.username}</td>
                                                    <td>${l.fullname}</td>
                                                    <td>${l.gender?"Male":"Female"}</td>
                                                    <td>${l.phone}</td>
                                                    <td>${l.email}</td>
                                                    <td>${l.dob}</td>
                                                    <td>${l.address}</td>
                                                    <td>${l.status?"Active":"Inactive"}</td>
                                                    <c:if test="${l.role == 0}">
                                                        <td>Admin</td>
                                                    </c:if>
                                                    <c:if test="${l.role == 1}">
                                                        <td>Staff</td>
                                                    </c:if>
                                                    <c:if test="${l.role == 2}">
                                                        <td>Mentor</td>
                                                    </c:if>
                                                    <c:if test="${l.role == 3}">
                                                        <td>Mentee</td>
                                                    </c:if>

                                                    <td> <a href="User_update?kid=${l.userID}"><i
                                                                class="fas fa-address-book"></i>
                                                        </a>
                                                        <a href="User_delete?kid=${l.userID}" 
                                                           onclick="if (!(confirm('Delete this user?')))
                                                                       return false"><i class="fas fa-trash" style="color: #ff3333"></i></a></td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.container-fluid -->
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


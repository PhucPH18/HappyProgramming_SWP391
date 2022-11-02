<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>HP Mentee - List Request</title>

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
                            <div style="display: flex; justify-content: space-between">
                                <!-- Page Heading -->
                                <h1 class="h3 mb-2 text-gray-800">Manage Request</h1>
                                <a href="CreateRequest">
                                    <button class="btn btn-info" style="padding-top: 10px; padding-bottom: 10px; margin-bottom: 20px;"><i class="bi-plus-circle" style="margin-right: 5px;">
                                        </i>Create  Request</button>
                                </a>
                            </div>
                            <!-- DataTales Example -->
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">List of requests</h6>
                                </div>
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                            <thead>
                                                <tr>
                                                    <th>Title</th>
                                                    <th>Content</th>
                                                    <th>Date</th>
                                                    <th>Status</th>
                                                    <th>Link</th>
                                                    <th>Mentor</th>
                                                    <th>Edit</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${reqList}" var="o" >
                                                <tr>
                                                    <td>${o.title}</a></td>
                                                    <td>${o.content}</td>
                                                    <td>${o.date}</td>
                                                    <c:if test="${o.status==0}">
                                                        <td style="color: red">Waiting</td>
                                                    </c:if>
                                                    <c:if test="${o.status==1}">
                                                        <td style="color: yellow">Ongoing</td>
                                                    </c:if>
                                                    <c:if test="${o.status==2}">
                                                        <td style="color: green">Finished</td>
                                                    </c:if>
                                                    <td>${o.link}</td>
                                                    <td></td>
                                                    <td> <a href="UpdateRequest?rid=${o.requestID}"><i
                                                                class="fas fa-address-book"></i>
                                                        </a>
                                                        <a href="DeleteRequest?rid=${o.requestID}" 
                                                           onclick="if (!(confirm('Delete this request?')))
                                                                       return false"><i class="fas fa-trash"></i></a>
                                                    </td>
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
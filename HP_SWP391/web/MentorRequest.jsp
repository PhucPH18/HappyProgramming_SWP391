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
                                                    <th>Mentee</th>
                                                    <th>Title</th>
                                                    <th>Content</th>
                                                    <th>Request Skill</th>
                                                    <th>Meet</th>
                                                    <th>Status</th>
                                                    <th>Accept/Reject request</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${reqList}" var="o" >
                                                <tr>
                                                    <c:forEach items="${listU}" var="u">
                                                        <c:if test="${u.userID == o.menteeID}">
                                                            <td>${u.username}</td>
                                                        </c:if>
                                                    </c:forEach>
                                                    <td>${o.title}</a></td>
                                                    <td>${o.content}</td>
                                                    <c:forEach items="${listRS}" var="rs">
                                                        <c:if test="${o.requestID==rs.requestID}">
                                                            <c:forEach items="${listS}" var="s">
                                                                <c:if test="${rs.skillID==s.skillID}">
                                                                    <td>${s.skillName}</td>
                                                                </c:if>
                                                            </c:forEach>
                                                        </c:if>
                                                    </c:forEach>

                                                    <c:if test="${o.link.length() != 0}">
                                                        <td><a style="color: #009c68;font-weight: bold" href="${o.link}">Join</a></td>
                                                    </c:if>
                                                    <c:if test="${o.link.length() == 0}">
                                                        <td><a style="color: #009c68;font-weight: bold" href="UpdateRequest?rid=${o.requestID}">Add</a></td>
                                                    </c:if>


                                                    <c:if test="${o.mentorStatus==0}">
                                                        <td style="color: blue">Waiting</td>
                                                    </c:if>
                                                    <c:if test="${o.mentorStatus==1}">
                                                        <td style="color: orange">In progress</td>
                                                    </c:if>
                                                    <c:if test="${o.mentorStatus==2}">
                                                        <td style="color: red">Rejected</td>
                                                    </c:if>
                                                    <c:if test="${o.mentorStatus==3}">
                                                        <td style="color: green">Finished</td>
                                                    </c:if>


                                                    <c:if test="${o.mentorStatus==0}">
                                                        <td>
                                                            <a href="AcceptRequest?requestID=${o.requestID}"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Accept</button></a>
                                                            <a href="RejectRequest?requestID=${o.requestID}"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Reject</button></a>
                                                        </td>
                                                    </c:if>
                                                    <c:if test="${o.mentorStatus==1}">
                                                        <td>
                                                            <a href="RejectRequest?requestID=${o.requestID}"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Reject</button></a>
                                                        </td>
                                                    </c:if>
                                                    <c:if test="${o.mentorStatus==2}">
                                                        <td>
                                                            <a href="AcceptRequest?requestID=${o.requestID}"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Accept</button></a>
                                                        </td>
                                                    </c:if>
                                                    <c:if test="${o.mentorStatus==3}">
                                                        <td></td>
                                                    </c:if>
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

        <script>
            function myFunc() {
                alert("You need to finish all your request to become a mentor");
            }
        </script>

    </body>

</html>
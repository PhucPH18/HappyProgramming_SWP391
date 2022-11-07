<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Mentor Profile</title>

        <!-- Custom fonts for this template-->
        <link href="Hieu/vendor/fontawesome-free/css/all.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="Hieu/css/sb-admin-2.css" rel="stylesheet">

        <style>
            .btn-primary {
                color: #fff;
                background-color: #5fcf80;
                border-color: #5fcf80;
            }

            .btn-outline-primary {
                color: #5fcf80;
                border-color: #5fcf80;
            }
        </style>
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

                    <div class="row gutters-sm">
                        <div class="col-md-4 mb-3">
                            <div class="card">
                                <div class="card-body">
                                    <div class="d-flex flex-column align-items-center text-center">
                                        <img src="${mp.avatar}" alt="Avatar" class="rounded-circle" width="150">
                                        <div class="mt-3">
                                            <h4>${user.fullname}</h4>
                                            <p style="font-weight: bold">${mp.profession}</p>
                                            <p class="text-secondary mb-1">${mp.introduction}</p>
                                            <p class="text-muted font-size-sm">${user.address}</p>
                                            <button class="btn btn-primary"><a style="color: white; text-decoration: none" href="CreateRequest">Request</a></button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="card mt-3">
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item d-flex justify-content-between align-items-center flex-wrap">
                                        <h6 class="mb-0"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-globe mr-2 icon-inline"><circle cx="12" cy="12" r="10"></circle><line x1="2" y1="12" x2="22" y2="12"></line><path d="M12 2a15.3 15.3 0 0 1 4 10 15.3 15.3 0 0 1-4 10 15.3 15.3 0 0 1-4-10 15.3 15.3 0 0 1 4-10z"></path></svg>LinkedIn</h6>
                                        <span class="text-secondary"><a href="${mp.linkedIn}">LinkedIn</a></span>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center flex-wrap">
                                        <h6 class="mb-0"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-github mr-2 icon-inline"><path d="M9 19c-5 1.5-5-2.5-7-3m14 6v-3.87a3.37 3.37 0 0 0-.94-2.61c3.14-.35 6.44-1.54 6.44-7A5.44 5.44 0 0 0 20 4.77 5.07 5.07 0 0 0 19.91 1S18.73.65 16 2.48a13.38 13.38 0 0 0-7 0C6.27.65 5.09 1 5.09 1A5.07 5.07 0 0 0 5 4.77a5.44 5.44 0 0 0-1.5 3.78c0 5.42 3.3 6.61 6.44 7A3.37 3.37 0 0 0 9 18.13V22"></path></svg>Github</h6>
                                        <span class="text-secondary"><a href="${mp.gitHub}">GitHub</a></span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-8">
                            <div class="card mb-3">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Full Name</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${user.fullname}
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Email</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${user.email}
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Phone</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${user.phone}
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Address</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${user.address}
                                        </div>
                                    </div>
                                    <hr>
                                </div>
                            </div>

                            <div class="row gutters-sm">
                                <c:forEach items="${msList}" var="ms">
                                    <c:forEach items="${scList}" var="sc">
                                        <c:if test="${ms.skillID==sc.skillID}">
                                            <div class="col-sm-6 mb-3">
                                                <div class="card h-100">
                                                    <div class="card-body">

                                                        <h6 style="color: #009c68;font-weight: bold" class="d-flex align-items-center mb-3">${sc.skillName}</h6>

                                                        <small>${ms.yearOfExp} year of experience</small>
                                                        <hr>
                                                        <small>${ms.description}</small>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>
                                    </c:forEach>
                                </c:forEach>

                            </div>



                        </div>

                    </div>
                    <!-- End of Main Content -->

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
            <script src="Hieu/vendor/chart.js/Chart.min.js"></script>

            <!-- Page level custom scripts -->
            <script src="Hieu/js/demo/chart-area-demo.js"></script>
            <script src="Hieu/js/demo/chart-pie-demo.js"></script>

    </body>
</html>
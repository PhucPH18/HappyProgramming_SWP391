<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${sessionScope.active.role==0}">
    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="admin">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">HP Admin</sup></div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav Item - Dashboard -->
        <li class="nav-item active">
            <a class="nav-link" href="admin">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Dashboard</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Management
        </div>

        <li class="nav-item active">
            <a class="nav-link" href="request">
                <i class="fas fa-fw fa-table"></i>
                <span>Request</span></a>
        </li>

        <li class="nav-item active">
            <a class="nav-link" href="SkillCategoryControl">
                <i class="fas fa-fw fa-table"></i>
                <span>Skill</span></a>
        </li>

        <li class="nav-item active">
            <a class="nav-link" href="UserControl">
                <i class="fas fa-fw fa-table"></i>
                <span>User</span></a>
        </li>

        <li class="nav-item active">
            <a class="nav-link" href="MentorControl">
                <i class="fas fa-fw fa-table"></i>
                <span>Mentor</span></a>
        </li>
        
        <li class="nav-item active">
            <a class="nav-link" href="manageRate">
                <i class="fas fa-fw fa-table"></i>
                <span>Rate</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">

        <!-- Sidebar Toggler (Sidebar) -->
        <div class="text-center d-none d-md-inline">
            <button class="rounded-circle border-0" id="sidebarToggle"></button>
        </div>
    </ul>
    <!-- End of Sidebar -->
</c:if>

<c:if test="${sessionScope.active.role==2}">
    <!-- Sidebar Mentor-->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="mentee">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">HP Mentor</sup></div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            View
        </div>

        <li class="nav-item active">
            <a class="nav-link" href="staticReq">
                <i class="fas fa-fw fa-table"></i>
                <span>Static request</span></a>
        </li>
        
        <li class="nav-item active">
            <a class="nav-link" href="MentorRequest">
                <i class="fas fa-fw fa-table"></i>
                <span>Mentor's request</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">

        <!-- Sidebar Toggler (Sidebar) -->
        <div class="text-center d-none d-md-inline">
            <button class="rounded-circle border-0" id="sidebarToggle"></button>
        </div>
    </ul>
    <!-- End of Sidebar Mentor -->
</c:if>

<c:if test="${sessionScope.active.role==3}">
    <!-- Sidebar Mentee-->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="mentee">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">HP Mentee</sup></div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            View
        </div>

        <li class="nav-item active">
            <a class="nav-link" href="mentee">
                <i class="fas fa-fw fa-table"></i>
                <span>List request</span></a>
        </li>

        <li class="nav-item active">
            <a class="nav-link" href="ListRating">
                <i class="fas fa-fw fa-table"></i>
                <span>List rating</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
               aria-expanded="true" aria-controls="collapseTwo">
                <i class="fas fa-fw fa-cog"></i>
                <span>Mentor by Skill</span>
            </a>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                <div class="bg-white py-2 collapse-inner rounded">
                    <h6 class="collapse-header">List of skills:</h6>
                    <c:forEach items="${listS}" var="o">
                        <c:if test="${o.status == true}">
                            <a class="collapse-item" href="mbs?sID=${o.skillID}">${o.skillName}</a>
                        </c:if>
                    </c:forEach>
                </div>
            </div>
        </li>


        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">

        <!-- Sidebar Toggler (Sidebar) -->
        <div class="text-center d-none d-md-inline">
            <button class="rounded-circle border-0" id="sidebarToggle"></button>
        </div>
    </ul>
    <!-- End of Sidebar Mentee -->
</c:if>


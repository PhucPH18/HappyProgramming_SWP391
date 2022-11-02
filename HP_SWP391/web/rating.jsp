<%-- 
    Document   : rating
    Created on : Oct 24, 2022, 9:21:59 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User rating</title>
        <link rel="stylesheet" href="css/rating.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" rel="stylesheet">
        <style>
            .height-100{
                height:100vh;
            }

            .shadow-textarea textarea.form-control::placeholder {
                font-weight: 300;
            }

            .shadow-textarea textarea.form-control {
                padding-left: 0.8rem;
            }
        </style>
    </head>
    <body class="img js-fullheight" style="background-image: url(images/ratingbg.jpeg);">
        <section>
            <div class="container my-5 py-5 text-dark">
                <div class="row d-flex justify-content-center">
                    <div class="col-md-10 col-lg-8 col-xl-6">
                        <div class="card">
                            <div class="card-body p-4">
                                <div class="d-flex flex-start w-100">
                                    <div class="w-100">
                                        <form action="rating" method="post">
                                            <h5 style="color: #5fcf80">Give mentor your feedback</h5>
                                            <div class="rating mb-3" id="rating">
                                                <input type="radio" id="star5" name="rating" value="5" />
                                                <label class = "full" for="star5" title="Awesome"></label>

                                                <input type="radio" id="star4" name="rating" value="4" />
                                                <label class = "full" for="star4" title="Pretty good"></label>

                                                <input type="radio" id="star3" name="rating" value="3" />
                                                <label class = "full" for="star3" title="Meh"></label>

                                                <input type="radio" id="star2" name="rating" value="2" />
                                                <label class = "full" for="star2" title="Kinda bad"></label>

                                                <input type="radio" id="star1" name="rating" value="1" />
                                                <label class = "full" for="star1" title="Very bad"></label>
                                            </div>
                                            <div class="form-outline shadow-textarea">
                                                <textarea class="form-control" name="feedback" id="feedback" placeholder="Give your feedback..." rows="4"></textarea>
                                            </div>
                                            <br>
                                            <input type="hidden" value="${mentorID}" name="mentorID">
                                            <div class="float-end mt-2 pt-1">
                                                <input style="color: white; background-color: #5fcf80" type="submit" value="Send Feedback" class="btn btn-primary btn-block"/>
                                            </div>
                                            <div style="color: #5fcf80" class="form-input" style="text-align: center;margin-top: 50px;font-size: 15px">
                                                Return to <a href="mentee" style="text-decoration: none;color: #5fcf80;"><strong>Mentee Page</strong></a>
                                            </div>
                                            <br>
                                            <h6 class="mb-4" style="color: red">${message}</h6>

                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script>
                function calcRate(r) {
                    const f = ~~r, //Tương tự Math.floor(r)
                            id = 'star' + f + (r % f ? 'half' : '')
                    id && (document.getElementById(id).checked = !0)
                }
            </script>
    </body>
</html>

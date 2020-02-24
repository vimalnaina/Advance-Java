<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>SignUp</h1>
</div>

<div align="center">
    <font color="green" size="3px">
        <br/>
        <%
        if (request.getParameter("msg") != null) {
            out.print(request.getParameter("msg"));
        }
        %>
    </font>
</div>

<!-- Main -->
<section id="main" class="wrapper">

    <div class="inner">
        <div class="content">

            <!-- Elements -->
            
            <div class="row">
                <div class="col-6 col-12-medium">

                    <!-- Form -->
                    <form method="post" action="signupController.jsp">
                        <div class="row gtr-uniform">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="username" placeholder="Username" />
                            </div>
                            <div class="col-6 col-12-xsmall">
                                <input type="password" name="pwd" placeholder="Password" />
                            </div>
                            <div class="col-12">
                                <input type="email" name="email" placeholder="Email" />
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <select name="branch">
                                    <option value="">- Select Branch -</option>
                                    <option value="CE">CE</option>
                                    <option value="IT">IT</option>
                                    <option value="EC">EC</option>
                                    <option value="EE">EE</option>
                                    <option value="NT">NT</option>
                                    <option value="BT">BT</option>
                                    <option value="MECH">MECH</option>
                                    <option value="CIVIL">CIVIL</option>
                                </select>
                            </div>

                            <div class="col-12">
                                <select name="sem" >
                                    <option value="">- Select Semester -</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                </select>
                            </div>
                            <!-- Break -->
                            <div class="col-6 col-12-small">
                                <input type="radio" id="gender-male" name="gender" value="male" checked>
                                <label for="gender-male">Male</label>
                            </div>
                            <div class="col-6 col-12-small">
                                <input type="radio" id="gender-female" name="gender" value="female">
                                <label for="gender-female">Female</label>
                            </div>
                            <!-- Break -->
                            <div class="col-4 col-12-small">
                                <input type="checkbox" id="cric" name="hobby" value="cricket">
                                <label for="cric">Cricket</label>
                            </div>
                            <div class="col-4 col-12-small">
                                <input type="checkbox" id="read" name="hobby" value="reading">
                                <label for="read">Reading</label>
                            </div>
                            <div class="col-4 col-12-small">
                                <input type="checkbox" id="sing" name="hobby" value="singing">
                                <label for="sing">Singing</label>
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <textarea name="address" placeholder="Address" rows="6"></textarea>
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <ul class="actions">
                                    <li><input type="submit" value="SignUp" class="primary" /></li>
                                    <li><input type="reset" value="Reset" /></li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            </div>
        </div>
    
</section>

<%@include file="../footer.jsp" %>

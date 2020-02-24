<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="../header.jsp" %>

    <!-- Heading -->
			<div id="heading" >
				<h1>Table-Generator</h1>
			</div>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">

					<!-- Elements -->
						<div class="row">
							<div class="col-6 col-12-medium">

								<!-- Form -->
									<form method="post" action="tablegenerator.do">
										<div class="row gtr-uniform">
											<div class="col-7">
												<input type="text" name="number" placeholder="Enter Number" />
											</div>
											<!-- Break -->
											<div class="col-12">
												<ul class="actions">
													<li><input type="submit" value="Generate Table" class="primary" /></li>
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

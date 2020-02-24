<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="../header.jsp" %>

    <!-- Heading -->
			<div id="heading" >
				<h1>Visitor Counter</h1>
			</div>

		<!-- Main -->
			<section id="main" class="wrapper" align="center">
				<div class="inner">
					<div class="content">

					<!-- Elements -->
						<div class="row">
							<div align="center">

								<!-- Form -->
									<form method="post" action="visitorcounter.do">
										<div class="row gtr-uniform">
											<div class="col-12">
												<ul class="actions">
													<li><input type="submit" value="Count Visitor" class="primary" /></li>
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



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>

<body>

	<div id="header">
		<h1>
			Online Banking System<span class="style1"></span>
		</h1>
		<h1>
			For RIO Bank Co.Ltd<span class="style1"></span>
		</h1>
		<h2>ExtraOrdinary Service</h2>

		<A href="index1.html"><IMG SRC="images/home1.gif"></IMG></A>
	</div>

	<div id="navigation">
		<ul>
			<li><a href="index.jsp">OPEN ACCOUNT</a></li>
			<li><a href="create.jsp">NEW ACCOUNT</a></li>
			<li><a href="balance1.jsp">BALANCE</a></li>
			<li><a href="deposit1.jsp">DEPOSIT</a></li>
			<li><a href="withdraw1.jsp">WITHDRAW</a></li>
			<li><a href="transfer1.jsp">TRANSFER</a></li>
			<li><a href="logout.jsp">LOGOUT</a></li>
		</ul>
	</div>
	<div id="welcome" style="border-right: #666666 1px dotted;">
		<h1>DEPOSIT FORM</h1>
		<br>
		<table align="center" bgcolor="white">
			<tr>
			</tr>
			<tr>
				<td>
					<form action="deposit" method="post">
						<table cellspacing="5" cellpadding="3">
							<tr>
								<th>ACCOUNT NO :</th>
								<td><input type="text" name="accNo"></td>
							</tr>
							<tr>
								<th>USER NAME :</th>
								<td><input type="text" name="username"></td>
							</tr>
							<tr>
								<th>PASSWORD :</th>
								<td><input type="password" name="password" /></td>
							</tr>
							<tr>
								<th>DEPOSITED AMOUNT :</th>
								<td><input type="text" name="depositMoney"></td>
							</tr>

							<tr>
								<td></td>
								<td><input type="submit" value="SUBMIT"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<INPUT TYPE=RESET VALUE="CLEAR"></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
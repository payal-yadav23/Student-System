package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class Student extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// fetch all data
		String studId = request.getParameter("studentId");
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String pincode = request.getParameter("pincode");
		String country = request.getParameter("country");
		String course = request.getParameter("course");
		String branch = request.getParameter("branch");
		String admissionYr = request.getParameter("admissionYear");
		int addYr = Integer.parseInt(admissionYr);
		String password = request.getParameter("password");

		// JDBC Connection

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch227", "root", "Payal@123");
			PreparedStatement ps = c.prepareStatement(
					"INSERT INTO student(studId, fName, lName, gender, dob, email, phone, address, city, state, pincode, country, course, branch, admissionYr, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			ps.setString(1, studId);
			ps.setString(2, fName);
			ps.setString(3, lName);
			ps.setString(4, gender);
			ps.setString(5, dob);
			ps.setString(6, email);
			ps.setString(7, phone);
			ps.setString(8, address);
			ps.setString(9, city);
			ps.setString(10, state);
			ps.setString(11, pincode);
			ps.setString(12, country);
			ps.setString(13, course);
			ps.setString(14, branch);
			ps.setInt(15, addYr);
			ps.setString(16, password);

			int i = ps.executeUpdate();

			PrintWriter out = response.getWriter();

			if (i > 0) {
				System.out.println("Data Inserted Successfully...");
				out.print("Registration Successful..!");
			} else {
				System.out.println("Insertion Failed..!");
				out.print("Registration Failed...!");
			}
			c.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

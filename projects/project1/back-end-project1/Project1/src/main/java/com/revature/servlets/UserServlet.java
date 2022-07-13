package com.revature.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dtos.UserDTO;
import com.revature.exceptions.UserNotCreatedException;
import com.revature.exceptions.UserNotFoundException;

import com.revature.models.User;
import com.revature.services.UserService;
import com.revature.util.CorsFix;

/*- 
 * Handles all of the requests made to /users(/...)
 */
public class UserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService us = new UserService();
	// object to convert to JSON format
	private ObjectMapper om = new ObjectMapper();


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Specifying that the response content-type will be JSON
				CorsFix.addCorsHeader(req.getRequestURI(), resp);
				resp.addHeader("Content-Type", "application/json");

				
				String pathInfo = req.getPathInfo();

				// if pathInfo is null, the req should be to /users -> send back all users
				if (pathInfo == null) {

					HttpSession session = req.getSession();

					if (true) {
						// retrieving users from db using UserService
						List<User> users = us.getUsers();
						List<UserDTO> usersDTO = new ArrayList<>();

						// converting Users to UserDTOs for data transfer
						users.forEach(u -> usersDTO.add(new UserDTO(u)));

						// retrieving print writer to write to the Response body
						try (PrintWriter pw = resp.getWriter();) {
							// writing toString representation of Users to body
							pw.write(om.writeValueAsString(users));
						}

					} else {
						resp.sendError(401, "Unauthorized request.");
					}

				} else {

					// Have to remove "/" to get the id to be retrieved
					int id = Integer.parseInt(pathInfo.substring(1));

					try (PrintWriter pw = resp.getWriter()) {
						// retrieve user by id
						User u = us.getUserById(id);
						UserDTO uDTO = new UserDTO(u);

						// convert user to JSON and write to response body
						pw.write(om.writeValueAsString(uDTO));

						resp.setStatus(200);
					} catch (UserNotFoundException e) {
						resp.setStatus(404);
						e.printStackTrace();
					}
				}
			}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		InputStream reqBody = req.getInputStream();

		User newUser = om.readValue(reqBody, User.class);

		try {
			us.createUser(newUser);

			res.setStatus(201); // Status: Created
		} catch (UserNotCreatedException e) {
//			res.setStatus(400);
			res.sendError(400, "Unable to create new user.");
			e.printStackTrace();
		}
	}}

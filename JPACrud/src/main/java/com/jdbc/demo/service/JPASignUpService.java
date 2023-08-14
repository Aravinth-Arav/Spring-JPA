package com.jdbc.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.demo.jparepo.JPARepository;
import com.jdbc.demo.model.JPASignUpModel;
import com.jdbc.demo.model.Response;

@Service
public class JPASignUpService {
	
	@PersistenceContext
	EntityManager entityManager;

	Response res = new Response();
	@Autowired
	JPARepository jparepo;

	public Response createUser(JPASignUpModel values) {

		try {

			String uuid = UUID.randomUUID().toString();
			values.setsNo(uuid);
			values.setCreatedBy(uuid);
			values.setUpdatedBy(uuid);

			jparepo.save(values);

			res.setData("User Created Successfully");
			res.setResponse_code(200);
			res.setResponse_msg("Success");

		} catch (Exception e) {
			e.printStackTrace();

			res.setData("Cannot Created Successfully");
			res.setResponse_code(500);
			res.setResponse_msg("Error");

		}

		return res;
	}

	public Response getUser() {

		return res;
	}

	public Response getOneUser() {

		return res;
	}

	public Object updateUser(String email) {

		return res;
	}

	public Response deleteUser() {

		return res;
	}

	public Response scamUser() {

		return res;
	}

	@SuppressWarnings({ "unchecked" })
	public Response loginUser(String email, String password) {

		try {
			
			Query query= entityManager.createQuery("SELECT u FROM JPASignUpModel u WHERE u.email = :email AND u.password = :password");
			query.setParameter("email",email);
			query.setParameter("password", password);
			List<JPASignUpModel> value = query.getResultList();
			
			if (value.isEmpty()) {
				res.setData("");
				res.setResponse_code(200);
				res.setResponse_msg("Success");
				
			} else {
				res.setData("No Such user!");
				res.setResponse_code(200);
				res.setResponse_msg("Success");

			}
			
			res.setData("Log In Successfully");
			res.setResponse_code(200);
			res.setResponse_msg("Success");

		} catch (Exception e) {
			e.printStackTrace();

			res.setData("Log In Failed");
			res.setResponse_code(500);
			res.setResponse_msg("Error");

		}

		return res;
	}

	public Response updateUser(JPASignUpModel values) {
		try {
			Optional<JPASignUpModel> optObj = jparepo.findById(values.getsNo());

			if (optObj.isPresent()) {

				JPASignUpModel update = optObj.get();
				update.setEmail(values.getEmail());

				jparepo.save(update);

				res.setData("Email Updated");
				res.setResponse_code(200);
				res.setResponse_msg("Success");

			} else {

				res.setData("Cannot Email Updated");
				res.setResponse_code(500);
				res.setResponse_msg("Error");

			}

		} catch (Exception e) {

			e.printStackTrace();

			res.setData("Cannot Perform Operation");
			res.setResponse_code(500);
			res.setResponse_msg("Error");

		}
		return null;
	}

}

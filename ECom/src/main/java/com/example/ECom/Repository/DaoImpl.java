package com.example.ECom.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jongo.Jongo;
import org.springframework.stereotype.Repository;

import com.example.ECom.pojo.UserDetails;
import com.mongodb.DB;
import com.mongodb.MongoClient;

@Repository
public class DaoImpl implements Dao {

	@SuppressWarnings("deprecation")

	@Override
	public List<UserDetails> findEmployee() {
		Iterator<UserDetails> userDetails = null;
		MongoClient mongoClient = new MongoClient("localhost", 27017);

		DB db1 = new DB(mongoClient, "Ecommerce");
		userDetails = new Jongo(db1).getCollection("userDetails").find("{'userId':1}").as(UserDetails.class);
		List<UserDetails> list = new ArrayList<UserDetails>();
		if (userDetails != null) {
			while (userDetails.hasNext()) {
				list.add(userDetails.next());
			}
		}

		return list;
	}
}

package com.example.ECom.Repository;

import java.util.Iterator;
import java.util.List;

import org.jongo.Jongo;
import org.springframework.stereotype.Repository;

import com.example.ECom.Constants.MongoConstants;
import com.example.ECom.Util.CommonUtil;
import com.example.ECom.Util.MongoConnectionUtil;
import com.example.ECom.pojo.UserDetails;

@Repository
public class DaoImpl implements Dao {

	@SuppressWarnings("deprecation")

	@Override
	public List<UserDetails> findEmployee() {
		Iterator<UserDetails> userDetails = null;
		userDetails = new Jongo(MongoConnectionUtil.getDB()).getCollection(MongoConstants.CN_USERDETAILS).find("{'userId':1}").as(UserDetails.class);
		List<UserDetails> list=CommonUtil.convertFromIteratorToList(userDetails);
		return list;
	}
}

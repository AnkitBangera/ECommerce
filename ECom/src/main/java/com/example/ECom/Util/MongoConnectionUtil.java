package com.example.ECom.Util;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnectionUtil {
	public static final String MONGODB_LOCAL_HOST = "localhost";
	public static final int MONGO_PORT = 27017;
	public static final String MONGO_DATABASE_NAME="Ecommerce";
	
	@SuppressWarnings("deprecation")
	public static DB getDB() {
		MongoClient mongoClient = new MongoClient(MONGODB_LOCAL_HOST, MONGO_PORT);
		DB db = new DB(mongoClient, MONGO_DATABASE_NAME);
		return db;
		
	}
}

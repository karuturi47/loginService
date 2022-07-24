package com.farmers.market.loginService.database;

import io.vertx.core.Vertx;
import io.vertx.jdbcclient.JDBCConnectOptions;
import io.vertx.jdbcclient.JDBCPool;
import io.vertx.sqlclient.PoolOptions;

/*
 * Author: Veera Karuturi
 * This class will create a connection for the oracle DB with size of 16
 * and any query to Database has to get the connection from this DB pool
 * 
 */


public class JDBCLoginPool {
	
	public JDBCPool createConnectionPool() {
		JDBCPool pool = JDBCPool.pool(
				  Vertx.vertx(),
				  new JDBCConnectOptions()
				    .setJdbcUrl("jdbc:h2:~/test")
				    .setUser("sa")
				    .setPassword(""),
				  new PoolOptions()
				    .setMaxSize(16)
				);
		return pool;
	}

}

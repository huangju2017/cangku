package test;

import java.sql.Connection;
import java.sql.SQLException;

import com.hj.studentsSys.utils.TxDBUtils;

public class TestConnection {

	public static void main(String[] args) throws SQLException {

		Connection  connection = TxDBUtils.getSource().getConnection();
		System.out.println(connection);
	}

}

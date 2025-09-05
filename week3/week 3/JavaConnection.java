package week3.day2.assignment3;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}

}

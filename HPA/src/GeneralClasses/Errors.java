//Aziza H Mustafa
package GeneralClasses;

public class Errors {
	private  Boolean Status=true;
	private  String Message ="Success";
	public Errors()
	{}
	public  void setError(Boolean status,String message) {
		Status = status;
		Message = message;
	}
	public  Boolean getStatus() {
		return Status;
	}
	
	public  String getMessage() {
		return Message;
	}
	

}

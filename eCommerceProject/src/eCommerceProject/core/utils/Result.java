package eCommerceProject.core.utils;

public class Result {
	public String message;
	public boolean success;
	public Result() {
		
	}
	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}
	
	public Result(boolean success) {
		super();
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean getSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}

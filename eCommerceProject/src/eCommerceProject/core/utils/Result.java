package eCommerceProject.core.utils;

public class Result {
	 private String message;
	 private boolean success;
	 
	public Result(boolean success, String message) {
		this(success); //this Class demek yani bu ifade aslinda: Result(boolean success) demek (satir 11 e gider)
		this.message = message;
	}
	public Result(boolean success) {
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

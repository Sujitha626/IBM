package comm.example.app;

@SuppressWarnings("serial")
public class InvalidSalaryException extends RuntimeException {
	private String message;
	public InvalidSalaryException(String message)
	{
		super();
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}

}
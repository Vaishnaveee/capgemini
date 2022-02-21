package String;

public class Source {
	public static void main(String args[] ) throws Exception {
		
	}

	
	}

class Email{
	Header header;
	String body;
	String greetings;
	public Email() {
	}
	public Email(Header header, String body, String greetings) {
		super();
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	public String getFrom() {
		return header.getFrom();
	}
	public String getTo() {
		return header.getTo();
	}
	
}

class Header{
	String from;
	String to;
	public Header(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	public Header() {
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
}



class EmailOperations{
	
public int emailVerify(Email e) {
		
		String strFrom[] = e.getFrom().split("@");
		String firstHalfFrom[]  = strFrom[0].split("");
		String secondHalfFrom[]  = strFrom[1].split(".");
		
		String strTo[] = e.getTo().split("@");
		String firstHalfTo[]  = strTo[0].split("");
		String secondHalfTo[]  = strFrom[1].split(".");
		int count = 0;
		if(firstHalfFrom[0].matches("[a-zA-Z]+") || firstHalfFrom[0].matches("_")) {
			if(firstHalfFrom.length == 2 && secondHalfFrom.length == 2 && secondHalfFrom[1].matches("[a-zA-Z]+")) {
				count += 1;
			}
		}
		if(firstHalfTo[0].matches("[a-zA-Z]+") || firstHalfTo[0].matches("_")) {
			if(firstHalfTo.length == 2 && secondHalfTo.length == 2 && secondHalfTo[1].matches("[a-zA-Z]+")) {
				count += 1;
			}
		}
		return count;
			
	}
	
	
	public String bodyEncryption(Source e) {
		return "";
		
	}
	
	public String greetingMessage(Source e) {
		return "";
		
	}
}





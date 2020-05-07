
public class Car {
	private String modelName;	// 필드
	private String color;		// 필드
	private int modelYear;    	// 필드
	private int maxSpeed;		// 필드
	private int currentSpeed;	// 필드
	
	Car(String modelName, String color, int modelYear, int maxSpeed){	// 생성자
		this.modelName = modelName;
		this.color = color;
		this.modelYear = modelYear;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	public String getModel() {	// 메소드
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
}

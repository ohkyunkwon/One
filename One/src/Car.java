
public class Car {
	private String modelName;	// �ʵ�
	private String color;		// �ʵ�
	private int modelYear;    	// �ʵ�
	private int maxSpeed;		// �ʵ�
	private int currentSpeed;	// �ʵ�
	
	Car(String modelName, String color, int modelYear, int maxSpeed){	// ������
		this.modelName = modelName;
		this.color = color;
		this.modelYear = modelYear;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	public String getModel() {	// �޼ҵ�
		return this.modelYear + "��� " + this.modelName + " " + this.color;
	}
}

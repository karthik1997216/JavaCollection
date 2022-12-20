package org.phone;

public class PhoneInfo {
	public void phoneName(){
		System.out.println("phoneName - 12345678");
	}
	public void phoneMieiNum() {
		System.out.println("phoneMieiNum - 1234");
	}
	public void Camera() {
		System.out.println("Camera - 20MP");
	}
	public void storage() {
		System.out.println("storage - 30GB");
	}
	public void osName() {
		System.out.println("osName - Android");
	}
	public static void main(String[] args) {
		PhoneInfo a = new PhoneInfo();
		a.phoneName();
		a.phoneMieiNum();
		a.Camera();
		a.storage();
		a.osName();

	}

}

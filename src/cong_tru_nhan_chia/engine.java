package cong_tru_nhan_chia;

public class engine {
	private double soA;
	private double soB;
	
	
	public engine() {
		super();
	}
	
	public double getSoA() {
		return soA;
	}
	public void setSoA(double soA) {
		this.soA = soA;
	}
	public double getSoB() {
		return soB;
	}
	public void setSoB(double soB) {
		this.soB = soB;
	}
	public engine(double soA, double soB) {
		super();
		this.soA = soA;
		this.soB = soB;
	}
	public double phepCong() {
		return this.soA + this.soB;
	}
	public double phepTru() {
		return this.soA - this.soB;
	}
	public double phepNhan() {
		return this.soA*this.soB;
	}
	public boolean cantDivide() {
		if (this.soB == 0)
			return false;
		else return true;
	}
	public double phepChia() {
		return this.soA/this.soB;
	}
}

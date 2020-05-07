package calculator.common;

public class ViewPanel {
	String number="";
	boolean sobreescreve = false;
	
	public ViewPanel() {
		
	}
	
	public String getNumber() {
		if (this.number.contentEquals("")) {
			return "0";
		}
		return number;
	}
	
	protected void setNumber(float number) {
		if (number == (int)number) {
			this.number = Integer.toString((int)number);
		} else {
			this.number = Float.toString(number);
		}
	}
	
	public String incNumber(String element) {
		if(number.contentEquals("") && element.contentEquals("0")) {
			return this.getNumber();
		} else if(element.contentEquals("-")) {
			this.number = "-"+this.number;
		} else if (element.contentEquals(".")) {
			if(this.getNumber().contentEquals("0") || this.sobreescreve == true) {
				this.number="0.";
				this.sobreescreve = false;
			} else if(this.number.indexOf(".") != -1 ) {
			} else {
				this.number+=".";
			}
		} else if(sobreescreve == false) {
			this.number+=element;
		} else {
			this.number=element;
			sobreescreve = false;
		}
		return number;
	}
	
	public void clear() {
		this.number="";
		this.sobreescreve = false;
	}
	
	public String changeNrSign() {
		if(this.getNumber().contentEquals("0")) {
			return this.getNumber();
		} else if(number.indexOf("-") == -1) {
			return incNumber("-");
		} else {
			this.number=number.replace("-", "");
			return number;
		}
	}
	
	public void setSobreescreve(boolean sobreescreve) {
		this.sobreescreve = sobreescreve;
	}
	
	public boolean getSobreescreve() {
		return this.sobreescreve;
	}
	
}

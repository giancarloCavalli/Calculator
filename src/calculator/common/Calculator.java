package calculator.common;

public class Calculator {
	private float nrStored;
	private char operador;
	private ViewPanel vp = new ViewPanel();
	
	public Calculator() {
		
	}
	
	public float getNrStored() {
		return nrStored;
	}
	
	private void setNrStored(float nrStored) {
		this.nrStored = nrStored;
		this.vp.setSobreescreve(true);
	}
	
	public char getOperador() {
		return operador;
	}
	
	public void setOperador(char operador) {
		this.setNrStored(Float.parseFloat(vp.getNumber()));
		this.operador = operador;
		}
	
	public float getResOperation() {
		float res = this.nrStored, nr2 = Float.parseFloat(vp.getNumber());
		switch (this.getOperador()) {
		case '+':
			res = this.getNrStored()+nr2;
			break;
		
		case '-':
			if(this.vp.getSobreescreve() == true) {
				res = nr2-this.getNrStored();
			} else {
				res = this.getNrStored()-nr2;
			}
			break;
			
		case '*':
			res = this.getNrStored()*nr2;
			break;

		case '/':
			if(this.vp.getSobreescreve() == true) {
				res = nr2/this.getNrStored();
			} else {
				res = this.getNrStored()/nr2;
			}
			break;
		
		default:
			break;
		}
		if (this.vp.getSobreescreve() == false) {
			this.setNrStored(nr2);
		}
		this.vp.setNumber(res);
		return res;
	}
	
	public ViewPanel getViewPanel() {
		return this.vp;
	}
	
	public void clearAll() {
		vp.clear();
		this.nrStored = 0;
	}
	
}

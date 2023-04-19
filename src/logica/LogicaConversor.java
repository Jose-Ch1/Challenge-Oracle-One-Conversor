package logica;

public class LogicaConversor {

	private double valor;
	private int datoConv1,datoConv2;
	private double resultado;
	
	
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDatoConv1() {
		return datoConv1;
	}
	public void setDatoConv1(int moneda1) {
		this.datoConv1 = moneda1;
	}
	public int getDatoConv2() {
		return datoConv2;
	}
	public void setDatoConv2(int moneda2) {
		this.datoConv2 = moneda2;
	}
	public LogicaConversor() {
		super();
	}
	//Colones (CRC)Dolares (USD)Euros (EUR)Peso Mexico (MXN)
	// operaciones Colones (CRC) 1	Dolares (USD) 0.0019	Euros (EUR)0.0017 	Peso Mexico (MXN) 0.034
	// 	Dolares (USD) 1	Euros (EUR)0.91 	Peso Mexico (MXN) 18.10 Peso Colones (CRC) 534.54
	// 	Euros (EUR)1	Peso Mexico (MXN) 19.84  Peso Colones (CRC) 585.73 Dolares (USD) 1.10
	//	Peso Mexico (MXN) 1  Peso Colones (CRC) 29.54 Dolares (USD) 0.055  Euros (EUR)0.050
	public double convertirDivisas() {
		switch (datoConv1) {
		case 1:
			if (datoConv2 == 2) {
				resultado = valor * 0.0019; 
			}else if (datoConv2 == 3) {
				resultado = valor * 0.0017;
			}else if (datoConv2 == 4) {
				resultado = valor * 0.034;
			}else if (datoConv2 == 1) {
				resultado = valor;
			}
			break;
		case 2:
			if (datoConv2 == 1) {
				resultado = valor * 534.54; 
			}else if (datoConv2 == 3) {
				resultado = valor * 0.91;
			}else if (datoConv2 == 4) {
				resultado = valor * 18.10;
			}else if (datoConv2 == 2) {
				resultado = valor;
			}
			break;
		case 3:
			if (datoConv2 == 1) {
				resultado = valor * 585.73; 
			}else if (datoConv2 == 2) {
				resultado = valor * 1.10;
			}else if (datoConv2 == 4) {
				resultado = valor * 19.84;
			}else if (datoConv2 == 3) {
				resultado = valor;
			}
			break;
		case 4:
			if (datoConv2 == 1) {
				resultado = valor * 29.54; 
			}else if (datoConv2 == 2) {
				resultado = valor * 0.055;
			}else if (datoConv2 == 3) {
				resultado = valor * 0.050;
			}else if (datoConv2 == 4) {
				resultado = valor;
			}
			break;
		}
		return resultado;
		
	}
	//-- Centímetros Metro	kilómetros
	public double convertirMedidas() {
		switch (datoConv1) {
		case 1:
			if (datoConv2 == 2) {
				resultado = valor / 100; 
			}else if (datoConv2 == 3) {
				resultado = (valor / 100)/1000 ;
			}else if (datoConv2 == 1) {
				resultado = valor;
			}
			break;
		case 2:
			if (datoConv2 == 1) {
				resultado = valor * 100; 
			}else if (datoConv2 == 3) {
				resultado = valor / 1000;
			}else if (datoConv2 == 2) {
				resultado = valor;
			}
			break;
		case 3:
			if (datoConv2 == 1) {
				resultado = (valor *1000) * 100; 
			}else if (datoConv2 == 2) {
				resultado = valor * 1000;
			}else if (datoConv2 == 3) {
				resultado = valor;
			}
			break;
		}
		return resultado;
		
	}
	
	//-- "Celsius", "Fahrenheit", "Kelvin
		public double convertirTemperatura() {
			switch (datoConv1) {
			case 1:
				if (datoConv2 == 2) {
					resultado = valor * 1.8 + 32; 
				}else if (datoConv2 == 3) {
					resultado = valor + 273.15;
				}else if (datoConv2 == 1) {
					resultado = valor;
				}
				break;
			case 2:
				if (datoConv2 == 1) {
					resultado = (valor - 32) / 1.8; 
				}else if (datoConv2 == 3) {
					resultado = (valor - 32) * 5/9 + 273.15;
				}else if (datoConv2 == 2) {
					resultado = valor;
				}
				break;
			case 3:
				if (datoConv2 == 1) {
					resultado = valor - 273.15 ; 
				}else if (datoConv2 == 2) {
					resultado = (valor - 273.15) * 1.8 + 32;
				}else if (datoConv2 == 3) {
					resultado = valor;
				}
				break;
			}
			return resultado;
			
		}
	
	
	
}

package clases;

import java.util.Scanner;

public class SuperPizza {
	private int tipoDePizza, tamañoPizza, adicional, opcionAdicional, tipoDeBebida, tamañoDeBebida, tipoDeCombo, postre;
	private double dineroPizza,dineroRefresco,dineroAgua,dineroCombo,dineroPostre,dineroVendida,totalDia;
	private int agrandado;
	public double getDineroPizza() {
		return dineroPizza;
	}

	public void setDineroPizza(double dineroPizza) {
		this.dineroPizza = dineroPizza;
	}

	public double getDineroRefresco() {
		return dineroRefresco;
	}

	public void setDineroRefresco(double dineroRefresco) {
		this.dineroRefresco = dineroRefresco;
	}

	public double getDineroAgua() {
		return dineroAgua;
	}

	public void setDineroAgua(double dineroAgua) {
		this.dineroAgua = dineroAgua;
	}

	public double getDineroCombo() {
		return dineroCombo;
	}

	public void setDineroCombo(double dineroCombo) {
		this.dineroCombo = dineroCombo;
	}

	public double getDineroPostre() {
		return dineroPostre;
	}

	public void setDineroPostre(double dineroPostre) {
		this.dineroPostre = dineroPostre;
	}

	public double getDineroVendida() {
		return dineroVendida;
	}

	public void setDineroVendida(double dineroVendida) {
		this.dineroVendida = dineroVendida;
	}

	public double getTotalDia() {
		return totalDia;
	}

	public void setTotalDia(double totalDia) {
		this.totalDia = totalDia;
	}

	public int getTipoDeCombo() {
		return tipoDeCombo;
	}

	public void setTipoDeCombo(int tipoDeCombo) {
		this.tipoDeCombo = tipoDeCombo;
	}

	public int getPostre() {
		return postre;
	}

	public void setPostre(int postre) {
		this.postre = postre;
	}


	public int getAgrandado() {
		return agrandado;
	}

	public void setAgrandado(int agrandado) {
		this.agrandado = agrandado;
	}

	public int getTamañoDeBebida() {
		return tamañoDeBebida;
	}

	public void setTamañoDeBebida(int tamañoDeBebida) {
		this.tamañoDeBebida = tamañoDeBebida;
	}

	public int getTipoDeBebida() {
		return tipoDeBebida;
	}

	public void setTipoDeBebida(int tipoDeBebida) {
		this.tipoDeBebida = tipoDeBebida;
	}

	private double precioTotal;

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getOpcionAdicional() {
		return opcionAdicional;
	}

	public void setOpcionAdicional(int opcionAdicional) {
		this.opcionAdicional = opcionAdicional;
	}

	public int getAdicional() {
		return adicional;
	}

	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}

	public int getTipoDePizza() {
		return tipoDePizza;
	}

	public void setTipoDePizza(int tipoDePizza) {
		this.tipoDePizza = tipoDePizza;
	}

	public int getTamañoPizza() {
		return tamañoPizza;
	}

	public void setTamañoPizza(int tamañoPizza) {
		this.tamañoPizza = tamañoPizza;
	}
	public void porcentajes() {
		double porcentajePizza,porcentajeRefresco,porcentajeCombo,porcentajePostre,porcentajeAgua;
		porcentajePizza=((getDineroPizza()/getTotalDia())*100);
		porcentajeRefresco=((getDineroRefresco()/getTotalDia())*100);
		porcentajeCombo=((getDineroCombo()/getTotalDia())*100);
		porcentajePostre=((getDineroPostre()/getTotalDia())*100);
		porcentajeAgua=((getDineroCombo()/getTotalDia())*100);
		System.out.println("Porcentajes");
		System.out.println("De un total de 100% se vendieron");
		System.out.println("Pizzas : "+porcentajePizza+"%");
		System.out.println("Refresco : "+porcentajeRefresco+"%");
		System.out.println("Combos : "+porcentajeCombo+"%");
		System.out.println("Postres : "+porcentajePostre+"%");
		System.out.println("Agua : "+porcentajeAgua+"%");
	}

	public void postres() {
		double precioPostre = 3.50;
		setDineroPostre(getDineroPostre()+precioPostre);
		setPrecioTotal(getPrecioTotal() + precioPostre);
	}

	public void combo() {
		double precioCombo = 6.75;
		if (getAgrandado() == 1) {
			precioCombo = precioCombo + 0.70;
		}
		setDineroCombo(getDineroCombo()+precioCombo);
		setPrecioTotal(getPrecioTotal() + precioCombo);
	}

	public void bebidas() {
		double precioBebida = 0;
		if (getTipoDeBebida() == 1 || getTipoDeBebida() == 2) {
			if (getTamañoDeBebida() == 1) {
				precioBebida = 1.50;
			} else if (getTamañoDeBebida() == 2) {
				precioBebida = 2.50;
			}
			setDineroRefresco(getDineroRefresco()+precioBebida);

		} else if (getTipoDeBebida() == 3) {
			precioBebida = 1.50;
			setDineroAgua(getDineroAgua()+precioBebida);
		}
		setPrecioTotal(getPrecioTotal() + precioBebida);

	}

	public void pizzas() {
		double precioPizza = 0;
		if (getTamañoPizza() == 1) {
			precioPizza = 5.50;
		} else if (getTamañoPizza() == 2) {
			precioPizza = 12;
		}
		if (getAdicional() == 1) {
			precioPizza = precioPizza + 1;
		}
		setDineroPizza(getDineroPizza()+precioPizza);
		setPrecioTotal(getPrecioTotal() + precioPizza);
	}

	public void menu() {
		int y = 0, x = 0,opp=0, op1 = 0, op2 = 0, w = 0, op3 = 0, op4 = 0;
		String factura = "";
		Scanner sc = new Scanner(System.in);
		while (y != 1) {
			System.out.println("Bienvenido a SuperPizza");
			System.out.println("1.Nuevo Cliente");
			System.out.println("2.Ventas del Dia");
			System.out.println("Seleccione una opcion: ");
			opp=sc.nextInt();
			x=0;
			switch(opp) {
			case 1: 
				while (x != 1) {
					System.out.println("*******************");
					System.out.println("Menu del Comprador");
					System.out.println("*******************");
				System.out.println("1.Ingresar nuevo producto");
				System.out.println("2.Salir");
				System.out.println("Seleccione una opcion: ");
				op1 = sc.nextInt();
				switch (op1) {
				case 1:
						System.out.println("*******************");
						System.out.println("Menu de SuperPizza");
						System.out.println("*******************");
						System.out.println("1.Pizza ");
						System.out.println("2.Bebidas");
						System.out.println("3.Combos");
						System.out.println("4.Postres");
						System.out.println("Seleccione una opcion: ");
						op2 = sc.nextInt();
						switch (op2) {
						case 1:
							System.out.println("*******************");
							System.out.println("Menu de Pizzas");
							System.out.println("*******************");
							System.out.println("Tamaño de la pizza ");
							System.out.println("1.Personal");
							System.out.println("2.Familiar");
							setTamañoPizza(sc.nextInt());
							System.out.println("1.Pizza de Jamon");
							System.out.println("2.Pizza de Pepperoni");
							System.out.println("3.Pizza de Pollo");
							System.out.println("4.Pizza Vegetariana");
							System.out.println("Seleccione una opcion: ");
							setTipoDePizza(sc.nextInt());
							if (getTamañoPizza() == 1) {
								factura = factura + "\nPizza Personal ";
								switch (getTipoDePizza()) {
								case 1:
									factura = factura + "de Jamon: 5.50 ";
									break;
								case 2:
									factura = factura + "de Pepperoni: 5.50 ";
									break;
								case 3:
									factura = factura + "de Pollo: 5.50 ";
									break;
								case 4:
									factura = factura + "de Vegetariana: 5.50 ";
									break;

								}
							}
							if (getTamañoPizza() == 2) {
								factura = factura + "\nPizza Familiar ";
								switch (getTipoDePizza()) {
								case 1:
									factura = factura + "de Jamon: 12.00 ";
									break;
								case 2:
									factura = factura + "de Pepperoni: 12.00 ";
									break;
								case 3:
									factura = factura + "de Pollo: 12.00 ";
									break;
								case 4:
									factura = factura + "de Vegetariana: 12.00 ";
									break;

								}
							}

							System.out.println("¿Desea un ingrediente adicional?");
							System.out.println("1.Si");
							System.out.println("2.No");
							setAdicional(sc.nextInt());
							if (getAdicional() == 1) {
								System.out.println("¿Que ingrediente adicional?");
								System.out.println("1.Jamon");
								System.out.println("2.Pepperoni");
								System.out.println("3.Pollo");
								System.out.println("4.Hongos");
								setOpcionAdicional(sc.nextInt());
								switch (getOpcionAdicional()) {
								case 1:
									factura = factura + "\nIngrediente Adicional Jamon: 1.00 ";
									break;
								case 2:
									factura = factura + "\nIngrediente Adicional Pepperoni: 1.00 ";
									break;
								case 3:
									factura = factura + "\nIngrediente Adicional Pollo: 1.00 ";
									break;
								case 4:
									factura = factura + "\nIngrediente Adicional Hongos: 1.00 ";
									break;

								}
							}
							pizzas();
							break;
						case 2:
							System.out.println("*******************");
							System.out.println("Menu de Bebidas");
							System.out.println("*******************");
							System.out.println("Tipo de bebida ");
							System.out.println("1.Soda");
							System.out.println("2.Te Frio");
							System.out.println("3.Agua Embotellada");
							setTipoDeBebida(sc.nextInt());
							if (getTipoDeBebida() == 1 || getTipoDeBebida() == 2) {
								System.out.println("Tamaño de Bebida");
								System.out.println("1.Regular");
								System.out.println("2.Tamaño Grande");
								setTamañoDeBebida(sc.nextInt());
							}
							switch (getTipoDeBebida()) {
							case 1:
								if (getTamañoDeBebida() == 1) {
									factura = factura + "\nSoda Regular: 1.50";
								} else if (getTamañoDeBebida() == 2) {
									factura = factura + "\nSoda Grande: 2.25";
								}
								break;
							case 2:
								if (getTamañoDeBebida() == 1) {
									factura = factura + "\nTe Frio Regular: 1.50";
								} else if (getTamañoDeBebida() == 2) {
									factura = factura + "\nTe Frio Grande: 2.25";
								}
								break;
							case 3:
								factura = factura + "\nBotella de agua: 1.50";
								break;
							}
							bebidas();
							break;
						case 3:
							System.out.println("*******************");
							System.out.println("Menu de Combos");
							System.out.println("*******************");
							System.out.println("1.Pizza Regular + Refresco");
							setTipoDeCombo(sc.nextInt());
							System.out.println("1.Pizza de Jamon");
							System.out.println("2.Pizza de Pepperoni");
							System.out.println("3.Pizza de Pollo");
							System.out.println("4.Pizza Vegetariana");
							System.out.println("Seleccione una opcion: ");
							setTipoDePizza(sc.nextInt());
							switch (getTipoDePizza()) {
							case 1:
								factura = factura + "\nRegular de Jamon +  ";
								break;
							case 2:
								factura = factura + "\nRegular de Pepperoni + ";
								break;
							case 3:
								factura = factura + "\nRegular de Pollo + ";
								break;
							case 4:
								factura = factura + "\nRegular Vegetariana + ";
								break;

							}
							System.out.println("Tipo de Refresco");
							System.out.println("1.Soda");
							System.out.println("2.Te Frio");
							setTipoDeBebida(sc.nextInt());
							if (getTipoDeBebida() == 1) {
								factura = factura + "Soda ";
							} else if (getTipoDeBebida() == 2) {
								factura = factura + "Te frio ";
							}
							System.out.println("¿Desea agrandar su refresco?");
							System.out.println("1.Si");
							System.out.println("2.No");
							setAgrandado(sc.nextInt());
							if (getAgrandado() == 1) {
								factura = factura + "Agrandado : 7.45";
							} else if (getAgrandado() == 2) {
								factura = factura + ":6.75";
							}
							combo();
							break;
						case 4:
							System.out.println("*******************");
							System.out.println("Menu de Postres");
							System.out.println("*******************");
							System.out.println("1.Flan");
							System.out.println("2.CheeseCake");
							System.out.println("3.Tiramisu");
							System.out.println("Seleccione una opcion: ");
							setPostre(sc.nextInt());
							switch (getPostre()) {
							case 1:
								factura = factura + "\nFlan: 3.50";
								break;
							case 2:
								factura = factura + "\nCheeseCake: 3.50";
								break;
							case 3:
								factura = factura + "\nTiramisu: 3.50";
								break;
							}
							postres();
							break;
						}

					break;
				case 2:
					System.out.println("***********************");
					System.out.println("Factura");
					System.out.println("***********************");
					System.out.println(factura);
					System.out.println("Precio total: " + getPrecioTotal());
					setTotalDia(getTotalDia()+getPrecioTotal());
					setPrecioTotal(0);
					setTipoDePizza(0);
				    setTamañoPizza(0);
				    setAdicional(0);
				    setOpcionAdicional(0);
				    setTipoDeBebida(0);
				    setTamañoDeBebida(0);
				    setTipoDeCombo(0);
				    setPostre(0);
				    factura="";
					x=1;
					break;
				}
			}
				
		 break;
			case 2:
				System.out.println("Total reacudado: "+getTotalDia());
				System.out.println("Recaudado en pizza: "+getDineroPizza());
				System.out.println("Recaudado en refrescos: "+getDineroRefresco());
				System.out.println("Recaudado en combo: "+getDineroCombo());
				System.out.println("Recaudado en Postres: "+getDineroPostre());
				System.out.println("Recaudado en Agua: "+getDineroAgua());
				porcentajes();
				y=1;
				break;
		}
		}
		
	}

	public static void main(String[] args) {
		SuperPizza p = new SuperPizza();
		p.menu();
	}

}

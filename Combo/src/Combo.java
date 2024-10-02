public class Combo {
	public String combo;
    public Burguer burger;
    public Bebida bebida;
    public Sobremesa sobremesa;

    public void CriarCombo(int tipo)
    {
        switch (tipo)
        {
            case 1:
                combo = "Master";
                
                burger = new Burguer();
                burger.descricao = "Big Burger";
                burger.preco = 10;
                burger.gramas = 250;

                bebida = new Bebida();
                bebida.descricao = "Coca-Cola";
                bebida.preco = 5;
                bebida.ml = 350;

                sobremesa = new Sobremesa();
                sobremesa.descricao = "Sorvete";
                sobremesa.preco = 7;
                sobremesa.tamanho = "Médio";    
                
                break;
            
            case 2:
                combo = "Pro";
                
                burger = new Burguer();
                burger.descricao = "The Big One";
                burger.preco = 10;
                burger.gramas = 500;

                bebida = new Bebida();
                bebida.descricao = "Coca-Cola";
                bebida.preco = 7;
                bebida.ml = 500;

                sobremesa = new Sobremesa();
                sobremesa.descricao = "Sorvete";
                sobremesa.preco = 10;
                sobremesa.tamanho = "Grande";
                
                break;
        }
    }
    
    public String toString()
    {
    	return String.format(
    			"Selecionado Combo %s:\n",
    			combo) +
    			
    			String.format(
    			"\tBurger:\n"+ 
    			"\t\tDescrição: %s\n" +
    			"\t\tGramas: %d\n"+
    			"\t\tPreço: %.2f\n\n",
    			burger.descricao, burger.gramas, burger.preco) +
    			
    			String.format(
    	    			"\tBebida:\n"+ 
    	    			"\t\tDescrição: %s\n" +
    	    			"\t\tml: %d\n"+
    	    			"\t\tPreço: %.2f\n\n",
    	    			bebida.descricao, bebida.ml, bebida.preco) +
    			
    			String.format(
    	    			"\tSobremesa:\n"+ 
    	    			"\t\tDescrição: %s\n" +
    	    			"\t\tTamanho: %s\n"+
    	    			"\t\tPreço: %.2f\n\n",
    	    			sobremesa.descricao, sobremesa.tamanho, sobremesa.preco);
    			
    }

}

public class Ebook extends Livro {
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem){
		if (porcentagem > 0.1){
			return false;
		}
		//double desconto = this.getPreco() * porcentagem;
		//this.setPreco(this.getPreco() - desconto);
		//return true;
		return super.aplicaDescontoDe(porcentagem);
	}
	

	private String watermark;

	public String getWatermark() {
		return watermark;
	}
	
	public Ebook(Autor autor){
		super(autor);
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}

}

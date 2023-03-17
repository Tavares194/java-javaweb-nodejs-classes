package Aula3;
public class Relogio {
    private String marca;
    private String cor;
    private Boolean tamanho;

    public Relogio(String marca, String cor, Boolean tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Relogio(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public Relogio() {
        this.marca = "";
        this.cor = "";
        this.tamanho = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getTamanho() {
        return tamanho;
    }

    public void setTamanho(Boolean tamanho) {
        this.tamanho = tamanho;
    }

    public String toString(){
        return "Marca: " + marca + "Cor: " + cor + "Tamanho: " + tamanho;
    }

    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj==null)
            return false;

        if(this.getClass() != obj.getClass())
            return false;

        Relogio other = (Relogio) obj;

        if (this.cor==null){
            if(other.cor!= null)
            return false;
        }
        else if(!cor.equals(other.cor))
        return false;

        if (this.marca==null){
            if(other.marca!= null)
            return false;
        }
        else if(!marca.equals(other.marca))
        return false;

        if (this.tamanho==null){
            if(other.tamanho!= null)
            return false;
        }
        else if(!tamanho.equals(other.tamanho))
        return false;

        return true;
        
    }
        public int hashCode(){
            int primo = 31;
            int resultado = 1;
            resultado = resultado * primo + ((marca==null) ? 0 : marca.hashCode());
            resultado = resultado * primo + ((cor==null) ? 0 : cor.hashCode());
            resultado = resultado * primo + ((tamanho==null) ? 0 : tamanho.hashCode());
            return resultado;
        }
}

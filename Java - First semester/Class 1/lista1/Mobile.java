package lista1;

public class Mobile {
    private String marca;
    private String modelo;

    public Mobile(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Mobile(String marca) {
        this.marca = marca;
    }

    public Mobile() {
        this.marca = "";
        this.modelo = "";
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString(){
        return "marca: " + marca + "modelo: " + modelo;
    }

    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj==null)
            return false;

        if(this.getClass() != obj.getClass())
            return false;

        Mobile other = (Mobile) obj;

        if (this.modelo==null){
            if(other.modelo!= null)
            return false;
        }
        else if(!modelo.equals(other.modelo))
        return false;

        if (this.marca==null){
            if(other.marca!= null)
            return false;
        }
        else if(!marca.equals(other.marca))
        return false;

        return true;
    }
}

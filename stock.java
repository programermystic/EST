
package erp_system;


public class stock {
 private String fecha;
 private Integer cantidad;
 private Integer indice;

    public String getFecha() {
        return fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
 
 public void mostrar()
 {
     
     System.out.print(this.getFecha()+" "+this.getCantidad()+" ");
     
 }
}

package cs_utec.cs2901.data;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class DayliCases implements Serializable {

    @Id
    private Long id;

    @Column
    private Integer cantidad;

    @Column
    private Date    fecha;

    public DayliCases() {
    }

    public DayliCases(Long id, Integer cantidad, Date fecha) {
        this.id = id;
        this.cantidad =  cantidad;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

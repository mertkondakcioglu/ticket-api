package in.finartz.proje.biletapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rotalar")
public class Rota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String baslangic;
	@Column
	private String bitis;
	@Column
	private String mesafe;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBaslangic() {
		return baslangic;
	}
	public void setBaslangic(String baslangic) {
		this.baslangic = baslangic;
	}
	public String getBitis() {
		return bitis;
	}
	public void setBitis(String bitis) {
		this.bitis = bitis;
	}
	public String getMesafe() {
		return mesafe;
	}
	public void setMesafe(String mesafe) {
		this.mesafe = mesafe;
	}
	@Override
	public String toString() {
		return "Rota [id=" + id + ", baslangic=" + baslangic + ", bitis=" + bitis + ", mesafe=" + mesafe + "]";
	}

}

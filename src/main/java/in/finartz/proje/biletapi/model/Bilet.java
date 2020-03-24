package in.finartz.proje.biletapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "biletler")
public class Bilet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String musteri_isim;
	@Column
	private Integer fiyat;
	@Column
	private Integer ucus_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMusteri_isim() {
		return musteri_isim;
	}
	public void setMusteri_isim(String musteri_isim) {
		this.musteri_isim = musteri_isim;
	}
	public Integer getFiyat() {
		return fiyat;
	}
	public void setFiyat(Integer fiyat) {
		this.fiyat = fiyat;
	}
	public Integer getUcus_id() {
		return ucus_id;
	}
	public void setUcus_id(Integer ucus_id) {
		this.ucus_id = ucus_id;
	}
	@Override
	public String toString() {
		return "Bilet [id=" + id + ", musteri_isim=" + musteri_isim + ", fiyat=" + fiyat + ", ucus_id=" + ucus_id + "]";
	}
	
}

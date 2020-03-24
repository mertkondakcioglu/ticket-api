package in.finartz.proje.biletapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sirketler")
public class Sirket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String isim;
	@Column
	private int personel_sayisi;
	@Column
	private int ucak_sayisi;
	@Column
	private Date kurulus_tarihi;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getPersonel_sayisi() {
		return personel_sayisi;
	}
	public void setPersonel_sayisi(int personel_sayisi) {
		this.personel_sayisi = personel_sayisi;
	}
	public int getUcak_sayisi() {
		return ucak_sayisi;
	}
	public void setUcak_sayisi(int ucak_sayisi) {
		this.ucak_sayisi = ucak_sayisi;
	}
	public Date getKurulus_tarihi() {
		return kurulus_tarihi;
	}
	public void setKurulus_tarihi(Date kurulus_tarihi) {
		this.kurulus_tarihi = kurulus_tarihi;
	}
	@Override
	public String toString() {
		return "Sirket [id=" + id + ", isim=" + isim + ", personel_sayisi=" + personel_sayisi + ", ucak_sayisi="
				+ ucak_sayisi + ", kurulus_tarihi=" + kurulus_tarihi + "]";
	}
	
}

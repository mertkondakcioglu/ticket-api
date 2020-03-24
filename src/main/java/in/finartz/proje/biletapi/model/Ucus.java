package in.finartz.proje.biletapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ucuslar")
public class Ucus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private int kontenjan;
	@Column
	private int kisi_sayisi;
	@Column
	private Date ucus_tarihi;
	@Column
	private int havayolu_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKontenjan() {
		return kontenjan;
	}
	public void setKontenjan(int kontenjan) {
		this.kontenjan = kontenjan;
	}
	public int getKisi_sayisi() {
		return kisi_sayisi;
	}
	public void setKisi_sayisi(int kisi_sayisi) {
		this.kisi_sayisi = kisi_sayisi;
	}
	public Date getUcus_tarihi() {
		return ucus_tarihi;
	}
	public void setUcus_tarihi(Date ucus_tarihi) {
		this.ucus_tarihi = ucus_tarihi;
	}
	public int getHavayolu_id() {
		return havayolu_id;
	}
	public void setHavayolu_id(int havayolu_id) {
		this.havayolu_id = havayolu_id;
	}
	@Override
	public String toString() {
		return "Ucus [id=" + id + ", kontenjan=" + kontenjan + ", kisi_sayisi=" + kisi_sayisi + ", ucus_tarihi="
				+ ucus_tarihi + ", havayolu_id=" + havayolu_id + "]";
	}
	
}

package in.finartz.proje.biletapi.view;

import in.finartz.proje.biletapi.model.Bilet;
import in.finartz.proje.biletapi.service.BiletService;
import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@ViewScoped
public class BiletView {

    @Autowired
    private BiletService biletService;

    private List<Bilet> biletler;
    private Bilet bilet = new Bilet();

    @PostConstruct
    public void init() {
        biletGetir();
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    public List<Bilet> getBiletler() {
        return biletler;
    }

    public void setBiletler(List<Bilet> biletler) {
        this.biletler = biletler;
    }

    public void biletGetir() {
        biletler = biletService.get();
    }

    public void biletSil(int id) {
        biletService.delete(id);
        biletGetir();
        FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage("Silme işlemi başarılı!"));
    }

    public void biletEkle() {
        biletService.save(bilet);
        bilet = new Bilet();
        biletGetir();
        FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage("Ekleme işlemi başarılı!"));
    }

    public void biletGetWithId(int id) {
        bilet = biletService.get(id);
    }

    public void biletDegistir() {
        biletService.update(bilet);
        bilet = new Bilet();
        PrimeFaces.current().executeScript("PF('biletUpdate').hide()");
        biletGetir();
        FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage("Güncelleme işlemi başarılı!"));
    }

    public String biletDetail(int id) {
        bilet = biletService.get(id);
        return "biletDetail?faces-redirect=true&includeViewParams=true";
    }

    public String biletMainPage() {
        bilet = new Bilet();
        return "biletler?faces-redirect=true";
    }
}

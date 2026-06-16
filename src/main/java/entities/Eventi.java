package entities;

import java.time.LocalDate;

//Creo la classe eventi e definisco tutti i suoi attributi

public class Eventi {
    private long id;
    private String titolo;
    private LocalDate dataEvento;
    private String descrizione;
    private String tipoEvento;
    private int numeroMassimoPartecipanti;

    //creo il costruttore della classe
    public Eventi(long id, String titolo, LocalDate dataEvento, String descrizione, String tipoEvento) {
        this.id = id;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    //definisco i getter e i setter per la classe
    public void getid(long id){
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public String getTipoEvento() {
        return tipoEvento;
    }
    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Eventi{");
        sb.append("id=").append(id);
        sb.append(", titolo='").append(titolo).append('\'');
        sb.append(", dataEvento=").append(dataEvento);
        sb.append(", descrizione='").append(descrizione).append('\'');
        sb.append(", tipoEvento='").append(tipoEvento).append('\'');
        sb.append(", numeroMassimoPartecipanti=").append(numeroMassimoPartecipanti);
        sb.append('}');
        return sb.toString();
    }
}



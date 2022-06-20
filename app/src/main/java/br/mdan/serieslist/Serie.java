package br.mdan.serieslist;

public class Serie {

    private String nameSerie;
    private String categorySerie;
    private String descriptionSerie;
    private int fotoSerie;
    private int fotoSeriePos;

    public Serie() {
    }

    public Serie(String nameSerie, String categorySerie, String descriptionSerie, int fotoSerie, int fotoSeriePos) {
        this.nameSerie = nameSerie;
        this.categorySerie = categorySerie;
        this.descriptionSerie = descriptionSerie;
        this.fotoSerie = fotoSerie;
        this.fotoSeriePos = fotoSeriePos;
    }

    public String getNameSerie() {
        return nameSerie;
    }

    public void setNameSerie(String nameSerie) {
        this.nameSerie = nameSerie;
    }

    public String getCategorySerie() {
        return categorySerie;
    }

    public void setCategorySerie(String categorySerie) {
        this.categorySerie = categorySerie;
    }

    public String getDescriptionSerie() {
        return descriptionSerie;
    }

    public void setDescriptionSerie(String descriptionSerie) {
        this.descriptionSerie = descriptionSerie;
    }

    public int getFotoSerie() {
        return fotoSerie;
    }

    public void setFotoSerie(int fotoSerie) {
        this.fotoSerie = fotoSerie;
    }

    public int getFotoSeriePos() {
        return fotoSeriePos;
    }

    public void setFotoSeriePos(int fotoSeriePos) {
        this.fotoSeriePos = fotoSeriePos;
    }
}

package com.polytech.tp;

public class CoursBuilder {
    private String matiere = "Inconnu";
    private String enseignant = "Inconnu";
    private String salle = "A définir";
    private String date = "01/01/1970";
    private String heureDebut = "08:00";
    private boolean estOptionnel = false;
    private String niveau = "Tous";
    private boolean necessiteProjecteur = false;

    public CoursBuilder setMatiere(String matiere) {
        if (matiere != null) this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        if (enseignant != null) this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        if (salle != null) this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        if (date != null) this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        if (heureDebut != null) this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        if (niveau != null) this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    public Cours build() {
        // Optionnel : validations simples
        // ex : si tu veux exiger une matière non vide, uncommenter :
        // if (this.matiere == null || this.matiere.trim().isEmpty()) {
        //     throw new IllegalStateException("La matière doit être fournie");
        // }

        return new Cours(
                this.matiere,
                this.enseignant,
                this.salle,
                this.date,
                this.heureDebut,
                this.estOptionnel,
                this.niveau,
                this.necessiteProjecteur
        );
    }
}

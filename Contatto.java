package contatto;

public class Contatto {
    private String nome;
    private String email;
    private String numero;//sring perche non devo fare calcoli sul numero inoltre alcuni numeri iniziano per zero e con int si perde lo zero iniziale
    public Contatto(String nome, String email, String numero){
        this.nome =nome;
        this.numero =numero;
        this.email =email;
    }
    /* Getter e Setter
    * */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return
                 nome +" - " + email + " - "  + numero;
    }
}

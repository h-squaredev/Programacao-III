public class Usuario {
    private String nome;
    private NivelAcesso nivel;

    public Usuario(String nome, NivelAcesso nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public boolean verificarPermissao(String recurso) {
        switch (recurso) {
            case "CONSULTAR":
                return true; // todos os níveis
            case "EDITAR":
                return nivel == NivelAcesso.INTERMEDIARIO || nivel == NivelAcesso.ADMIN;
            case "GERENCIAR_USUARIOS":
                return nivel == NivelAcesso.ADMIN;
            default:
                System.out.println("Recurso desconhecido: " + recurso);
                return false;
        }
    }

    public String getNome() { return nome; }
    public NivelAcesso getNivel() { return nivel; }
}

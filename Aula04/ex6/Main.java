public class Main {
    public static void main(String[] args) {
        Usuario[] usuarios = {
            new Usuario("Joana", NivelAcesso.BASICO),
            new Usuario("Pedro", NivelAcesso.INTERMEDIARIO),
            new Usuario("Admin", NivelAcesso.ADMIN)
        };

        String[] recursos = { "CONSULTAR", "EDITAR", "GERENCIAR_USUARIOS" };

        for (Usuario u : usuarios) {
            System.out.println("Usuário: " + u.getNome() + " (" + u.getNivel() + ")");
            for (String r : recursos) {
                String resultado = u.verificarPermissao(r) ? "PERMITIDO" : "NEGADO";
                System.out.println("  " + r + ": " + resultado);
            }
            System.out.println();
        }
    }
}

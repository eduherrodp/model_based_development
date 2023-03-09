package modelbaseddevelopment.template;

public class Arenisca extends PaqueteDecoracion {
    @Override
    public void darAcabado() {
        System.out.println("Material lajeado");
    }
    @Override
    boolean solicitudAcabado() {
        String answer = respuestaUsuario();
        return answer.toLowerCase().startsWith("y");
    }
}

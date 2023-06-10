public class Subtitulo {

    int num;
    String InicialTime;
    String finalTime;
    String texto;
    Subtitulo sigSubtitulo;

    public Subtitulo(int num, String inicialTime, String finalTime, String texto, Subtitulo sigSubtitulo) {
        this.num = num;
        InicialTime = inicialTime;
        this.finalTime = finalTime;
        this.texto = texto;
        this.sigSubtitulo = sigSubtitulo;
    }


    public int getNum() {
        return num;
    }

    public String getInicialTime() {
        return InicialTime;
    }

    public String getFinalTime() {
        return finalTime;
    }

    public String getTexto() {
        return texto;
    }

    public Subtitulo getSigSubtitulo() {
        return sigSubtitulo;
    }


}

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Construtor
    public Hora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    // Método para comparar com outra hora
    public int compara(Hora outraHora) {
        int segundosThis = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int segundosOutraHora = outraHora.getHoras() * 3600 + outraHora.getMinutos() * 60 + outraHora.getSegundos();
        return segundosThis - segundosOutraHora;
    }

    // Métodos para obter horas, minutos e segundos
    public int getHoras() {
        return this.horas;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    // Método para exibir hora completa no formato HH:MM:SS
    public String displayHora() {
        return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }
}

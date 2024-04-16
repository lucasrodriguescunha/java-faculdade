public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        validarData();
    }

    private void validarData() {
        // Verifica se a data é válida
        int[] diasPorMes = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (mes < 1 || mes > 12) {
            dia = 1;
            mes = 1;
            ano = 1;
            return;
        }

        if (dia < 1 || dia > diasPorMes[mes]) {
            dia = 1;
            mes = 1;
            ano = 1;
            return;
        }

        if (mes == 2 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            if (dia > 29) {
                dia = 1;
                mes = 1;
                ano = 1;
            }
        }
    }

    public int compara(Data outraData) {
        if (ano == outraData.ano) {
            if (mes == outraData.mes) {
                if (dia == outraData.dia) {
                    return 0;
                } else if (dia > outraData.dia) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (mes > outraData.mes) {
                return 1;
            } else {
                return -1;
            }
        } else if (ano > outraData.ano) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        String[] meses = {
                "", "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        return meses[mes];
    }

    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        Data data1 = new Data(15, 4, 2024);
        Data data2 = new Data(20, 4, 2024);

        System.out.println(data1.compara(data2));  // Saída: -1 (data1 é anterior a data2)
        System.out.println(data1.getMesExtenso());  // Saída: abril
    }
}

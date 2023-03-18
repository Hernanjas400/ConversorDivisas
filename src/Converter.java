
import java.text.DecimalFormat;

public class Converter {
    DecimalFormat df = new DecimalFormat("#,##");

    public String ArgDolar(double valor) {
        valor = valor / 210.10;
        return df.format(valor);
    }

    public String ArgEuro(double valor) {

        valor = valor / 215.62;
        return df.format(valor);

    }

    public String ArgLibrasEsterlinas(double valor) {
        valor = valor / 243.67;
        return df.format(valor);
    }

    public String ArgYenes(double valor) {
        valor = valor * 1.52;
        return df.format(valor);
    }

    public String ArgWones(double valor) {
        valor = valor * 0.1557345;
        return df.format(valor);
    }

    public String DolaraAr(double valor) {
        valor = valor * 210.10;
        return df.format(valor);
    }

    public String EuroaAr(double valor) {
        valor = valor * 215.62;
        return df.format(valor);

    }

    public String LibrasEsterlinasaAr(double valor) {
        valor = valor * 243.67;
        return df.format(valor);
    }

    public String YenesaAr(double valor) {
        valor = valor * 1.52;
        return df.format(valor);
    }

    public String WonesaAr(double valor) {
        valor = valor * 0.1557345;
        return df.format(valor);
    }

    public String kgAgramos(double valor) {
        valor = valor * 1000;
        return df.format(valor);
    }

    public String kgAOz(double valor) {
        valor = valor * 35.2739619496;
        return df.format(valor);
    }

    public String kgATon(double valor) {
        valor = valor * 0.001;
        return df.format(valor);
    }

    public String gramosAKg(double valor) {
        valor = valor / 1000;
        return df.format(valor);
    }

    public String gramosAOz(double valor) {
        valor = valor / 28.34952315;
        return df.format(valor);
    }

    public String gramosATon(double valor) {
        valor = valor / 1000000;
        return df.format(valor);
    }

    public String ozAgramos(double valor) {
        valor = valor * 28.34952315;
        return df.format(valor);
    }

    public String ozAKg(double valor) {
        valor = valor * 0.0283495231;
        return df.format(valor);
    }

    public String ozATon(double valor) {
        valor = valor * 0.0000283495;
        return df.format(valor);
    }

    public String tonAgramos(double valor) {
        valor = valor * 1000000;
        return df.format(valor);
    }

    public String tonAoz(double valor) {
        valor = valor * 35273.96194958;
        return df.format(valor);
    }

    public String tonaKg(double valor) {
        valor = valor * 1000;
        return df.format(valor);
    }

    public String gramosALibras(double valor) {
        valor = valor * 0.0022046226;
        return df.format(valor);
    }

    public String librasaGramos(double valor) {
        valor = valor * 453.59237;
        return df.format(valor);
    }

    public String librasaOnzas(double valor) {
        valor = valor / 16;
        return df.format(valor);
    }

    public String librasaKilos(double valor) {
        valor = valor * 0.45359237;
        return df.format(valor);
    }

    public String librasaToneladas(double valor) {
        valor = valor * 0.0004535924;
        return df.format(valor);
    }

    public String ozALibras(double valor) {
        valor = valor / 16;
        return df.format(valor);
    }

    public String kgALibras(double valor) {
        valor = valor / 0.45359237;
        return df.format(valor);
    }

    public String tonALibras(double valor) {
        valor = valor / 0.0004535924;
        return df.format(valor);
    }

}

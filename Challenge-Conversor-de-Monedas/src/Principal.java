import com.francis.challenge.modelos.Conversor;

public class Principal {
    public static void main(String[] args) {
        Conversor convertidor = new Conversor();

        convertidor.DolaraPesoArgentino = 922.24;
        convertidor.PesoArgentinoaDolar = 0.0011;
        convertidor.DolaraPesoBrasileño = 546630;
        convertidor.RealaDolar = 0.18;
        convertidor.DolaraPesoColombiano= 3936.95 ;
        convertidor.PesoColombianoaDolar= 0.00025;
        convertidor.opcionExit= true;
        convertidor.totalOpciones=7;

        convertidor.muestraFicha();

        convertidor.opcion();


    }
}

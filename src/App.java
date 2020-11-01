import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {
        int saldoAwal = 2500000;
        double bunga = 0.15;

        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        for (int i = 1; i <= 6; i++) {
            int saldoAkhir = (int) (saldoAwal + (saldoAwal * bunga));
            
            kursIndo.setDecimalFormatSymbols(formatRp);
            System.out.println("Saldo di bulan ke-" + i + " " + kursIndo.format(saldoAkhir));
            
            saldoAwal = saldoAkhir;

        }
    }
}

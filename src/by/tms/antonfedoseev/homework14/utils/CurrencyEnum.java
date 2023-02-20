package by.tms.antonfedoseev.homework14.utils;

public class CurrencyEnum {
    public enum Currency {
        BYN("Белорусский рубль"),
        USD("Доллар США"),
        EUR("Евро"),
        GBP("Фунт стерлтнгов"),
        RUS("Российский рубль"),
        CNY("Китайский юань");
        private final String rusName;

        Currency( String rusName) {
            this.rusName = rusName;
        }



    }
}

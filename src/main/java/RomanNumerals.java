import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    private final Map<Integer,String> romanNumeralMap;
    private int arabicNumber;

    public RomanNumerals(int arabicNumber) {
        this.arabicNumber = arabicNumber;
        romanNumeralMap = new LinkedHashMap<>();
        romanNumeralMap.put(1000,"M");
        romanNumeralMap.put(900,"CM");
        romanNumeralMap.put(500,"D");
        romanNumeralMap.put(400,"CD");
        romanNumeralMap.put(100,"C");
        romanNumeralMap.put(90,"XC");
        romanNumeralMap.put(50,"L");
        romanNumeralMap.put(40,"XL");
        romanNumeralMap.put(10,"X");
        romanNumeralMap.put(9,"IX");
        romanNumeralMap.put(5,"V");
        romanNumeralMap.put(4,"IV");
        romanNumeralMap.put(1,"I");
    }

    public String convert() {
        StringBuilder romanNumeral = new StringBuilder();
        for (Integer an : romanNumeralMap.keySet()) {
            romanNumeral.append(getRomanNumeral(an));
        }
        return romanNumeral.toString();
    }

    private StringBuilder getRomanNumeral(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        while (this.arabicNumber >= number) {
            romanNumeral.append(romanNumeralMap.get(number));
            this.arabicNumber -= number;
        }
        return romanNumeral;
    }
}

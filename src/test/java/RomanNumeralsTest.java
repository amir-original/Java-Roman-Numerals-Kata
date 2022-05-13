import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    void should_convert_arabic_number_to_roman_numeral() {

        Assertions.assertThat(new RomanNumerals(1).convert()).isEqualTo("I");
        Assertions.assertThat(new RomanNumerals(2).convert()).isEqualTo("II");
        Assertions.assertThat(new RomanNumerals(3).convert()).isEqualTo("III");

        Assertions.assertThat(new RomanNumerals(5).convert()).isEqualTo("V");
        Assertions.assertThat(new RomanNumerals(6).convert()).isEqualTo("VI");
        Assertions.assertThat(new RomanNumerals(7).convert()).isEqualTo("VII");
        Assertions.assertThat(new RomanNumerals(8).convert()).isEqualTo("VIII");

        Assertions.assertThat(new RomanNumerals(9).convert()).isEqualTo("IX");
        Assertions.assertThat(new RomanNumerals(10).convert()).isEqualTo("X");
        Assertions.assertThat(new RomanNumerals(11).convert()).isEqualTo("XI");
        Assertions.assertThat(new RomanNumerals(12).convert()).isEqualTo("XII");
        Assertions.assertThat(new RomanNumerals(13).convert()).isEqualTo("XIII");

        Assertions.assertThat(new RomanNumerals(19).convert()).isEqualTo("XIX");
        Assertions.assertThat(new RomanNumerals(20).convert()).isEqualTo("XX");
        Assertions.assertThat(new RomanNumerals(21).convert()).isEqualTo("XXI");
        Assertions.assertThat(new RomanNumerals(25).convert()).isEqualTo("XXV");
        Assertions.assertThat(new RomanNumerals(28).convert()).isEqualTo("XXVIII");

        Assertions.assertThat(new RomanNumerals(30).convert()).isEqualTo("XXX");
        Assertions.assertThat(new RomanNumerals(37).convert()).isEqualTo("XXXVII");

        Assertions.assertThat(new RomanNumerals(49).convert()).isEqualTo("XLIX");
        Assertions.assertThat(new RomanNumerals(50).convert()).isEqualTo("L");
        Assertions.assertThat(new RomanNumerals(60).convert()).isEqualTo("LX");
        Assertions.assertThat(new RomanNumerals(70).convert()).isEqualTo("LXX");
        Assertions.assertThat(new RomanNumerals(80).convert()).isEqualTo("LXXX");
        Assertions.assertThat(new RomanNumerals(87).convert()).isEqualTo("LXXXVII");

        Assertions.assertThat(new RomanNumerals(90).convert()).isEqualTo("XC");
        Assertions.assertThat(new RomanNumerals(100).convert()).isEqualTo("C");
        Assertions.assertThat(new RomanNumerals(200).convert()).isEqualTo("CC");

        Assertions.assertThat(new RomanNumerals(400).convert()).isEqualTo("CD");
        Assertions.assertThat(new RomanNumerals(500).convert()).isEqualTo("D");
        Assertions.assertThat(new RomanNumerals(600).convert()).isEqualTo("DC");
        Assertions.assertThat(new RomanNumerals(700).convert()).isEqualTo("DCC");
        Assertions.assertThat(new RomanNumerals(800).convert()).isEqualTo("DCCC");

        Assertions.assertThat(new RomanNumerals(900).convert()).isEqualTo("CM");
        Assertions.assertThat(new RomanNumerals(1000).convert()).isEqualTo("M");
        Assertions.assertThat(new RomanNumerals(1378).convert()).isEqualTo("MCCCLXXVIII");
        Assertions.assertThat(new RomanNumerals(2022).convert()).isEqualTo("MMXXII");
        Assertions.assertThat(new RomanNumerals(1999).convert()).isEqualTo("MCMXCIX");
        Assertions.assertThat(new RomanNumerals(798).convert()).isEqualTo("DCCXCVIII");
    }
}

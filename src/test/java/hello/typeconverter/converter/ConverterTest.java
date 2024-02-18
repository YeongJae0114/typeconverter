package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class ConverterTest {
    @Test
    void stringToInteger(){
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void integerToString(){
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);
        Assertions.assertThat(result).isEqualTo("10");
    }

    @Test
    void stringToIpPort(){
        StringToIpPortConverter stringToIpPortConverter = new StringToIpPortConverter();
        IpPort result = stringToIpPortConverter.convert("127.0.0.1:8080");
        Assertions.assertThat(result).isEqualTo(new IpPort("127.0.0.1",8080));

    }
    @Test
    void ipPortToString(){
        IpPortToStringConverter ipPortToString = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1",8080);
        String result = ipPortToString.convert(source);
        Assertions.assertThat(result).isEqualTo("127.0.0.1:8080");
    }
}

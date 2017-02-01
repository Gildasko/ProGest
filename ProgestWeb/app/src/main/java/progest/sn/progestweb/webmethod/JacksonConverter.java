package progest.sn.progestweb.webmethod;

import java.lang.reflect.Type;

import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/**
 * Created by Pray on 16/01/2017.
 */

public class JacksonConverter  implements Converter{




    @Override
    public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
        return null;
    }

    @Override
    public TypedOutput toBody(Object o) {
        return null;
    }
}

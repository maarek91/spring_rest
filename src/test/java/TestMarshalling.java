import com.markelov.spring.rest.models.Passport;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RunWith(MockitoJUnitRunner.class)
public class TestMarshalling {

    private Passport passport;

    @Before
    public void init() {
        passport = new Passport();
        passport.setId(1L);
        passport.setName("Alexandr");
        passport.setSurname("Markelov");
        passport.setNumber((int) Math.random());
        passport.setDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
    }

    @Test
    public void marshallng() throws JAXBException, IOException {
        passport.marshal(passport);
    }
}

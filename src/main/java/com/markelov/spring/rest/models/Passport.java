package com.markelov.spring.rest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Data
@NoArgsConstructor
@XmlRootElement(name = "passport")
public class Passport {

    private Long id;
    private String name;
    private String surname;
    private int number;
    private String date;

    public void marshal(Passport passport) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Passport.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(passport, new File("./passport.xml"));
    }
}

package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;

public class ObjectToXml {
    public static void main(String[] args) throws Exception{
        JAXBContext contextObj = JAXBContext.newInstance(Answer.class);

        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Answer ans=new Answer(102,"Java is platform dependent","john");

        marshallerObj.marshal(ans, new FileWriter("C:/Users/Pooja chavan/Documents/answer.xml"));

    }
}

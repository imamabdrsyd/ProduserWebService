
package com.valensi;

import com.valensi.model.Address;
import com.valensi.model.Family;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonRestController {
    
    @RequestMapping(value="/aperson.json")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Roberto");
        p.setJob("Coach");
        p.setDob(new Date());
        return p;
    }
    
    @RequestMapping(value="/allperson.json")
    public List<Person> getAllPerson(){
        List<Person> all = new ArrayList<>();
        all.add(new Person("Jacky", "Actor", new Date()));
        all.add(new Person("Stanley", "Actor", new Date()));
        all.add(new Person("Imam", "Actor", new Date()));
        all.add(new Person("Chen", "Hero", new Date()));
        return all;
    }
    
      @RequestMapping(value="/personwithaddress.json")
        public List<Person> getPersonWithAddress(){
            Address address = new Address("Daan Mogot", "Jakarta");
            List<Person> all = new ArrayList<>();
            all.add(new Person("Jacky", "Actor", new Date(), address));
            all.add(new Person("Stanley", "Actor", new Date(), address));
            all.add(new Person("Imam", "Actor", new Date(), address));
            all.add(new Person("Chen", "Hero", new Date(), address));
        return all;
    }
        
    @RequestMapping(value="/family.json")
        public Family getFamily(){
            Address address = new Address("Daan Mogot", "Jakarta Barat");
            Address address2 = new Address("Sudirman", "Jakarta Selatan");
            Address address3 = new Address("5th Avenue", "New York City");
            List<Person> all = new ArrayList<>();
            all.add(new Person("Jacky", "Actor", new Date(), address));
            all.add(new Person("Stanley", "Actor", new Date(), address3));
            all.add(new Person("Imam", "Actor", new Date(), address2));
            all.add(new Person("Chen", "Hero", new Date(), address));
            Family fams = new Family("Simatupang", all);
        return fams;
    } 
}

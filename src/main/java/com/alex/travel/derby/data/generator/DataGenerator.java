package com.alex.travel.derby.data.generator;

import com.alex.travel.derby.data.entity.Role; // Import entities and services
import com.alex.travel.derby.data.entity.Travel;
import com.alex.travel.derby.data.entity.User;
import com.alex.travel.derby.data.service.TravelRepository;
import com.alex.travel.derby.data.service.UserRepository;
import com.vaadin.flow.spring.annotation.SpringComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringComponent
public class DataGenerator {

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository, TravelRepository travelRepository) {
        return args -> {
            Logger logger = LoggerFactory.getLogger(getClass());


            logger.info("Generating demo data");


            if(travelRepository.count()<1) { // Conditional data generator (if there is less than one entry in the database, the generator will produce the static content).
                travelRepository.save(new Travel("images/travel/amsterdam.png",
                        "Text", "Amsterdam city break", "300£", "Amsterdam is the Netherlands’ capital, known for its artistic heritage, elaborate canal system and narrow houses with gabled facades.", "amsterdam netherlands europe"));

                travelRepository.save(new Travel("images/travel/bucharest.png",
                        "Text", "Bucharest city break", "250£", "Bucharest, in southern Romania, is the country's capital and commercial center.", "bucharest romania europe"));

            }

            if(userRepository.getByUserName("alex")==null) {
                userRepository.save(new User("alex", "alex", Role.USER));
            }

            logger.info("Generated demo data");
        };
    }

}
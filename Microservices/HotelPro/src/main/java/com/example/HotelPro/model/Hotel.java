package com.example.HotelPro.model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "hotelTab")
@Data
@Document("hotel_Tab")
public class Hotel {

    @Id
    private String id;
    private String name;
    private String location;
    private String about;
}


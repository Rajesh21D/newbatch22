package com.zensar.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
//@ApiModel("This is the Olx Master model")
@Entity
public class AdvertiseStatus {
	//@ApiModelProperty("User Id of integer type")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
      private long id;
      private String status;
}

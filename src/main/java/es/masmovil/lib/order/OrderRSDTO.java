package es.masmovil.lib.order;

import java.util.List;

import lombok.Data;

@Data
public class OrderRSDTO {

	private String identifier;

	private String customerIdentifier;
	
	private List<PhoneRSDTO> listPhone;
	
	private String totalPrice;

}

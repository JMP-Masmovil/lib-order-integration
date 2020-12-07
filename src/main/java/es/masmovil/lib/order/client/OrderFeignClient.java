package es.masmovil.lib.order.client;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import es.masmovil.lib.order.OrderRSDTO;

@ConditionalOnProperty(name = "api.ms.url.order")
@FeignClient(name = "orderClient", url = "${api.ms.url.order}", decode404 = true)
public interface OrderFeignClient {

	@PostMapping("/")
	ResponseEntity<OrderRSDTO> createOrder(@RequestBody OrderRSDTO orderRSDTO);

}

package nus.iss.pizzaapp.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import nus.iss.pizzaapp.models.Order;

@Repository
public class PizzaRepository {

    @Autowired @Qualifier("my-redis")
    private RedisTemplate<String,String> redisTemplate;

    public void save(Order order) {
		redisTemplate.opsForValue().set(
				order.getOrderID(), order.toJSON().toString()
		);
	}


    public String getJSONStringByID(String orderID){

        String jsonstring = redisTemplate.opsForValue().get(orderID);
        return jsonstring;
    }
    
}

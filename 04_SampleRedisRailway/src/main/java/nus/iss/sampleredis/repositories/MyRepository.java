package nus.iss.sampleredis.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import nus.iss.sampleredis.models.Contact;

@Repository
public class MyRepository {

    @Autowired
    @Qualifier("my-redis")
    private RedisTemplate<String, String> template;

    public void addname(String name) {
        template.opsForValue().set("testname", name);
    }

    public String getname() {
        String redisname = template.opsForValue().get("testname");
        return redisname;
    }

    public void addopslist(String fruit) {
        template.opsForList().rightPush("fruit", fruit);
    }

    public List<String> getopslist(String fruit) {
        List<String> fruitdata = template.opsForList().range("fruit", 0, -1);
        return fruitdata;
    }

    public void deletelast() {
        template.opsForList().rightPop("fruit");

    }

    public void deletefruit(Integer index) {
        // use set to replace with unique words based on index, then use remove to
        // remove it
        template.opsForList().set("fruit", index, "tobedelete");
        template.opsForList().remove("fruit", 1, "tobedelete");

    }

    public void addHash(String name, String email, String phone) {
        template.opsForHash().put("contacthash", "name", name);
        template.opsForHash().put("contacthash", "email", email);
        template.opsForHash().put("contacthash", "phone", phone);
    }

    public Contact getHash() {
        String name = (String) template.opsForHash().get("contacthash", "name");
        String email = (String) template.opsForHash().get("contacthash", "email");
        String phone = (String) template.opsForHash().get("contacthash", "phone");
        Contact contact = new Contact(name, email, phone);
        return contact;

    }

}

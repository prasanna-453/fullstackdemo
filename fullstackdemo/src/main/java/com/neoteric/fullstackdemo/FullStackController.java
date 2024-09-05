package com.neoteric.fullstackdemo;
import com.neoteric.fullstackdemo.model.OTP;
import main.java.com.neoteric.fullstackdemo.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FullStackController {

    //method
    //path
    //protocol
    //header
    //body
    @CrossOrigin("*")
    @PostMapping(value = "/api/registeruser",
    consumes ={"application/json"},
    produces ={"application/json"})

    public OTP registerUser(User user){

        OTP otp=new OTP();
        otp.mobileNo=user.getEmail();
        int randomNumber=(int)(Math.random()*9000)+1000;
        String number=String.valueOf(randomNumber);

        otp.otp=number;
        System.out.println(user);
        System.out.println(otp);

        return otp;

    }
}

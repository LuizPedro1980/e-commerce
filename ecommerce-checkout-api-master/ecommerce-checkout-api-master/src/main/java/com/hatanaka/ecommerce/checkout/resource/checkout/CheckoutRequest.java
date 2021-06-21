package com.hatanaka.ecommerce.checkout.resource.checkout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable {

    private  String firstname;
    private  String lastname;
    private  String email;
    private  String address;
    private  String complement;
    private  String country;
    private  String state;
    private  String cep;
    private  Boolean saveAddress;
    private  Boolean saveInfo;
    private  String cardNome;
    private  String cardNumber;
    private  String cardCvv;
}

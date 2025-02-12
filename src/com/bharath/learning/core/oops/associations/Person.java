package com.bharath.learning.core.oops.associations;

import java.util.List;

class CreditCard {

}

class VisaCreditCard  extends  CreditCard{

}

class MasterCard  extends  CreditCard{

}

class SCBVisaCreditCard {}


public class Person {

    private List<CreditCard> creditCardList;

}

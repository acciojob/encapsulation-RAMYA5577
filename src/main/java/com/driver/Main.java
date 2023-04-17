package com.driver;

public class Main {
  public static void main(){
      RWOnly obj=new RWOnly();
     // obj.name="uuu";
      //System.out.println(obj.name);
      //name has private access in com.driver.RWOnly
      obj.setName("Ramya");
      obj.getName();
  }

}
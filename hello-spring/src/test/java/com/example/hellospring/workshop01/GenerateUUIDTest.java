package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Random7 implements IRandom {
   @Override
   public int nextInt(int bound) {
//       ถ้า random ได้ 7 function มันยังจะทำงานได้ถูกต้องไหม
      return 7;
   }
}

class GenerateUUIDTest {

   @Test
    public void getUUID() {
       GenerateUUID generateUUID = new GenerateUUID();
      generateUUID.setRandom(new Random7());
       String uuid = generateUUID.get("narawan");
       assertEquals("XYZnarawan7", uuid);
   }

}
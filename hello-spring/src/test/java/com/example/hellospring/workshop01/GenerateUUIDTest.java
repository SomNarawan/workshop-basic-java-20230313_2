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
       generateUUID.setRandom(new Random7()); // Dependency Injection (DI)
//       ส่ง random เข้าไปที่ generateUUID > Injection
//       Random7 > Dependency เป็นสิ่งที่ generateUUID ต้องใช้
//       รวมเป็น Dependency Injection (DI)
       String uuid = generateUUID.get("narawan");
       assertEquals("XYZnarawan7", uuid);
   }

}
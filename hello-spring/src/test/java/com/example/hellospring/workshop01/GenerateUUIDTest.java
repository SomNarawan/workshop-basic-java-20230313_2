package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateUUIDTest {

   @Test
    public void getUUID() {
       GenerateUUID generateUUID = new GenerateUUID();
       String uuid = generateUUID.get("narawan");
       assertEquals("XYZnarawan7",uuid);
   }

}
package com.example.justinxu.signinapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LOUISA on 3/14/2018.
 * Tests the MemberList class
 */

public class MemberListTest {
   @Test
    public void addAndGetMember() throws Exception {
       MemberList list = new MemberList();
       Member louisa  = new Member();
       String name = "Louisa";
       louisa.setFirstName(name);
       list.add(louisa);

       Member first = list.get(0);
       String foundName = first.getFirstName();
       assertEquals(name, foundName);
    }

   @Test
   public void addGetMembers() throws Exception {
      MemberList list = new MemberList();
      Member kid;

      //add 10 kids
      for (int i=1; i<=10; i++)
      {
         String name = "name" + String.valueOf(i);
         kid = new Member();
         kid.setFirstName(name);
         list.add(kid);
      }

      //verify first kid is first added
      kid = list.get(0);
      String foundName = kid.getFirstName();
      assertEquals("name" + String.valueOf(1),foundName);

      //verify kids all there
      assertEquals(10 , list.size());


      //verify last kid is last added
      kid = list.get(9);
      foundName = kid.getFirstName();
      assertEquals("name" + String.valueOf(10),foundName);


   }
}

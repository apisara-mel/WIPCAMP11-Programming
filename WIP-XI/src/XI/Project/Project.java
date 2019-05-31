/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class Project {
    public static void main(String[] args) {
        System.out.println("กรุณาพิมพ์ตัวเลขเพื่อเลือกเมนู");
        int item = 8 , limit = 10 , memu;
        System.out.println("Add = 1 ");
        System.out.println("Remove = 2 ");
        System.out.println("Check item = 3 ");
        Scanner input = new Scanner (System.in);
        int menu = input.nextInt();
        if(menu == 1){
            if(item < limit){
                System.out.println("กรุณากรอกจน.ไอเท็มที่ต้องการเพิ่ม : ");
                int amount = input.nextInt();
                if(item+amount > limit){
                    System.out.println("ไอเท็มเกินลิมิต");
                }
                else{
                    item = item+amount;
                    System.out.println("ไอเท็มคงเหลือ : " + item);
                    System.out.println("ลิมิตไอเท็ม : " + limit);
                }
            }
            else{
                System.out.println("ไอเท็มเต็มแล้ว");
            }
        } 
        else if (menu == 2){
            if(item == 0){
                System.out.println("ไม่มีไอเท็มในโกดัง");
            }
            else{
                System.out.println("กรุณากรอกจน.ไอเท็มที่ต้องการลบ : ");
                int amount = input.nextInt();
                if (item - amount >= 0){
                    item = item-amount;
                    System.out.println("ไอเท็มคงเหลือ : " + item);
                    System.out.println("ลิมิตไอเท็ม : " + limit);
                }
                else{
                    System.out.println("ไอเท็มไม่มีให้ลบ");
                }
            }
        }
        else if(menu == 3){
            System.out.println("ไอเท็มตอนนี้ : " + item);
            System.out.println("ลิมิตขิงในโกดัง : " + limit);
        }
        else{
            System.out.println("menuไม่ถูกต้อง");
        }
    }
    
}

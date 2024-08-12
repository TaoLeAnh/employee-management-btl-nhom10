/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author LAPTOP
 */
public class PositionManagement {
     private ArrayList<Position> danhSach;
     Scanner sc=new Scanner(System.in);
    
    public PositionManagement(){
        this.danhSach=new ArrayList<Position>();
    }

    public PositionManagement(ArrayList<Position> danhSach) {
        this.danhSach = danhSach;
    }
    
    public void addNewPosition(Position ps){
        this.danhSach.add(ps);
    }
    
    public boolean removePosition(Position ps){
        return this.danhSach.remove(ps);
    }
    
    public void editPosition(){ 
        System.out.println("Nhập id chức vụ cần sửa: ");
        int positionID=sc.nextInt();
        int found=0;
        for(Position position : danhSach){
            if(position.getPositionID() == positionID){
                
//                System.out.println("Nhập id chức vụ: ");
//                positionID=sc.nextInt();
//                position.setPositionID(positionID);
                sc.nextLine();
                System.out.println("Nhập tên chức vụ: ");
                String positionName=sc.nextLine();
                position.setPositionName(positionName);
                
                System.out.println("Nhập lương chức vụ: ");
                double positionSalary=sc.nextDouble();
                position.setPositionSalary(positionSalary);
                
                System.out.println("Sửa thành công");
                found=1;
                break;
            }
        }
        if(found==0){
            System.out.println("Không tìm thấy xe có id: "+positionID);
        }
    }
    public void searchPosition(){
        System.out.println("Nhập id chức vụ cần tìm: ");
        int positionID=sc.nextInt();
        int found=0;
        for(Position position : danhSach){
            if(position.getPositionID() == positionID){
                System.out.println(position.toString());
                found=1;
                break;
            }
        }
        if(found==0){
            System.out.println("Không tìm thấy chức vụ có id: "+positionID);
        }
    }
    public void printPosition(){
        for(Position position : danhSach){
            System.out.println(position);
        }
}
}

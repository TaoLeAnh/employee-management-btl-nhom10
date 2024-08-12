/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Model.Position;
import Model.PositionManagement;
import java.util.Scanner;

/**
 *
 * @author LAPTOP
 */
public class Main_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PositionManagement ds=new PositionManagement();
        int luaChon=0;
        do{
            System.out.println("1.thêm");
            System.out.println("2.in");
            System.out.println("3.xóa");
            System.out.println("4.sửa");
            System.out.println("5.tìm kiếm");
            System.out.println("0.thoat");
            System.out.print("Lựa chọn của bạn: ");
            luaChon=sc.nextInt();
            sc.nextLine();
            if(luaChon==1){
                System.out.print("Nhập id chức vụ: ");
                int positionID=sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập tên chức vụ: ");
                String positionName=sc.nextLine();
                System.out.print("Nhập lương: ");
                double positionSalary=sc.nextDouble();
                Position ps=new Position(positionID,positionName,positionSalary);
                ds.addNewPosition(ps);
            }else if(luaChon==2){
               ds.printPosition();
            }else if(luaChon==3){
                System.out.print("Nhập id chức vụ: ");
                int positionID=sc.nextInt();
                Position ps=new Position(positionID);
                System.out.println("Xóa chức vụ: "+ds.removePosition(ps));
            }else if(luaChon==4){
                ds.editPosition();
            }else if(luaChon==5){
                ds.searchPosition();
            }
             
        }while(luaChon!=0);
    }
}

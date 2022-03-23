package space.leafpy;

import java.util.Objects;

public class Flat {
    String address;
    int quantityOfRooms;
    float area;
    final String unitOfMeasuremant = "m^2";

    Flat(){
        this.address = "Undefined";
        this.quantityOfRooms = 0;
        this.area = 0;
    }
    Flat(int qRooms, float area){
        this.address = "Undefined";
        this.quantityOfRooms = qRooms;
        this.area = area;
    }
    Flat(String address, int qRooms){
        this.address = address;
        this.quantityOfRooms = qRooms;
        this.area = -1;
    }
    Flat(String address, float area){
        this.address = address;
        this.quantityOfRooms = -1;
        this.area = area;
    }
    Flat(String address, int qRooms, float area){
        this.address = address;
        this.quantityOfRooms = qRooms;
        this.area = area;
    }

    public void displayInfo(){
        if(Objects.equals(this.address, "Undefined")
        && this.quantityOfRooms == 0 && this.area == 0){
            System.out.print("Flat info is empty\n");
        }
        else if(this.quantityOfRooms == -1){
            System.out.printf("Address: %s\nRooms: TBD\nArea: %.2f %s\n",this.address, this.area, this.unitOfMeasuremant);
        }
        else if(this.area == -1){
            System.out.printf("Address: %s\nRooms: %d\nArea: TBD\n",this.address, this.quantityOfRooms);
        }
        else if(Objects.equals(this.address, "Undefined")){
            System.out.printf("Address: TBD\nRooms: %d\nArea: %.2f %s\n",this.quantityOfRooms, this.area,
                    this.unitOfMeasuremant);
        }
        else{
            System.out.printf("Address: %s\nRooms: %d\nArea: %.2f %s\n",this.address,this.quantityOfRooms, this.area,
                    this.unitOfMeasuremant);
        }
    }
}

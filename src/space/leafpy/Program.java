package space.leafpy;

public class Program {
    public static void main(String[] args) {
        Flat emptyFlat = new Flat();
        Flat smartBuilding = new Flat("Mashinobudivna,41", 1, 29.6F);
        Flat unknownAddress = new Flat(2, 44.3F);
        Flat commercialArea = new Flat("Khreshchatyk, 4", 120F);
        Flat apartmentRooms = new Flat("Shevchenko, 21", 6);

        emptyFlat.displayInfo();
        smartBuilding.displayInfo();
        unknownAddress.displayInfo();
        commercialArea.displayInfo();
        apartmentRooms.displayInfo();

        /*
        Flat info is empty
        Address: Mashinobudivna,41
        Rooms: 1
        Area: 29.60 m^2
        Address: TBD
        Rooms: 2
        Area: 44.30 m^2
        Address: Khreshchatyk, 4
        Rooms: TBD
        Area: 120.00 m^2
        Address: Shevchenko, 21
        Rooms: 6
        Area: TBD
        */
    }
}

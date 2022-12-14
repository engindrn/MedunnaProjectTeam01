package pojos.us016_Pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomPostPojo16 {

    /*
    {
        "description": "string",
        "price": 0,
        "roomNumber": 0,
        "roomType": "TWIN",
        "status": true
        }
     */

    private String description;
    private int price;
    private int roomNumber;
    private String roomType;
    private boolean status;
   //private int roomId;

   //public int getRoomId() {
   //    return roomId;
   //}

   //public void setRoomId(int roomId) {
   //    this.roomId = roomId;
   //}

    public RoomPostPojo16(String description, int price, int roomNumber, String roomType, boolean status) {
        this.description = description;
        this.price = price;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
    }

    public RoomPostPojo16() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "RoomPostPojo{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", status=" + status +
                '}';
    }
}

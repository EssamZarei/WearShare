import java.awt.image.BufferedImage;

public class Clothes {
    private int ID;
    private String type;
    private double size;
    private BufferedImage image;
    private Clothes next; 

    // Constructor
    public Clothes (){
        this(1, "Clothes", null, 1);
    }
    
    public Clothes(int ID, String type, double size) {
        this.ID = ID;
        this.type = type;
        this.image = image;
        this.size = size;
        this.next = null;
    }



    // Check if it is Empty
    public boolean isEmpty() {
        return this.next == null;
    }

    // Printing information for all Clothes in the list
    public void printList() {
        Clothes temp = this;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    // Find Clothes based on ID
    public Clothes searchByID(int ID) {
        Clothes temp = this;
        while (temp != null) {
            if (temp.getID() == ID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add User in First
    public void addFirst(Clothes newHead) {
        newHead.next = this.next;
        this.next = newHead;
    }

    // Add Clothes in Last
    public void addLast(Clothes newNode) {
        Clothes temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove Head (First node)
    public void removeFirst() {
        if (this.next == null) return;
        this.next = this.next.next;
    }

    // Remove Last node
    public void removeLast() {
        if (this.next == null) return;
        Clothes temp = this;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Remove a target User
    public boolean removeItem(Clothes target) {
        if (this.next == null) return false;
        if (this.next.getID() == target.getID()) {
            this.next = this.next.next;
            return true;
        }

        Clothes temp = this;
        while (temp.next != null) {
            if (temp.next.getID() == target.getID()) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    //              toString  & getters & Setters

    public String toString() {
        // Imp
        return "";
    }

    // Getter and setter methods

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}

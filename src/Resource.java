public class Resource {
    private int id;
    private String name;
    private int capcity;
    private int currentUsers;

    public Resource(int id, String name, int capcity) {
        this.id = id;
        this.name = name;
        this.capcity = capcity;
        this.currentUsers = 0;
    }

    public boolean isAvailable(){
        return currentUsers < capcity;
    }

    public int occupy(){
        return currentUsers++;
    }

    public int release(){
        return currentUsers--;
    }


}

public class Main {

    public static void main(String[] args) throws Exception {

        Resource room = new Resource(1, "Meeting Room", 2);

        Resource gym = new Resource(2, "Gym", 5);

        Service service = new Service();




        Usage user1 = null;
        Usage user2 = null;
        Usage user3 = null;

        if(room.isAvailable()){
            user1 = new Usage(room);
            System.out.println("User1 entered ");
        } else {
            System.out.println("User1 denied");
        }

        if(room.isAvailable()){
            user2 = new Usage(room);
            System.out.println("User2 entered ");
            System.out.println();
        } else {
            System.out.println("User2 denied");
        }

        if(room.isAvailable()){
            user3 = new Usage(room);
            System.out.println("User3 entered ");
        } else {
            System.out.println("User3 denied");
            user3 = new Usage(gym);
            System.out.println("User3 entered in Gym ");

        }

        Thread.sleep(5000);
        if(user1 != null){
            int bill = user1.stop(service);
            System.out.println("User1 Bill : "+bill);
        }


    }
}
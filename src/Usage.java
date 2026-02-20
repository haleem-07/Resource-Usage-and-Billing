import java.time.LocalDateTime;
import java.util.*;
public class Usage {
    private Resource resource;
    private LocalDateTime startTime;
    private  LocalDateTime endTime;

    public Usage(Resource resource){
        this.resource = resource;
        this.startTime = LocalDateTime.now();
        resource.occupy();
        System.out.println("Usage started " + startTime);
    }

    public int stop(Service service){
        endTime = LocalDateTime.now();

        resource.release();
        System.out.println("Usage stopped at " + endTime);


        int hours = 0;
        return service.calculateBill(hours);

    }


}

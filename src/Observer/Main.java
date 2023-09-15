package Observer;

public class Main {
    public static void main(String[] args) {
        SportNewsPublisher sportNewsPublisher=new SportNewsPublisher();
        SportNewsSubscribers sportNewsSubscribers1=new SportNewsSubscribers(sportNewsPublisher);
        SportNewsSubscribers sportNewsSubscribers2=new SportNewsSubscribers(sportNewsPublisher);


        sportNewsPublisher.setLastSportInfo("Chelsea - Arsenal 1:1");

        TechnologyNewsPublisher technologyNewsPublisher=new TechnologyNewsPublisher();

        TechnologyNewsSubscribers technologyNewsSubscribers1=new TechnologyNewsSubscribers(technologyNewsPublisher);
        TechnologyNewsSubscribers technologyNewsSubscribers2=new TechnologyNewsSubscribers(technologyNewsPublisher);
        TechnologyNewsSubscribers technologyNewsSubscribers3=new TechnologyNewsSubscribers(technologyNewsPublisher);

        technologyNewsPublisher.setLastRtxPrice(1000);


    }
}

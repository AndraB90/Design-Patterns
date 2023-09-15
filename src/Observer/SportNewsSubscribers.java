package Observer;

public class SportNewsSubscribers implements iNewsSubscriber{

    private SportNewsPublisher _publisher;

    public SportNewsSubscribers(SportNewsPublisher publisher) {
        _publisher=publisher;
        _publisher.addSubscriber(this);
    }

    @Override
    public void update() {
        String info=_publisher.getLastSportInfo();
        System.out.println("Sport subscriber received updated info "+info);
    }
}

package misc.data;

public class Event {
    String eventTitle;
    String eventDate;
    int idEvent;

    public Event(int idEvent, String title, String date)
    {
        this.idEvent = idEvent;
        eventDate = date;
        eventTitle = title;
    }

    @Override
    public String toString() {
        return eventTitle;
    }

    public String getEventTitle() {return eventTitle;}
    public String getEventDate() {return eventDate;}
    public String getFullDate() {
        if (eventDate.split("\\.").length == 2) {
            return "01." + eventDate;
        }
        else return eventDate;
    }
    public int getEventId() {return idEvent;}
}

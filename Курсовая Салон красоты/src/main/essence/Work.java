package main.essence;

public class Work {
    private int id;
    private Services services;
    private float point;//сколько баллов использовалось при оплате
    private float income;
    private Clients clients;
    private Employee employee;
    private String data;
    private String time;
    private String comments;

    public void setId(int id) {
        this.id = id;
    }

    public Work(int id, Services s, float points, float income, Clients c, Employee e, String data, String time, String comments)
    {
        this.id=id;
        this.services=s;
        this.point=points;
        this.income=income;
        this.clients=c;
        this.employee=e;
        this.data=data;
        this.time=time;
        this.comments=comments;

    }
    public Work(Services s,float points,float income, Clients c, Employee e, String data, String time, String comments){
        this.services=s;
        this.clients=c;
        this.income=income;
        this.employee=e;
        this.point=points;
        this.data=data;
        this.time=time;
        this.comments=comments;
    }

    public float getIncome() {
        return income;
    }

    public int getId() {
        return id;
    }

    public float getPoint() {
        return point;
    }

    public Clients getClients() {
        return clients;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Services getServices() {
        return services;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public String getComments() {
        return comments;
    }
}

package com.example.employeedatabase;

public class Model {
    private String Id;
    private String Name;
    private String Position;
    //private String Salary;
    //private String url;

    public Model(String id, String name, String position) {
        this.Id = id;
        this.Name = name;
        this.Position = position;
        //this.Salary = salary;
    }

    public Model() {

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    //public String getSalary() {
       // return Salary;
    //}

    //public void setSalary(String salary) {
        //this.Salary = salary;
    //}

    //public String getUrl() {
        //return url;
    //}

    //public void setUrl(String url) {
       // this.url = url;
    //}
}
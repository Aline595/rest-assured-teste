package qaops.automation.api.dominio;

public class Usuario {
    private String name;
    private String job;
    private String email;

    public Usuario(){

    }

    public Usuario(String name, String job, String email) {
        this.name = name;
        this.job = job;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }
}


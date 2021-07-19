package red.patterns.behavioural.chain.of.responsibility;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public record Request(String ip, String name, String role) {

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Request{" +
                "ip='" + ip + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

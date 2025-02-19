import java.util.List;
import java.util.ArrayList;
class Player {
    private String name;
    private String description;
    private int health;
    private List<String> inventory = new ArrayList<>();

    public Player(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }


}


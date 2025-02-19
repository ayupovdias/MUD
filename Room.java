class Room implements IGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void describe() {
        System.out.println("Room: " + name);
        System.out.println("Description: " + description);
    }
}

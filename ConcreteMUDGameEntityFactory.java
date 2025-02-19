class ConcreteMUDGameEntityFactory extends MUDGameEntityFactory {
    @Override
    public IGameEntity createEntity(String type, String param) {
        return switch (type.toLowerCase()) {
            case "room" -> new Room(param, "Standard room");
            case "npc" -> new NPC(param, "Standard NPC");
            default -> throw new IllegalArgumentException("Unknown entity type: " + type);
        };
    }
}

class SciFyMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom() {
        return new Room("Spaceship Bridge", "High-tech control room with holographic displays");
    }

    @Override
    public IGameEntity createNPC() {
        return new NPC("Cyborg", "Mechanical humanoid with advanced weaponry");
    }
}

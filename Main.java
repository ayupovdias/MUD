public class Main {
    public static void main(String[] args) {

        MUDGameEntityFactory standardFactory = new ConcreteMUDGameEntityFactory();
        IGameEntity dungeon = standardFactory.createEntity("room", "Dungeon");
        IGameEntity orc = standardFactory.createEntity("npc", "Orc");

        dungeon.describe();
        orc.describe();

        IMUDAbstractFactory sciFyFactory = new SciFyMUDFactory();
        IGameEntity spaceship = sciFyFactory.createRoom();
        IGameEntity android = sciFyFactory.createNPC();

        spaceship.describe();
        android.describe();
    }
}


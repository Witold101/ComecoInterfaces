package by.vistar.comeco.interfaces;

public interface DaoService <Key,Entity> {
    Entity add(Entity entity);
    void dell (Key id);
    Entity edit(Entity entity);
    Entity get (Key id);
}
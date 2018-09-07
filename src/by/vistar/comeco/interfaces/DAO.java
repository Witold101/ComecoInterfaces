package by.vistar.comeco.interfaces;

import java.sql.SQLException;

public interface DAO <Key,Entity> {
    Entity add(Entity entity) throws SQLException;
    void dell (Key id) throws SQLException;
    Entity edit(Entity entity) throws SQLException;
    Entity get (Key id) throws SQLException;
}
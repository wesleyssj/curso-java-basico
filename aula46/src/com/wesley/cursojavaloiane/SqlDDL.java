package com.wesley.cursojavaloiane;

public interface SqlDDL {

    void create(String query);
    void alter(String query);
    void drop(String query);
}

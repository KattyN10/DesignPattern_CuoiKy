package org.example.decorator.datasource;

public interface DataSource {
    void writeData(String data);

    String readData();
}

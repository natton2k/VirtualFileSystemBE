package org.tientt.models.entities;

import java.util.stream.Stream;

public enum FileType {

    REGULAR_FILE("-"), DIRECTORY("d"), ROOT("r");

    private final String text;

    FileType(String text) {
        this.text = text;
    }

    public String getValue(){
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}

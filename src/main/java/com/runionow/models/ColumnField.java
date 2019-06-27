package com.runionow.models;

import java.lang.reflect.Field;

public class ColumnField {

    private Field column;

    public ColumnField(Field field) {
        this.column = field;
    }

    public String getName() {
        return this.column.getName();
    }

    public Class<?> getType() {
        return this.column.getType();
    }


}

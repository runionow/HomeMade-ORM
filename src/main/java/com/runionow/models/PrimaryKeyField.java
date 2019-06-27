package com.runionow.models;

import java.lang.reflect.Field;

public class PrimaryKeyField {
    private Field primaryKey;

    public PrimaryKeyField(Field primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return this.primaryKey.getName();
    }

    public Class<?> getType() {
        return this.primaryKey.getType();
    }
}

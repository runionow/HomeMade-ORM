package com.runionow.reflection;

import com.runionow.models.ColumnField;
import com.runionow.models.PrimaryKeyField;
import com.runionow.reflection.annotation.Column;
import com.runionow.reflection.annotation.PrimaryKey;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MetaModel<T> {
    
    private Class<T> personClass;

    public MetaModel(Class<T> personClass) {
        this.personClass = personClass;
    }

    public static <T> MetaModel of(Class<T> personClass) {
        return new MetaModel<T>(personClass);
    }

    public PrimaryKeyField getPrimaryKey() {
        Field[] fields = personClass.getDeclaredFields();
        for(Field field: fields) {
            PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
            if(primaryKey != null) {
                PrimaryKeyField pk = new PrimaryKeyField(field);
                return pk;
            }
        }
        throw new IllegalArgumentException("No primary key is found in the class" +personClass.getSimpleName());
    }

    public List<ColumnField> getColumns() {
        Field[] fields = personClass.getDeclaredFields();
        List<ColumnField> result = new ArrayList<ColumnField>();
        for(Field field: fields) {
            Column col = field.getAnnotation(Column.class);
            if(col != null){
                ColumnField colField = new ColumnField(field);
                result.add(colField);
            }
        }

        return  result;
    }
}

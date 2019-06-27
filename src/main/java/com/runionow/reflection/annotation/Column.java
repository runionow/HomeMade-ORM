package com.runionow.reflection.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The three stages where annotation can be available
 * 1. Compile time
 * 2. Class loading time - Annotation can only be seen by the class loader
 * 3. Runtime
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

}

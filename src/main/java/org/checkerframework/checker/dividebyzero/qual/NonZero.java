package org.checkerframework.checker.dividebyzero.qual;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//@DefaultQualifierInHierarchy //TODO:  check if this should be here
@SubtypeOf({Top.class})    // TODO: how do differentiate between zero and non zero. structure of these two are similar except the name
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface NonZero { }

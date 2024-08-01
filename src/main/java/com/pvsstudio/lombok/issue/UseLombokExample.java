package com.pvsstudio.lombok.issue;

import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseLombokExample {
    @Setter
    private List<String> stringList = new ArrayList<>();

    static void testMethodExample() {
        Set<String> hashSet = new HashSet<>();

        new UseLombokExample().setStringList(new ArrayList<>(hashSet)); // JLSViolation

        // new UseLombokExample().setStringList(new ArrayList<>()); // No JLSViolation
    }

}

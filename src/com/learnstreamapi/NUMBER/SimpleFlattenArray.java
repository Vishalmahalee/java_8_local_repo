package com.learnstreamapi.NUMBER;

import java.util.ArrayList;
import java.util.List;

public class SimpleFlattenArray {

        public static void main(String[] args) {
            Object[] nestedArray = {1, new Object[]{2, 3}, new Object[]{4, new Object[]{5, 6}}};

            List<Object> flattenedList = new ArrayList<>();
            flatten(nestedArray, flattenedList);

            System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6]
        }

        private static void flatten(Object[] array, List<Object> result) {
            for (Object element : array) {
                if (element instanceof Object[]) {
                    flatten((Object[]) element, result); // Recursive call for nested arrays
                } else {
                    result.add(element); // Add non-array elements
                }
            }
        }
    }


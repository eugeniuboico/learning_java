package org.example.Homework.hw15.customer;

import java.util.List;

public record Order(String customerName, List<String> productNames, int total) {
}

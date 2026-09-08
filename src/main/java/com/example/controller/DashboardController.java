package com.example.controller;
import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController public class DashboardController {
 @GetMapping("/api/inventory") public Map<String,Object> data(){return Map.of("products",128,"inStock",103,"lowStock",17,"outOfStock",8,"items",List.of(
 Map.of("product","Laptop","category","Electronics","stock",42,"status","In Stock"),
 Map.of("product","Monitor","category","Electronics","stock",12,"status","Low Stock"),
 Map.of("product","Keyboard","category","Accessories","stock",35,"status","In Stock"),
 Map.of("product","Office Chair","category","Furniture","stock",4,"status","Low Stock")));}}

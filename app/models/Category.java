package models;

import java.util.List;

import com.google.code.morphia.annotations.Entity;

import play.modules.morphia.Model;

@Entity("categories")
public class Category extends Model {
    List<Category> categories;
}

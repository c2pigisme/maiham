package models;

import java.util.List;

import com.google.code.morphia.annotations.Entity;

import play.modules.morphia.Model;

@Entity("articles")
public class Article extends Model {

    public List<Paragraph> paras;
    public Metadata meta;
    public String url;
}

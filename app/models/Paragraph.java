package models;

import play.modules.morphia.Model;

public class Paragraph extends Model {
    public String content;
    public ParagraphMetadata meta;
}

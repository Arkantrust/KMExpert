package model;

public class KnowledgeUnit {
    private String id;
    private String description;
    private KnowledgeUnitType type;
    private String author;
    private String authorPosition;

    public KnowledgeUnit(String id, String description, int type, String author, String authorPosition) {
        this.id = id;
        this.description = description;
        this.type = KnowledgeUnitType.getType(type);
        this.author = author;
        this.authorPosition = authorPosition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KnowledgeUnitType getType() {
        return type;
    }

    public void setType(int type) {
        this.type = KnowledgeUnitType.getType(type);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorPosition() {
        return authorPosition;
    }

    public void setAuthorPosition(String authorPosition) {
        this.authorPosition = authorPosition;
    }
}

public class CatInfo {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public CatInfo() {
    }

    public CatInfo(String id, String text, String type, String user, int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "CatInfo{" + "id = " + id + ", " +
                "text = " + "'" + text + "'" + ", " +
                "type = " + "'" + type + "'" + ", " +
                "user = " + "'" + user + "'" + ", " +
                "upvotes = " + upvotes + '}';
    }
}

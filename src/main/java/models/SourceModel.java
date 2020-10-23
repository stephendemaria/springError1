package models;


public class SourceModel
{

    private String authorFirstName;
    private String authorLastName;
    private String sourceTitle;
    private int edition;

    public int getEdition(){ return edition; }

    public void setEdition( int edition ){ this.edition = edition; }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

}

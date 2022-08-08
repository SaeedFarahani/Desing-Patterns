package MementoPattern;

public class Editor  {
    private String content;

    public String getContent() {
        return content;
    }

    public EditorState CreateState(){
        return new EditorState(this.content);
    }

    public void restore(EditorState editorState){
        content = editorState.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }
}

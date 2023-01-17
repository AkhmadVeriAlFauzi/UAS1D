import java.util.ArrayList;

public class UAS1D{
    private String MessageID;
    private String MessageName;
    private String Context;

    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public String getMessageName() {
        return MessageName;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String context) {
        Context = context;
    }
    public UAS1D(){
        this.MessageID = MessageID;
        this.MessageName = MessageName;
        this.Context = Context;
    }
    public String FindWords(ArrayList<String> context, String cari){
        String HURUF = String.valueOf(context.indexOf(cari));
        return HURUF;
    }
}


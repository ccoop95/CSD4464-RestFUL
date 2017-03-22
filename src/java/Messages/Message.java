/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messages;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.json.JsonObject;

/**
 *
 * @author c0659824
 */
public class Message {
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    int id;
    String title;
    String contents;
    String author;
    Date senttime;
    JsonObject json;
    
    public Message(JsonObject json){
        id = json.getInt("id", 0);
        title = json.getString("title", "");
        contents = json.getString("contents", "");
        author = json.getString("author", "");
     //   senttime = json.getString(sdf.parse("settime"), "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getSenttime() {
        return senttime;
    }

    public void setSenttime(Date senttime) {
        this.senttime = senttime;
    }

    public JsonObject getJson() {
        return json;
    }

    public void setJson(JsonObject json) {
        this.json = json;
    }
    
    
}

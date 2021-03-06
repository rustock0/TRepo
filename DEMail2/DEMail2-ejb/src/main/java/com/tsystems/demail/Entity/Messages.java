package com.tsystems.demail.Entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: eugene
 * Date: 6/23/13
 * Time: 3:01 AM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "messages", catalog = "demail")
@Entity
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String from_name;

    @Column(nullable = false)
    private String to_name;

    @Column(nullable = false)
    private Date sent_date;

    @Column(nullable = true)
    private String subject;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private int folder_id;

    @Column(nullable = false)
    private int mail_id;

    @ManyToOne
    @JoinColumn(name="folder_id", referencedColumnName = "id", insertable=false, updatable=false)
    private Folders folders;

    public Messages() {
    }

    public Messages(int folder_id, int mail_id, String from_name, String to_name, String subject, Date sent_date, String text){
        this.folder_id = folder_id;
        this.mail_id = mail_id;
        this.from_name = from_name;
        this.to_name = to_name;
        this.subject = subject;
        this.sent_date = sent_date;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom_name() {
        return from_name;
    }

    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    public String getTo_name() {
        return to_name;
    }

    public void setTo_name(String to_name) {
        this.to_name = to_name;
    }

    public Date getSent_date() {
        return sent_date;
    }

    public void setSent_date(Date sent_date) {
        this.sent_date = sent_date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(int folder_id) {
        this.folder_id = folder_id;
    }

    public int getMail_id() {
        return mail_id;
    }

    public void setMail_id(int mail_id) {
        this.mail_id = mail_id;
    }

    public Folders getFolders() {
        return folders;
    }

    public void setFolders(Folders folders) {
        this.folders = folders;
    }
}

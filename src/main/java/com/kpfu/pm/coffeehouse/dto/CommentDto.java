package com.kpfu.pm.coffeehouse.dto;

public class CommentDto {

    private String commentText;
    private long addressant_id;

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public long getAddressant_id() {
        return addressant_id;
    }

    public void setAddressant_id(long addressant_id) {
        this.addressant_id = addressant_id;
    }
}

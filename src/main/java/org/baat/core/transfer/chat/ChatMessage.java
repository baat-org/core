package org.baat.core.transfer.chat;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;
import java.util.Objects;

public class ChatMessage {

    @Positive
    private Long id;

    @NotNull
    @Positive
    private Long senderUserId;

    @Positive
    private Long recipientChannelId;

    @Positive
    private Long recipientUserId;

    @NotBlank
    private String textMessage;

    private LocalDateTime updatedAt;

    public ChatMessage() {
    }

    public ChatMessage(final Long id, final Long senderUserId, final Long recipientChannelId, final Long recipientUserId, final String textMessage, final LocalDateTime updatedAt) {
        this.id = id;
        this.senderUserId = senderUserId;
        this.recipientChannelId = recipientChannelId;
        this.recipientUserId = recipientUserId;
        this.textMessage = textMessage;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(Long senderUserId) {
        this.senderUserId = senderUserId;
    }

    public Long getRecipientChannelId() {
        return recipientChannelId;
    }

    public void setRecipientChannelId(Long recipientChannelId) {
        this.recipientChannelId = recipientChannelId;
    }

    public Long getRecipientUserId() {
        return recipientUserId;
    }

    public void setRecipientUserId(Long recipientUserId) {
        this.recipientUserId = recipientUserId;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatMessage that = (ChatMessage) o;
        return Objects.equals(id, that.id) && Objects.equals(senderUserId, that.senderUserId) && Objects.equals(recipientChannelId, that.recipientChannelId) && Objects.equals(recipientUserId, that.recipientUserId) && Objects.equals(textMessage, that.textMessage) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, senderUserId, recipientChannelId, recipientUserId, textMessage, updatedAt);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatMessage{");
        sb.append("id=").append(id);
        sb.append(", senderUserId=").append(senderUserId);
        sb.append(", recipientChannelId=").append(recipientChannelId);
        sb.append(", recipientUserId=").append(recipientUserId);
        sb.append(", textMessage='").append(textMessage).append('\'');
        sb.append(", updatedAt=").append(updatedAt);
        sb.append('}');
        return sb.toString();
    }
}

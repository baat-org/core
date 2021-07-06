package org.baat.core.transfer.chat;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ReplyMessage {

    @NotNull
    @Positive
    private Long senderUserId;

    // TODO
    private Long recipientChannelId;

    @NotBlank
    private String textMessage;

    public ReplyMessage() {
    }

    public ReplyMessage(final Long senderUserId, final Long recipientChannelId, final String textMessage) {
        this.senderUserId = senderUserId;
        this.recipientChannelId = recipientChannelId;
        this.textMessage = textMessage;
    }

    public Long getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(final Long senderUserId) {
        this.senderUserId = senderUserId;
    }

    public Long getRecipientChannelId() {
        return recipientChannelId;
    }

    public void setRecipientChannelId(final Long recipientChannelId) {
        this.recipientChannelId = recipientChannelId;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(final String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        final ReplyMessage that = (ReplyMessage) o;

        if (senderUserId != null ? !senderUserId.equals(that.senderUserId) : that.senderUserId != null)
            return false;
        if (recipientChannelId != null ? !recipientChannelId.equals(that.recipientChannelId) : that.recipientChannelId != null)
            return false;
        return textMessage != null ? textMessage.equals(that.textMessage) : that.textMessage == null;
    }

    @Override
    public int hashCode() {
        int result = senderUserId != null ? senderUserId.hashCode() : 0;
        result = 31 * result + (recipientChannelId != null ? recipientChannelId.hashCode() : 0);
        result = 31 * result + (textMessage != null ? textMessage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReplyMessage{");
        sb.append("senderUserId=").append(senderUserId);
        sb.append(", recipientChannelId=").append(recipientChannelId);
        sb.append(", textMessage='").append(textMessage).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

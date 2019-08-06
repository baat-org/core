package org.baat.core.transfer.chat;


public class ChatMessage {
	private String senderUserToken;

	//TODO
	private Long recipientChannelId;

	private Long recipientUserId;
	private String textMessage;

	public ChatMessage() {
	}

	public ChatMessage(final String senderUserToken, final Long recipientChannelId, final Long recipientUserId, final String textMessage) {
		this.senderUserToken = senderUserToken;
		this.recipientChannelId = recipientChannelId;
		this.recipientUserId = recipientUserId;
		this.textMessage = textMessage;
	}

	public String getSenderUserToken() {
		return senderUserToken;
	}

	public void setSenderUserToken(final String senderUserToken) {
		this.senderUserToken = senderUserToken;
	}

	public Long getRecipientChannelId() {
		return recipientChannelId;
	}

	public void setRecipientChannelId(final Long recipientChannelId) {
		this.recipientChannelId = recipientChannelId;
	}

	public Long getRecipientUserId() {
		return recipientUserId;
	}

	public void setRecipientUserId(final Long recipientUserId) {
		this.recipientUserId = recipientUserId;
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

		final ChatMessage that = (ChatMessage) o;

		if (senderUserToken != null ? !senderUserToken.equals(that.senderUserToken) : that.senderUserToken != null)
			return false;
		if (recipientChannelId != null ? !recipientChannelId.equals(that.recipientChannelId) : that.recipientChannelId != null)
			return false;
		if (recipientUserId != null ? !recipientUserId.equals(that.recipientUserId) : that.recipientUserId != null)
			return false;
		return textMessage != null ? textMessage.equals(that.textMessage) : that.textMessage == null;
	}

	@Override
	public int hashCode() {
		int result = senderUserToken != null ? senderUserToken.hashCode() : 0;
		result = 31 * result + (recipientChannelId != null ? recipientChannelId.hashCode() : 0);
		result = 31 * result + (recipientUserId != null ? recipientUserId.hashCode() : 0);
		result = 31 * result + (textMessage != null ? textMessage.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ChatMessage{");
		sb.append("senderUserToken='").append(senderUserToken).append('\'');
		sb.append(", recipientChannelId=").append(recipientChannelId);
		sb.append(", recipientUserId=").append(recipientUserId);
		sb.append(", textMessage='").append(textMessage).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

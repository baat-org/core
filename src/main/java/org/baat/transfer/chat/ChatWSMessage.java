package org.baat.core.transfer.chat;


import java.util.Set;

public class ChatWSMessage {
	private Long senderUserId;
	private Long recipientChannelId;
	private Set<String> recipientUserTokens;
	private String textMessage;

	public ChatWSMessage() {
	}

	public ChatWSMessage(final Long senderUserId, final Long recipientChannelId, final Set<String> recipientUserTokens, final String textMessage) {
		this.senderUserId = senderUserId;
		this.recipientChannelId = recipientChannelId;
		this.recipientUserTokens = recipientUserTokens;
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

	public Set<String> getRecipientUserTokens() {
		return recipientUserTokens;
	}

	public void setRecipientUserTokens(final Set<String> recipientUserTokens) {
		this.recipientUserTokens = recipientUserTokens;
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

		final ChatWSMessage that = (ChatWSMessage) o;

		if (senderUserId != null ? !senderUserId.equals(that.senderUserId) : that.senderUserId != null)
			return false;
		if (recipientChannelId != null ? !recipientChannelId.equals(that.recipientChannelId) : that.recipientChannelId != null)
			return false;
		if (recipientUserTokens != null ? !recipientUserTokens.equals(that.recipientUserTokens) : that.recipientUserTokens != null)
			return false;
		return textMessage != null ? textMessage.equals(that.textMessage) : that.textMessage == null;
	}

	@Override
	public int hashCode() {
		int result = senderUserId != null ? senderUserId.hashCode() : 0;
		result = 31 * result + (recipientChannelId != null ? recipientChannelId.hashCode() : 0);
		result = 31 * result + (recipientUserTokens != null ? recipientUserTokens.hashCode() : 0);
		result = 31 * result + (textMessage != null ? textMessage.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ChatWSMessage{");
		sb.append("senderUserId=").append(senderUserId);
		sb.append(", recipientChannelId=").append(recipientChannelId);
		sb.append(", recipientUserTokens=").append(recipientUserTokens);
		sb.append(", textMessage='").append(textMessage).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

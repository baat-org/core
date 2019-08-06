package org.baat.core.transfer.user;

public class SignupRequest {
	private String email;
	private String name;
	private String avatarUrl;
	private String password;

	public SignupRequest() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(final String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final SignupRequest that = (SignupRequest) o;

		if (email != null ? !email.equals(that.email) : that.email != null)
			return false;
		if (name != null ? !name.equals(that.name) : that.name != null)
			return false;
		if (avatarUrl != null ? !avatarUrl.equals(that.avatarUrl) : that.avatarUrl != null)
			return false;
		return password != null ? password.equals(that.password) : that.password == null;
	}

	@Override
	public int hashCode() {
		int result = email != null ? email.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (avatarUrl != null ? avatarUrl.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SignupRequest{");
		sb.append("email='").append(email).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", avatarUrl='").append(avatarUrl).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

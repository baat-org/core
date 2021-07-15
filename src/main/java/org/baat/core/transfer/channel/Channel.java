package org.baat.core.transfer.channel;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.Objects;

public class Channel {

    @Positive
    private Long id;

    @NotBlank
    private String name;

    private String description;

    private boolean archived;

    public Channel() {
    }

    public Channel(Long id, String name, String description, boolean archived) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.archived = archived;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return archived == channel.archived && Objects.equals(id, channel.id) && Objects.equals(name, channel.name) && Objects.equals(description, channel.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, archived);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Channel{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", archived=").append(archived);
        sb.append('}');
        return sb.toString();
    }
}

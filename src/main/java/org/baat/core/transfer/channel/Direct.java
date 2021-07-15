package org.baat.core.transfer.channel;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Objects;

public class Direct {

    @NotNull
    @Positive
    private Long firstUserId;

    @NotNull
    @Positive
    private Long secondUserId;


    public Direct() {
    }

    public Direct(Long firstUserId, Long secondUserId) {
        this.firstUserId = firstUserId;
        this.secondUserId = secondUserId;
    }

    public Long getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(Long firstUserId) {
        this.firstUserId = firstUserId;
    }

    public Long getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(Long secondUserId) {
        this.secondUserId = secondUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direct direct = (Direct) o;
        return Objects.equals(firstUserId, direct.firstUserId) && Objects.equals(secondUserId, direct.secondUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstUserId, secondUserId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Direct{");
        sb.append("firstUserId=").append(firstUserId);
        sb.append(", secondUserId=").append(secondUserId);
        sb.append('}');
        return sb.toString();
    }
}

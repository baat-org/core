package org.baat.core.transfer.channel;


import javax.validation.constraints.Positive;
import java.util.Objects;

public class Direct {

    @Positive
    private long firstUserId;

    @Positive
    private long secondUserId;


    public Direct() {
    }

    public Direct(long firstUserId, long secondUserId) {
        this.firstUserId = firstUserId;
        this.secondUserId = secondUserId;
    }

    public long getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(long firstUserId) {
        this.firstUserId = firstUserId;
    }

    public long getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(long secondUserId) {
        this.secondUserId = secondUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direct direct = (Direct) o;
        return firstUserId == direct.firstUserId && secondUserId == direct.secondUserId;
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

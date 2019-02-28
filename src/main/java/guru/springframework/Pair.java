package guru.springframework;

import java.util.Objects;

class Pair {
    private final String from;
    private final String to;

    public Pair(final String from, final String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pair pair = (Pair) o;
        return Objects.equals(from, pair.from) &&
                Objects.equals(to, pair.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

}

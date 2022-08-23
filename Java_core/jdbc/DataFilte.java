package jdbc;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import java.sql.SQLException;
import java.util.function.Predicate;

public class DataFilte implements Predicate {
    public boolean evaluate(RowSet rs) throws SQLException {
        CachedRowSet crs = (CachedRowSet) rs;
        return crs.getString("name").indexOf("Nguyen") > -1;
    }

    @Override
    public boolean test(Object o) {
        return false;
    }

    @Override
    public Predicate and(Predicate other) {
        return Predicate.super.and(other);
    }

    @Override
    public Predicate negate() {
        return Predicate.super.negate();
    }

    @Override
    public Predicate or(Predicate other) {
        return Predicate.super.or(other);
    }
}

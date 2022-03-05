package hibernate.dz11_1;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable

public class OrderKey implements Serializable {

    static final long serializableId = 1L;

    @Column (name = "person_id")
    int person_id;

    @Column (name = "product_id")
    int product_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof OrderKey)) return false;
        OrderKey orderKey = (OrderKey) o;
        return Objects.equals(getPerson_id(), orderKey.getPerson_id()) &&
                Objects.equals(getProduct_id(), orderKey.getProduct_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(person_id, product_id);
    }
}

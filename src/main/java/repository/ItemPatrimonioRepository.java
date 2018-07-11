package repository;

import model.Campus;
import model.ItemPatrimonio;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

import static br.edu.utfpr.tables.Campus.CAMPUS;

@Repository
public class ItemPatrimonioRepository {

    private DSLContext dslContext;

    @Autowired
    public ItemPatrimonioRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }


    public List<Campus> listaOsCampus() {
        try{
            return dslContext.select().from(CAMPUS).fetchInto(Campus.class);
        } catch(RuntimeException e) {
            e.getMessage();
        }
        return null;
    }
}

import com.runionow.models.ColumnField;
import com.runionow.models.Person;
import com.runionow.models.PrimaryKeyField;
import com.runionow.reflection.MetaModel;

import java.util.List;

public class PlayMetaModel {

    public static void main(String[] args) {
        MetaModel<Person> model = MetaModel.of(Person.class);

        PrimaryKeyField primaryKey = model.getPrimaryKey();
        List<ColumnField> cols = model.getColumns();

        System.out.println("Name :"+ primaryKey.getName() +" Type :"+ primaryKey.getType().getSimpleName());

        for(ColumnField field: cols) {
            System.out.println("Name :"+field.getName()+" Type :"+ field.getType().getSimpleName());
        }
    }
}

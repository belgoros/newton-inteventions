package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.Table;

@Table("ITV_AUTHOR")
@CompositePK({ "ITV_ID", "IAU_ACTION_AUTHOR_ID" })
public class InterventionAuthor extends Model {
}

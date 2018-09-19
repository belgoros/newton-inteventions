package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("ITV_STATES")
@CompositePK({ "ITV_ID", "IST_TYPE_ID" })
public class InterventionState extends Model {
}

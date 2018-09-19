package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("INTERVENTION")
@IdName("ITV_ID")
@BelongsTo(parent = InterventionType.class, foreignKeyName = "ITV_ID_INTERVENTION_TYPE")
public class Intervention extends Model {
}

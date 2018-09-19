package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("STATES")
@IdName("STA_ID")
public class State extends Model {
}

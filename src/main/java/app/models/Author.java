package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("AUTHOR")
@IdName("AUT_ID")
public class Author extends Model {
}

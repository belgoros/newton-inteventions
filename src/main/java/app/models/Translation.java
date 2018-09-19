package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("TRANSLATION")
@CompositePK({ "TRS_CONTEXT_CODE", "TRS_LABEL_CODE", "TRS_LANGUAGE" })
public class Translation extends Model {
}

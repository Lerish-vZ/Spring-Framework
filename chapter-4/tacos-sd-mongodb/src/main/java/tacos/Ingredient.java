package tacos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document //placed at the class level to indicate that Ingredient is a document entity that can be written to and read form a Mongo database
//By default, the collection name is based on the class name, with the first letter lowercase. You can specify what you want the collection name to be by setting the collection attribute of @Document [@Document (collection="ingredients")]
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class Ingredient {

  @Id
  private String id;
  private String name;
  private Type type;

  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}

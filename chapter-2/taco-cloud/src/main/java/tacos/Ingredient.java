//This ingredient class defines the domain object that we need
package tacos;

import lombok.Data;

@Data
public class Ingredient {
  
  private final String id;
  private final String name;
  private final Type type;
  
  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
//We do not have getter and setter methods or toString methods because we are using Lombok, this creates all those methods for us at runtime
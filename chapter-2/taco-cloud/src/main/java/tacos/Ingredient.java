//This ingredient class defines the domain object that we need
package tacos;

import lombok.Data;

@Data //this generates all the useful methods that is usually in a class at compile time to be used in run time
public class Ingredient {
  
  private final String id;
  private final String name;
  private final Type type;
  
  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
//We do not have getter and setter methods or toString methods because we are using Lombok, this creates all those methods for us at runtime
//Lombok needs to be added as a dependency (./pom.xml)
//You also need to add Lombok as an extension to your IDE
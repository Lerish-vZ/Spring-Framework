package tacos.data;

import java.util.Optional;

import tacos.Ingredient;

//Defines the following operations as method declarations:
//    Query for all ingredients into a collection of Ingredient objects
//    Query for a single Ingredient by its id
//    Save an Ingredient object

public interface IngredientRepository {

  Iterable<Ingredient> findAll();
  
  Optional<Ingredient> findById(String id);
  
  Ingredient save(Ingredient ingredient);
  
}

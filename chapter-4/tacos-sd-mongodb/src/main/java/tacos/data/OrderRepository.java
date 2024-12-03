package tacos.data;

import org.springframework.data.repository.CrudRepository;

import tacos.TacoOrder;

public interface OrderRepository 
         extends CrudRepository<TacoOrder, String> { //This reflects the change we made in TacoOrder to support automatic assignment of IDs.

}

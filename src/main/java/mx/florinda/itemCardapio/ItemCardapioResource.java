package mx.florinda.itemCardapio;

import io.smallrye.mutiny.Uni;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/itens-cardapio")
public class ItemCardapioResource {

  @GET
  public Uni<List<ItemCardapio>> lista() {
    return ItemCardapio.listAll();
  }
}

package mx.florinda.itemCardapio;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/itens-cardapio")
public class ItemCardapioResource {

  @GET
  public Uni<List<ItemCardapioResponse>> lista() {
    return ItemCardapio.<ItemCardapio>listAll()
            .map(itens -> itens.stream()
                    .map(ItemCardapioResponse::fromEntity)
                    .toList());
  }
}

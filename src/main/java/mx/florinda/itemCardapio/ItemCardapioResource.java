package mx.florinda.itemCardapio;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;

@Path("/itens-cardapio")
public class ItemCardapioResource {

  @GET
  public Uni<List<ItemCardapioResponse>> lista() {
    return ItemCardapio.<ItemCardapio>listAll()
            .map(ItemCardapioResource::getItensResponse);
  }

  @POST
  public Uni<RestResponse<ItemCardapioResponse>> cria(ItemCardapioRequest itemCardapioRequest) {
    ItemCardapio itemCardapio = itemCardapioRequest.toEntity();
    return Panache.<ItemCardapio>withTransaction(itemCardapio::persist)
            .map(item -> RestResponse.status(RestResponse.Status.CREATED,
                    ItemCardapioResponse.fromEntity(item)));
  }

  @GET
  @Path("/por-categoria")
  public Uni<List<ItemCardapioPorCategoriaResponse>> porCategoria() {
    return ItemCardapio
            .find("SELECT c.categoria, COUNT(c) FROM ItemCardapio c GROUP BY c.categoria")
            .project(ItemCardapioPorCategoriaResponse.class)
            .list();
  }

  private static List<ItemCardapioResponse> getItensResponse(List<ItemCardapio> itens) {
    return itens.stream()
            .map(ItemCardapioResponse::fromEntity)
            .toList();
  }
}

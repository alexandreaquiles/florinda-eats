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
  public Uni<List<ItemCardapio>> lista() {
    return ItemCardapio.listAll();
  }

  @POST
  public Uni<RestResponse<ItemCardapio>> cria(ItemCardapioRequest itemCardapioRequest) {
    ItemCardapio itemCardapio = itemCardapioRequest.toEntity();
    return Panache.<ItemCardapio>withTransaction(itemCardapio::persist)
            .map(item -> RestResponse.status(RestResponse.Status.CREATED, item));
  }

  @GET
  @Path("/por-categoria")
  public Uni<List<ItemCardapioPorCategoriaResponse>> itensPorCategoria() {
    return ItemCardapio.find("select ic.categoria, count(ic) from ItemCardapio ic group by ic.categoria")
            .project(ItemCardapioPorCategoriaResponse.class)
            .list();
  }
}

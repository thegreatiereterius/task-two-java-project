package pl.edu.vistula.firstrestapispring.product.api.response;

public class ProductResponse {

	private final long id;
	private final String name;

	public ProductResponse(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
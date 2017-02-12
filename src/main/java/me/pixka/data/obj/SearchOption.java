package me.pixka.data.obj;

public class SearchOption {

	private String value;
	private String limit;
	private Long page;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "SearchOption [value=" + value + ", limit=" + limit + ", page=" + page + "]";
	}
}

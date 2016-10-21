package th.co.tac.kms.web.dao.model;

import java.util.ArrayList;
import java.util.List;

public class ComboboxResponse {

	private List<ComboboxResponse.Item> items = new ArrayList<ComboboxResponse.Item>();
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String id;
		private String text;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
}

package it.vige.wildfly.model;

import static org.hibernate.search.annotations.Store.YES;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.SortableField;

@Entity
@Table(name = "MY_TABLE")
@Indexed(index = "indexes/bug")
public class Attachment {

	@Id
	@Column(name = "JBP_ID")
	@DocumentId
	@GeneratedValue
	private Integer id;
	
	@Column(name = "JBP_NAME")
	@Field(store = YES)
	@SortableField
	private String field;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}

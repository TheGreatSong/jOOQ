/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "TEST")
public class T_BOOK extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_INTERFACE {

	private static final long serialVersionUID = 1496241171;

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID, value);
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID);
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> fetchT_BOOK_TO_BOOK_STOREList() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	@Override
	public void setAUTHOR_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getAUTHOR_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.AUTHOR_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR 
	 * T_AUTHOR}
	 */
	public void setAUTHOR_ID(org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.AUTHOR_ID, value.getValue(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ID));
		}
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR fetchT_AUTHORByAUTHOR_ID() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	@Override
	public void setCO_AUTHOR_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	@Override
	public java.lang.Integer getCO_AUTHOR_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR 
	 * T_AUTHOR}
	 */
	public void setCO_AUTHOR_ID(org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CO_AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CO_AUTHOR_ID, value.getValue(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ID));
		}
	}

	/**
	 * The table column <code>TEST.T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR fetchT_AUTHORByCO_AUTHOR_ID() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.T_BOOK.DETAILS_ID</code>
	 */
	@Override
	public void setDETAILS_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.DETAILS_ID</code>
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	@Override
	public java.lang.Integer getDETAILS_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.DETAILS_ID);
	}

	/**
	 * The book's title
	 */
	@Override
	public void setTITLE(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.TITLE, value);
	}

	/**
	 * The book's title
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	@Override
	public void setPUBLISHED_IN(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getPUBLISHED_IN() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * The language of the book
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	@Override
	public void setLANGUAGE_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * The language of the book
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getLANGUAGE_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE 
	 * T_LANGUAGE}
	 */
	public void setLANGUAGE_ID(org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID, value.getValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID));
		}
	}

	/**
	 * The language of the book
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE fetchT_LANGUAGE() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * Some textual content of the book
	 */
	@Override
	public void setCONTENT_TEXT(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * Some textual content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	@Override
	public java.lang.String getCONTENT_TEXT() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * Some binary content of the book
	 */
	@Override
	public void setCONTENT_PDF(byte[] value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * Some binary content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	@Override
	public byte[] getCONTENT_PDF() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached T_BOOK
	 */
	public T_BOOK() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK);
	}
}

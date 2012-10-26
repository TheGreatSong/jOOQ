/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -805621128;

	/**
	 * The table column <code>TEST.T_BOOK.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.ID);
	}

	/**
	 * The table column <code>TEST.T_BOOK.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TBook.ID)))
			.fetch();
	}

	/**
	 * The table column <code>TEST.T_BOOK.AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord 
	 * TAuthorRecord}
	 */
	public void setAuthorId(org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBook.AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBook.AUTHOR_ID, value.getValue(org.jooq.test.derby.generatedclasses.tables.TAuthor.ID));
		}
	}

	/**
	 * The table column <code>TEST.T_BOOK.AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.derby.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TBook.AUTHOR_ID)))
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
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
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
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord 
	 * TAuthorRecord}
	 */
	public void setCoAuthorId(org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBook.CO_AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBook.CO_AUTHOR_ID, value.getValue(org.jooq.test.derby.generatedclasses.tables.TAuthor.ID));
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
	public org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.derby.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TBook.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.T_BOOK.DETAILS_ID</code>
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.DETAILS_ID</code>
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * The table column <code>TEST.T_BOOK.TITLE</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.TITLE</code>
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * The table column <code>TEST.T_BOOK.PUBLISHED_IN</code>
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.PUBLISHED_IN</code>
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * The table column <code>TEST.T_BOOK.LANGUAGE_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.LANGUAGE_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.derby.generatedclasses.tables.records.TLanguageRecord 
	 * TLanguageRecord}
	 */
	public void setLanguageId(org.jooq.test.derby.generatedclasses.tables.records.TLanguageRecord value) {
		if (value == null) {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBook.LANGUAGE_ID, null);
		}
		else {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBook.LANGUAGE_ID, value.getValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.ID));
		}
	}

	/**
	 * The table column <code>TEST.T_BOOK.LANGUAGE_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public org.jooq.test.derby.generatedclasses.tables.records.TLanguageRecord fetchTLanguage() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TLanguage.T_LANGUAGE)
			.where(org.jooq.test.derby.generatedclasses.tables.TLanguage.ID.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TBook.LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.T_BOOK.CONTENT_TEXT</code>
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.CONTENT_TEXT</code>
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * The table column <code>TEST.T_BOOK.CONTENT_PDF</code>
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.CONTENT_PDF</code>
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	/**
	 * The table column <code>TEST.T_BOOK.REC_TIMESTAMP</code>
	 */
	public void setRecTimestamp(java.sql.Timestamp value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBook.REC_TIMESTAMP, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK.REC_TIMESTAMP</code>
	 */
	public java.sql.Timestamp getRecTimestamp() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBook.REC_TIMESTAMP);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.derby.generatedclasses.tables.TBook.T_BOOK);
	}
}

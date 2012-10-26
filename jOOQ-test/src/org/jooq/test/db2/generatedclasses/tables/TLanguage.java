/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TLanguage extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1276023170;

	/**
	 * The singleton instance of LUKAS.T_LANGUAGE
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.db2.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The table column <code>LUKAS.T_LANGUAGE.CD</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR, T_LANGUAGE);

	/**
	 * The table column <code>LUKAS.T_LANGUAGE.DESCRIPTION</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR, T_LANGUAGE);

	/**
	 * The table column <code>LUKAS.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("DESCRIPTION_ENGLISH", org.jooq.impl.SQLDataType.VARCHAR, T_LANGUAGE);

	/**
	 * The table column <code>LUKAS.T_LANGUAGE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_LANGUAGE);

	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		super("T_LANGUAGE", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_LANGUAGE__PK_T_LANGUAGE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_LANGUAGE__PK_T_LANGUAGE);
	}
}

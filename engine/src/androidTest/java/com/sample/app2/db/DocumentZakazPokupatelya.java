/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package com.sample.app2.db;

import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

import ru.profi1c.engine.meta.Document;
import ru.profi1c.engine.meta.MetadataObject;
import ru.profi1c.engine.meta.TablePart;

/**
 * Документ 'Заказ покупателя'
 * @author Сидоров Сидор Петрович (sidor_sidoroff@mail.ru)
 *
 */
@DatabaseTable(tableName=DocumentZakazPokupatelya.TABLE_NAME, daoClass = DocumentZakazPokupatelyaDao.class) 
@MetadataObject(type=MetadataObject.TYPE_DOCUMENT, name=DocumentZakazPokupatelya.META_NAME)
public class DocumentZakazPokupatelya extends Document {
	
	/**
	 * Имя таблицы в базе данных
	 */
	public static final String TABLE_NAME = "DocumentZakazPokupatelya";
	
	/**
	 * Имя метаданных объекта в 1С (не изменять)
	 */
	public static final String META_NAME = "ЗаказПокупателя";
	
	private static final long serialVersionUID = 1L;


	@Override
	public List<Class<? extends TablePart>> getTabularSections() {
		return null;
	}
	
	@Override
	public String getMetaName() {
		return META_NAME;
	}

}

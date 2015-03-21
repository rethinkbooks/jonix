/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.codelist;

import java.util.Map;
import java.util.HashMap;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

/**
 * Enum that corresponds to ONIX's CodeList13
 * <p>
 * Series identifier type code
 * 
 * @see http://www.editeur.org/14/code-lists/
 */
public enum SeriesIdentifierTypes
{
	/**
	 * For example, publisher’s own series ID.
	 */
	Proprietary("01"), //

	/**
	 * International Standard Serial Number, unhyphenated, 8 digits.
	 */
	ISSN("02"), //

	/**
	 * Maintained by the Deutsche Nationalbibliothek.
	 */
	German_National_Bibliography_series_ID("03"), //

	/**
	 * Maintained by VLB.
	 */
	German_Books_in_Print_series_ID("04"), //

	/**
	 * Maintained by Electre Information, France.
	 */
	Electre_series_ID("05"), //

	/**
	 * Digital Object Identifier (variable length and character set).
	 */
	DOI("06"), //

	/**
	 * Use only where the collection (series or set) is available as a single product.
	 */
	ISBN_13("15"), //

	/**
	 * Uniform Resource Name.
	 */
	URN("22"), //

	/**
	 * French National Bibliography series ID, maintained by the Bibliothèque Nationale de France.
	 */
	Identifiant_BNF_des_publications_en_s_rie("29");

	public final String value;

	private SeriesIdentifierTypes(String value)
	{
		this.value = value;
	}

	private static Map<String, SeriesIdentifierTypes> map;

	private static Map<String, SeriesIdentifierTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (SeriesIdentifierTypes e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static SeriesIdentifierTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
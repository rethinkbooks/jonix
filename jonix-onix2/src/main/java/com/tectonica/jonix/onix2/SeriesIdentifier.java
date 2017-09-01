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

package com.tectonica.jonix.onix2;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixDataCompositeWithKey;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.SeriesIdentifierTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixSeriesIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Series identifier composite</h1>
 * <p>
 * A repeatable group of data elements which together define an identifier of a series or subseries. The composite is
 * optional, and may only repeat if two or more identifiers of different types are sent. It is not permissible to have
 * two identifiers of the same type.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;SeriesIdentifier&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;seriesidentifier&gt;</td>
 * </tr>
 * </table>
 */
public class SeriesIdentifier
		implements OnixDataCompositeWithKey<JonixSeriesIdentifier, SeriesIdentifierTypes>, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "SeriesIdentifier";
	public static final String shortname = "seriesidentifier";

	/////////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	/////////////////////////////////////////////////////////////////////////////////

	public TextFormats textformat;

	public TextCaseFlags textcase;

	public LanguageCodes language;

	public TransliterationSchemes transliteration;

	/**
	 * (type: DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	/////////////////////////////////////////////////////////////////////////////////
	// CONSTRUCTION
	/////////////////////////////////////////////////////////////////////////////////

	private boolean initialized;
	private final boolean exists;
	private final org.w3c.dom.Element element;
	public static final SeriesIdentifier EMPTY = new SeriesIdentifier();

	public SeriesIdentifier()
	{
		exists = false;
		element = null;
		initialized = true; // so that no further processing will be done on this intentionally-empty object
	}

	public SeriesIdentifier(org.w3c.dom.Element element)
	{
		exists = true;
		initialized = false;
		this.element = element;
	}

	private void initialize()
	{
		if (initialized)
			return;
		initialized = true;

		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, e -> {
			final String name = e.getNodeName();
			if (name.equals(SeriesIDType.refname) || name.equals(SeriesIDType.shortname))
				seriesIDType = new SeriesIDType(e);
			else if (name.equals(IDTypeName.refname) || name.equals(IDTypeName.shortname))
				idTypeName = new IDTypeName(e);
			else if (name.equals(IDValue.refname) || name.equals(IDValue.shortname))
				idValue = new IDValue(e);
		});
	}

	@Override
	public boolean exists()
	{
		return exists;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// MEMBERS
	/////////////////////////////////////////////////////////////////////////////////

	private SeriesIDType seriesIDType = SeriesIDType.EMPTY;

	/**
	 * (this field is required)
	 */
	public SeriesIDType seriesIDType()
	{
		initialize();
		return seriesIDType;
	}

	private IDTypeName idTypeName = IDTypeName.EMPTY;

	/**
	 * (this field is optional)
	 */
	public IDTypeName idTypeName()
	{
		initialize();
		return idTypeName;
	}

	private IDValue idValue = IDValue.EMPTY;

	/**
	 * (this field is required)
	 */
	public IDValue idValue()
	{
		initialize();
		return idValue;
	}

	@Override
	public JonixSeriesIdentifier asStruct()
	{
		initialize();
		JonixSeriesIdentifier struct = new JonixSeriesIdentifier();
		struct.seriesIDType = seriesIDType.value;
		struct.idTypeName = idTypeName.value;
		struct.idValue = idValue.value;
		return struct;
	}

	@Override
	public SeriesIdentifierTypes structKey()
	{
		return seriesIDType().value;
	}
}

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
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>ISBN-10 of set</h1>
 * <p>
 * A 10-character ISBN identifying a set of which the product forms part. Optional and non-repeating. <strong>The
 * &lt;ProductIdentifier&gt; composite on the next page provides a more general method of handling this and other
 * product codes, and is to be preferred.</strong>
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed-length, 10 characters, all numeric except last character, which may be letter X</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ISBNOfSet&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;b021&gt;</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;b021&gt;8474339790&lt;/b021&gt;</td>
 * </tr>
 * </table>
 */
public class ISBNOfSet implements OnixElement<String>, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ISBNOfSet";
	public static final String shortname = "b021";

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
	// VALUE MEMBER
	/////////////////////////////////////////////////////////////////////////////////

	/**
	 * Raw Format: Fixed-length, 10 characters, all numeric except last character, which may be letter X
	 * <p>
	 * (type: NonEmptyString)
	 */
	public String value;

	/**
	 * Internal API, use the {@link #value} field instead
	 */
	@Override
	public String _value()
	{
		return value;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// SERVICES
	/////////////////////////////////////////////////////////////////////////////////

	private final boolean exists;
	public static final ISBNOfSet EMPTY = new ISBNOfSet();

	public ISBNOfSet()
	{
		exists = false;
	}

	public ISBNOfSet(org.w3c.dom.Element element)
	{
		exists = true;
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = JPU.getContentAsString(element);
	}

	@Override
	public boolean exists()
	{
		return exists;
	}
}

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
import com.tectonica.jonix.codelist.PersonDateRoles;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Person date role code</h1>
 * <p>
 * An ONIX code indicating the significance of the date in relation to the contributor name. Mandatory in each
 * occurrence of the &lt;PersonDate&gt; composite.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed-length, three numeric digits</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 75</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;PersonDateRole&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;b305&gt;</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;PersonDateRole&gt;007&lt;/PersonDateRole&gt;&#160;&#160;&#160;&#160;Date of birth</td>
 * </tr>
 * </table>
 */
public class PersonDateRole implements OnixElement<PersonDateRoles>, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "PersonDateRole";
	public static final String shortname = "b305";

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

	public PersonDateRoles value;

	/**
	 * Internal API, use the {@link #value} field instead
	 */
	@Override
	public PersonDateRoles _value()
	{
		return value;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// SERVICES
	/////////////////////////////////////////////////////////////////////////////////

	private final boolean exists;
	public static final PersonDateRole EMPTY = new PersonDateRole();

	public PersonDateRole()
	{
		exists = false;
	}

	public PersonDateRole(org.w3c.dom.Element element)
	{
		exists = true;
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = PersonDateRoles.byCode(JPU.getContentAsString(element));
	}

	@Override
	public boolean exists()
	{
		return exists;
	}
}

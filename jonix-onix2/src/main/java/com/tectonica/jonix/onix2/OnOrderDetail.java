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
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixOnOrderDetail;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>On order detail composite</h1>
 * <p>
 * A repeatable group of data elements which together specify details of a stock shipment currently awaited, normally
 * from overseas. Optional.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;OnOrderDetail&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;onorderdetail&gt;</td>
 * </tr>
 * </table>
 */
public class OnOrderDetail implements OnixDataComposite<JonixOnOrderDetail>, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "OnOrderDetail";
	public static final String shortname = "onorderdetail";

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
	public static final OnOrderDetail EMPTY = new OnOrderDetail();

	public OnOrderDetail()
	{
		exists = false;
		element = null;
		initialized = true; // so that no further processing will be done on this intentionally-empty object
	}

	public OnOrderDetail(org.w3c.dom.Element element)
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
			if (name.equals(OnOrder.refname) || name.equals(OnOrder.shortname))
				onOrder = new OnOrder(e);
			else if (name.equals(ExpectedDate.refname) || name.equals(ExpectedDate.shortname))
				expectedDate = new ExpectedDate(e);
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

	private OnOrder onOrder = OnOrder.EMPTY;

	/**
	 * (this field is required)
	 */
	public OnOrder onOrder()
	{
		initialize();
		return onOrder;
	}

	private ExpectedDate expectedDate = ExpectedDate.EMPTY;

	/**
	 * (this field is required)
	 */
	public ExpectedDate expectedDate()
	{
		initialize();
		return expectedDate;
	}

	@Override
	public JonixOnOrderDetail asStruct()
	{
		initialize();
		JonixOnOrderDetail struct = new JonixOnOrderDetail();
		struct.expectedDate = expectedDate.value;
		struct.onOrder = JPU.convertStringToInteger(onOrder.value);
		return struct;
	}
}

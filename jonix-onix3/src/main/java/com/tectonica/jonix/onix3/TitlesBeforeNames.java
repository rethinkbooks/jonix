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

package com.tectonica.jonix.onix3;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextScriptCodes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Person name part 1: titles before names</h1><p>The first part of a structured name of a person who contributed to
 * the creation of the product: qualifications and/or titles preceding a person’s names, <i>eg</i> ‘Professor’ or ‘HRH
 * Prince’ or ‘Saint’. Optional and non-repeating: see Group&nbsp;P.7 introductory text for valid options.</p><table
 * border='1' cellpadding='3'><tr><td>Format</td><td>Variable-length text, suggested maximum length 100
 * characters</td></tr><tr><td>Reference name</td><td>&lt;TitlesBeforeNames&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;b038&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;1</td></tr><tr><td>Attributes</td><td>collationkey,
 * language, textscript</td></tr><tr><td>Example</td><td>&lt;TitlesBeforeNames&gt;HRH
 * Prince&lt;/TitlesBeforeNames&gt;</td></tr></table>
 */
public class TitlesBeforeNames implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "TitlesBeforeNames";
    public static final String shortname = "b038";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    public String sourcename;

    public String collationkey;

    public TextScriptCodes textscript;

    public LanguageCodes language;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Raw Format: Variable-length text, suggested maximum length 100 characters<p> (type: dt.NonEmptyString)
     */
    public String value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public String _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final TitlesBeforeNames EMPTY = new TitlesBeforeNames();

    public TitlesBeforeNames() {
        exists = false;
    }

    public TitlesBeforeNames(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
        collationkey = JPU.getAttribute(element, "collationkey");
        textscript = TextScriptCodes.byCode(JPU.getAttribute(element, "textscript"));
        language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));

        value = JPU.getContentAsString(element);
    }

    @Override
    public boolean exists() {
        return exists;
    }
}

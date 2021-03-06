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
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.Regions;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Region code</h1><p>An ONIX code identifying a region with which a contributor is particularly associated.
 * Optional and non-repeatable. There must be an occurrence of either the &lt;CountryCode&gt; or the &lt;RegionCode&gt;
 * elements in each occurrence of &lt;ContributorPlace&gt;. A region is an area which is not a country, but which is
 * precisely defined in geographical terms, <i>eg</i> Northern Ireland, Australian Capital Territory. Note that US
 * States have region codes, while US overseas territories have distinct ISO Country Codes.</p><table border='1'
 * cellpadding='3'><tr><td>Format</td><td>Variable-length code, consisting of upper case letters with or without a
 * hyphen. Suggested maximum length 8 characters</td></tr><tr><td>Codelist</td><td>List 49 Where possible and
 * appropriate, country subdivision codes are derived from the UN LOCODE scheme based on ISO
 * 3166</td></tr><tr><td>Reference name</td><td>&lt;RegionCode&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;b398&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;1</td></tr><tr><td>Example</td><td>&lt;RegionCode&gt;CA-NL&lt;/RegionCode&gt;
 * (Newfoundland and Labrador)</td></tr></table>
 */
public class RegionCode implements OnixElement<Regions>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "RegionCode";
    public static final String shortname = "b398";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    public Regions value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public Regions _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final RegionCode EMPTY = new RegionCode();

    public RegionCode() {
        exists = false;
    }

    public RegionCode(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = Regions.byCode(JPU.getContentAsString(element));
    }

    @Override
    public boolean exists() {
        return exists;
    }
}

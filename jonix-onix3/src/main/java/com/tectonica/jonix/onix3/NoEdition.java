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
import com.tectonica.jonix.OnixFlag;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>“No edition” indicator</h1><p>An empty element that provides a positive indication that a product does not carry
 * any edition information. Intended to be used an ONIX accreditation scheme to confirm that edition information is
 * being consistently supplied in publisher ONIX feeds. Optional and non-repeating. Must only be sent in a record that
 * has no instances of any of the four preceding Edition elements.</p><table border='1'
 * cellpadding='3'><tr><td>Format</td><td>XML empty element</td></tr><tr><td>Reference
 * name</td><td>&lt;NoEdition&gt;</td></tr><tr><td>Short tag</td><td>&lt;n386&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;1</td></tr><tr><td>Example</td><td>&lt;NoEdition/&gt;</td></tr></table>
 */
public class NoEdition implements OnixFlag, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "NoEdition";
    public static final String shortname = "n386";

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
    // CONSTRUCTORS
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final NoEdition EMPTY = new NoEdition();

    public NoEdition() {
        exists = false;
    }

    public NoEdition(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
    }

    @Override
    public boolean exists() {
        return exists;
    }
}

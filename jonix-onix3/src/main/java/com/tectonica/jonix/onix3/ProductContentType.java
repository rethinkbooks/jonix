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
import com.tectonica.jonix.codelist.ProductContentTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Product content type code (product part)</h1><p>An ONIX code which indicates certain types of content which are
 * closely related to but not strictly an attribute of product form, <i>eg</i> audiobook. Optional and
 * repeatable.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>Fixed-length text, two
 * digits</td></tr><tr><td>Codelist</td><td>List 81</td></tr><tr><td>Reference name</td><td>&lt;ProductContentType&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;b385&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;n</td></tr><tr><td>Example</td><td>&lt;ProductContentType&gt;01&lt;/ProductContentType&gt;
 * (Audiobook)</td></tr></table>
 */
public class ProductContentType implements OnixElement<ProductContentTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "ProductContentType";
    public static final String shortname = "b385";

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

    public ProductContentTypes value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public ProductContentTypes _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final ProductContentType EMPTY = new ProductContentType();

    public ProductContentType() {
        exists = false;
    }

    public ProductContentType(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = ProductContentTypes.byCode(JPU.getContentAsString(element));
    }

    @Override
    public boolean exists() {
        return exists;
    }
}

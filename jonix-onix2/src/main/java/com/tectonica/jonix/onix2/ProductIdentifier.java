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

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixDataCompositeWithKey;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.ProductIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixProductIdentifier;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Product identifier composite</h1><p>A repeatable group of data elements which together define the identifier of a
 * product in accordance with a specified scheme, and allowing other types of product identifier for a related product
 * to be included without defining additional data elements. <strong>See notes on the &lt;ProductIdentifier&gt;
 * composite in section&nbsp;PR.2 for details of the handling of ISBN-13.</strong></p><table border='1'
 * cellpadding='3'><tr><td>Reference name</td><td>&lt;ProductIdentifier&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;productidentifier&gt;</td></tr></table>
 */
public class ProductIdentifier
    implements OnixDataCompositeWithKey<JonixProductIdentifier, ProductIdentifierTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "ProductIdentifier";
    public static final String shortname = "productidentifier";

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
    public static final ProductIdentifier EMPTY = new ProductIdentifier();

    public ProductIdentifier() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public ProductIdentifier(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
    }

    @Override
    public void _initialize() {
        if (initialized) {
            return;
        }
        initialized = true;

        JPU.forElementsOf(element, e -> {
            final String name = e.getNodeName();
            switch (name) {
                case ProductIDType.refname:
                case ProductIDType.shortname:
                    productIDType = new ProductIDType(e);
                    break;
                case IDTypeName.refname:
                case IDTypeName.shortname:
                    idTypeName = new IDTypeName(e);
                    break;
                case IDValue.refname:
                case IDValue.shortname:
                    idValue = new IDValue(e);
                    break;
                default:
                    break;
            }
        });
    }

    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private ProductIDType productIDType = ProductIDType.EMPTY;

    /**
     * (this field is required)
     */
    public ProductIDType productIDType() {
        _initialize();
        return productIDType;
    }

    private IDTypeName idTypeName = IDTypeName.EMPTY;

    /**
     * (this field is optional)
     */
    public IDTypeName idTypeName() {
        _initialize();
        return idTypeName;
    }

    private IDValue idValue = IDValue.EMPTY;

    /**
     * (this field is required)
     */
    public IDValue idValue() {
        _initialize();
        return idValue;
    }

    @Override
    public JonixProductIdentifier asStruct() {
        _initialize();
        JonixProductIdentifier struct = new JonixProductIdentifier();
        struct.productIDType = productIDType.value;
        struct.idTypeName = idTypeName.value;
        struct.idValue = idValue.value;
        return struct;
    }

    @Override
    public ProductIdentifierTypes structKey() {
        return productIDType().value;
    }
}

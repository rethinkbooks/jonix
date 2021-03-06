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

package com.tectonica.jonix;

/**
 * represents an ONIX composite (i.e. a container for ONIX elements and possibly other ONIX composites)
 */
public interface OnixComposite extends OnixTag {
    /**
     * This is an internal API. Since Jonix 8.0, composite objects are being populated lazily. This method initiates the
     * population process, and is invoked internally by the accessor APIs of the composites
     */
    void _initialize();

    /**
     * represents an ONIX composite that contains other composites
     */
    public static interface OnixSuperComposite extends OnixComposite {
    }

    /**
     * represents an ONIX composite that contains only ONIX elements (i.e. no nested composites). This composite is
     * unique to specific version of ONIX, and isn't common to all
     */
    public static interface OnixDataCompositeUncommon extends OnixComposite {
    }

    /**
     * represents an ONIX composite that contains only ONIX elements (i.e. no nested composites)
     */
    public static interface OnixDataComposite<V extends JonixStruct> extends OnixComposite {
        V asStruct();
    }

    /**
     * represents an ONIX composite that contains only ONIX elements (i.e. no nested composites), one of which is the
     * key of the composite (i.e. a mandatory enumerated value, by which a composite can't be looked up)
     */
    public static interface OnixDataCompositeWithKey<V extends JonixKeyedStruct<K>, K extends Enum<K>>
        extends OnixDataComposite<V> {
        K structKey();
    }
}

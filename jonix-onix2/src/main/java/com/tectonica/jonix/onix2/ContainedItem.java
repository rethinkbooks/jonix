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
import com.tectonica.jonix.ListOfOnixDataCompositeWithKey;
import com.tectonica.jonix.ListOfOnixElement;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.BookFormDetails;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.ProductContentTypes;
import com.tectonica.jonix.codelist.ProductFormDetails;
import com.tectonica.jonix.codelist.ProductFormFeatureTypes;
import com.tectonica.jonix.codelist.ProductIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixProductFormFeature;
import com.tectonica.jonix.struct.JonixProductIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Contained item composite</h1>
 * <p>
 * A repeatable group of data elements which together describe an item which is part of or contained within the current
 * product. The composite may be used to specify the item(s) and item quantity/ies carried in a dumpbin, or included in
 * (eg) a classroom pack, or simply to state the product forms contained within a mixed media product, without
 * specifying their identifiers or quantity. The composite is used only when the product form coding for the product as
 * a whole indicates that the product includes two or more different items, or multiple copies of the same item.
 * </p>
 * <p>
 * Each instance of the &lt;ContainedItem&gt; composite must carry at least either a product identifier, or a product
 * form code, or both. In other words, it is valid to send an instance of the composite with an identifier and no
 * product form code, or with a product form code and no identifier.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ContainedItem&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;containeditem&gt;</td>
 * </tr>
 * </table>
 */
public class ContainedItem implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ContainedItem";
	public static final String shortname = "containeditem";

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
	public static final ContainedItem EMPTY = new ContainedItem();

	public ContainedItem()
	{
		exists = false;
		element = null;
		initialized = true; // so that no further processing will be done on this intentionally-empty object
	}

	public ContainedItem(org.w3c.dom.Element element)
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
			if (name.equals(ISBN.refname) || name.equals(ISBN.shortname))
				isbn = new ISBN(e);
			else if (name.equals(EAN13.refname) || name.equals(EAN13.shortname))
				ean13 = new EAN13(e);
			else if (name.equals(ProductIdentifier.refname) || name.equals(ProductIdentifier.shortname))
				productIdentifiers = JPU.addToList(productIdentifiers, new ProductIdentifier(e));
			else if (name.equals(ProductForm.refname) || name.equals(ProductForm.shortname))
				productForm = new ProductForm(e);
			else if (name.equals(ProductFormDetail.refname) || name.equals(ProductFormDetail.shortname))
				productFormDetails = JPU.addToList(productFormDetails, new ProductFormDetail(e));
			else if (name.equals(ProductFormFeature.refname) || name.equals(ProductFormFeature.shortname))
				productFormFeatures = JPU.addToList(productFormFeatures, new ProductFormFeature(e));
			else if (name.equals(BookFormDetail.refname) || name.equals(BookFormDetail.shortname))
				bookFormDetails = JPU.addToList(bookFormDetails, new BookFormDetail(e));
			else if (name.equals(ProductPackaging.refname) || name.equals(ProductPackaging.shortname))
				productPackaging = new ProductPackaging(e);
			else if (name.equals(ProductFormDescription.refname) || name.equals(ProductFormDescription.shortname))
				productFormDescription = new ProductFormDescription(e);
			else if (name.equals(NumberOfPieces.refname) || name.equals(NumberOfPieces.shortname))
				numberOfPieces = new NumberOfPieces(e);
			else if (name.equals(TradeCategory.refname) || name.equals(TradeCategory.shortname))
				tradeCategory = new TradeCategory(e);
			else if (name.equals(ProductContentType.refname) || name.equals(ProductContentType.shortname))
				productContentTypes = JPU.addToList(productContentTypes, new ProductContentType(e));
			else if (name.equals(ItemQuantity.refname) || name.equals(ItemQuantity.shortname))
				itemQuantity = new ItemQuantity(e);
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

	private ISBN isbn = ISBN.EMPTY;

	/**
	 * (this field is required)
	 */
	public ISBN isbn()
	{
		initialize();
		return isbn;
	}

	private EAN13 ean13 = EAN13.EMPTY;

	/**
	 * (this field is optional)
	 */
	public EAN13 ean13()
	{
		initialize();
		return ean13;
	}

	private ListOfOnixDataCompositeWithKey<ProductIdentifier, JonixProductIdentifier, ProductIdentifierTypes> productIdentifiers = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<ProductIdentifier, JonixProductIdentifier, ProductIdentifierTypes> productIdentifiers()
	{
		initialize();
		return productIdentifiers;
	}

	private ProductForm productForm = ProductForm.EMPTY;

	/**
	 * (this field is optional)
	 */
	public ProductForm productForm()
	{
		initialize();
		return productForm;
	}

	private ListOfOnixElement<ProductFormDetail, ProductFormDetails> productFormDetails = ListOfOnixElement.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixElement<ProductFormDetail, ProductFormDetails> productFormDetails()
	{
		initialize();
		return productFormDetails;
	}

	private ListOfOnixDataCompositeWithKey<ProductFormFeature, JonixProductFormFeature, ProductFormFeatureTypes> productFormFeatures = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<ProductFormFeature, JonixProductFormFeature, ProductFormFeatureTypes> productFormFeatures()
	{
		initialize();
		return productFormFeatures;
	}

	private ListOfOnixElement<BookFormDetail, BookFormDetails> bookFormDetails = ListOfOnixElement.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixElement<BookFormDetail, BookFormDetails> bookFormDetails()
	{
		initialize();
		return bookFormDetails;
	}

	private ProductPackaging productPackaging = ProductPackaging.EMPTY;

	/**
	 * (this field is optional)
	 */
	public ProductPackaging productPackaging()
	{
		initialize();
		return productPackaging;
	}

	private ProductFormDescription productFormDescription = ProductFormDescription.EMPTY;

	/**
	 * (this field is optional)
	 */
	public ProductFormDescription productFormDescription()
	{
		initialize();
		return productFormDescription;
	}

	private NumberOfPieces numberOfPieces = NumberOfPieces.EMPTY;

	/**
	 * (this field is optional)
	 */
	public NumberOfPieces numberOfPieces()
	{
		initialize();
		return numberOfPieces;
	}

	private TradeCategory tradeCategory = TradeCategory.EMPTY;

	/**
	 * (this field is optional)
	 */
	public TradeCategory tradeCategory()
	{
		initialize();
		return tradeCategory;
	}

	private ListOfOnixElement<ProductContentType, ProductContentTypes> productContentTypes = ListOfOnixElement.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixElement<ProductContentType, ProductContentTypes> productContentTypes()
	{
		initialize();
		return productContentTypes;
	}

	private ItemQuantity itemQuantity = ItemQuantity.EMPTY;

	/**
	 * (this field is optional)
	 */
	public ItemQuantity itemQuantity()
	{
		initialize();
		return itemQuantity;
	}
}

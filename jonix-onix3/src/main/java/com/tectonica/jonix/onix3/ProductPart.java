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

import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.DU;
import com.tectonica.jonix.codelist.CountryCodeIso31661s;
import com.tectonica.jonix.codelist.ProductContentTypes;
import com.tectonica.jonix.codelist.ProductFormDetailsList175;
import com.tectonica.jonix.codelist.ProductFormsList150;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class ProductPart
{
	public static final String refname = "ProductPart";
	public static final String shortname = "productpart";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public PrimaryPart primaryPart; // Optional
	public List<ProductIdentifier> productIdentifiers; // ZeroOrMore
	public ProductForm productForm; // Required
	public List<ProductFormDetail> productFormDetails; // ZeroOrMore
	public List<ProductFormFeature> productFormFeatures; // ZeroOrMore
	public List<ProductFormDescription> productFormDescriptions; // ZeroOrMore
	public List<ProductContentType> productContentTypes; // ZeroOrMore
	public NumberOfItemsOfThisForm numberOfItemsOfThisForm; // Required
	public NumberOfCopies numberOfCopies; // Optional
	public CountryOfManufacture countryOfManufacture; // Optional

	public static ProductPart fromDoc(org.w3c.dom.Element element)
	{
		final ProductPart x = new ProductPart();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(PrimaryPart.refname) || name.equals(PrimaryPart.shortname))
					x.primaryPart = PrimaryPart.fromDoc(element);
				else if (name.equals(ProductIdentifier.refname) || name.equals(ProductIdentifier.shortname))
					x.productIdentifiers = DU.addToList(x.productIdentifiers, ProductIdentifier.fromDoc(element));
				else if (name.equals(ProductForm.refname) || name.equals(ProductForm.shortname))
					x.productForm = ProductForm.fromDoc(element);
				else if (name.equals(ProductFormDetail.refname) || name.equals(ProductFormDetail.shortname))
					x.productFormDetails = DU.addToList(x.productFormDetails, ProductFormDetail.fromDoc(element));
				else if (name.equals(ProductFormFeature.refname) || name.equals(ProductFormFeature.shortname))
					x.productFormFeatures = DU.addToList(x.productFormFeatures, ProductFormFeature.fromDoc(element));
				else if (name.equals(ProductFormDescription.refname) || name.equals(ProductFormDescription.shortname))
					x.productFormDescriptions = DU.addToList(x.productFormDescriptions, ProductFormDescription.fromDoc(element));
				else if (name.equals(ProductContentType.refname) || name.equals(ProductContentType.shortname))
					x.productContentTypes = DU.addToList(x.productContentTypes, ProductContentType.fromDoc(element));
				else if (name.equals(NumberOfItemsOfThisForm.refname) || name.equals(NumberOfItemsOfThisForm.shortname))
					x.numberOfItemsOfThisForm = NumberOfItemsOfThisForm.fromDoc(element);
				else if (name.equals(NumberOfCopies.refname) || name.equals(NumberOfCopies.shortname))
					x.numberOfCopies = NumberOfCopies.fromDoc(element);
				else if (name.equals(CountryOfManufacture.refname) || name.equals(CountryOfManufacture.shortname))
					x.countryOfManufacture = CountryOfManufacture.fromDoc(element);
			}
		});

		return x;
	}

	public ProductFormsList150 getProductFormValue()
	{
		return (productForm == null) ? null : productForm.value;
	}

	public List<ProductFormDetailsList175> getProductFormDetailValues()
	{
		if (productFormDetails != null)
		{
			List<ProductFormDetailsList175> list = new ArrayList<>();
			for (ProductFormDetail i : productFormDetails)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public List<String> getProductFormDescriptionValues()
	{
		if (productFormDescriptions != null)
		{
			List<String> list = new ArrayList<>();
			for (ProductFormDescription i : productFormDescriptions)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public List<ProductContentTypes> getProductContentTypeValues()
	{
		if (productContentTypes != null)
		{
			List<ProductContentTypes> list = new ArrayList<>();
			for (ProductContentType i : productContentTypes)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public Integer getNumberOfItemsOfThisFormValue()
	{
		return (numberOfItemsOfThisForm == null) ? null : numberOfItemsOfThisForm.value;
	}

	public Integer getNumberOfCopiesValue()
	{
		return (numberOfCopies == null) ? null : numberOfCopies.value;
	}

	public CountryCodeIso31661s getCountryOfManufactureValue()
	{
		return (countryOfManufacture == null) ? null : countryOfManufacture.value;
	}
}

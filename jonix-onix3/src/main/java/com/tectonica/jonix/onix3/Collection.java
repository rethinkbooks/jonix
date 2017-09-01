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

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.ListOfOnixDataCompositeWithKey;
import com.tectonica.jonix.ListOfOnixElement;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.CollectionSequenceTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.SeriesIdentifierTypes;
import com.tectonica.jonix.struct.JonixCollectionIdentifier;
import com.tectonica.jonix.struct.JonixCollectionSequence;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Collection composite</h1>
 * <p>
 * A repeatable group of data elements which carry attributes of a collection of which the product is part. The
 * composite is optional.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;Collection&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;collection&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 */
public class Collection implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "Collection";
	public static final String shortname = "collection";

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
	// CONSTRUCTION
	/////////////////////////////////////////////////////////////////////////////////

	private boolean initialized;
	private final boolean exists;
	private final org.w3c.dom.Element element;
	public static final Collection EMPTY = new Collection();

	public Collection()
	{
		exists = false;
		element = null;
		initialized = true; // so that no further processing will be done on this intentionally-empty object
	}

	public Collection(org.w3c.dom.Element element)
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

		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, e -> {
			final String name = e.getNodeName();
			if (name.equals(CollectionType.refname) || name.equals(CollectionType.shortname))
				collectionType = new CollectionType(e);
			else if (name.equals(SourceName.refname) || name.equals(SourceName.shortname))
				sourceName = new SourceName(e);
			else if (name.equals(CollectionIdentifier.refname) || name.equals(CollectionIdentifier.shortname))
				collectionIdentifiers = JPU.addToList(collectionIdentifiers, new CollectionIdentifier(e));
			else if (name.equals(CollectionSequence.refname) || name.equals(CollectionSequence.shortname))
				collectionSequences = JPU.addToList(collectionSequences, new CollectionSequence(e));
			else if (name.equals(TitleDetail.refname) || name.equals(TitleDetail.shortname))
				titleDetails = JPU.addToList(titleDetails, new TitleDetail(e));
			else if (name.equals(Contributor.refname) || name.equals(Contributor.shortname))
				contributors = JPU.addToList(contributors, new Contributor(e));
			else if (name.equals(ContributorStatement.refname) || name.equals(ContributorStatement.shortname))
				contributorStatements = JPU.addToList(contributorStatements, new ContributorStatement(e));
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

	private CollectionType collectionType = CollectionType.EMPTY;

	/**
	 * (this field is required)
	 */
	public CollectionType collectionType()
	{
		initialize();
		return collectionType;
	}

	private SourceName sourceName = SourceName.EMPTY;

	/**
	 * (this field is optional)
	 */
	public SourceName sourceName()
	{
		initialize();
		return sourceName;
	}

	private ListOfOnixDataCompositeWithKey<CollectionIdentifier, JonixCollectionIdentifier, SeriesIdentifierTypes> collectionIdentifiers = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<CollectionIdentifier, JonixCollectionIdentifier, SeriesIdentifierTypes> collectionIdentifiers()
	{
		initialize();
		return collectionIdentifiers;
	}

	private ListOfOnixDataCompositeWithKey<CollectionSequence, JonixCollectionSequence, CollectionSequenceTypes> collectionSequences = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<CollectionSequence, JonixCollectionSequence, CollectionSequenceTypes> collectionSequences()
	{
		initialize();
		return collectionSequences;
	}

	private List<TitleDetail> titleDetails = Collections.emptyList();

	/**
	 * (this list may be empty)
	 */
	public List<TitleDetail> titleDetails()
	{
		initialize();
		return titleDetails;
	}

	private List<Contributor> contributors = Collections.emptyList();

	/**
	 * (this list may be empty)
	 */
	public List<Contributor> contributors()
	{
		initialize();
		return contributors;
	}

	private ListOfOnixElement<ContributorStatement, String> contributorStatements = ListOfOnixElement.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixElement<ContributorStatement, String> contributorStatements()
	{
		initialize();
		return contributorStatements;
	}
}

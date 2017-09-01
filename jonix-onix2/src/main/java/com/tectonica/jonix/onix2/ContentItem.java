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
import java.util.Collections;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.ListOfOnixDataComposite;
import com.tectonica.jonix.ListOfOnixDataCompositeWithKey;
import com.tectonica.jonix.ListOfOnixElement;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.ImageAudioVideoFileTypes;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.OtherTextTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TitleTypes;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.codelist.WorkIdentifierTypes;
import com.tectonica.jonix.struct.JonixMediaFile;
import com.tectonica.jonix.struct.JonixOtherText;
import com.tectonica.jonix.struct.JonixSubject;
import com.tectonica.jonix.struct.JonixTitle;
import com.tectonica.jonix.struct.JonixWebsite;
import com.tectonica.jonix.struct.JonixWorkIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Content item composite</h1>
 * <p>
 * A repeatable group of data elements which together describe a content item within a product.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ContentItem&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;contentitem&gt;</td>
 * </tr>
 * </table>
 */
public class ContentItem implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ContentItem";
	public static final String shortname = "contentitem";

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
	public static final ContentItem EMPTY = new ContentItem();

	public ContentItem()
	{
		exists = false;
		element = null;
		initialized = true; // so that no further processing will be done on this intentionally-empty object
	}

	public ContentItem(org.w3c.dom.Element element)
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
			if (name.equals(LevelSequenceNumber.refname) || name.equals(LevelSequenceNumber.shortname))
				levelSequenceNumber = new LevelSequenceNumber(e);
			else if (name.equals(TextItem.refname) || name.equals(TextItem.shortname))
				textItem = new TextItem(e);
			else if (name.equals(Website.refname) || name.equals(Website.shortname))
				websites = JPU.addToList(websites, new Website(e));
			else if (name.equals(ComponentTypeName.refname) || name.equals(ComponentTypeName.shortname))
				componentTypeName = new ComponentTypeName(e);
			else if (name.equals(ComponentNumber.refname) || name.equals(ComponentNumber.shortname))
				componentNumber = new ComponentNumber(e);
			else if (name.equals(DistinctiveTitle.refname) || name.equals(DistinctiveTitle.shortname))
				distinctiveTitle = new DistinctiveTitle(e);
			else if (name.equals(Title.refname) || name.equals(Title.shortname))
				titles = JPU.addToList(titles, new Title(e));
			else if (name.equals(WorkIdentifier.refname) || name.equals(WorkIdentifier.shortname))
				workIdentifiers = JPU.addToList(workIdentifiers, new WorkIdentifier(e));
			else if (name.equals(Contributor.refname) || name.equals(Contributor.shortname))
				contributors = JPU.addToList(contributors, new Contributor(e));
			else if (name.equals(ContributorStatement.refname) || name.equals(ContributorStatement.shortname))
				contributorStatement = new ContributorStatement(e);
			else if (name.equals(Subject.refname) || name.equals(Subject.shortname))
				subjects = JPU.addToList(subjects, new Subject(e));
			else if (name.equals(PersonAsSubject.refname) || name.equals(PersonAsSubject.shortname))
				personAsSubjects = JPU.addToList(personAsSubjects, new PersonAsSubject(e));
			else if (name.equals(CorporateBodyAsSubject.refname) || name.equals(CorporateBodyAsSubject.shortname))
				corporateBodyAsSubjects = JPU.addToList(corporateBodyAsSubjects, new CorporateBodyAsSubject(e));
			else if (name.equals(PlaceAsSubject.refname) || name.equals(PlaceAsSubject.shortname))
				placeAsSubjects = JPU.addToList(placeAsSubjects, new PlaceAsSubject(e));
			else if (name.equals(OtherText.refname) || name.equals(OtherText.shortname))
				otherTexts = JPU.addToList(otherTexts, new OtherText(e));
			else if (name.equals(MediaFile.refname) || name.equals(MediaFile.shortname))
				mediaFiles = JPU.addToList(mediaFiles, new MediaFile(e));
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

	private LevelSequenceNumber levelSequenceNumber = LevelSequenceNumber.EMPTY;

	/**
	 * (this field is optional)
	 */
	public LevelSequenceNumber levelSequenceNumber()
	{
		initialize();
		return levelSequenceNumber;
	}

	private TextItem textItem = TextItem.EMPTY;

	/**
	 * (this field is required)
	 */
	public TextItem textItem()
	{
		initialize();
		return textItem;
	}

	private ListOfOnixDataComposite<Website, JonixWebsite> websites = ListOfOnixDataComposite.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataComposite<Website, JonixWebsite> websites()
	{
		initialize();
		return websites;
	}

	private ComponentTypeName componentTypeName = ComponentTypeName.EMPTY;

	/**
	 * (this field is required)
	 */
	public ComponentTypeName componentTypeName()
	{
		initialize();
		return componentTypeName;
	}

	private ComponentNumber componentNumber = ComponentNumber.EMPTY;

	/**
	 * (this field is optional)
	 */
	public ComponentNumber componentNumber()
	{
		initialize();
		return componentNumber;
	}

	private DistinctiveTitle distinctiveTitle = DistinctiveTitle.EMPTY;

	/**
	 * (this field is optional)
	 */
	public DistinctiveTitle distinctiveTitle()
	{
		initialize();
		return distinctiveTitle;
	}

	private ListOfOnixDataCompositeWithKey<Title, JonixTitle, TitleTypes> titles = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<Title, JonixTitle, TitleTypes> titles()
	{
		initialize();
		return titles;
	}

	private ListOfOnixDataCompositeWithKey<WorkIdentifier, JonixWorkIdentifier, WorkIdentifierTypes> workIdentifiers = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<WorkIdentifier, JonixWorkIdentifier, WorkIdentifierTypes> workIdentifiers()
	{
		initialize();
		return workIdentifiers;
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

	private ContributorStatement contributorStatement = ContributorStatement.EMPTY;

	/**
	 * (this field is optional)
	 */
	public ContributorStatement contributorStatement()
	{
		initialize();
		return contributorStatement;
	}

	private ListOfOnixDataComposite<Subject, JonixSubject> subjects = ListOfOnixDataComposite.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataComposite<Subject, JonixSubject> subjects()
	{
		initialize();
		return subjects;
	}

	private List<PersonAsSubject> personAsSubjects = Collections.emptyList();

	/**
	 * (this list may be empty)
	 */
	public List<PersonAsSubject> personAsSubjects()
	{
		initialize();
		return personAsSubjects;
	}

	private ListOfOnixElement<CorporateBodyAsSubject, String> corporateBodyAsSubjects = ListOfOnixElement.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixElement<CorporateBodyAsSubject, String> corporateBodyAsSubjects()
	{
		initialize();
		return corporateBodyAsSubjects;
	}

	private ListOfOnixElement<PlaceAsSubject, String> placeAsSubjects = ListOfOnixElement.empty();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixElement<PlaceAsSubject, String> placeAsSubjects()
	{
		initialize();
		return placeAsSubjects;
	}

	private ListOfOnixDataCompositeWithKey<OtherText, JonixOtherText, OtherTextTypes> otherTexts = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<OtherText, JonixOtherText, OtherTextTypes> otherTexts()
	{
		initialize();
		return otherTexts;
	}

	private ListOfOnixDataCompositeWithKey<MediaFile, JonixMediaFile, ImageAudioVideoFileTypes> mediaFiles = ListOfOnixDataCompositeWithKey
			.emptyKeyed();

	/**
	 * (this list may be empty)
	 */
	public ListOfOnixDataCompositeWithKey<MediaFile, JonixMediaFile, ImageAudioVideoFileTypes> mediaFiles()
	{
		initialize();
		return mediaFiles;
	}
}

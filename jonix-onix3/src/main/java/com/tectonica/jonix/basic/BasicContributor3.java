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

package com.tectonica.jonix.basic;

import java.util.HashSet;

import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.onix3.BiographicalNote;
import com.tectonica.jonix.onix3.Contributor;

/**
 * ONIX3 concrete implementation for {@link BasicContributor}
 * 
 * @author Zach Melamed
 */
public class BasicContributor3 extends BasicContributor
{
	private static final long serialVersionUID = 1L;

	public BasicContributor3(Contributor c)
	{
		contributorRoles = (c.contributorRoles().valuesInto(new HashSet<>()));
		Integer sequenceNumberValue = c.sequenceNumber().value;
		sequenceNumber = (sequenceNumberValue == null) ? null : sequenceNumberValue.toString();
		personName = c.personName().value;
		personNameKey = c.keyNames().value;
		personNameBeforeKey = c.namesBeforeKey().value;
		personNameInverted = c.personNameInverted().value;
		corporateName = c.corporateName().value;
		biographicalNote = pickBiographicalNote(c);
	}

	private String pickBiographicalNote(Contributor contributor)
	{
		for (BiographicalNote bio : contributor.biographicalNotes())
		{
			if (bio.language == null || bio.language == LanguageCodes.English)
				return bio.value;
		}
		return contributor.biographicalNotes().firstValueOrNull(); // return whatever language we have
	}
}
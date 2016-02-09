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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tectonica.jonix.onix3.Addressee;

/**
 * Contains the essential information included in ONIX &lt;Header&gt;.
 * <p>
 * Provided as part of the 'basic' suite of classes whose goal is to extract the most important information from an ONIX
 * source (be it ONIX2 or ONIX3) and make it available for other various uses (print in a tabular format, etc.). The
 * classes of the 'basic' bridge the gap between ONIX versions, and provide a unified view of the content, allowing the
 * user to write a version-agnostic code.
 * <p>
 * NOTE: to access the information, read the (public final) fields directly. No getters() are included..
 * <p>
 * May be constructed from either a {@link com.tectonica.jonix.onix2.Header} or a
 * {@link com.tectonica.jonix.onix3.Header}.
 * 
 * @author Zach Melamed
 */
public class BasicHeader implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String fromCompany;
	public final String fromPerson;
	public final String fromEmail;
	public final List<String> toCompanies;
	public final String sentDate;

	/**
	 * constructor for ONIX2 &lt;Header&gt; element
	 */
	public BasicHeader(com.tectonica.jonix.onix2.Header header)
	{
		fromCompany = header.getFromCompanyValue();
		fromPerson = header.getFromPersonValue();
		fromEmail = header.getFromEmailValue();
		String toCompany = header.getToCompanyValue();
		toCompanies = (toCompany == null) ? null : Arrays.asList(toCompany);
		sentDate = header.getSentDateValue();
	}

	/**
	 * constructor for ONIX3 &lt;Header&gt; element
	 */
	public BasicHeader(com.tectonica.jonix.onix3.Header header)
	{
		fromCompany = header.sender.getSenderNameValue();
		fromPerson = header.sender.getContactNameValue();
		fromEmail = header.sender.getEmailAddressValue();
		toCompanies = extractToCompanies(header);
		sentDate = header.getSentDateTimeValue();
	}

	private List<String> extractToCompanies(com.tectonica.jonix.onix3.Header header)
	{
		List<String> list = new ArrayList<>();
		if (header.addressees != null)
		{
			for (Addressee addressee : header.addressees)
			{
				String toCompany = addressee.getAddresseeNameValue();
				if (toCompany != null)
					list.add(toCompany);
			}
		}
		return list.size() > 0 ? list : null;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("FromCompany: ").append(fromCompany).append("\n");
		sb.append("FromPerson:  ").append(fromPerson).append("\n");
		sb.append("FromEmail:   ").append(fromEmail).append("\n");
		sb.append("ToCompany:   ").append(toCompanies).append("\n");
		sb.append("SentDate:    ").append(sentDate);
		return sb.toString();
	}
}
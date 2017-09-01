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

import java.util.Arrays;

import com.tectonica.jonix.onix2.Header;

/**
 * ONIX2 concrete implementation for {@link BasicHeader}
 * 
 * @author Zach Melamed
 */
public class BasicHeader2 extends BasicHeader
{
	private static final long serialVersionUID = 1L;

	public BasicHeader2(Header header)
	{
		fromCompany = header.fromCompany().value;
		fromPerson = header.fromPerson().value;
		fromEmail = header.fromEmail().value;
		String toCompany = header.toCompany().value;
		toCompanies = (toCompany == null) ? null : Arrays.asList(toCompany);
		sentDate = header.sentDate().value;
	}
}

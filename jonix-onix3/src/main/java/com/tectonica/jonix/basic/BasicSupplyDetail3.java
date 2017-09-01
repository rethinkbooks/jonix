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

import com.tectonica.jonix.onix3.SupplyDetail;

/**
 * ONIX3 concrete implementation for {@link BasicSupplyDetail}
 * 
 * @author Zach Melamed
 */
public class BasicSupplyDetail3 extends BasicSupplyDetail
{
	private static final long serialVersionUID = 1L;

	public BasicSupplyDetail3(SupplyDetail supplyDetail)
	{
		supplierRole = supplyDetail.supplier().supplierRole().value;
		supplierName = supplyDetail.supplier().supplierName().value;
		availability = supplyDetail.productAvailability().value.name();
		prices = new BasicPrices3(supplyDetail);
	}
}
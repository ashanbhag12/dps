package com.dps.service;

import java.util.List;
import java.util.Map;

import com.dps.domain.entity.CustomerOrderDetails;


/**
 * Service interface to access {@link CustomerOrderDetails} objects.
 *
 * @see
 *
 * @Date 10-Jul-2016
 *
 * @author Akshay
 */
public interface CustomerOrderDetailsService extends BaseService<CustomerOrderDetails>
{
	/**
	 * Returns {@link Map} containing the product id and the cumulative sum of unordered quantity for the specified products.
	 * @param productId - {@link List} of product ids for which the unordered quantities need to be fetched.
	 * @return {@link Map} containing the product id and the cumulative sum of unordered quantity for the specified products.
	 */
	Map<Long,Integer> getUnorderedQuantityForProducts(List<Long> productId);
}

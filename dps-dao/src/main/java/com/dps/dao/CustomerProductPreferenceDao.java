package com.dps.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.dps.domain.entity.CustomerProductPreference;

/**
 * DAO interfaces to access {@link CustomerProductPreference} objects.
 *
 * @see
 *
 * @Date Jul 17, 2016
 *
 * @author akshay
 */
public interface CustomerProductPreferenceDao extends BaseDao<CustomerProductPreference>
{

	/**
	 * Returns {@link Map} of {@link Long} the product code and {@link BigDecimal} the discount for that product for the specified customer.
	 * @param id - The id of the customer for which preferences are to be fetched.
	 * @return {@link Map} of {@link Long} the product code and {@link BigDecimal} the discount for that product for the specified customer.
	 */
	Map<Long, BigDecimal> findPreferenceForCustomer(Long id);

	/**
	 * Returns {@link List} of {@link CustomerProductPreference} objects that are present for that customer.
	 * @param id - The Id of the customer for whom preferences are to be fetched.
	 * @return {@link List} of {@link CustomerProductPreference} objects that are present for that customer.
	 */
	List<CustomerProductPreference> findAllPreferencesForCustomer(Long id);

}

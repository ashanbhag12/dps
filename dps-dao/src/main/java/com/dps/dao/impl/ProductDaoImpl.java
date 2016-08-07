package com.dps.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.dps.commons.domain.JpaEntityId;
import com.dps.dao.ProductDao;
import com.dps.domain.entity.Product;

/**
 * Default implementation of {@link ProductDao} interface
 *
 * @see
 *
 * @Date 10-Jul-2016
 *
 * @author Akshay
 */
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao
{
	private static final List<Product> EMPTY_PRODUCT_LIST = new ArrayList<>();

	@Override
	public List<Product> findByCode(String code)
	{
		List<JpaEntityId> productCodeId = null;
		if(StringUtils.isNotBlank(code))
		{
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("code", code + "%");
			productCodeId = findAllByNamedQuery(Product.FIND_PRODUCT_BY_CODE, parameters);
		}
		
		if(CollectionUtils.isEmpty(productCodeId))
		{
			return EMPTY_PRODUCT_LIST;
		}
		
		return findAll(productCodeId);
	}

	/* (non-Javadoc)
	 * @see com.dps.dao.ProductDao#getAllProductCodes()
	 */
	@Override
	public List<String> getAllProductCodes()
	{
		TypedQuery<String> query = entityManager.createNamedQuery(Product.GET_ALL_PRODUCT_CODE, String.class);
		return query.getResultList();
	}

}

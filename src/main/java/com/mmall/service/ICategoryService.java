package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by mark on 17-8-8.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse selectChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndDeepChildrenCategory(Integer categoryId);
}

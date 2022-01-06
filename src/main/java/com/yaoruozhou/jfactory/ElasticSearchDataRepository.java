package com.yaoruozhou.jfactory;

import com.github.leeonky.jfactory.DataRepository;

public interface ElasticSearchDataRepository extends DataRepository {

    void setRootClass(Class<?> clazz);
}

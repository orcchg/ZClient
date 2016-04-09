package com.orcchg.zclient.data.local.sql;

import com.orcchg.zclient.data.local.base.Specification;

public interface SqlSpecification extends Specification {

    String toSqlQuery();
}

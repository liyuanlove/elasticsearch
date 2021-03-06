/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.sql.querydsl.agg;

import org.elasticsearch.search.aggregations.AggregationBuilder;

import static org.elasticsearch.search.aggregations.AggregationBuilders.extendedStats;

public class ExtendedStatsAgg extends LeafAgg {

    public ExtendedStatsAgg(String id, String fieldName) {
        super(id, fieldName);
    }

    @Override
    AggregationBuilder toBuilder() {
        return extendedStats(id()).field(fieldName());
    }
}

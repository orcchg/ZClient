package com.orcchg.zclient.data.mapper;

public interface Mapper<From, To> {
    To map(From from);
}

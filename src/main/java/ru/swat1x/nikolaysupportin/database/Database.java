package ru.swat1x.nikolaysupportin.database;

import org.apache.commons.dbutils.QueryRunner;

public interface Database {

    QueryRunner sync();

    CompletableQueryRunner async();

}

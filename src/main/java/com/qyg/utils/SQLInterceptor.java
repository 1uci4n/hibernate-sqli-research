package com.qyg.utils;

import com.github.vertical_blank.sqlformatter.SqlFormatter;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import java.io.Serializable;

public class SQLInterceptor extends EmptyInterceptor {
    private static String executeSql = "null";

    @Override
    public String onPrepareStatement(String sql) {
        executeSql = SqlFormatter.format(sql);
        return super.onPrepareStatement(sql);
    }

    public static void init() {
        executeSql = "null";
    }

    public static String getExecuteSql() {
        return executeSql;
    }
}

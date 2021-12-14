package com.github.ismail2ov.sproutclass;

import java.util.Date;
import java.util.List;

public final class Database {
    private static Database instance;

    private DatabaseManager databaseManager;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public List<Result> queryResults(Date beginDate, Date endDate) {
        return databaseManager.queryResults(beginDate, endDate);
    }
}

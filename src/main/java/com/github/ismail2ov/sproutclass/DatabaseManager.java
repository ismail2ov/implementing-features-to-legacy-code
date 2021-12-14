package com.github.ismail2ov.sproutclass;

import java.util.Date;
import java.util.List;

public interface DatabaseManager {
    List<Result> queryResults(Date beginDate, Date endDate);
}

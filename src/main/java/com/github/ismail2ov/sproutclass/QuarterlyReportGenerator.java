package com.github.ismail2ov.sproutclass;

import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
public class QuarterlyReportGenerator {
    private final Date beginDate;
    private final Date endDate;

    public String generate() {
        List<Result> results = Database.getInstance().queryResults(this.beginDate, this.endDate);

        StringBuilder pageText = new StringBuilder();

        pageText.append("<html>");
        pageText.append("<head>");
        pageText.append("<title>").append("Quarterly Report").append("</title>");
        pageText.append("</head>");
        pageText.append("<body>");
        pageText.append("<table>");

        if (results.size() != 0) {
            QuarterlyReportTableHeaderProducer producer = new QuarterlyReportTableHeaderProducer();
            pageText.append(producer.makeHeader());

            for (Result item : results) {
                pageText.append("<tr>");
                pageText.append("<td>").append(item.getDepartment()).append("</td>");
                pageText.append("<td>").append(item.getManager()).append("</td>");
                pageText.append("<td>").append(item.getNetProfit() / 100).append("</td>");
                pageText.append("<td>").append(item.getOperatingExpense() / 100).append("</td>");
                pageText.append("</tr>");
            }
        } else {
            pageText.append("No Result For this Period");
        }
        pageText.append("</table>");
        pageText.append("</body>");
        pageText.append("</html>");

        return pageText.toString();
    }
}

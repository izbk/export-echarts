package io.github.izbk.export.service;


import io.github.izbk.export.vo.DataCenterMonthlyReportReq;
import io.github.izbk.export.vo.SpecialReportWordData;

import java.io.File;

/**
 * @author zbk
 * @date 2020-05-14 14:10:37
 */
public interface DataCenterReportService {

    /**
     * 获取生成word所需数据
     *
     * @param reportReq
     * @return 结果
     */
    SpecialReportWordData queryReportData(DataCenterMonthlyReportReq reportReq);
    /**
     * 导出报表
     * @param reportReq
     * @return
     */
    File export(DataCenterMonthlyReportReq reportReq);
}

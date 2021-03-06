package io.github.izbk.export.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author lijiafeng
 * @date 2020/1/17 14:39
 */
@Data
public class SpecialReportVO {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 专题报告名称
     */
    @NotBlank(message = "专题报告名称不能为空")
    private String name;

    /**
     * 专题报告类型
     */
    @NotBlank(message = "专题报告类型不能为空")
    private String type;

    /**
     * 专题报告类型
     */
    private String typeName;

    /**
     * 附件名称
     */
    @NotBlank(message = "附件名称不能为空")
    private String attachmentName;

    /**
     * 附件地址
     */
    @NotBlank(message = "附件地址不能为空")
    private String attachmentUrl;

    /**
     * 生成日期
     */
    private Date reportTime;
}

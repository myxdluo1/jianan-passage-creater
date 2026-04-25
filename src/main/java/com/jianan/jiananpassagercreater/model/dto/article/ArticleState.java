package com.jianan.jiananpassagercreater.model.dto.article;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 文章生成状态（智能体间共享的状态对象）
 *
 */
@Data
public class ArticleState implements Serializable {

    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 选题
     */
    private String topic;

    /**
     * 标题结果（智能体1输出）
     */
    private TitleResult title;

    /**
     * 大纲结果（智能体2输出）
     */
    private OutlineResult outline;

    /**
     * 正文内容（智能体3输出）
     */
    private String content;

    /**
     * 配图需求列表（智能体4输出）
     */
    private List<ImageRequirement> imageRequirements;

    /**
     * 配图结果列表（智能体5输出）
     */
    private List<ImageResult> images;
    /**
     * 文章风格
     */
    private String style;

    /**
     * 标题结果
     */
    @Data
    public static class TitleResult implements Serializable {
        private String mainTitle;
        private String subTitle;
    }

    /**
     * 大纲结果
     */
    @Data
    public static class OutlineResult implements Serializable {
        private List<OutlineSection> sections;
    }

    /**
     * 大纲章节
     */
    @Data
    public static class OutlineSection implements Serializable {
        private Integer section;
        private String title;
        private List<String> points;
    }

    /**
     * 配图需求
     */
    @Data
    public static class ImageRequirement implements Serializable {
        private Integer position;
        private String type;
        private String keywords;
    }

    /**
     * 配图结果
     */
    @Data
    public static class ImageResult implements Serializable {
        private Integer position;
        private String url;
        private String method;
        private String keywords;
        private String description; /**
         * 占位符ID，用于在正文中定位插入位置，格式：{{IMAGE_PLACEHOLDER_N}}
         */
        private String placeholderId;

    }
    /**
     * 智能体4返回结果（包含带占位符的正文和配图需求列表）
     */
    @Data
    public static class Agent4Result implements Serializable {
        /**
         * 包含占位符的正文内容
         */
        private String contentWithPlaceholders;
        /**
         * 配图需求列表
         */
        private List<ImageRequirement> imageRequirements;
    }

    private static final long serialVersionUID = 1L;
}
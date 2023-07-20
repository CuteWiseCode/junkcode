package com.me.plugin.ext;


/**
 * @Desc:  插件配置
 */
public class JunkCodeExtension {
    /**
     * 是否启动插件
     */
    private boolean enable = true;

    /**
     * 配置文件路径
     */
    private String configFile = "";



    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getConfigFile() {
        return configFile;
    }

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }
}
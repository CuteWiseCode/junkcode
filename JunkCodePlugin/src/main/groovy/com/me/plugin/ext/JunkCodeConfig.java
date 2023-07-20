package com.me.plugin.ext;

import java.util.ArrayList;
/**
 * @Desc:  插件配置扩展
 */
public class JunkCodeConfig {


    /**
     * 配置文件路径
     */
    private ArrayList<String> junkPackages = null;


    public ArrayList<String> getJunkPackages() {
        return junkPackages;
    }

    public void setJunkPackages(ArrayList<String> junkPackages) {
        this.junkPackages = junkPackages;
    }


}
package com.xxl.job.executor.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * guns项目配置
 *
 * @author stylefeng
 * @Date 2017/5/23 22:31
 */
@Component
@ConfigurationProperties(prefix = KettleProperties.PREFIX)
public class KettleProperties {

    public static final String PREFIX = "kettle";

    private String fileExecPath;

	public String getFileExecPath() {
		return fileExecPath;
	}

	public void setFileExecPath(String fileExecPath) {
		this.fileExecPath = fileExecPath;
	}
    
    
}

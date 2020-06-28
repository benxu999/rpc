/*
 * Copyright (c) 2019. All Rights Reserved.
 * Author: Ben
 * Date: 2019.9
 * Version: v1.0
 *
 */
package ben.rpc.enroll;

/**
 * 常量
 */
public class Constant {

	public static final int ZK_SESSION_TIMEOUT = 5000;//zk超时时间

    public static final String ZK_REGISTRY_PATH = "/registry";//注册节点
    public static final String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";//节点
}

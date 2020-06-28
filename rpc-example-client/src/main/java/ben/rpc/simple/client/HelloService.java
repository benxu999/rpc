/*
 * Copyright (c) 2019. All Rights Reserved.
 * Author: Ben
 * Date: 2019.9
 * Version: v1.0
 *
 */
package ben.rpc.simple.client;

public interface HelloService {

    String hello(String name);

    String hello(Person person);
}

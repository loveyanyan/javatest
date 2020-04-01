package com.djcps.test.test;

/**
 * @author yj
 * @version 1.0
 * @ClassName: generateId
 * @description: TODO
 * @date 2019/7/18 14:06
 */
public class GenerateId {
    public static void main(String[] args) {

        String uuid = GetUuid.uuid;
        System.out.println("UUID = " + uuid);
        long snowflakeID = IdWorker.getInstance().nextId();
        System.out.println("snowflakeID = " + snowflakeID);
    }


}

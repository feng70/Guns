package cn.stylefeng.guns.core.consts;

import cn.stylefeng.guns.GunsApplication;

/**
 * 项目的常量
 *
 * @author fengshuonan
 * @date 2020/12/16 14:28
 */
public interface ProjectConstants {

    /**
     * 项目的模块名称
     */
    String PROJECT_MODULE_NAME = "guns-standalone";

    /**
     * 异常枚举的步进值
     */
    String BUSINESS_EXCEPTION_STEP_CODE = "100";

    /**
     * 项目的包名，例如cn.stylefeng.guns
     */
    String ROOT_PACKAGE_NAME = GunsApplication.class.getPackage().getName();

    /**
     * 超级管理员的角色编码
     */
    String SUPER_ADMIN_ROLE_CODE = "superAdmin";

    /**
     * 初始化超级管理员的监听器顺序
     */
    Integer SUPER_ADMIN_INIT_LISTENER_SORT = 400;

}
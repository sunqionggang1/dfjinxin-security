/**
 * Copyright (c) 东方金信 All rights reserved.
 *
 * http://www.seaboxdata.com
 *
 * 版权所有，侵权必究！
 */

package io.dfjinxin.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.dfjinxin.common.utils.PageUtils;
import io.dfjinxin.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}

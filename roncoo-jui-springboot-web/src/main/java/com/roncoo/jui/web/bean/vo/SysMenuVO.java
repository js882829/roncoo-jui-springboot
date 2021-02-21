package com.roncoo.jui.web.bean.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单信息
 * </p>
 *
 * @author wujing
 * @since 2017-10-26
 */
@Data
@Accessors(chain = true)
public class SysMenuVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 修改时间
	 */
	private Date gmtModified;
	/**
	 * 状态
	 */
	private String statusId;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 父主键
	 */
	private Long parentId;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 菜单路径
	 */
	private String menuUrl;
	/**
	 * 目标名称
	 */
	private String targetName;
	/**
	 * 菜单图标
	 */
	private String menuIcon;
	/**
	 * 备注
	 */
	private String remark;

	private List<SysMenuVO> list;

	private Integer isShow;

}

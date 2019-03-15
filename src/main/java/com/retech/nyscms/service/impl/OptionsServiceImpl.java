package com.retech.nyscms.service.impl;

import com.retech.nyscms.entity.*;
import com.retech.nyscms.entity.custom.Options;
import com.retech.nyscms.entity.custom.OptionsSearchBean;
import com.retech.nyscms.mapper.*;
import com.retech.nyscms.service.OptionsService;
import com.retech.nyscms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**

 *@description
 
 *@author qinc

 *@date 2018/12/11

 */
@Service
public class OptionsServiceImpl implements OptionsService {

	@Autowired
	private BaseMenusMapper baseMenusMapper;

	@Autowired
	private BaseMgroleMapper baseMgroleMapper;

	@Autowired
	private BaseRolemenuMapper baseRolemenuMapper;

	@Autowired
	private BaseClassesMapper classesMapper;

	@Autowired
	private BaseSeriesMapper seriesMapper;

	public ActionResult getMenuTreeOptionsByRole(OptionsSearchBean optionsSearchBean) {
		int roleId = optionsSearchBean.getRoleId();
		int userid = optionsSearchBean.getUserId();
		BaseMenusExample example = new BaseMenusExample();
		example.createCriteria().andMenuidIsNotNull();
		// 设置id不为空
		example.setOrderByClause("parentmenuid asc,sort asc");
		List<BaseMenus> menuslist = baseMenusMapper.selectByExample(example);
		List<Options> menuTreeList = new ArrayList<Options>();
		if (menuslist != null && menuslist.size() > 0) {
			List<Integer> menuidarr = new ArrayList<Integer>();
			if (roleId > 0 || userid > 0) {
				List<Integer> rolearr = null;
				if (roleId > 0) {
					rolearr = new ArrayList<Integer>();
					rolearr.add(roleId);
				} else {
					BaseMgroleExample mgRoleExample = new BaseMgroleExample();
					mgRoleExample.createCriteria().andUseridEqualTo(userid);
					List<BaseMgrole> mgrolelist = baseMgroleMapper.selectByExample(mgRoleExample);
					if (mgrolelist != null && mgrolelist.size() > 0) {
						rolearr = new ArrayList<>(mgrolelist.size());
						int i = 0;
						for (BaseMgrole mgrole : mgrolelist) {
							rolearr.add(i, mgrole.getRoleid());
						}
					}
				}
				BaseRolemenuExample roleMenuExample = new BaseRolemenuExample();
				roleMenuExample.createCriteria().andRoleidIn(rolearr);
				List<BaseRolemenu> rolemenulist = baseRolemenuMapper.selectByExample(roleMenuExample);
				if (rolemenulist != null && rolemenulist.size() > 0) {
					for (BaseRolemenu rolemenu : rolemenulist)
						menuidarr.add(rolemenu.getMenuid());
				}
			}

			menuTreeList = setMenusChildren(0, menuslist, menuidarr);
		}

		return ActionResult.ok(menuTreeList);
	}

	private List<Options> setMenusChildren(int parentOption, List<BaseMenus> list, List<Integer> rolemenuarr) {
		List<Options> menusChildren = new ArrayList<Options>();
		Options option;
		for (BaseMenus menu : list) {
			Integer menuid = menu.getMenuid();// 获取菜单的id
			Integer parentid = menu.getParentmenuid();// 获取菜单的父id
			if (parentid == parentOption) {
				option = new Options();
				option.setId(menu.getMenuid());
				option.setText(menu.getMenuname());
				option.setSelected(rolemenuarr.contains(menuid));
				menusChildren.add(option);

				List<Options> iterateMenu = setMenusChildren(menuid, list, rolemenuarr);
				if (iterateMenu != null && iterateMenu.size() > 0) {
					option.setChildren(iterateMenu);
				}
			}
		}
		return menusChildren;
	}

	@Override
	public ActionResult getClassTreeOptionsByParent(OptionsSearchBean optionsSearchBean) {
		List<Options> clsTreeList = new ArrayList<>();
		int parentId = optionsSearchBean.getParentId();
		if (parentId < 0){
        	parentId = 0;
        }
		BaseClassesExample example = new BaseClassesExample();
		example.setOrderByClause("parentclassid asc");
		List<BaseClasses> classlist = classesMapper.selectByExample(example);
		if (classlist != null) {
			clsTreeList = setClsChildren(parentId, classlist);
		}
		if(optionsSearchBean.isWithNone()){
        	Options option = new Options();
        	option.setId(-1);
        	option.setText("--请选择--");
        	clsTreeList.add(0,option);
        }
		return ActionResult.ok(clsTreeList);
	}

	@Override
	public ActionResult getSeriesTreeOptionsByParent(OptionsSearchBean optionsSearchBean) {
		int parentId=0;
		List<Options> clsTreeList  = new ArrayList<>();
		BaseSeriesExample example = new BaseSeriesExample();
		example.setOrderByClause("parentserialid asc");
		List<BaseSeries> classlist = seriesMapper.selectByExample(example);
		if (classlist != null){
			clsTreeList = setSeriesChildren(parentId, classlist);
		}
		return ActionResult.ok(clsTreeList);
	}

	private List<Options> setClsChildren(int parentId, List<BaseClasses> list) {
		List<Options> clsChildren = new ArrayList<>();
		for (BaseClasses cls : list) {
			Integer clsid = cls.getClassid();// 获取分类的id
			Integer parentid = cls.getParentclassid();// 获取分类的父id
			if (parentid == parentId) {
				Options option = new Options();
				option.setId(clsid);
				option.setText(cls.getClassname());
				List<Options> iterateCls = setClsChildren(clsid, list);
				if (iterateCls != null && iterateCls.size() > 0) {
					option.setChildren(iterateCls);
				}
				clsChildren.add(option);
			}
		}
		return clsChildren;
	}

	private List<Options> setSeriesChildren(int parentOption, List<BaseSeries> list){
		List<Options> clsChildren = new ArrayList<>();
		for (BaseSeries cls : list){
			Integer clsid = cls.getSerialid();//获取分类的id
			Integer parentid = cls.getParentserialid();//获取分类的父id

			if(parentid == parentOption){
				Options option = new Options();
				option.setId(clsid);
				option.setText(cls.getSerialname());

				List<Options> iterateCls = setSeriesChildren(clsid,list);
				if(iterateCls != null && iterateCls.size() > 0){
					option.setChildren(iterateCls);
				}
				clsChildren.add(option);
			}
		}
		return clsChildren;
	}

}

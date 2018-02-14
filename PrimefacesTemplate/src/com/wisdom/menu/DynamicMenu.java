package com.wisdom.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PRODUCT        : StockManager_V3
 * FUNCTION       : Dynamic Menu
 * AUTHOR         : Asela Liyanage
 * CREATED DATE   : December 2014
 * VERSION        : 3.0
 * REMARKS        : 
 * PROPERTY OF ENSKY IT
 */

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean(name = "DynamicMenu")
@SessionScoped
public class DynamicMenu {

	private MenuModel menuModel;

	public DynamicMenu() throws Exception {
		generateMenuModel();
	}

	public void generateMenuModel() {
		try {

			DefaultSubMenu subMenuHeader = null;
			DefaultSubMenu subMenuDetail = null;
			DefaultMenuItem item = null;

			menuModel = new DefaultMenuModel();

			subMenuHeader = new DefaultSubMenu("Main Menu 1");

			subMenuDetail = new DefaultSubMenu("Sub Menu 1");

			item = new DefaultMenuItem("Link 1");
			item.setUrl("/pages/page1.xhtml?param=page1");
			item.setIcon("ui-icon-disk");
			item.setParam("param1", "value1");
			Map<String, List<String>> params = new HashMap<String, List<String>>();
			List<String> list = new ArrayList<String>();
			list.add("123");
			params.put("abc", list);
			
			item.setParams(params);			
		
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 2");
			item.setUrl("/pages/page2.xhtml?param=page2");
			item.setIcon("ui-icon-check");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 3");
			item.setUrl("/pages/page3.xhtml?param=page3");
			item.setIcon("ui-icon-close");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 4");
			item.setUrl("/pages/page4.xhtml?param=page4");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 5");
			item.setUrl("/pages/page5.xhtml?param=page5");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("pLink 6");
			item.setUrl("/pages/page6.xhtml?param=page6");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			subMenuHeader.addElement(subMenuDetail);

			subMenuDetail = new DefaultSubMenu("Sub Menu 2");

			item = new DefaultMenuItem("Link 1");
			item.setUrl("/pages/page1.xhtml?param=page1");
			item.setIcon("ui-icon-disk");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 2");
			item.setUrl("/pages/page2.xhtml?param=page2");
			item.setIcon("ui-icon-check");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 3");
			item.setUrl("/pages/page3.xhtml?param=page3");
			item.setIcon("ui-icon-close");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 4");
			item.setUrl("/pages/page4.xhtml?param=page4");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 5");
			item.setUrl("/pages/page5.xhtml?param=page5");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("pLink 6");
			item.setUrl("/pages/page6.xhtml?param=page6");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			subMenuHeader.addElement(subMenuDetail);
			menuModel.addElement(subMenuHeader);

			subMenuHeader = new DefaultSubMenu("Main Menu 2");

			subMenuDetail = new DefaultSubMenu("Sub Menu 1");

			item = new DefaultMenuItem("Link 1");
			item.setUrl("/pages/page1.xhtml?param=page1");
			item.setIcon("ui-icon-disk");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 2");
			item.setUrl("/pages/page2.xhtml?param=page2");
			item.setIcon("ui-icon-check");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 3");
			item.setUrl("/pages/page3.xhtml?param=page3");
			item.setIcon("ui-icon-close");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 4");
			item.setUrl("/pages/page4.xhtml?param=page4");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 5");
			item.setUrl("/pages/page5.xhtml?param=page5");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("pLink 6");
			item.setUrl("/pages/page6.xhtml?param=page6");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			subMenuHeader.addElement(subMenuDetail);

			subMenuDetail = new DefaultSubMenu("Sub Menu 2");

			item = new DefaultMenuItem("Link 1");
			item.setUrl("/pages/page1.xhtml?param=page1");
			item.setIcon("ui-icon-disk");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 2");
			item.setUrl("/pages/page2.xhtml?param=page2");
			item.setIcon("ui-icon-check");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 3");
			item.setUrl("/pages/page3.xhtml?param=page3");
			item.setIcon("ui-icon-close");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 4");
			item.setUrl("/pages/page4.xhtml?param=page4");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 5");
			item.setUrl("/pages/page5.xhtml?param=page5");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("pLink 6");
			item.setUrl("/pages/page6.xhtml?param=page6");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			subMenuHeader.addElement(subMenuDetail);
			menuModel.addElement(subMenuHeader);

			subMenuHeader = new DefaultSubMenu("Main Menu 3");

			subMenuDetail = new DefaultSubMenu("Sub Menu 1");

			item = new DefaultMenuItem("Link 1");
			item.setUrl("/pages/page1.xhtml?param=page1");
			item.setIcon("ui-icon-disk");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 2");
			item.setUrl("/pages/page2.xhtml?param=page2");
			item.setIcon("ui-icon-check");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 3");
			item.setUrl("/pages/page3.xhtml?param=page3");
			item.setIcon("ui-icon-close");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 4");
			item.setUrl("/pages/page4.xhtml?param=page4");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 5");
			item.setUrl("/pages/page5.xhtml?param=page5");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("pLink 6");
			item.setUrl("/pages/page6.xhtml?param=page6");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			subMenuHeader.addElement(subMenuDetail);

			subMenuDetail = new DefaultSubMenu("Sub Menu 2");

			item = new DefaultMenuItem("Link 1");
			item.setUrl("/pages/page1.xhtml?param=page1");
			item.setIcon("ui-icon-disk");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 2");
			item.setUrl("/pages/page2.xhtml?param=page2");
			item.setIcon("ui-icon-check");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 3");
			item.setUrl("/pages/page3.xhtml?param=page3");
			item.setIcon("ui-icon-close");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 4");
			item.setUrl("/pages/page4.xhtml?param=page4");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("Link 5");
			item.setUrl("/pages/page5.xhtml?param=page5");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			item = new DefaultMenuItem("pLink 6");
			item.setUrl("/pages/page6.xhtml?param=page6");
			item.setIcon("ui-icon-search");
			item.setAjax(false);
			subMenuDetail.addElement(item);

			subMenuHeader.addElement(subMenuDetail);
			menuModel.addElement(subMenuHeader);

		} catch (Exception e) {

			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Internal Error", "");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public MenuModel getMenuModel() {
		return menuModel;
	}

	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}
}
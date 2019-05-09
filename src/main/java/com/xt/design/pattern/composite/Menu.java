package com.xt.design.pattern.composite;

import java.util.List;

/**
 * 菜单项
 *
 * @author wangxiaoteng
 * @date 2019/5/7 16:03
 */

public class Menu {

  public Menu() {
  }

  public Menu(String name, List<Menu> subMenuList) {
    this.name = name;
    this.subMenuList = subMenuList;
  }

  /**
   * 菜单名称
   */
  private String name;

  /**
   * 子菜单
   */
  private List<Menu> subMenuList;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Menu> getSubMenuList() {
    return subMenuList;
  }

  public void setSubMenuList(List<Menu> subMenuList) {
    this.subMenuList = subMenuList;
  }
}

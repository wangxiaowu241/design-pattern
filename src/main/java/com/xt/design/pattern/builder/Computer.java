package com.xt.design.pattern.builder;

/**
 * 电脑-构造的产品类
 *
 * @author wangxiaoteng
 * @date 2019/4/30 14:55
 */
public class Computer {

  /**
   * CPU
   */
  private String cpu;

  /**
   * 主板
   */
  private String mainBoard;

  /**
   * 内存
   */
  private String memory;

  /**
   * 硬盘
   */
  private String hardDisk;

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getMainBoard() {
    return mainBoard;
  }

  public void setMainBoard(String mainBoard) {
    this.mainBoard = mainBoard;
  }

  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  public String getHardDisk() {
    return hardDisk;
  }

  public void setHardDisk(String hardDisk) {
    this.hardDisk = hardDisk;
  }
}

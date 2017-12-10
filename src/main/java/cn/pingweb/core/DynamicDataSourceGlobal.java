package cn.pingweb.core;

//定义枚举类型，读写
public enum DynamicDataSourceGlobal {
    READ("读"), WRITE("写");
    String msg;

    DynamicDataSourceGlobal(String msg) {
        this.msg = msg;
    }
}
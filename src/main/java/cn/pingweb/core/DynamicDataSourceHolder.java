package cn.pingweb.core;

public class DynamicDataSourceHolder {

    private static final ThreadLocal<DynamicDataSourceGlobal> HOLDER = new ThreadLocal<DynamicDataSourceGlobal>();

    public static void putDataSource(DynamicDataSourceGlobal dataSource){
        HOLDER.set(dataSource);
    }

    public static DynamicDataSourceGlobal getDataSource(){
        return HOLDER.get();
    }

    public static void clearDataSource() {
        HOLDER.remove();
    }

}


package com.example.dllo.lexuebdemo.sql;

import com.example.dllo.lexuebdemo.utils.MyApp;
import com.litesuits.orm.LiteOrm;
import com.litesuits.orm.db.assit.QueryBuilder;
import com.litesuits.orm.db.assit.WhereBuilder;
import com.litesuits.orm.db.enums.Strategy;
import com.litesuits.orm.db.model.ColumnsValue;
import com.litesuits.orm.db.model.ConflictAlgorithm;

import java.util.List;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/

public class DatabaseManager {

    private static LiteOrm liteOrm;
    private static DatabaseManager ourInstance = new DatabaseManager();

    private DatabaseManager() {
        liteOrm = LiteOrm.newSingleInstance(MyApp.getContext(), "lexue.db");
    }

    public static DatabaseManager getInstance() {
        return ourInstance;
    }

    /**
     * 插入一条记录
     *
     * @param t
     */
    public <T> long insert(T t) {
        return liteOrm.insert(t);
    }

    /**
     * 插入所有记录
     *
     * @param list
     */
    public <T> void insertAll(List<T> list) {
        liteOrm.insert(list);
    }

    /**
     * 查询所有
     *
     * @param cla
     * @return
     */
    public <T> List<T> getQueryAll(Class<T> cla) {
        return liteOrm.query(cla);
    }

    /**
     * 查询  某字段 等于 Value的值
     *
     * @param cla
     * @param field
     * @param value
     * @return
     */
<<<<<<< HEAD
//    public <T> List<T> getQueryByWhere(Class<T> cla, String field, String[] value) {
//        return liteOrm.<T>query(new QueryBuilder(cla).where(field + "=?",   value));
//    }
=======
    public <T> List<T> getQueryByWhere(Class<T> cla, String field, String value) {
        return liteOrm.<T>query(new QueryBuilder(cla).where(field + "=?", value));
    }
>>>>>>> 98416f36d1fa6a1c1e9216d2c78e7ae0628cbd15

    /**
     * 查询  某字段
     *
     */
<<<<<<< HEAD
//    public <T> List<T> getQueryByWhereLength(Class<T> cla, String field, String[] value, int start, int length) {
//        return liteOrm.<T>query(new QueryBuilder(cla).where(field + "=?", value).limit(start, length));
//    }
=======
    public <T> List<T> getQueryByWhereLength(Class<T> cla, String field, String value, int start, int length) {
        MyThreadPool.getInstance().getThreadPoolExecutor().execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        return liteOrm.<T>query(new QueryBuilder(cla).where(field + "=?", value).limit(start, length));
    }
>>>>>>> 98416f36d1fa6a1c1e9216d2c78e7ae0628cbd15

    public <T> int update(Class<T> tClass, String where, String[] args, String[] args2, String[]args3){
        return liteOrm.update(new WhereBuilder(tClass, where, args),
                new ColumnsValue(args2, args3)
                , ConflictAlgorithm.None);
    }


    /**
     * 删除一个数据
     *
     * @param t
     * @param <T>
     */
    public <T> void delete(T t) {
        liteOrm.delete(t);
    }

    /**
     * 删除一个表
     *
     * @param cla
     * @param <T>
     */

    public <T> void delete(Class<T> cla) {
        liteOrm.delete(cla);
    }

    /**
     * 删除集合中的数据
     *
     * @param list
     * @param <T>
     */
    public <T> void deleteList(List<T> list) {
        liteOrm.delete(list);
    }


    /**
     * 删除数据库
     */
    public void deleteDatabase() {
        liteOrm.deleteDatabase();
    }

}


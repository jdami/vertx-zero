/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.domain.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import up.god.jooq.domain.DbHtl;
import up.god.jooq.domain.Indexes;
import up.god.jooq.domain.Keys;
import up.god.jooq.domain.tables.records.SecUserRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecUser extends TableImpl<SecUserRecord> {

    private static final long serialVersionUID = 1753266171;

    /**
     * The reference instance of <code>DB_HTL.SEC_USER</code>
     */
    public static final SecUser SEC_USER = new SecUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecUserRecord> getRecordType() {
        return SecUserRecord.class;
    }

    /**
     * The column <code>DB_HTL.SEC_USER.PK_ID</code>. uniqueId,PK_ID
     */
    public final TableField<SecUserRecord, String> PK_ID = createField("PK_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "uniqueId,PK_ID");

    /**
     * The column <code>DB_HTL.SEC_USER.S_CODE</code>. code,S_CODE
     */
    public final TableField<SecUserRecord, String> S_CODE = createField("S_CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "code,S_CODE");

    /**
     * The column <code>DB_HTL.SEC_USER.S_ALIPAY</code>. 支付宝,alipay,S_ALIPAY
     */
    public final TableField<SecUserRecord, String> S_ALIPAY = createField("S_ALIPAY", org.jooq.impl.SQLDataType.VARCHAR(72), this, "支付宝,alipay,S_ALIPAY");

    /**
     * The column <code>DB_HTL.SEC_USER.S_EMAIL</code>. 个人Email,email,S_EMAIL
     */
    public final TableField<SecUserRecord, String> S_EMAIL = createField("S_EMAIL", org.jooq.impl.SQLDataType.VARCHAR(72), this, "个人Email,email,S_EMAIL");

    /**
     * The column <code>DB_HTL.SEC_USER.S_MOBILE</code>. 手机号,mobile,S_MOBILE
     */
    public final TableField<SecUserRecord, String> S_MOBILE = createField("S_MOBILE", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "手机号,mobile,S_MOBILE");

    /**
     * The column <code>DB_HTL.SEC_USER.S_PASSWORD</code>. 登陆口令/密码,password,S_PASSWORD
     */
    public final TableField<SecUserRecord, String> S_PASSWORD = createField("S_PASSWORD", org.jooq.impl.SQLDataType.VARCHAR(255), this, "登陆口令/密码,password,S_PASSWORD");

    /**
     * The column <code>DB_HTL.SEC_USER.S_QQ</code>. 个人QQ号,qq,S_QQ
     */
    public final TableField<SecUserRecord, String> S_QQ = createField("S_QQ", org.jooq.impl.SQLDataType.VARCHAR(10), this, "个人QQ号,qq,S_QQ");

    /**
     * The column <code>DB_HTL.SEC_USER.S_SECRET</code>. 专用私钥，OAuth中也可用,secret,S_SECRET
     */
    public final TableField<SecUserRecord, String> S_SECRET = createField("S_SECRET", org.jooq.impl.SQLDataType.VARCHAR(255), this, "专用私钥，OAuth中也可用,secret,S_SECRET");

    /**
     * The column <code>DB_HTL.SEC_USER.S_TAOBAO</code>. 淘宝,taobao,S_TAOBAO
     */
    public final TableField<SecUserRecord, String> S_TAOBAO = createField("S_TAOBAO", org.jooq.impl.SQLDataType.VARCHAR(72), this, "淘宝,taobao,S_TAOBAO");

    /**
     * The column <code>DB_HTL.SEC_USER.S_USERNAME</code>. 登陆账号,username,S_USERNAME
     */
    public final TableField<SecUserRecord, String> S_USERNAME = createField("S_USERNAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "登陆账号,username,S_USERNAME");

    /**
     * The column <code>DB_HTL.SEC_USER.S_WECHAT</code>. 微信账号,wechat,S_WECHAT
     */
    public final TableField<SecUserRecord, String> S_WECHAT = createField("S_WECHAT", org.jooq.impl.SQLDataType.VARCHAR(64), this, "微信账号,wechat,S_WECHAT");

    /**
     * The column <code>DB_HTL.SEC_USER.S_WEIBO</code>. 微博账号,weibo,S_WEIBO
     */
    public final TableField<SecUserRecord, String> S_WEIBO = createField("S_WEIBO", org.jooq.impl.SQLDataType.VARCHAR(64), this, "微博账号,weibo,S_WEIBO");

    /**
     * The column <code>DB_HTL.SEC_USER.J_CONFIG</code>. config,J_CONFIG
     */
    public final TableField<SecUserRecord, String> J_CONFIG = createField("J_CONFIG", org.jooq.impl.SQLDataType.CLOB, this, "config,J_CONFIG");

    /**
     * The column <code>DB_HTL.SEC_USER.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public final TableField<SecUserRecord, Boolean> IS_ACTIVE = createField("IS_ACTIVE", org.jooq.impl.SQLDataType.BOOLEAN, this, "active,IS_ACTIVE");

    /**
     * The column <code>DB_HTL.SEC_USER.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public final TableField<SecUserRecord, String> Z_SIGMA = createField("Z_SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "sigma,Z_SIGMA");

    /**
     * The column <code>DB_HTL.SEC_USER.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public final TableField<SecUserRecord, String> Z_LANGUAGE = createField("Z_LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "language,Z_LANGUAGE");

    /**
     * The column <code>DB_HTL.SEC_USER.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public final TableField<SecUserRecord, String> Z_CREATE_BY = createField("Z_CREATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "createBy,Z_CREATE_BY");

    /**
     * The column <code>DB_HTL.SEC_USER.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public final TableField<SecUserRecord, Timestamp> Z_CREATE_TIME = createField("Z_CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "createTime,Z_CREATE_TIME");

    /**
     * The column <code>DB_HTL.SEC_USER.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public final TableField<SecUserRecord, String> Z_UPDATE_BY = createField("Z_UPDATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "updateBy,Z_UPDATE_BY");

    /**
     * The column <code>DB_HTL.SEC_USER.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public final TableField<SecUserRecord, Timestamp> Z_UPDATE_TIME = createField("Z_UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "updateTime,Z_UPDATE_TIME");

    /**
     * Create a <code>DB_HTL.SEC_USER</code> table reference
     */
    public SecUser() {
        this(DSL.name("SEC_USER"), null);
    }

    /**
     * Create an aliased <code>DB_HTL.SEC_USER</code> table reference
     */
    public SecUser(String alias) {
        this(DSL.name(alias), SEC_USER);
    }

    /**
     * Create an aliased <code>DB_HTL.SEC_USER</code> table reference
     */
    public SecUser(Name alias) {
        this(alias, SEC_USER);
    }

    private SecUser(Name alias, Table<SecUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private SecUser(Name alias, Table<SecUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbHtl.DB_HTL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SEC_USER_PRIMARY, Indexes.SEC_USER_UK_SEC_USER_S_ALIPAY_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_CODE_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_EMAIL_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_MOBILE_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_QQ_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_TAOBAO_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_USERNAME_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_WECHAT_Z_SIGMA, Indexes.SEC_USER_UK_SEC_USER_S_WEIBO_Z_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SecUserRecord> getPrimaryKey() {
        return Keys.KEY_SEC_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SecUserRecord>> getKeys() {
        return Arrays.<UniqueKey<SecUserRecord>>asList(Keys.KEY_SEC_USER_PRIMARY, Keys.KEY_SEC_USER_UK_SEC_USER_S_CODE_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_ALIPAY_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_EMAIL_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_MOBILE_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_QQ_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_TAOBAO_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_USERNAME_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_WECHAT_Z_SIGMA, Keys.KEY_SEC_USER_UK_SEC_USER_S_WEIBO_Z_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecUser as(String alias) {
        return new SecUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecUser as(Name alias) {
        return new SecUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecUser rename(String name) {
        return new SecUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SecUser rename(Name name) {
        return new SecUser(name, null);
    }
}

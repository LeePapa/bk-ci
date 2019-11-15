/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.image.tables;


import com.tencent.devops.model.image.DevopsImage;
import com.tencent.devops.model.image.Keys;
import com.tencent.devops.model.image.tables.records.TUploadImageTaskRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUploadImageTask extends TableImpl<TUploadImageTaskRecord> {

    private static final long serialVersionUID = 138160194;

    /**
     * The reference instance of <code>devops_image.T_UPLOAD_IMAGE_TASK</code>
     */
    public static final TUploadImageTask T_UPLOAD_IMAGE_TASK = new TUploadImageTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUploadImageTaskRecord> getRecordType() {
        return TUploadImageTaskRecord.class;
    }

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.TASK_ID</code>.
     */
    public final TableField<TUploadImageTaskRecord, String> TASK_ID = createField("TASK_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.PROJECT_ID</code>.
     */
    public final TableField<TUploadImageTaskRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.OPERATOR</code>.
     */
    public final TableField<TUploadImageTaskRecord, String> OPERATOR = createField("OPERATOR", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.CREATED_TIME</code>.
     */
    public final TableField<TUploadImageTaskRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.UPDATED_TIME</code>.
     */
    public final TableField<TUploadImageTaskRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.TASK_STATUS</code>.
     */
    public final TableField<TUploadImageTaskRecord, String> TASK_STATUS = createField("TASK_STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.TASK_MESSAGE</code>.
     */
    public final TableField<TUploadImageTaskRecord, String> TASK_MESSAGE = createField("TASK_MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>devops_image.T_UPLOAD_IMAGE_TASK.IMAGE_DATA</code>.
     */
    public final TableField<TUploadImageTaskRecord, String> IMAGE_DATA = createField("IMAGE_DATA", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>devops_image.T_UPLOAD_IMAGE_TASK</code> table reference
     */
    public TUploadImageTask() {
        this("T_UPLOAD_IMAGE_TASK", null);
    }

    /**
     * Create an aliased <code>devops_image.T_UPLOAD_IMAGE_TASK</code> table reference
     */
    public TUploadImageTask(String alias) {
        this(alias, T_UPLOAD_IMAGE_TASK);
    }

    private TUploadImageTask(String alias, Table<TUploadImageTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUploadImageTask(String alias, Table<TUploadImageTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsImage.DEVOPS_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TUploadImageTaskRecord> getPrimaryKey() {
        return Keys.KEY_T_UPLOAD_IMAGE_TASK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TUploadImageTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TUploadImageTaskRecord>>asList(Keys.KEY_T_UPLOAD_IMAGE_TASK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUploadImageTask as(String alias) {
        return new TUploadImageTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUploadImageTask rename(String name) {
        return new TUploadImageTask(name, null);
    }
}
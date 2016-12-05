package info.kimjihyok.new_york_times_client.db;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import info.kimjihyok.new_york_times_client.db.Multimedia;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MULTIMEDIA".
*/
public class MultimediaDao extends AbstractDao<Multimedia, Long> {

    public static final String TABLENAME = "MULTIMEDIA";

    /**
     * Properties of entity Multimedia.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Url = new Property(1, String.class, "url", false, "URL");
        public final static Property Format = new Property(2, String.class, "format", false, "FORMAT");
        public final static Property Height = new Property(3, Integer.class, "height", false, "HEIGHT");
        public final static Property Width = new Property(4, Integer.class, "width", false, "WIDTH");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
        public final static Property Subtype = new Property(6, String.class, "subtype", false, "SUBTYPE");
        public final static Property Caption = new Property(7, String.class, "caption", false, "CAPTION");
        public final static Property Copyright = new Property(8, String.class, "copyright", false, "COPYRIGHT");
        public final static Property Post_url = new Property(9, String.class, "post_url", false, "POST_URL");
    };

    private DaoSession daoSession;


    public MultimediaDao(DaoConfig config) {
        super(config);
    }
    
    public MultimediaDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MULTIMEDIA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"URL\" TEXT," + // 1: url
                "\"FORMAT\" TEXT," + // 2: format
                "\"HEIGHT\" INTEGER," + // 3: height
                "\"WIDTH\" INTEGER," + // 4: width
                "\"TYPE\" TEXT," + // 5: type
                "\"SUBTYPE\" TEXT," + // 6: subtype
                "\"CAPTION\" TEXT," + // 7: caption
                "\"COPYRIGHT\" TEXT," + // 8: copyright
                "\"POST_URL\" TEXT NOT NULL );"); // 9: post_url
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MULTIMEDIA\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Multimedia entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }
 
        String format = entity.getFormat();
        if (format != null) {
            stmt.bindString(3, format);
        }
 
        Integer height = entity.getHeight();
        if (height != null) {
            stmt.bindLong(4, height);
        }
 
        Integer width = entity.getWidth();
        if (width != null) {
            stmt.bindLong(5, width);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
 
        String subtype = entity.getSubtype();
        if (subtype != null) {
            stmt.bindString(7, subtype);
        }
 
        String caption = entity.getCaption();
        if (caption != null) {
            stmt.bindString(8, caption);
        }
 
        String copyright = entity.getCopyright();
        if (copyright != null) {
            stmt.bindString(9, copyright);
        }
        stmt.bindString(10, entity.getPost_url());
    }

    @Override
    protected void attachEntity(Multimedia entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Multimedia readEntity(Cursor cursor, int offset) {
        Multimedia entity = new Multimedia( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // url
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // format
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // height
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // width
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // type
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // subtype
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // caption
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // copyright
            cursor.getString(offset + 9) // post_url
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Multimedia entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUrl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFormat(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setHeight(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setWidth(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSubtype(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCaption(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCopyright(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPost_url(cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Multimedia entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Multimedia entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getPostItemDao().getAllColumns());
            builder.append(" FROM MULTIMEDIA T");
            builder.append(" LEFT JOIN POST_ITEM T0 ON T.\"POST_URL\"=T0.\"URL\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Multimedia loadCurrentDeep(Cursor cursor, boolean lock) {
        Multimedia entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        PostItem postItem = loadCurrentOther(daoSession.getPostItemDao(), cursor, offset);
         if(postItem != null) {
            entity.setPostItem(postItem);
        }

        return entity;    
    }

    public Multimedia loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Multimedia> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Multimedia> list = new ArrayList<Multimedia>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Multimedia> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Multimedia> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}

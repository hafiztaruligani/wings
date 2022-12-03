package com.hafiztaruligani.wings.data.local.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ProductDao _productDao;

  private volatile UserDao _userDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `product` (`product_code` TEXT NOT NULL, `product_name` TEXT NOT NULL, `price` INTEGER NOT NULL, `currency` TEXT NOT NULL, `discount` INTEGER NOT NULL, `dimension` TEXT NOT NULL, `unit` TEXT NOT NULL, PRIMARY KEY(`product_code`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `login` (`user` TEXT NOT NULL, `password` TEXT NOT NULL, PRIMARY KEY(`user`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transaction_detail` (`product_code` TEXT NOT NULL, `document_number` INTEGER NOT NULL, `document_code` TEXT NOT NULL, `produceName` TEXT NOT NULL, `price` INTEGER NOT NULL, `quantity` INTEGER NOT NULL, `unit` TEXT NOT NULL, `currency` TEXT NOT NULL, `subTotal` INTEGER NOT NULL, PRIMARY KEY(`product_code`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transaction_header` (`document_number` INTEGER NOT NULL, `document_code` TEXT NOT NULL, `user` TEXT NOT NULL, `total` INTEGER NOT NULL, `date` TEXT NOT NULL, PRIMARY KEY(`document_number`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3df72b19fae00019dc7a1ab02e6f29e3')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `product`");
        _db.execSQL("DROP TABLE IF EXISTS `login`");
        _db.execSQL("DROP TABLE IF EXISTS `transaction_detail`");
        _db.execSQL("DROP TABLE IF EXISTS `transaction_header`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProduct = new HashMap<String, TableInfo.Column>(7);
        _columnsProduct.put("product_code", new TableInfo.Column("product_code", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("discount", new TableInfo.Column("discount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("dimension", new TableInfo.Column("dimension", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("unit", new TableInfo.Column("unit", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProduct = new TableInfo("product", _columnsProduct, _foreignKeysProduct, _indicesProduct);
        final TableInfo _existingProduct = TableInfo.read(_db, "product");
        if (! _infoProduct.equals(_existingProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "product(com.hafiztaruligani.wings.data.local.room.entity.ProductEntity).\n"
                  + " Expected:\n" + _infoProduct + "\n"
                  + " Found:\n" + _existingProduct);
        }
        final HashMap<String, TableInfo.Column> _columnsLogin = new HashMap<String, TableInfo.Column>(2);
        _columnsLogin.put("user", new TableInfo.Column("user", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogin.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLogin = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLogin = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLogin = new TableInfo("login", _columnsLogin, _foreignKeysLogin, _indicesLogin);
        final TableInfo _existingLogin = TableInfo.read(_db, "login");
        if (! _infoLogin.equals(_existingLogin)) {
          return new RoomOpenHelper.ValidationResult(false, "login(com.hafiztaruligani.wings.data.local.room.entity.LoginEntity).\n"
                  + " Expected:\n" + _infoLogin + "\n"
                  + " Found:\n" + _existingLogin);
        }
        final HashMap<String, TableInfo.Column> _columnsTransactionDetail = new HashMap<String, TableInfo.Column>(9);
        _columnsTransactionDetail.put("product_code", new TableInfo.Column("product_code", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("document_number", new TableInfo.Column("document_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("document_code", new TableInfo.Column("document_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("produceName", new TableInfo.Column("produceName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("unit", new TableInfo.Column("unit", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionDetail.put("subTotal", new TableInfo.Column("subTotal", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactionDetail = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTransactionDetail = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransactionDetail = new TableInfo("transaction_detail", _columnsTransactionDetail, _foreignKeysTransactionDetail, _indicesTransactionDetail);
        final TableInfo _existingTransactionDetail = TableInfo.read(_db, "transaction_detail");
        if (! _infoTransactionDetail.equals(_existingTransactionDetail)) {
          return new RoomOpenHelper.ValidationResult(false, "transaction_detail(com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity).\n"
                  + " Expected:\n" + _infoTransactionDetail + "\n"
                  + " Found:\n" + _existingTransactionDetail);
        }
        final HashMap<String, TableInfo.Column> _columnsTransactionHeader = new HashMap<String, TableInfo.Column>(5);
        _columnsTransactionHeader.put("document_number", new TableInfo.Column("document_number", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionHeader.put("document_code", new TableInfo.Column("document_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionHeader.put("user", new TableInfo.Column("user", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionHeader.put("total", new TableInfo.Column("total", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionHeader.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactionHeader = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTransactionHeader = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransactionHeader = new TableInfo("transaction_header", _columnsTransactionHeader, _foreignKeysTransactionHeader, _indicesTransactionHeader);
        final TableInfo _existingTransactionHeader = TableInfo.read(_db, "transaction_header");
        if (! _infoTransactionHeader.equals(_existingTransactionHeader)) {
          return new RoomOpenHelper.ValidationResult(false, "transaction_header(com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity).\n"
                  + " Expected:\n" + _infoTransactionHeader + "\n"
                  + " Found:\n" + _existingTransactionHeader);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3df72b19fae00019dc7a1ab02e6f29e3", "27c9543f67c9562a6c467f4018fb9645");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "product","login","transaction_detail","transaction_header");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `product`");
      _db.execSQL("DELETE FROM `login`");
      _db.execSQL("DELETE FROM `transaction_detail`");
      _db.execSQL("DELETE FROM `transaction_header`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ProductDao.class, ProductDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ProductDao productDao() {
    if (_productDao != null) {
      return _productDao;
    } else {
      synchronized(this) {
        if(_productDao == null) {
          _productDao = new ProductDao_Impl(this);
        }
        return _productDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }
}

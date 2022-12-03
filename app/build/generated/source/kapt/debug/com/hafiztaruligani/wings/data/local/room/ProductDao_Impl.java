package com.hafiztaruligani.wings.data.local.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hafiztaruligani.wings.data.local.room.entity.ProductEntity;
import com.hafiztaruligani.wings.data.local.room.entity.TransactionDetailEntity;
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderEntity;
import com.hafiztaruligani.wings.data.local.room.entity.TransactionHeaderWithDetail;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  private final EntityInsertionAdapter<TransactionHeaderEntity> __insertionAdapterOfTransactionHeaderEntity;

  private final EntityInsertionAdapter<TransactionDetailEntity> __insertionAdapterOfTransactionDetailEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateQuantity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSubTotal;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `product` (`product_code`,`product_name`,`price`,`currency`,`discount`,`dimension`,`unit`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getProductCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getProductCode());
        }
        if (value.getProductName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProductName());
        }
        stmt.bindLong(3, value.getPrice());
        if (value.getCurrency() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCurrency());
        }
        stmt.bindLong(5, value.getDiscount());
        if (value.getDimension() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDimension());
        }
        if (value.getUnit() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUnit());
        }
      }
    };
    this.__insertionAdapterOfTransactionHeaderEntity = new EntityInsertionAdapter<TransactionHeaderEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `transaction_header` (`document_number`,`document_code`,`user`,`total`,`date`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionHeaderEntity value) {
        stmt.bindLong(1, value.getDocumentNumber());
        if (value.getDocumentCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDocumentCode());
        }
        if (value.getUser() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUser());
        }
        stmt.bindLong(4, value.getTotal());
        if (value.getDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDate());
        }
      }
    };
    this.__insertionAdapterOfTransactionDetailEntity = new EntityInsertionAdapter<TransactionDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `transaction_detail` (`product_code`,`document_number`,`document_code`,`produceName`,`price`,`quantity`,`unit`,`currency`,`subTotal`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionDetailEntity value) {
        if (value.getProductCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getProductCode());
        }
        stmt.bindLong(2, value.getDocumentNumber());
        if (value.getDocumentCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDocumentCode());
        }
        if (value.getProduceName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProduceName());
        }
        stmt.bindLong(5, value.getPrice());
        stmt.bindLong(6, value.getQuantity());
        if (value.getUnit() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUnit());
        }
        if (value.getCurrency() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCurrency());
        }
        stmt.bindLong(9, value.getSubTotal());
      }
    };
    this.__preparedStmtOfUpdateQuantity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE transaction_detail SET quantity=? WHERE product_code=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSubTotal = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE transaction_detail SET subTotal=? WHERE product_code=?";
        return _query;
      }
    };
  }

  @Override
  public Object insertProducts(final List<ProductEntity> data,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertTransactionHeader(final TransactionHeaderEntity transactionHeader,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTransactionHeaderEntity.insert(transactionHeader);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void insertTransactionDetail(final TransactionDetailEntity data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTransactionDetailEntity.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object updateQuantity(final String productCode, final int quantity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateQuantity.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, quantity);
        _argIndex = 2;
        if (productCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, productCode);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateQuantity.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object updateSubTotal(final String productCode, final int subTotal,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSubTotal.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, subTotal);
        _argIndex = 2;
        if (productCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, productCode);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateSubTotal.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<ProductEntity>> getProducts() {
    final String _sql = "SELECT * FROM product";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"product"}, new Callable<List<ProductEntity>>() {
      @Override
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "product_code");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
          final int _cursorIndexOfDimension = CursorUtil.getColumnIndexOrThrow(_cursor, "dimension");
          final int _cursorIndexOfUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "unit");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductCode;
            if (_cursor.isNull(_cursorIndexOfProductCode)) {
              _tmpProductCode = null;
            } else {
              _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
            }
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final int _tmpDiscount;
            _tmpDiscount = _cursor.getInt(_cursorIndexOfDiscount);
            final String _tmpDimension;
            if (_cursor.isNull(_cursorIndexOfDimension)) {
              _tmpDimension = null;
            } else {
              _tmpDimension = _cursor.getString(_cursorIndexOfDimension);
            }
            final String _tmpUnit;
            if (_cursor.isNull(_cursorIndexOfUnit)) {
              _tmpUnit = null;
            } else {
              _tmpUnit = _cursor.getString(_cursorIndexOfUnit);
            }
            _item = new ProductEntity(_tmpProductCode,_tmpProductName,_tmpPrice,_tmpCurrency,_tmpDiscount,_tmpDimension,_tmpUnit);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionHeaderEntity>> getTransactionHeader() {
    final String _sql = "SELECT * FROM transaction_header";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_header"}, new Callable<List<TransactionHeaderEntity>>() {
      @Override
      public List<TransactionHeaderEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDocumentNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "document_number");
          final int _cursorIndexOfDocumentCode = CursorUtil.getColumnIndexOrThrow(_cursor, "document_code");
          final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
          final int _cursorIndexOfTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "total");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final List<TransactionHeaderEntity> _result = new ArrayList<TransactionHeaderEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionHeaderEntity _item;
            final int _tmpDocumentNumber;
            _tmpDocumentNumber = _cursor.getInt(_cursorIndexOfDocumentNumber);
            final String _tmpDocumentCode;
            if (_cursor.isNull(_cursorIndexOfDocumentCode)) {
              _tmpDocumentCode = null;
            } else {
              _tmpDocumentCode = _cursor.getString(_cursorIndexOfDocumentCode);
            }
            final String _tmpUser;
            if (_cursor.isNull(_cursorIndexOfUser)) {
              _tmpUser = null;
            } else {
              _tmpUser = _cursor.getString(_cursorIndexOfUser);
            }
            final int _tmpTotal;
            _tmpTotal = _cursor.getInt(_cursorIndexOfTotal);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            _item = new TransactionHeaderEntity(_tmpDocumentNumber,_tmpDocumentCode,_tmpUser,_tmpTotal,_tmpDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDetailEntity>> getTransactionDetail(final int documentNumber) {
    final String _sql = "SELECT * FROM transaction_detail WHERE document_number=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, documentNumber);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_detail"}, new Callable<List<TransactionDetailEntity>>() {
      @Override
      public List<TransactionDetailEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "product_code");
          final int _cursorIndexOfDocumentNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "document_number");
          final int _cursorIndexOfDocumentCode = CursorUtil.getColumnIndexOrThrow(_cursor, "document_code");
          final int _cursorIndexOfProduceName = CursorUtil.getColumnIndexOrThrow(_cursor, "produceName");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "unit");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfSubTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subTotal");
          final List<TransactionDetailEntity> _result = new ArrayList<TransactionDetailEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDetailEntity _item;
            final String _tmpProductCode;
            if (_cursor.isNull(_cursorIndexOfProductCode)) {
              _tmpProductCode = null;
            } else {
              _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
            }
            final int _tmpDocumentNumber;
            _tmpDocumentNumber = _cursor.getInt(_cursorIndexOfDocumentNumber);
            final String _tmpDocumentCode;
            if (_cursor.isNull(_cursorIndexOfDocumentCode)) {
              _tmpDocumentCode = null;
            } else {
              _tmpDocumentCode = _cursor.getString(_cursorIndexOfDocumentCode);
            }
            final String _tmpProduceName;
            if (_cursor.isNull(_cursorIndexOfProduceName)) {
              _tmpProduceName = null;
            } else {
              _tmpProduceName = _cursor.getString(_cursorIndexOfProduceName);
            }
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final String _tmpUnit;
            if (_cursor.isNull(_cursorIndexOfUnit)) {
              _tmpUnit = null;
            } else {
              _tmpUnit = _cursor.getString(_cursorIndexOfUnit);
            }
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final int _tmpSubTotal;
            _tmpSubTotal = _cursor.getInt(_cursorIndexOfSubTotal);
            _item = new TransactionDetailEntity(_tmpProductCode,_tmpDocumentNumber,_tmpDocumentCode,_tmpProduceName,_tmpPrice,_tmpQuantity,_tmpUnit,_tmpCurrency,_tmpSubTotal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<TransactionHeaderWithDetail> getTransactionHeaderWithDetail(
      final int documentNumber) {
    final String _sql = "SELECT * FROM transaction_header WHERE document_number=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, documentNumber);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"transaction_detail","transaction_header"}, new Callable<TransactionHeaderWithDetail>() {
      @Override
      public TransactionHeaderWithDetail call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfDocumentNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "document_number");
            final int _cursorIndexOfDocumentCode = CursorUtil.getColumnIndexOrThrow(_cursor, "document_code");
            final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
            final int _cursorIndexOfTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "total");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final LongSparseArray<ArrayList<TransactionDetailEntity>> _collectionDetailEntity = new LongSparseArray<ArrayList<TransactionDetailEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfDocumentNumber);
              ArrayList<TransactionDetailEntity> _tmpDetailEntityCollection = _collectionDetailEntity.get(_tmpKey);
              if (_tmpDetailEntityCollection == null) {
                _tmpDetailEntityCollection = new ArrayList<TransactionDetailEntity>();
                _collectionDetailEntity.put(_tmpKey, _tmpDetailEntityCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiptransactionDetailAscomHafiztaruliganiWingsDataLocalRoomEntityTransactionDetailEntity(_collectionDetailEntity);
            final TransactionHeaderWithDetail _result;
            if(_cursor.moveToFirst()) {
              final TransactionHeaderEntity _tmpTransactionHeaderEntity;
              if (! (_cursor.isNull(_cursorIndexOfDocumentNumber) && _cursor.isNull(_cursorIndexOfDocumentCode) && _cursor.isNull(_cursorIndexOfUser) && _cursor.isNull(_cursorIndexOfTotal) && _cursor.isNull(_cursorIndexOfDate))) {
                final int _tmpDocumentNumber;
                _tmpDocumentNumber = _cursor.getInt(_cursorIndexOfDocumentNumber);
                final String _tmpDocumentCode;
                if (_cursor.isNull(_cursorIndexOfDocumentCode)) {
                  _tmpDocumentCode = null;
                } else {
                  _tmpDocumentCode = _cursor.getString(_cursorIndexOfDocumentCode);
                }
                final String _tmpUser;
                if (_cursor.isNull(_cursorIndexOfUser)) {
                  _tmpUser = null;
                } else {
                  _tmpUser = _cursor.getString(_cursorIndexOfUser);
                }
                final int _tmpTotal;
                _tmpTotal = _cursor.getInt(_cursorIndexOfTotal);
                final String _tmpDate;
                if (_cursor.isNull(_cursorIndexOfDate)) {
                  _tmpDate = null;
                } else {
                  _tmpDate = _cursor.getString(_cursorIndexOfDate);
                }
                _tmpTransactionHeaderEntity = new TransactionHeaderEntity(_tmpDocumentNumber,_tmpDocumentCode,_tmpUser,_tmpTotal,_tmpDate);
              }  else  {
                _tmpTransactionHeaderEntity = null;
              }
              ArrayList<TransactionDetailEntity> _tmpDetailEntityCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfDocumentNumber);
              _tmpDetailEntityCollection_1 = _collectionDetailEntity.get(_tmpKey_1);
              if (_tmpDetailEntityCollection_1 == null) {
                _tmpDetailEntityCollection_1 = new ArrayList<TransactionDetailEntity>();
              }
              _result = new TransactionHeaderWithDetail(_tmpTransactionHeaderEntity,_tmpDetailEntityCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getProduct(final String productCode,
      final Continuation<? super ProductEntity> continuation) {
    final String _sql = "SELECT * FROM product WHERE product_code=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ProductEntity>() {
      @Override
      public ProductEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "product_code");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
          final int _cursorIndexOfDimension = CursorUtil.getColumnIndexOrThrow(_cursor, "dimension");
          final int _cursorIndexOfUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "unit");
          final ProductEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpProductCode;
            if (_cursor.isNull(_cursorIndexOfProductCode)) {
              _tmpProductCode = null;
            } else {
              _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
            }
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final int _tmpDiscount;
            _tmpDiscount = _cursor.getInt(_cursorIndexOfDiscount);
            final String _tmpDimension;
            if (_cursor.isNull(_cursorIndexOfDimension)) {
              _tmpDimension = null;
            } else {
              _tmpDimension = _cursor.getString(_cursorIndexOfDimension);
            }
            final String _tmpUnit;
            if (_cursor.isNull(_cursorIndexOfUnit)) {
              _tmpUnit = null;
            } else {
              _tmpUnit = _cursor.getString(_cursorIndexOfUnit);
            }
            _result = new ProductEntity(_tmpProductCode,_tmpProductName,_tmpPrice,_tmpCurrency,_tmpDiscount,_tmpDimension,_tmpUnit);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshiptransactionDetailAscomHafiztaruliganiWingsDataLocalRoomEntityTransactionDetailEntity(
      final LongSparseArray<ArrayList<TransactionDetailEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<TransactionDetailEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<TransactionDetailEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshiptransactionDetailAscomHafiztaruliganiWingsDataLocalRoomEntityTransactionDetailEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<TransactionDetailEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshiptransactionDetailAscomHafiztaruliganiWingsDataLocalRoomEntityTransactionDetailEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `product_code`,`document_number`,`document_code`,`produceName`,`price`,`quantity`,`unit`,`currency`,`subTotal` FROM `transaction_detail` WHERE `document_number` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "document_number");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfProductCode = 0;
      final int _cursorIndexOfDocumentNumber = 1;
      final int _cursorIndexOfDocumentCode = 2;
      final int _cursorIndexOfProduceName = 3;
      final int _cursorIndexOfPrice = 4;
      final int _cursorIndexOfQuantity = 5;
      final int _cursorIndexOfUnit = 6;
      final int _cursorIndexOfCurrency = 7;
      final int _cursorIndexOfSubTotal = 8;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<TransactionDetailEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final TransactionDetailEntity _item_1;
          final String _tmpProductCode;
          if (_cursor.isNull(_cursorIndexOfProductCode)) {
            _tmpProductCode = null;
          } else {
            _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
          }
          final int _tmpDocumentNumber;
          _tmpDocumentNumber = _cursor.getInt(_cursorIndexOfDocumentNumber);
          final String _tmpDocumentCode;
          if (_cursor.isNull(_cursorIndexOfDocumentCode)) {
            _tmpDocumentCode = null;
          } else {
            _tmpDocumentCode = _cursor.getString(_cursorIndexOfDocumentCode);
          }
          final String _tmpProduceName;
          if (_cursor.isNull(_cursorIndexOfProduceName)) {
            _tmpProduceName = null;
          } else {
            _tmpProduceName = _cursor.getString(_cursorIndexOfProduceName);
          }
          final int _tmpPrice;
          _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
          final int _tmpQuantity;
          _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
          final String _tmpUnit;
          if (_cursor.isNull(_cursorIndexOfUnit)) {
            _tmpUnit = null;
          } else {
            _tmpUnit = _cursor.getString(_cursorIndexOfUnit);
          }
          final String _tmpCurrency;
          if (_cursor.isNull(_cursorIndexOfCurrency)) {
            _tmpCurrency = null;
          } else {
            _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
          }
          final int _tmpSubTotal;
          _tmpSubTotal = _cursor.getInt(_cursorIndexOfSubTotal);
          _item_1 = new TransactionDetailEntity(_tmpProductCode,_tmpDocumentNumber,_tmpDocumentCode,_tmpProduceName,_tmpPrice,_tmpQuantity,_tmpUnit,_tmpCurrency,_tmpSubTotal);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}

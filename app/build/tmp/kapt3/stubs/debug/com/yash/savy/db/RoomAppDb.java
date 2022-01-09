package com.yash.savy.db;

import java.lang.System;

@androidx.room.Database(entities = {com.yash.savy.db.UserEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/yash/savy/db/RoomAppDb;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/yash/savy/db/UserDao;", "Companion", "app_debug"})
public abstract class RoomAppDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.yash.savy.db.RoomAppDb.Companion Companion = null;
    private static com.yash.savy.db.RoomAppDb INSTANCE;
    
    public RoomAppDb() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.yash.savy.db.UserDao userDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/yash/savy/db/RoomAppDb$Companion;", "", "()V", "INSTANCE", "Lcom/yash/savy/db/RoomAppDb;", "getAppDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.yash.savy.db.RoomAppDb getAppDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}
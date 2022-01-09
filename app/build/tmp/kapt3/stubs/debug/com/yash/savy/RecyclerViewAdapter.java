package com.yash.savy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001e\u0010\u0019\u001a\u00020\u00122\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/yash/savy/RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yash/savy/RecyclerViewAdapter$MyViewHolder;", "listener", "Lcom/yash/savy/RecyclerViewAdapter$RowClickListener;", "(Lcom/yash/savy/RecyclerViewAdapter$RowClickListener;)V", "items", "Ljava/util/ArrayList;", "Lcom/yash/savy/db/UserEntity;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getListener", "()Lcom/yash/savy/RecyclerViewAdapter$RowClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListData", "data", "Lkotlin/collections/ArrayList;", "MyViewHolder", "RowClickListener", "app_debug"})
public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.yash.savy.RecyclerViewAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.yash.savy.RecyclerViewAdapter.RowClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.yash.savy.db.UserEntity> items;
    
    public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    com.yash.savy.RecyclerViewAdapter.RowClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yash.savy.RecyclerViewAdapter.RowClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.yash.savy.db.UserEntity> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.yash.savy.db.UserEntity> p0) {
    }
    
    public final void setListData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.yash.savy.db.UserEntity> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yash.savy.RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.yash.savy.RecyclerViewAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/yash/savy/RecyclerViewAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/yash/savy/RecyclerViewAdapter$RowClickListener;", "(Landroid/view/View;Lcom/yash/savy/RecyclerViewAdapter$RowClickListener;)V", "deleteUserID", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getDeleteUserID", "()Landroid/widget/ImageView;", "getListener", "()Lcom/yash/savy/RecyclerViewAdapter$RowClickListener;", "tvEmail", "Landroid/widget/TextView;", "getTvEmail", "()Landroid/widget/TextView;", "tvName", "getTvName", "bind", "", "data", "Lcom/yash/savy/db/UserEntity;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.yash.savy.RecyclerViewAdapter.RowClickListener listener = null;
        private final android.widget.TextView tvName = null;
        private final android.widget.TextView tvEmail = null;
        private final android.widget.ImageView deleteUserID = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.yash.savy.RecyclerViewAdapter.RowClickListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yash.savy.RecyclerViewAdapter.RowClickListener getListener() {
            return null;
        }
        
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        public final android.widget.TextView getTvEmail() {
            return null;
        }
        
        public final android.widget.ImageView getDeleteUserID() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.yash.savy.db.UserEntity data) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/yash/savy/RecyclerViewAdapter$RowClickListener;", "", "onDeleteUserClickListener", "", "user", "Lcom/yash/savy/db/UserEntity;", "onItemClickListener", "app_debug"})
    public static abstract interface RowClickListener {
        
        public abstract void onDeleteUserClickListener(@org.jetbrains.annotations.NotNull()
        com.yash.savy.db.UserEntity user);
        
        public abstract void onItemClickListener(@org.jetbrains.annotations.NotNull()
        com.yash.savy.db.UserEntity user);
    }
}
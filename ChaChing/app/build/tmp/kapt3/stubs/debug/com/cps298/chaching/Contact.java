package com.cps298.chaching;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/cps298/chaching/Contact;", "", "()V", "cardName", "", "expiration", "cardBrand", "perk", "useCategory", "fee", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardBrand", "()Ljava/lang/String;", "setCardBrand", "(Ljava/lang/String;)V", "getCardName", "setCardName", "getExpiration", "setExpiration", "getFee", "setFee", "id", "", "getId", "()I", "setId", "(I)V", "getPerk", "setPerk", "getUseCategory", "setUseCategory", "app_debug"})
@androidx.room.Entity(tableName = "contacts")
public final class Contact {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "card")
    private int id = 0;
    @androidx.room.ColumnInfo(name = "cardName")
    @org.jetbrains.annotations.Nullable
    private java.lang.String cardName;
    @androidx.room.ColumnInfo(name = "useCategory")
    @org.jetbrains.annotations.Nullable
    private java.lang.String useCategory;
    @androidx.room.ColumnInfo(name = "fee")
    @org.jetbrains.annotations.Nullable
    private java.lang.String fee;
    @androidx.room.ColumnInfo(name = "expiration")
    @org.jetbrains.annotations.Nullable
    private java.lang.String expiration;
    @androidx.room.ColumnInfo(name = "perk")
    @org.jetbrains.annotations.Nullable
    private java.lang.String perk;
    @org.jetbrains.annotations.Nullable
    private java.lang.String cardBrand;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCardName() {
        return null;
    }
    
    public final void setCardName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUseCategory() {
        return null;
    }
    
    public final void setUseCategory(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFee() {
        return null;
    }
    
    public final void setFee(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getExpiration() {
        return null;
    }
    
    public final void setExpiration(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPerk() {
        return null;
    }
    
    public final void setPerk(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCardBrand() {
        return null;
    }
    
    public final void setCardBrand(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public Contact() {
        super();
    }
    
    public Contact(@org.jetbrains.annotations.NotNull
    java.lang.String cardName, @org.jetbrains.annotations.NotNull
    java.lang.String expiration, @org.jetbrains.annotations.NotNull
    java.lang.String cardBrand, @org.jetbrains.annotations.NotNull
    java.lang.String perk, @org.jetbrains.annotations.NotNull
    java.lang.String useCategory, @org.jetbrains.annotations.NotNull
    java.lang.String fee) {
        super();
    }
}
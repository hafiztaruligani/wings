package com.hafiztaruligani.cryptoday.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/hafiztaruligani/cryptoday/util/Cons;", "", "()V", "BANNED_TIME", "", "MAX_PAGE_SIZE", "PAGE_SIZE", "PRE_FETCH_DISTANCE", "QUERY_DELAY_TIME", "", "getQUERY_DELAY_TIME", "()J", "setQUERY_DELAY_TIME", "(J)V", "TAG", "", "UPDATE_DELAY_TIME", "getUPDATE_DELAY_TIME", "setUPDATE_DELAY_TIME", "app_debug"})
public final class Cons {
    @org.jetbrains.annotations.NotNull()
    public static final com.hafiztaruligani.cryptoday.util.Cons INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TAG";
    private static long QUERY_DELAY_TIME = 1000L;
    public static final int PAGE_SIZE = 30;
    public static final int PRE_FETCH_DISTANCE = 5;
    private static long UPDATE_DELAY_TIME = 10000L;
    public static final int BANNED_TIME = 120;
    public static final int MAX_PAGE_SIZE = 250;
    
    private Cons() {
        super();
    }
    
    public final long getQUERY_DELAY_TIME() {
        return 0L;
    }
    
    public final void setQUERY_DELAY_TIME(long p0) {
    }
    
    public final long getUPDATE_DELAY_TIME() {
        return 0L;
    }
    
    public final void setUPDATE_DELAY_TIME(long p0) {
    }
}
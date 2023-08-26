.class public interface abstract Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;
.super Ljava/lang/Object;
.source "IMediaDataSource.java"


# static fields
.field public static final TYPE_DASH:I = 0x0

.field public static final TYPE_HLS:I = 0x2

.field public static final TYPE_OTHER:I = 0x3

.field public static final TYPE_SS:I = 0x1


# virtual methods
.method public abstract getContentId()Ljava/lang/String;
.end method

.method public abstract getContentType()I
.end method

.method public abstract getContentUri()Landroid/net/Uri;
.end method

.method public abstract getProviderDASH()Ljava/lang/String;
.end method

.class public Lmychristophedelory/logging/LogFactory;
.super Ljava/lang/Object;
.source "LogFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmychristophedelory/logging/LogFactory$MyLog;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getLog(Ljava/lang/Class;)Lorg/myapache/commons/logging/Log;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/myapache/commons/logging/Log;"
        }
    .end annotation

    .line 9
    new-instance p0, Lmychristophedelory/logging/LogFactory$MyLog;

    invoke-direct {p0}, Lmychristophedelory/logging/LogFactory$MyLog;-><init>()V

    return-object p0
.end method

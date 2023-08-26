.class Lmychristophedelory/logging/LogFactory$MyLog;
.super Ljava/lang/Object;
.source "LogFactory.java"

# interfaces
.implements Lorg/myapache/commons/logging/Log;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmychristophedelory/logging/LogFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyLog"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public debug(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public debug(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public error(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public error(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public fatal(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public fatal(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public info(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public info(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isErrorEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isFatalEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isInfoEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isTraceEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWarnEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public trace(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public trace(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public warn(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public warn(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

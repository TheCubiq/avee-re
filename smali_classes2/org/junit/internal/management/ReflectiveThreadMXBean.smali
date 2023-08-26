.class final Lorg/junit/internal/management/ReflectiveThreadMXBean;
.super Ljava/lang/Object;
.source "ReflectiveThreadMXBean.java"

# interfaces
.implements Lorg/junit/internal/management/ThreadMXBean;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/internal/management/ReflectiveThreadMXBean$Holder;
    }
.end annotation


# instance fields
.field private final threadMxBean:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lorg/junit/internal/management/ReflectiveThreadMXBean;->threadMxBean:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getThreadCpuTime(J)J
    .locals 5

    .line 49
    sget-object v0, Lorg/junit/internal/management/ReflectiveThreadMXBean$Holder;->getThreadCpuTimeMethod:Ljava/lang/reflect/Method;

    const-string v1, "Unable to access ThreadMXBean"

    if-eqz v0, :cond_0

    .line 52
    :try_start_0
    sget-object v0, Lorg/junit/internal/management/ReflectiveThreadMXBean$Holder;->getThreadCpuTimeMethod:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lorg/junit/internal/management/ReflectiveThreadMXBean;->threadMxBean:Ljava/lang/Object;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    .line 66
    :goto_0
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p2, v1, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isThreadCpuTimeSupported()Z
    .locals 4

    .line 75
    sget-object v0, Lorg/junit/internal/management/ReflectiveThreadMXBean$Holder;->isThreadCpuTimeSupportedMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 77
    :try_start_0
    sget-object v0, Lorg/junit/internal/management/ReflectiveThreadMXBean$Holder;->isThreadCpuTimeSupportedMethod:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lorg/junit/internal/management/ReflectiveThreadMXBean;->threadMxBean:Ljava/lang/Object;

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    return v1
.end method

.class final Lorg/junit/internal/management/ReflectiveRuntimeMXBean$Holder;
.super Ljava/lang/Object;
.source "ReflectiveRuntimeMXBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/internal/management/ReflectiveRuntimeMXBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Holder"
.end annotation


# static fields
.field private static final getInputArgumentsMethod:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-string v0, "java.lang.management.RuntimeMXBean"

    .line 21
    invoke-static {v0}, Lorg/junit/internal/Classes;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInputArguments"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    .line 22
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    sput-object v0, Lorg/junit/internal/management/ReflectiveRuntimeMXBean$Holder;->getInputArgumentsMethod:Ljava/lang/reflect/Method;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/reflect/Method;
    .locals 1

    .line 16
    sget-object v0, Lorg/junit/internal/management/ReflectiveRuntimeMXBean$Holder;->getInputArgumentsMethod:Ljava/lang/reflect/Method;

    return-object v0
.end method

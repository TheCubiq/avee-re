.class public Lcom/daaw/m31;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/n31;

.field public static final b:[Lcom/daaw/di0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/n31;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/daaw/n31;

    invoke-direct {v0}, Lcom/daaw/n31;-><init>()V

    :goto_1
    sput-object v0, Lcom/daaw/m31;->a:Lcom/daaw/n31;

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/daaw/di0;

    sput-object v0, Lcom/daaw/m31;->b:[Lcom/daaw/di0;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/daaw/di0;
    .locals 1

    sget-object v0, Lcom/daaw/m31;->a:Lcom/daaw/n31;

    invoke-virtual {v0, p0}, Lcom/daaw/n31;->a(Ljava/lang/Class;)Lcom/daaw/di0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lcom/daaw/ei0;
    .locals 2

    sget-object v0, Lcom/daaw/m31;->a:Lcom/daaw/n31;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lcom/daaw/n31;->b(Ljava/lang/Class;Ljava/lang/String;)Lcom/daaw/ei0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcom/daaw/oz0;)Lcom/daaw/fi0;
    .locals 1

    sget-object v0, Lcom/daaw/m31;->a:Lcom/daaw/n31;

    invoke-virtual {v0, p0}, Lcom/daaw/n31;->c(Lcom/daaw/oz0;)Lcom/daaw/fi0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lcom/daaw/si0;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/daaw/m31;->a:Lcom/daaw/n31;

    invoke-virtual {v0, p0}, Lcom/daaw/n31;->e(Lcom/daaw/si0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

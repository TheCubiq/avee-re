.class public final Lcom/daaw/pt7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/dv7;


# static fields
.field public static final b:Lcom/daaw/vt7;


# instance fields
.field public final a:Lcom/daaw/vt7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nt7;

    invoke-direct {v0}, Lcom/daaw/nt7;-><init>()V

    sput-object v0, Lcom/daaw/pt7;->b:Lcom/daaw/vt7;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lcom/daaw/ot7;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/daaw/vt7;

    invoke-static {}, Lcom/daaw/es7;->c()Lcom/daaw/es7;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getInstance"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v4, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/vt7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lcom/daaw/pt7;->b:Lcom/daaw/vt7;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/daaw/ot7;-><init>([Lcom/daaw/vt7;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "messageInfoFactory"

    invoke-static {v0, v1}, Lcom/daaw/vs7;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/daaw/pt7;->a:Lcom/daaw/vt7;

    return-void
.end method

.method public static b(Lcom/daaw/ut7;)Z
    .locals 1

    invoke-interface {p0}, Lcom/daaw/ut7;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/daaw/cv7;
    .locals 9

    const-class v0, Lcom/daaw/ls7;

    invoke-static {p1}, Lcom/daaw/ev7;->g(Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/daaw/pt7;->a:Lcom/daaw/vt7;

    invoke-interface {v1, p1}, Lcom/daaw/vt7;->a(Ljava/lang/Class;)Lcom/daaw/ut7;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/ut7;->zzb()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/daaw/ev7;->b()Lcom/daaw/tv7;

    move-result-object p1

    invoke-static {}, Lcom/daaw/yr7;->b()Lcom/daaw/wr7;

    move-result-object v0

    :goto_0
    invoke-interface {v3}, Lcom/daaw/ut7;->zza()Lcom/daaw/xt7;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/daaw/bu7;->i(Lcom/daaw/tv7;Lcom/daaw/wr7;Lcom/daaw/xt7;)Lcom/daaw/bu7;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/daaw/ev7;->b0()Lcom/daaw/tv7;

    move-result-object p1

    invoke-static {}, Lcom/daaw/yr7;->a()Lcom/daaw/wr7;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v3}, Lcom/daaw/pt7;->b(Lcom/daaw/ut7;)Z

    move-result v0

    invoke-static {}, Lcom/daaw/du7;->b()Lcom/daaw/cu7;

    move-result-object v4

    invoke-static {}, Lcom/daaw/lt7;->e()Lcom/daaw/lt7;

    move-result-object v5

    invoke-static {}, Lcom/daaw/ev7;->b()Lcom/daaw/tv7;

    move-result-object v6

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/daaw/yr7;->b()Lcom/daaw/wr7;

    move-result-object v7

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    invoke-static {}, Lcom/daaw/tt7;->b()Lcom/daaw/st7;

    move-result-object v8

    goto :goto_3

    :cond_3
    invoke-static {v3}, Lcom/daaw/pt7;->b(Lcom/daaw/ut7;)Z

    move-result v0

    invoke-static {}, Lcom/daaw/du7;->a()Lcom/daaw/cu7;

    move-result-object v4

    invoke-static {}, Lcom/daaw/lt7;->d()Lcom/daaw/lt7;

    move-result-object v5

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/daaw/ev7;->b0()Lcom/daaw/tv7;

    move-result-object v6

    invoke-static {}, Lcom/daaw/yr7;->a()Lcom/daaw/wr7;

    move-result-object v7

    goto :goto_2

    :cond_4
    invoke-static {}, Lcom/daaw/ev7;->a()Lcom/daaw/tv7;

    move-result-object v6

    const/4 v7, 0x0

    :goto_2
    invoke-static {}, Lcom/daaw/tt7;->a()Lcom/daaw/st7;

    move-result-object v8

    :goto_3
    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lcom/daaw/au7;->O(Ljava/lang/Class;Lcom/daaw/ut7;Lcom/daaw/cu7;Lcom/daaw/lt7;Lcom/daaw/tv7;Lcom/daaw/wr7;Lcom/daaw/st7;)Lcom/daaw/au7;

    move-result-object p1

    return-object p1
.end method

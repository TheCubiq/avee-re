.class public Lcom/daaw/mm;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ue0;

.field public final c:Lcom/daaw/a5;

.field public final d:Lcom/daaw/ef1;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/daaw/mm;->e:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi-v7a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "arm64-v8a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "x86"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "x86_64"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "18.3.3"

    aput-object v3, v2, v1

    const-string v1, "Crashlytics Android SDK/%s"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/mm;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ue0;Lcom/daaw/a5;Lcom/daaw/ef1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mm;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/mm;->b:Lcom/daaw/ue0;

    iput-object p3, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iput-object p4, p0, Lcom/daaw/mm;->d:Lcom/daaw/ef1;

    return-void
.end method

.method public static e()I
    .locals 4

    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x7

    if-eqz v1, :cond_0

    return v2

    :cond_0
    sget-object v1, Lcom/daaw/mm;->e:Ljava/util/Map;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lcom/daaw/lm$b;
    .locals 2

    invoke-static {}, Lcom/daaw/lm;->b()Lcom/daaw/lm$b;

    move-result-object v0

    const-string v1, "18.3.3"

    invoke-virtual {v0, v1}, Lcom/daaw/lm$b;->h(Ljava/lang/String;)Lcom/daaw/lm$b;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$b;->d(Ljava/lang/String;)Lcom/daaw/lm$b;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->b:Lcom/daaw/ue0;

    invoke-virtual {v1}, Lcom/daaw/ue0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$b;->e(Ljava/lang/String;)Lcom/daaw/lm$b;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$b;->b(Ljava/lang/String;)Lcom/daaw/lm$b;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$b;->c(Ljava/lang/String;)Lcom/daaw/lm$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/daaw/lm$b;->g(I)Lcom/daaw/lm$b;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/daaw/lm$a;)Lcom/daaw/lm$e$d;
    .locals 4

    iget-object v0, p0, Lcom/daaw/mm;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-static {}, Lcom/daaw/lm$e$d;->a()Lcom/daaw/lm$e$d$b;

    move-result-object v1

    const-string v2, "anr"

    invoke-virtual {v1, v2}, Lcom/daaw/lm$e$d$b;->f(Ljava/lang/String;)Lcom/daaw/lm$e$d$b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/lm$a;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/lm$e$d$b;->e(J)Lcom/daaw/lm$e$d$b;

    move-result-object v1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/mm;->h(ILcom/daaw/lm$a;)Lcom/daaw/lm$e$d$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/lm$e$d$b;->b(Lcom/daaw/lm$e$d$a;)Lcom/daaw/lm$e$d$b;

    move-result-object p1

    invoke-virtual {p0, v0}, Lcom/daaw/mm;->j(I)Lcom/daaw/lm$e$d$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/lm$e$d$b;->c(Lcom/daaw/lm$e$d$c;)Lcom/daaw/lm$e$d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$b;->a()Lcom/daaw/lm$e$d;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Lcom/daaw/lm$e$d;
    .locals 10

    move-object v7, p0

    iget-object v0, v7, Lcom/daaw/mm;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v8, v0, Landroid/content/res/Configuration;->orientation:I

    new-instance v2, Lcom/daaw/bo1;

    iget-object v0, v7, Lcom/daaw/mm;->d:Lcom/daaw/ef1;

    move-object v1, p1

    invoke-direct {v2, p1, v0}, Lcom/daaw/bo1;-><init>(Ljava/lang/Throwable;Lcom/daaw/ef1;)V

    invoke-static {}, Lcom/daaw/lm$e$d;->a()Lcom/daaw/lm$e$d$b;

    move-result-object v0

    move-object v1, p3

    invoke-virtual {v0, p3}, Lcom/daaw/lm$e$d$b;->f(Ljava/lang/String;)Lcom/daaw/lm$e$d$b;

    move-result-object v0

    move-wide v3, p4

    invoke-virtual {v0, p4, p5}, Lcom/daaw/lm$e$d$b;->e(J)Lcom/daaw/lm$e$d$b;

    move-result-object v9

    move-object v0, p0

    move v1, v8

    move-object v3, p2

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/mm;->i(ILcom/daaw/bo1;Ljava/lang/Thread;IIZ)Lcom/daaw/lm$e$d$a;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/daaw/lm$e$d$b;->b(Lcom/daaw/lm$e$d$a;)Lcom/daaw/lm$e$d$b;

    move-result-object v0

    invoke-virtual {p0, v8}, Lcom/daaw/mm;->j(I)Lcom/daaw/lm$e$d$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$d$b;->c(Lcom/daaw/lm$e$d$c;)Lcom/daaw/lm$e$d$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lm$e$d$b;->a()Lcom/daaw/lm$e$d;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;J)Lcom/daaw/lm;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/mm;->a()Lcom/daaw/lm$b;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/mm;->r(Ljava/lang/String;J)Lcom/daaw/lm$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$b;->i(Lcom/daaw/lm$e;)Lcom/daaw/lm$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$b;->a()Lcom/daaw/lm;

    move-result-object p1

    return-object p1
.end method

.method public final f()Lcom/daaw/lm$e$d$a$b$a;
    .locals 3

    invoke-static {}, Lcom/daaw/lm$e$d$a$b$a;->a()Lcom/daaw/lm$e$d$a$b$a$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/lm$e$d$a$b$a$a;->b(J)Lcom/daaw/lm$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/lm$e$d$a$b$a$a;->d(J)Lcom/daaw/lm$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$d$a$b$a$a;->c(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$d$a$b$a$a;->e(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lm$e$d$a$b$a$a;->a()Lcom/daaw/lm$e$d$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/daaw/of0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/lm$e$d$a$b$a;

    invoke-virtual {p0}, Lcom/daaw/mm;->f()Lcom/daaw/lm$e$d$a$b$a;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/daaw/of0;->e([Ljava/lang/Object;)Lcom/daaw/of0;

    move-result-object v0

    return-object v0
.end method

.method public final h(ILcom/daaw/lm$a;)Lcom/daaw/lm$e$d$a;
    .locals 2

    invoke-virtual {p2}, Lcom/daaw/lm$a;->b()I

    move-result v0

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/daaw/lm$e$d$a;->a()Lcom/daaw/lm$e$d$a$a;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/lm$e$d$a$a;->b(Ljava/lang/Boolean;)Lcom/daaw/lm$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$d$a$a;->f(I)Lcom/daaw/lm$e$d$a$a;

    move-result-object p1

    invoke-virtual {p0, p2}, Lcom/daaw/mm;->m(Lcom/daaw/lm$a;)Lcom/daaw/lm$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$d$a$a;->d(Lcom/daaw/lm$e$d$a$b;)Lcom/daaw/lm$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$a;->a()Lcom/daaw/lm$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method public final i(ILcom/daaw/bo1;Ljava/lang/Thread;IIZ)Lcom/daaw/lm$e$d$a;
    .locals 6

    iget-object v0, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v0, v0, Lcom/daaw/a5;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/mm;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/fh;->j(Ljava/lang/String;Landroid/content/Context;)Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {}, Lcom/daaw/lm$e$d$a;->a()Lcom/daaw/lm$e$d$a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/lm$e$d$a$a;->b(Ljava/lang/Boolean;)Lcom/daaw/lm$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$d$a$a;->f(I)Lcom/daaw/lm$e$d$a$a;

    move-result-object p1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/mm;->n(Lcom/daaw/bo1;Ljava/lang/Thread;IIZ)Lcom/daaw/lm$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$d$a$a;->d(Lcom/daaw/lm$e$d$a$b;)Lcom/daaw/lm$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$a;->a()Lcom/daaw/lm$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method public final j(I)Lcom/daaw/lm$e$d$c;
    .locals 8

    iget-object v0, p0, Lcom/daaw/mm;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nb;->a(Landroid/content/Context;)Lcom/daaw/nb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/nb;->b()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/nb;->c()I

    move-result v0

    iget-object v2, p0, Lcom/daaw/mm;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/daaw/fh;->o(Landroid/content/Context;)Z

    move-result v2

    invoke-static {}, Lcom/daaw/fh;->s()J

    move-result-wide v3

    iget-object v5, p0, Lcom/daaw/mm;->a:Landroid/content/Context;

    invoke-static {v5}, Lcom/daaw/fh;->a(Landroid/content/Context;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/fh;->b(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {}, Lcom/daaw/lm$e$d$c;->a()Lcom/daaw/lm$e$d$c$a;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/daaw/lm$e$d$c$a;->b(Ljava/lang/Double;)Lcom/daaw/lm$e$d$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/lm$e$d$c$a;->c(I)Lcom/daaw/lm$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/lm$e$d$c$a;->f(Z)Lcom/daaw/lm$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$d$c$a;->e(I)Lcom/daaw/lm$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Lcom/daaw/lm$e$d$c$a;->g(J)Lcom/daaw/lm$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, Lcom/daaw/lm$e$d$c$a;->d(J)Lcom/daaw/lm$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$c$a;->a()Lcom/daaw/lm$e$d$c;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lcom/daaw/bo1;II)Lcom/daaw/lm$e$d$a$b$c;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/mm;->l(Lcom/daaw/bo1;III)Lcom/daaw/lm$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lcom/daaw/bo1;III)Lcom/daaw/lm$e$d$a$b$c;
    .locals 5

    iget-object v0, p1, Lcom/daaw/bo1;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/bo1;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/daaw/bo1;->c:[Ljava/lang/StackTraceElement;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v2, v3, [Ljava/lang/StackTraceElement;

    :goto_0
    iget-object p1, p1, Lcom/daaw/bo1;->d:Lcom/daaw/bo1;

    if-lt p4, p3, :cond_1

    move-object v4, p1

    :goto_1
    if-eqz v4, :cond_1

    iget-object v4, v4, Lcom/daaw/bo1;->d:Lcom/daaw/bo1;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/daaw/lm$e$d$a$b$c;->a()Lcom/daaw/lm$e$d$a$b$c$a;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/daaw/lm$e$d$a$b$c$a;->f(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$d$a$b$c$a;->e(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {p0, v2, p2}, Lcom/daaw/mm;->p([Ljava/lang/StackTraceElement;I)Lcom/daaw/of0;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/of0;->d(Ljava/util/List;)Lcom/daaw/of0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$d$a$b$c$a;->c(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/daaw/lm$e$d$a$b$c$a;->d(I)Lcom/daaw/lm$e$d$a$b$c$a;

    move-result-object v0

    if-eqz p1, :cond_2

    if-nez v3, :cond_2

    add-int/lit8 p4, p4, 0x1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/mm;->l(Lcom/daaw/bo1;III)Lcom/daaw/lm$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$d$a$b$c$a;->b(Lcom/daaw/lm$e$d$a$b$c;)Lcom/daaw/lm$e$d$a$b$c$a;

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/lm$e$d$a$b$c$a;->a()Lcom/daaw/lm$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lcom/daaw/lm$a;)Lcom/daaw/lm$e$d$a$b;
    .locals 1

    invoke-static {}, Lcom/daaw/lm$e$d$a$b;->a()Lcom/daaw/lm$e$d$a$b$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$d$a$b$b;->b(Lcom/daaw/lm$a;)Lcom/daaw/lm$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/mm;->u()Lcom/daaw/lm$e$d$a$b$d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/lm$e$d$a$b$b;->e(Lcom/daaw/lm$e$d$a$b$d;)Lcom/daaw/lm$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/mm;->g()Lcom/daaw/of0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/lm$e$d$a$b$b;->c(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$b;->a()Lcom/daaw/lm$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lcom/daaw/bo1;Ljava/lang/Thread;IIZ)Lcom/daaw/lm$e$d$a$b;
    .locals 1

    invoke-static {}, Lcom/daaw/lm$e$d$a$b;->a()Lcom/daaw/lm$e$d$a$b$b;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, p5}, Lcom/daaw/mm;->x(Lcom/daaw/bo1;Ljava/lang/Thread;IZ)Lcom/daaw/of0;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/daaw/lm$e$d$a$b$b;->f(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$b$b;

    move-result-object p2

    invoke-virtual {p0, p1, p3, p4}, Lcom/daaw/mm;->k(Lcom/daaw/bo1;II)Lcom/daaw/lm$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/lm$e$d$a$b$b;->d(Lcom/daaw/lm$e$d$a$b$c;)Lcom/daaw/lm$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/mm;->u()Lcom/daaw/lm$e$d$a$b$d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$d$a$b$b;->e(Lcom/daaw/lm$e$d$a$b$d;)Lcom/daaw/lm$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/mm;->g()Lcom/daaw/of0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$d$a$b$b;->c(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$b;->a()Lcom/daaw/lm$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljava/lang/StackTraceElement;Lcom/daaw/lm$e$d$a$b$e$b$a;)Lcom/daaw/lm$e$d$a$b$e$b;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    int-to-long v3, v0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    int-to-long v1, p1

    :cond_1
    invoke-virtual {p2, v3, v4}, Lcom/daaw/lm$e$d$a$b$e$b$a;->e(J)Lcom/daaw/lm$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/lm$e$d$a$b$e$b$a;->f(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v5}, Lcom/daaw/lm$e$d$a$b$e$b$a;->b(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Lcom/daaw/lm$e$d$a$b$e$b$a;->d(J)Lcom/daaw/lm$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$e$b$a;->a()Lcom/daaw/lm$e$d$a$b$e$b;

    move-result-object p1

    return-object p1
.end method

.method public final p([Ljava/lang/StackTraceElement;I)Lcom/daaw/of0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/StackTraceElement;",
            "I)",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$e$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-static {}, Lcom/daaw/lm$e$d$a$b$e$b;->a()Lcom/daaw/lm$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-virtual {v4, p2}, Lcom/daaw/lm$e$d$a$b$e$b$a;->c(I)Lcom/daaw/lm$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-virtual {p0, v3, v4}, Lcom/daaw/mm;->o(Ljava/lang/StackTraceElement;Lcom/daaw/lm$e$d$a$b$e$b$a;)Lcom/daaw/lm$e$d$a$b$e$b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/daaw/of0;->d(Ljava/util/List;)Lcom/daaw/of0;

    move-result-object p1

    return-object p1
.end method

.method public final q()Lcom/daaw/lm$e$a;
    .locals 2

    invoke-static {}, Lcom/daaw/lm$e$a;->a()Lcom/daaw/lm$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->b:Lcom/daaw/ue0;

    invoke-virtual {v1}, Lcom/daaw/ue0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$a$a;->e(Ljava/lang/String;)Lcom/daaw/lm$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$a$a;->g(Ljava/lang/String;)Lcom/daaw/lm$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$a$a;->d(Ljava/lang/String;)Lcom/daaw/lm$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->b:Lcom/daaw/ue0;

    invoke-virtual {v1}, Lcom/daaw/ue0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$a$a;->f(Ljava/lang/String;)Lcom/daaw/lm$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->g:Lcom/daaw/mt;

    invoke-virtual {v1}, Lcom/daaw/mt;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$a$a;->b(Ljava/lang/String;)Lcom/daaw/lm$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mm;->c:Lcom/daaw/a5;

    iget-object v1, v1, Lcom/daaw/a5;->g:Lcom/daaw/mt;

    invoke-virtual {v1}, Lcom/daaw/mt;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$a$a;->c(Ljava/lang/String;)Lcom/daaw/lm$e$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lm$e$a$a;->a()Lcom/daaw/lm$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final r(Ljava/lang/String;J)Lcom/daaw/lm$e;
    .locals 1

    invoke-static {}, Lcom/daaw/lm$e;->a()Lcom/daaw/lm$e$b;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/daaw/lm$e$b;->l(J)Lcom/daaw/lm$e$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/lm$e$b;->i(Ljava/lang/String;)Lcom/daaw/lm$e$b;

    move-result-object p1

    sget-object p2, Lcom/daaw/mm;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$b;->g(Ljava/lang/String;)Lcom/daaw/lm$e$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/mm;->q()Lcom/daaw/lm$e$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$b;->b(Lcom/daaw/lm$e$a;)Lcom/daaw/lm$e$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/mm;->t()Lcom/daaw/lm$e$e;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$b;->k(Lcom/daaw/lm$e$e;)Lcom/daaw/lm$e$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/mm;->s()Lcom/daaw/lm$e$c;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$b;->d(Lcom/daaw/lm$e$c;)Lcom/daaw/lm$e$b;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$b;->h(I)Lcom/daaw/lm$e$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$b;->a()Lcom/daaw/lm$e;

    move-result-object p1

    return-object p1
.end method

.method public final s()Lcom/daaw/lm$e$c;
    .locals 11

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/mm;->e()I

    move-result v1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    invoke-static {}, Lcom/daaw/fh;->s()J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v7, v0

    mul-long v5, v5, v7

    invoke-static {}, Lcom/daaw/fh;->x()Z

    move-result v0

    invoke-static {}, Lcom/daaw/fh;->m()I

    move-result v7

    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v9, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/lm$e$c;->a()Lcom/daaw/lm$e$c$a;

    move-result-object v10

    invoke-virtual {v10, v1}, Lcom/daaw/lm$e$c$a;->b(I)Lcom/daaw/lm$e$c$a;

    move-result-object v1

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v10}, Lcom/daaw/lm$e$c$a;->f(Ljava/lang/String;)Lcom/daaw/lm$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/daaw/lm$e$c$a;->c(I)Lcom/daaw/lm$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/daaw/lm$e$c$a;->h(J)Lcom/daaw/lm$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Lcom/daaw/lm$e$c$a;->d(J)Lcom/daaw/lm$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/lm$e$c$a;->i(Z)Lcom/daaw/lm$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/daaw/lm$e$c$a;->j(I)Lcom/daaw/lm$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/daaw/lm$e$c$a;->e(Ljava/lang/String;)Lcom/daaw/lm$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/daaw/lm$e$c$a;->g(Ljava/lang/String;)Lcom/daaw/lm$e$c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lm$e$c$a;->a()Lcom/daaw/lm$e$c;

    move-result-object v0

    return-object v0
.end method

.method public final t()Lcom/daaw/lm$e$e;
    .locals 2

    invoke-static {}, Lcom/daaw/lm$e$e;->a()Lcom/daaw/lm$e$e$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$e$a;->d(I)Lcom/daaw/lm$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$e$a;->e(Ljava/lang/String;)Lcom/daaw/lm$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$e$a;->b(Ljava/lang/String;)Lcom/daaw/lm$e$e$a;

    move-result-object v0

    invoke-static {}, Lcom/daaw/fh;->y()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$e$a;->c(Z)Lcom/daaw/lm$e$e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lm$e$e$a;->a()Lcom/daaw/lm$e$e;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/daaw/lm$e$d$a$b$d;
    .locals 3

    invoke-static {}, Lcom/daaw/lm$e$d$a$b$d;->a()Lcom/daaw/lm$e$d$a$b$d$a;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$d$a$b$d$a;->d(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/lm$e$d$a$b$d$a;->c(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$d$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/lm$e$d$a$b$d$a;->b(J)Lcom/daaw/lm$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lm$e$d$a$b$d$a;->a()Lcom/daaw/lm$e$d$a$b$d;

    move-result-object v0

    return-object v0
.end method

.method public final v(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Lcom/daaw/lm$e$d$a$b$e;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/mm;->w(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Lcom/daaw/lm$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method public final w(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Lcom/daaw/lm$e$d$a$b$e;
    .locals 1

    invoke-static {}, Lcom/daaw/lm$e$d$a$b$e;->a()Lcom/daaw/lm$e$d$a$b$e$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$d$a$b$e$a;->d(Ljava/lang/String;)Lcom/daaw/lm$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/daaw/lm$e$d$a$b$e$a;->c(I)Lcom/daaw/lm$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p0, p2, p3}, Lcom/daaw/mm;->p([Ljava/lang/StackTraceElement;I)Lcom/daaw/of0;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/of0;->d(Ljava/util/List;)Lcom/daaw/of0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$d$a$b$e$a;->b(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$e$a;->a()Lcom/daaw/lm$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lcom/daaw/bo1;Ljava/lang/Thread;IZ)Lcom/daaw/of0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bo1;",
            "Ljava/lang/Thread;",
            "IZ)",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Lcom/daaw/bo1;->c:[Ljava/lang/StackTraceElement;

    invoke-virtual {p0, p2, p1, p3}, Lcom/daaw/mm;->w(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Lcom/daaw/lm$e$d$a$b$e;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Thread;

    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/mm;->d:Lcom/daaw/ef1;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    invoke-interface {v1, p3}, Lcom/daaw/ef1;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    move-result-object p3

    invoke-virtual {p0, p4, p3}, Lcom/daaw/mm;->v(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Lcom/daaw/lm$e$d$a$b$e;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/daaw/of0;->d(Ljava/util/List;)Lcom/daaw/of0;

    move-result-object p1

    return-object p1
.end method

.class public final Lcom/daaw/u7$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/u7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/lm$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/u7$i;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;

.field public static final d:Lcom/daaw/q00;

.field public static final e:Lcom/daaw/q00;

.field public static final f:Lcom/daaw/q00;

.field public static final g:Lcom/daaw/q00;

.field public static final h:Lcom/daaw/q00;

.field public static final i:Lcom/daaw/q00;

.field public static final j:Lcom/daaw/q00;

.field public static final k:Lcom/daaw/q00;

.field public static final l:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u7$i;

    invoke-direct {v0}, Lcom/daaw/u7$i;-><init>()V

    sput-object v0, Lcom/daaw/u7$i;->a:Lcom/daaw/u7$i;

    const-string v0, "generator"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->b:Lcom/daaw/q00;

    const-string v0, "identifier"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->c:Lcom/daaw/q00;

    const-string v0, "startedAt"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->d:Lcom/daaw/q00;

    const-string v0, "endedAt"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->e:Lcom/daaw/q00;

    const-string v0, "crashed"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->f:Lcom/daaw/q00;

    const-string v0, "app"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->g:Lcom/daaw/q00;

    const-string v0, "user"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->h:Lcom/daaw/q00;

    const-string v0, "os"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->i:Lcom/daaw/q00;

    const-string v0, "device"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->j:Lcom/daaw/q00;

    const-string v0, "events"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->k:Lcom/daaw/q00;

    const-string v0, "generatorType"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$i;->l:Lcom/daaw/q00;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/lm$e;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/u7$i;->b(Lcom/daaw/lm$e;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/lm$e;Lcom/daaw/mt0;)V
    .locals 3

    sget-object v0, Lcom/daaw/u7$i;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->i()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->d:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->k()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->e:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->f:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->m()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->f(Lcom/daaw/q00;Z)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->g:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->b()Lcom/daaw/lm$e$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->h:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->l()Lcom/daaw/lm$e$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->i:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->j()Lcom/daaw/lm$e$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->j:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->c()Lcom/daaw/lm$e$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->k:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->e()Lcom/daaw/of0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$i;->l:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->g()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->a(Lcom/daaw/q00;I)Lcom/daaw/mt0;

    return-void
.end method

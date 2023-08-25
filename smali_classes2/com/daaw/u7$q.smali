.class public final Lcom/daaw/u7$q;
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
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/lm$e$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/u7$q;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;

.field public static final d:Lcom/daaw/q00;

.field public static final e:Lcom/daaw/q00;

.field public static final f:Lcom/daaw/q00;

.field public static final g:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u7$q;

    invoke-direct {v0}, Lcom/daaw/u7$q;-><init>()V

    sput-object v0, Lcom/daaw/u7$q;->a:Lcom/daaw/u7$q;

    const-string v0, "batteryLevel"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$q;->b:Lcom/daaw/q00;

    const-string v0, "batteryVelocity"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$q;->c:Lcom/daaw/q00;

    const-string v0, "proximityOn"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$q;->d:Lcom/daaw/q00;

    const-string v0, "orientation"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$q;->e:Lcom/daaw/q00;

    const-string v0, "ramUsed"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$q;->f:Lcom/daaw/q00;

    const-string v0, "diskUsed"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$q;->g:Lcom/daaw/q00;

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

    check-cast p1, Lcom/daaw/lm$e$d$c;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/u7$q;->b(Lcom/daaw/lm$e$d$c;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/lm$e$d$c;Lcom/daaw/mt0;)V
    .locals 3

    sget-object v0, Lcom/daaw/u7$q;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$c;->b()Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$q;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->a(Lcom/daaw/q00;I)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$q;->d:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$c;->g()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->f(Lcom/daaw/q00;Z)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$q;->e:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$c;->e()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->a(Lcom/daaw/q00;I)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$q;->f:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$c;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$q;->g:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    return-void
.end method

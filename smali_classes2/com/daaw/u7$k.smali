.class public final Lcom/daaw/u7$k;
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
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/lm$e$d$a$b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/u7$k;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;

.field public static final d:Lcom/daaw/q00;

.field public static final e:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u7$k;

    invoke-direct {v0}, Lcom/daaw/u7$k;-><init>()V

    sput-object v0, Lcom/daaw/u7$k;->a:Lcom/daaw/u7$k;

    const-string v0, "baseAddress"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$k;->b:Lcom/daaw/q00;

    const-string v0, "size"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$k;->c:Lcom/daaw/q00;

    const-string v0, "name"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$k;->d:Lcom/daaw/q00;

    const-string v0, "uuid"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$k;->e:Lcom/daaw/q00;

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

    check-cast p1, Lcom/daaw/lm$e$d$a$b$a;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/u7$k;->b(Lcom/daaw/lm$e$d$a$b$a;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/lm$e$d$a$b$a;Lcom/daaw/mt0;)V
    .locals 3

    sget-object v0, Lcom/daaw/u7$k;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$k;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$a;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$k;->d:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$k;->e:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$a;->f()[B

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    return-void
.end method

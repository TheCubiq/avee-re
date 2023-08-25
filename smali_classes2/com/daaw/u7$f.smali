.class public final Lcom/daaw/u7$f;
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
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/lm$e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/u7$f;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;

.field public static final d:Lcom/daaw/q00;

.field public static final e:Lcom/daaw/q00;

.field public static final f:Lcom/daaw/q00;

.field public static final g:Lcom/daaw/q00;

.field public static final h:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u7$f;

    invoke-direct {v0}, Lcom/daaw/u7$f;-><init>()V

    sput-object v0, Lcom/daaw/u7$f;->a:Lcom/daaw/u7$f;

    const-string v0, "identifier"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$f;->b:Lcom/daaw/q00;

    const-string v0, "version"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$f;->c:Lcom/daaw/q00;

    const-string v0, "displayVersion"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$f;->d:Lcom/daaw/q00;

    const-string v0, "organization"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$f;->e:Lcom/daaw/q00;

    const-string v0, "installationUuid"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$f;->f:Lcom/daaw/q00;

    const-string v0, "developmentPlatform"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$f;->g:Lcom/daaw/q00;

    const-string v0, "developmentPlatformVersion"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$f;->h:Lcom/daaw/q00;

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

    check-cast p1, Lcom/daaw/lm$e$a;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/u7$f;->b(Lcom/daaw/lm$e$a;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/lm$e$a;Lcom/daaw/mt0;)V
    .locals 2

    sget-object v0, Lcom/daaw/u7$f;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$f;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$f;->d:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$f;->e:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$a;->g()Lcom/daaw/lm$e$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$f;->f:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$f;->g:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$f;->h:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$e$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    return-void
.end method

.class public final Lcom/daaw/u7$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/lm;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/u7$c;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;

.field public static final d:Lcom/daaw/q00;

.field public static final e:Lcom/daaw/q00;

.field public static final f:Lcom/daaw/q00;

.field public static final g:Lcom/daaw/q00;

.field public static final h:Lcom/daaw/q00;

.field public static final i:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u7$c;

    invoke-direct {v0}, Lcom/daaw/u7$c;-><init>()V

    sput-object v0, Lcom/daaw/u7$c;->a:Lcom/daaw/u7$c;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->b:Lcom/daaw/q00;

    const-string v0, "gmpAppId"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->c:Lcom/daaw/q00;

    const-string v0, "platform"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->d:Lcom/daaw/q00;

    const-string v0, "installationUuid"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->e:Lcom/daaw/q00;

    const-string v0, "buildVersion"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->f:Lcom/daaw/q00;

    const-string v0, "displayVersion"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->g:Lcom/daaw/q00;

    const-string v0, "session"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->h:Lcom/daaw/q00;

    const-string v0, "ndkPayload"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$c;->i:Lcom/daaw/q00;

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

    check-cast p1, Lcom/daaw/lm;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/u7$c;->b(Lcom/daaw/lm;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/lm;Lcom/daaw/mt0;)V
    .locals 2

    sget-object v0, Lcom/daaw/u7$c;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$c;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$c;->d:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->h()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->a(Lcom/daaw/q00;I)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$c;->e:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$c;->f:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$c;->g:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$c;->h:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->j()Lcom/daaw/lm$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$c;->i:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm;->g()Lcom/daaw/lm$d;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    return-void
.end method

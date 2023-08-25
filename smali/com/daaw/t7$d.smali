.class public final Lcom/daaw/t7$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/t7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/cl0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/t7$d;

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

    new-instance v0, Lcom/daaw/t7$d;

    invoke-direct {v0}, Lcom/daaw/t7$d;-><init>()V

    sput-object v0, Lcom/daaw/t7$d;->a:Lcom/daaw/t7$d;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$d;->b:Lcom/daaw/q00;

    const-string v0, "eventCode"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$d;->c:Lcom/daaw/q00;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$d;->d:Lcom/daaw/q00;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$d;->e:Lcom/daaw/q00;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$d;->f:Lcom/daaw/q00;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$d;->g:Lcom/daaw/q00;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$d;->h:Lcom/daaw/q00;

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

    check-cast p1, Lcom/daaw/cl0;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/t7$d;->b(Lcom/daaw/cl0;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/cl0;Lcom/daaw/mt0;)V
    .locals 3

    sget-object v0, Lcom/daaw/t7$d;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/cl0;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/t7$d;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/cl0;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/t7$d;->d:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/cl0;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/t7$d;->e:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/cl0;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/t7$d;->f:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/cl0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/t7$d;->g:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/cl0;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/daaw/mt0;->b(Lcom/daaw/q00;J)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/t7$d;->h:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/cl0;->e()Lcom/daaw/ls0;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    return-void
.end method
